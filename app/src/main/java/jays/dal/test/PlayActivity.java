package jays.dal.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import androidx.cardview.widget.CardView;
import android.widget.Toast;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);
        getCardViews();
        setVisibiltyOfCards();

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView1.setVisibility(View.VISIBLE);
                Toast.makeText(v.getContext(), "Card 7 Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView2.setVisibility(View.VISIBLE);
                Toast.makeText(v.getContext(), "Card 8 Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView3.setVisibility(View.VISIBLE);
                Toast.makeText(v.getContext(), "Card 9 Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView1.setVisibility(View.VISIBLE);
                Toast.makeText(v.getContext(), "Card 10 Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView2.setVisibility(View.VISIBLE);
                Toast.makeText(v.getContext(), "Card 11 Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView3.setVisibility(View.VISIBLE);
                Toast.makeText(v.getContext(), "Card 12 Clicked", Toast.LENGTH_SHORT).show();
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
    }

    /**
     * This method will fetch
     * the card view objects
     */
    public void getCardViews(){
        cardView1 = findViewById(R.id.card_view_1);
        cardView2 = findViewById(R.id.card_view_2);
        cardView3 = findViewById(R.id.card_view_3);

        cardView7 = findViewById(R.id.card_view_7);
        cardView8 = findViewById(R.id.card_view_8);
        cardView9 = findViewById(R.id.card_view_9);
        cardView10 = findViewById(R.id.card_view_10);
        cardView11 = findViewById(R.id.card_view_11);
        cardView12 = findViewById(R.id.card_view_12);
    }

}
