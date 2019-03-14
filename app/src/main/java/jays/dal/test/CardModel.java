package jays.dal.test;

public class CardModel {

    private int card_Id;

    public int getCard_value() {
        return card_value;
    }

    public void setCard_value(int card_value) {
        this.card_value = card_value;
    }

    public String getType_of_card() {
        return type_of_card;
    }

    public void setType_of_card(String type_of_card) {
        this.type_of_card = type_of_card;
    }

    private int card_value;
    private String type_of_card;

    public int getCard_Id() {
        return card_Id;
    }

    public void setCard_Id(int card_Id) {
        this.card_Id = card_Id;
    }
}
