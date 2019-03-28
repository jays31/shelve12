package jays.dal.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import androidx.cardview.widget.CardView;

import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PlayActivity extends AppCompatActivity {

    private static CardView cardView1;
    private static CardView cardView2;
    private static CardView cardView3;
    private static CardView cardView4;
    private static CardView cardView5;
    private static CardView cardView6;
    private static CardView cardView7;
    private static CardView cardView8;
    private static CardView cardView9;
    private static CardView cardView10;
    private static CardView cardView11;
    private static CardView cardView12;


    private static TextView textView1;
    private static TextView textView2;
    private static TextView textView3;
    private static TextView textView4;
    private static TextView textView5;
    private static TextView textView6;
    private static TextView textView7;
    private static TextView textView8;
    private static TextView textView9;
    private static TextView textView10;
    private static TextView textView11;
    private static TextView textView12;

    GameLogic gameLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);
        getCardViews();
        getTextViews();
        setVisibiltyOfCards();

        gameLogic=new GameLogic();
        gameLogic.setSysplayer();
        LinkedHashMap<Integer, Integer> shuffledMapUserCads = gameLogic.shuffleMap();
        gameLogic.setUserplayer();
        List userCardList = new ArrayList(shuffledMapUserCads.values());

        textView7.setText(String.valueOf(userCardList.get(0)));
        textView8.setText(String.valueOf(userCardList.get(1)));
        textView9.setText(String.valueOf(userCardList.get(2)));
        textView10.setText(String.valueOf(userCardList.get(3)));
        textView11.setText(String.valueOf(userCardList.get(4)));
        textView12.setText(String.valueOf(userCardList.get(5)));

        gameLogic.removeUserAssignedCardsfromSysplayer();
        LinkedHashMap<Integer, Integer> shuffledMapSystemCards = gameLogic.getFirstSixGlobalShuffledCards();
        List systemCardList = new ArrayList(shuffledMapSystemCards.values());
        textView1.setText(String.valueOf(systemCardList.get(0)));
        textView2.setText(String.valueOf(systemCardList.get(1)));
        textView3.setText(String.valueOf(systemCardList.get(2)));
        textView4.setText(String.valueOf(systemCardList.get(3)));
        textView5.setText(String.valueOf(systemCardList.get(4)));
        textView6.setText(String.valueOf(systemCardList.get(5)));

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView1.setVisibility(View.VISIBLE);
                String val1 = textView7.getText().toString();
                int i = Integer.parseInt(val1);
                String val2 = textView1.getText().toString();
                int j = Integer.parseInt(val2);
               SystemClock.sleep(500);
                if(i>j) {
                    cardView1.setVisibility(View.INVISIBLE);
                    Snackbar snack = Snackbar.make(v, "User Wins the Card", Snackbar.LENGTH_LONG) .setAction("Action", null);
                    snack.show();
                }
                else{
                    cardView7.setVisibility(View.INVISIBLE);
                    Snackbar snack = Snackbar.make(v, "System Wins the Card", Snackbar.LENGTH_LONG) .setAction("Action", null);
                    snack.show();
                }
            }
        });

        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView2.setVisibility(View.VISIBLE);
                String val1 = textView8.getText().toString();
                int i = Integer.parseInt(val1);
                String val2 = textView2.getText().toString();
                int j = Integer.parseInt(val2);
               SystemClock.sleep(500);
                if(i>j) {
                    cardView2.setVisibility(View.INVISIBLE);
                    Snackbar snack = Snackbar.make(v, "User Wins the Card", Snackbar.LENGTH_LONG) .setAction("Action", null);
                    snack.show();
                }
                else{
                    cardView8.setVisibility(View.INVISIBLE);
                    Snackbar snack = Snackbar.make(v, "System Wins the Card", Snackbar.LENGTH_LONG) .setAction("Action", null);
                    snack.show();
                }
            }
        });

        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView3.setVisibility(View.VISIBLE);
                String val1 = textView9.getText().toString();
                int i = Integer.parseInt(val1);
                String val2 = textView3.getText().toString();
                int j = Integer.parseInt(val2);
               SystemClock.sleep(500);
                if(i>j) {
                    cardView3.setVisibility(View.INVISIBLE);
                    Snackbar snack = Snackbar.make(v, "User Wins the Card", Snackbar.LENGTH_LONG) .setAction("Action", null);
                    snack.show();
                }
                else{
                    cardView9.setVisibility(View.INVISIBLE);
                    Snackbar snack = Snackbar.make(v, "System Wins the Card", Snackbar.LENGTH_LONG) .setAction("Action", null);
                    snack.show();
                }
            }
        });

        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView4.setVisibility(View.VISIBLE);
                String val1 = textView10.getText().toString();
                int i = Integer.parseInt(val1);
                String val2 = textView4.getText().toString();
                int j = Integer.parseInt(val2);
               SystemClock.sleep(500);
                if(i>j) {
                    cardView4.setVisibility(View.INVISIBLE);
                    Snackbar snack = Snackbar.make(v, "User Wins the Card", Snackbar.LENGTH_LONG) .setAction("Action", null);
                    snack.show();
                }
                else{
                    cardView10.setVisibility(View.INVISIBLE);
                    Snackbar snack = Snackbar.make(v, "System Wins the Card", Snackbar.LENGTH_LONG) .setAction("Action", null);
                    snack.show();
                }
            }
        });

        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView5.setVisibility(View.VISIBLE);
                String val1 = textView7.getText().toString();
                int i = Integer.parseInt(val1);
                String val2 = textView1.getText().toString();
                int j = Integer.parseInt(val2);
               SystemClock.sleep(500);
                if(i>j) {
                    cardView5.setVisibility(View.INVISIBLE);
                    Snackbar snack = Snackbar.make(v, "User Wins the Card", Snackbar.LENGTH_LONG) .setAction("Action", null);
                    snack.show();
                }
                else{
                    cardView11.setVisibility(View.INVISIBLE);
                    Snackbar snack = Snackbar.make(v, "System Wins the Card", Snackbar.LENGTH_LONG) .setAction("Action", null);
                    snack.show();
                }
            }
        });

        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView6.setVisibility(View.VISIBLE);
                String val1 = textView7.getText().toString();
                int i = Integer.parseInt(val1);
                String val2 = textView1.getText().toString();
                int j = Integer.parseInt(val2);
               SystemClock.sleep(500);
                if(i>j) {
                    cardView6.setVisibility(View.INVISIBLE);
                    Snackbar snack = Snackbar.make(v, "User Wins the Card", Snackbar.LENGTH_LONG) .setAction("Action", null);
                    snack.show();
                }
                else{
                    cardView12.setVisibility(View.INVISIBLE);
                    Snackbar snack = Snackbar.make(v, "System Wins the Card", Snackbar.LENGTH_LONG) .setAction("Action", null);
                    snack.show();
                }
            }
        });

    }

    /**
     * This method will be used to set the
     * visibility of cards depending upon whether it is
     * a user's card or system's card
     */
    public void setVisibiltyOfCards(){
        cardView1.setVisibility(View.INVISIBLE);
        cardView2.setVisibility(View.INVISIBLE);
        cardView3.setVisibility(View.INVISIBLE);
        cardView4.setVisibility(View.INVISIBLE);
        cardView5.setVisibility(View.INVISIBLE);
        cardView6.setVisibility(View.INVISIBLE);
    }

    /**
     * This method will fetch
     * the card view objects
     */
    public void getCardViews(){
        cardView1 = findViewById(R.id.card_view_1);
        cardView2 = findViewById(R.id.card_view_2);
        cardView3 = findViewById(R.id.card_view_3);
        cardView4 = findViewById(R.id.card_view_4);
        cardView5 = findViewById(R.id.card_view_5);
        cardView6 = findViewById(R.id.card_view_6);

        cardView7 = findViewById(R.id.card_view_7);
        cardView8 = findViewById(R.id.card_view_8);
        cardView9 = findViewById(R.id.card_view_9);
        cardView10 = findViewById(R.id.card_view_10);
        cardView11 = findViewById(R.id.card_view_11);
        cardView12 = findViewById(R.id.card_view_12);
    }

    /**
     * This method will fetch
     * the card view objects
     */
    public void getTextViews(){
        textView1 = findViewById(R.id.Rank1);
        textView2 = findViewById(R.id.Rank2);
        textView3 = findViewById(R.id.Rank3);
        textView4 = findViewById(R.id.Rank4);
        textView5 = findViewById(R.id.Rank5);
        textView6 = findViewById(R.id.Rank6);

        textView7 = findViewById(R.id.Rank7);
        textView8 = findViewById(R.id.Rank8);
        textView9 = findViewById(R.id.Rank9);
        textView10 = findViewById(R.id.Rank10);
        textView11 = findViewById(R.id.Rank11);
        textView12 = findViewById(R.id.Rank12);

    }

}
