package jays.dal.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Medals extends AppCompatActivity {

    TextView userMedals;
    private Activity activity;

    UserDbHelper userDbHelper;
    private UserDatabase userDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medals);

        activity = this;
        userMedals = findViewById(R.id.userMedals);
        userDbHelper = new UserDbHelper(this);
        userDatabase = new UserDatabase(activity);
        UserModel userModel = userDatabase.selectUser();

        userMedals.setText(String.valueOf("1"));

//        Update to Medals Count
//        userMedals.setText(String.valueOf(userModel.getCoinsCount()));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Medals.this, DashboardActivity.class);
                startActivity(myIntent);

            }
        });
    }
}
