package jays.dal.test;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will be used
 * to insert the coins count
 * in the database
 */
public class UserDatabase {
    private final UserDataQueries userDataQueries;
    private List<UserModel> userList = new ArrayList<>();

    public UserDatabase(Context context,int coinsCount){
        userDataQueries = new UserDataQueries(context);
        userDataQueries.open();
        if(userDataQueries.isAppRunningFirstTime()) {
            userDataQueries.createCard(new UserModel(coinsCount));
        }
        userList = userDataQueries.getUserData();
        if(null!=userList && userList.size()>0) {
            for(int i=0;i<userList.size();i++) {
                UserModel model = userList.get(i);
            }
        }
    }

    /**
     * Closing the queries
     */
    public void closeDatabase(){
        userDataQueries.close();
    }

}
