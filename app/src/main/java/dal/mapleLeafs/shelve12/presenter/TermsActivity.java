package dal.mapleLeafs.shelve12.presenter;

import androidx.appcompat.app.AppCompatActivity;
import dal.mapleLeafs.shelve12.R;
import dal.mapleLeafs.shelve12.presenter.BuyCardActivity;
import dal.mapleLeafs.shelve12.presenter.DashboardActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class TermsActivity extends AppCompatActivity {

    Button saveBtn;
    CheckBox checkBoxBtn;
    public SharedPreferences sharedPreferences;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        saveBtn = (Button) findViewById(R.id.button);
        checkBoxBtn = (CheckBox) findViewById(R.id.checkBox);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);


        String checkBoxValue = sharedPreferences.getString("condition_check", "");

        if(checkBoxValue.equals("1")){
            checkBoxBtn.setChecked(true);
            checkBoxBtn.setEnabled(false);
            saveBtn.setEnabled(false);
            //Toast.makeText(getApplicationContext(), "CheckBox checked", Toast.LENGTH_SHORT).show();
        }
        else{
            checkBoxBtn.setChecked(false);
            checkBoxBtn.setEnabled(true);
            saveBtn.setEnabled(true);
            //Toast.makeText(getApplicationContext(), "CheckBox un-checked", Toast.LENGTH_SHORT).show();
        }

        //The below on click listener works on click of save button and save the variable in shared preference if its not saved already
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(checkBoxBtn.isChecked()){

                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("condition_check", "1");
                    editor.commit();
                    String checkBoxValue = sharedPreferences.getString("condition_check", "");
                    if(checkBoxValue.equals("1")){
                        //The below code is for disabling the checkbox and button after fetching the sharedpreference value for checkbox.
                        checkBoxBtn.setChecked(true);
                        checkBoxBtn.setEnabled(false);
                        saveBtn.setEnabled(false);
                    }
                }
                else{
                    //The below code is for saving the variable in shared preferences.
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("condition_check", "0");
                    editor.commit();
                }
                Toast.makeText(getApplicationContext(), "Setting Saved.", Toast.LENGTH_SHORT).show();
            }
        });

        BottomAppBar bar = (BottomAppBar) findViewById(R.id.bottomAppBar2);

        //The below click handler is for going to the dashboard screen.
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
