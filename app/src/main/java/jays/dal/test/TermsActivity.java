package jays.dal.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TermsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        TextView terms = findViewById(R.id.terms);
       terms.setText("By downloading Shelve 12 from the Play Store you are accepting the " +
                "below mentioned terms and conditions:\n\n" +
                "Shelve 12 has the authority to amend the rules of Game Play at any time " +
                "upon mutual consent of all the Maple Leafs members.\n\n" +
                "You are 12 years or older while using the application.In case " +
                "you are below the minimum age, your parents or legal guardians must have " +
                "reviewed the application before use.\n\n" +
                "Shelve 12 is an intellectual property of Maple Leafs. Under any " +
                "given circumstance, no " +
                "asset of" +
                " the application is to be copied or distributed without prior consent.");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TermsActivity.this, DashboardActivity.class);
                startActivity(myIntent);

            }
        });
    }
}
