package jays.dal.test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

public class CardsReaderDbHelper extends SQLiteOpenHelper
{

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Cards.db";

    public static abstract class CardsEntry implements BaseColumns
    {
        public static final String TABLE_NAME= "cards";
        public static final String COLUMN_CARDS_ID = "card_id";
        public static final String COLUMN_CARD_VALUE = "card_value";
        public static final String COLUMN_CARD_TYPE = "card_type";
    }
    public static abstract class UserEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "user";
        public static final String COLUMN_USER_ID = "user_id";
        public static final String COLUMN_USER_NAME = "user_name";
        public static final String COLUMN_USER_COINS = "user_coins";
        public static final String COLUMN_USER_LEVEL = "user_level";

    }

    private static final String INTEGER_TYPE = " INTEGER";
    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    private static final String SQL_CREATE_CARDS_TABLE =
            "CREATE TABLE IF NOT EXISTS " + CardsEntry.TABLE_NAME + " (" +
                    CardsEntry._ID + " INTEGER PRIMARY KEY" + COMMA_SEP +
                    CardsEntry.COLUMN_CARDS_ID + INTEGER_TYPE + COMMA_SEP +
                    CardsEntry.COLUMN_CARD_VALUE + INTEGER_TYPE +
                    CardsEntry.COLUMN_CARD_TYPE + TEXT_TYPE + " )";

    private static final String SQL_CREATE_USER_TABLE =
            "CREATE TABLE IF NOT EXISTS " + UserEntry.TABLE_NAME + " (" +
                    UserEntry._ID + " INTERGER PRIMARY KEY" + COMMA_SEP +
                    UserEntry.COLUMN_USER_ID + INTEGER_TYPE + COMMA_SEP +
                    UserEntry.COLUMN_USER_NAME + TEXT_TYPE + COMMA_SEP +
                    UserEntry.COLUMN_USER_COINS + INTEGER_TYPE + COMMA_SEP +
                    UserEntry.COLUMN_USER_LEVEL + INTEGER_TYPE + " )";

    private static final String SQL_DELETE_CARDS_TABLE =
            "DROP TABLE IF EXISTS " + CardsEntry.TABLE_NAME;
    private static final String SQL_DELETE_USER_TABLE =
            "DROP TABLE IF EXISTS " + UserEntry.TABLE_NAME;


    public CardsReaderDbHelper (Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    public void onCreate(SQLiteDatabase DB)
    {
        Log.e("Create db","Start");
        DB.execSQL(SQL_CREATE_CARDS_TABLE);
        DB.execSQL(SQL_CREATE_USER_TABLE);
        Log.e("Create db","End");
    }

    public void onUpgrade(SQLiteDatabase DB, int oldVersion, int newVersion)
    {
        DB.execSQL(SQL_DELETE_CARDS_TABLE);
        DB.execSQL(SQL_DELETE_USER_TABLE);
    }

    public void onDownGrade(SQLiteDatabase DB, int oldVersion, int newVersion)
    {
        onUpgrade(DB, oldVersion, newVersion);
    }
}
