package jays.dal.test;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class CardsDataQueries
{
    public static final String IS_FIRST_TIME = "IS FIRST TIME";
    private final Context mContext;
    private SQLiteDatabase database;
    private CardsReaderDbHelper dbHelper;

//    private String[] userCardsColumns =
//            {
//                    CardsReaderDbHelper.UserCardEntry._ID,
//                    CardsReaderDbHelper.UserCardEntry.COLUMN_USER_CARD_ID,
//                    CardsReaderDbHelper.UserCardEntry.COLUMN_USER_CARD_VALUE
//            };
//
//    private String[] systemCardsColumns =
//            {
//                    CardsReaderDbHelper.SystemCardEntry._ID,
//                    CardsReaderDbHelper.SystemCardEntry.COLUMN_SYSTEM_CARD_ID,
//                    CardsReaderDbHelper.SystemCardEntry.COLUMN_SYSTEM_CARD_VALUE
//            };
//
//    private String[] globalCardsColumns =
//            {
//                    CardsReaderDbHelper.GlobalCardEntry._ID,
//                    CardsReaderDbHelper.GlobalCardEntry.COLUMN_GLOBAL_CARD_ID,
//                    CardsReaderDbHelper.GlobalCardEntry.COLUMN_GLOBAL_CARD_VALUE
//            };

    private String[] cardColumns =
            {
                    CardsReaderDbHelper.CardsEntry._ID,
                    CardsReaderDbHelper.CardsEntry.COLUMN_CARDS_ID,
                    CardsReaderDbHelper.CardsEntry.COLUMN_CARD_VALUE,
                    CardsReaderDbHelper.CardsEntry.COLUMN_CARD_TYPE
            };
    private String[] userColumns =
            {
                    CardsReaderDbHelper.UserEntry._ID,
                    CardsReaderDbHelper.UserEntry.COLUMN_USER_ID,
                    CardsReaderDbHelper.UserEntry.COLUMN_USER_NAME,
                    CardsReaderDbHelper.UserEntry.COLUMN_USER_COINS,
                    CardsReaderDbHelper.UserEntry.COLUMN_USER_LEVEL
            };

    public CardsDataQueries(Context context)
    {
        mContext = context;
        dbHelper = new CardsReaderDbHelper(context);
    }

    public void open() throws SQLException { database = dbHelper.getWritableDatabase(); }

    public void close() { dbHelper.close(); }
}

