package com.pulkit.dailythoughthindi;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    SharedPreferences prefs;
    EditText mobilenumber;
    EditText password;
    String mobileNumber, passWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try
        {
            prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            prefs.edit().putString("current","").commit();
            prefs.edit().putString("first","").commit();
            Button signIn = (Button) findViewById(R.id.buttonSignIn);
            signIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //Toast.makeText(getApplicationContext(), "Sign In", Toast.LENGTH_LONG).show();

                    mobilenumber = (EditText) findViewById(R.id.editTextMobileNumber);
                    password = (EditText) findViewById(R.id.editTextPassword);

                    mobileNumber = mobilenumber.getText().toString();
                    passWord = password.getText().toString();

                    //Log.i("DailyThought", " mobileNumber "+ mobileNumber+" pasword "+passWord);

                    String data = prefs.getString("data","");
                    //Log.i("DailyThought", data);
                    String arr[] = data.split(",");
                    //Log.i("DailyThought", String.valueOf(arr.length));
                    //Log.i("DailyThought", arr[0]+" "+ arr[1]);
                    if (arr[0].equals(mobileNumber))
                    {
                        //Log.i("DailyThought", "Mobile Number Matched");
                        if (arr[1].equals(passWord)) {
                            //Log.i("DailyThought", "Password Matched");
                            Intent mainIntent = new Intent(MainActivity.this, Words.class);
                            MainActivity.this.startActivity(mainIntent);
                        } else {
                            Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "MobileNumber is not registered", Toast.LENGTH_LONG).show();
                    }
                }
            });

            Button signUp = (Button) findViewById(R.id.buttonSignUp);
            signUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Registration Successful", Toast.LENGTH_LONG).show();
                    EditText mobile = (EditText) findViewById(R.id.editTextMobileNumber);
                    EditText pass = (EditText) findViewById(R.id.editTextPassword);

                    mobileNumber = mobile.getText().toString();
                    passWord = pass.getText().toString();

                    //Log.i("DailyThought", " mobileNumber "+ mobileNumber+" pasword "+passWord);

                    prefs.edit().putString("data", mobileNumber+","+passWord).commit();
                    String storedData = prefs.getString("data","");
                    //Log.i("DailyThought", "SignUp "+storedData);

                }
            });

        }catch (Exception e)
        {
            //Log.i("DailyThought", "Exception");
            //e.printStackTrace();
        } finally {
            //Log.i("DailyThought", "Finally");
            mobileNumber =null;
            passWord =null;
        }
    }

}
