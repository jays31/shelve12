package jays.dal.test;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.Gravity;
import android.view.View;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public final static String pipe ="coins_val";
    private TextView usersCoins;
    private Button resetButton;
    private TextView userMedals;


    CardsReaderDbHelper cardsReaderDbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer);
        cardsReaderDbHelper = new CardsReaderDbHelper(this);

        Intent intent = getIntent();
        String coins_val = intent.getStringExtra(pipe);
        usersCoins = findViewById(R.id.usersCoins);
        resetButton = findViewById(R.id.resetButton);
        userMedals = findViewById(R.id.userMedals);
        usersCoins.setText(String.valueOf(coins_val));



        BottomAppBar bar = (BottomAppBar) findViewById(R.id.bottomAppBar2);
        setSupportActionBar(bar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snack = Snackbar.make(view, "Redirecting to XII Store",
                        Snackbar.LENGTH_LONG)
                        .setAction("Action", null);
                snack.show();
                Intent myIntent = new Intent(DashboardActivity.this, PlayActivity.class);
                startActivity(myIntent);

            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usersCoins.setText(String.valueOf(0));
                userMedals.setText(String.valueOf(0));

            }

        });

        final Switch simpleSwitch = (Switch) findViewById(R.id.simpleSwitch);
        simpleSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Intent musicIntent = new Intent(DashboardActivity.this, MusicService.class);
                    startService(musicIntent);
                } else {
                    Intent musicIntent = new Intent(DashboardActivity.this, MusicService.class);
                    stopService(musicIntent);

                }
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, bar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav_bottom, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast toast = Toast.makeText(getApplicationContext(),"Opening Settings",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM, 0, 250);
            Intent myIntent = new Intent(DashboardActivity.this, SettingsActivity.class);
            startActivity(myIntent);
            toast.show();
            return true;
        }

        if (id == R.id.profile) {
            Toast toast = Toast.makeText(getApplicationContext(),"Opening User Profile",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM, 0, 250);
            toast.show();
            return true;
        }

        if (id == R.id.qrcode) {
            Intent myIntent = new Intent(DashboardActivity.this, QRCode.class);
            startActivity(myIntent);
            Toast toast = Toast.makeText(getApplicationContext(),"Share QR Code",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM, 0, 250);
            toast.show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.dashboard) {
            // Handle the camera action
        } else if (id == R.id.store) {

        } else if (id == R.id.medals) {

        } else if (id == R.id.tutorial) {

        } else if (id == R.id.terms) {

        } else if (id == R.id.action_settings) {
            Intent myIntent = new Intent(DashboardActivity.this, SettingsActivity.class);
            startActivity(myIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
