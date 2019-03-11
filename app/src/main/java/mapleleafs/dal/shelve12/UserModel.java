package mapleleafs.dal.shelve12;

public class UserModel {

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public int getUser_coins() {
        return user_coins;
    }

    public void setUser_coins(int user_coins) {
        this.user_coins = user_coins;
    }

    public int getUser_Level() {
        return user_Level;
    }

    public void setUser_Level(int user_Level) {
        this.user_Level = user_Level;
    }

    private int user_Id;
    private String user_Name;
    private int user_coins;
    private int user_Level;

}
