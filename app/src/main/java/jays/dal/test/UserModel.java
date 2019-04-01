package jays.dal.test;

/**
 * This class will be
 * used as a model to
 * store the coins data
 */
public class UserModel {

    private int coinsCount;

    public UserModel(int coinsCount) {
        this.coinsCount=coinsCount;
    }

    public int getCoinsCount() {
        return coinsCount;
    }

    public void setCoinsCount(int coinsCount) {
        this.coinsCount = coinsCount;
    }

}
