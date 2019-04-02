package dal.shelve12.db;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import dal.shelve12.model.UserModel;

/**
 * This class will be used
 * to insert the coins count
 * in the database
 */
public class UserDatabase {
    private final UserDataQueries userDataQueries;
    private List<UserModel> userList = new ArrayList<>();

    public UserDatabase(Context context){
        userDataQueries = new UserDataQueries(context);
        userDataQueries.open();
        userDataQueries.isAppRunningFirstTime();
        userList = userDataQueries.getUserData();

        // Start code for testing purpose
        if(null!=userList && userList.size()>0) {
            for(int i=0;i<userList.size();i++) {
                UserModel model = userList.get(i);
            }
        }
        // End code for testing purpose
    }

    /**
     * Closing the queries
     */
    public void closeDatabase(){
        userDataQueries.close();
    }


    /**
     * @param userModel
     * @return
     * This method will
     * update the coins of a user
     */
    public boolean updateUser(UserModel userModel){
        return userDataQueries.updateUser(userModel);
    }


    /**
     * @return
     * This method will return
     * the selected users attributes
     * from the database
     */
    public UserModel selectUser(){
        return userDataQueries.selectUser("Manpreet");
    }

}
