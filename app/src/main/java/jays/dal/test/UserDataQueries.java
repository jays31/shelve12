package jays.dal.test;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class UserDataQueries
{
    public static final String IS_FIRST_TIME = "is first time";
    public static final String SHARED_PREF_USER ="shared pref user";
    private final Context mContext;
    private SQLiteDatabase database;
    private UserDbHelper dbHelper;

    private String[] userColumns = {UserDbHelper.UserEntry._ID,
                                    UserDbHelper.UserEntry.COLUMN_COINS_COUNT};

    public UserDataQueries(Context context)
    {
        mContext = context;
        dbHelper = new UserDbHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() { dbHelper.close(); }

    public UserModel createCard(UserModel userModel)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(UserDbHelper.UserEntry.COLUMN_COINS_COUNT, userModel.getCoinsCount());
        long insertUserId = database.insert(UserDbHelper.UserEntry.TABLE_NAME,null, contentValues);
        Log.i(getClass().getName(),String.valueOf(insertUserId));
        Cursor cursor = database.query(UserDbHelper.UserEntry.TABLE_NAME,
                userColumns, UserDbHelper.UserEntry._ID + " = "+ insertUserId,
                null,null,null,null);
        cursor.moveToFirst();
        UserModel userModelFromCursor = getCardDataFromCursor(cursor);
        cursor.close();
        return userModelFromCursor;
    }


    private UserModel getCardDataFromCursor(Cursor cursor)
    {
        if(null!=cursor && cursor.moveToFirst()) {
            return new UserModel(cursor.getInt(1));
        }
        return  null;
    }

    public List<UserModel> getUserData(){
        List<UserModel> userList = new ArrayList<UserModel>();
        Cursor cursor = database.query(UserDbHelper.UserEntry.TABLE_NAME,
                userColumns, null,null,null,null,null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            UserModel userModel = getCardDataFromCursor(cursor);
            userList.add(userModel);
            cursor.moveToNext();
        }
        cursor.close();
        return userList;
    }


    public boolean isAppRunningFirstTime(){
        boolean isFirst= mContext.getSharedPreferences(SHARED_PREF_USER,Context.MODE_PRIVATE).
                getBoolean(IS_FIRST_TIME,true);
        if(isFirst){
            mContext.getSharedPreferences(SHARED_PREF_USER, Context.MODE_PRIVATE).edit()
                    .putBoolean(IS_FIRST_TIME, false).apply();
        }
        return isFirst;
    }
}

