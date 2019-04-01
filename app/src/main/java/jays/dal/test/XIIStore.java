package jays.dal.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class XIIStore extends AppCompatActivity {

    TextView usersCoins;
    private Activity activity;

    UserDbHelper userDbHelper;
    private UserDatabase userDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiistore);

        activity = this;
        usersCoins = findViewById(R.id.usersCoins);
        userDbHelper = new UserDbHelper(this);
        userDatabase = new UserDatabase(activity);
        UserModel userModel = userDatabase.selectUser();
        usersCoins.setText(String.valueOf(userModel.getCoinsCount()));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(XIIStore.this, DashboardActivity.class);
                startActivity(myIntent);

            }
        });
    }
}
