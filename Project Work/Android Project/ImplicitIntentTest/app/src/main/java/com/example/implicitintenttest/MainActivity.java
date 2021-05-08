package com.example.implicitintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openURL(View view) {
        Uri u = Uri.parse("https://www.google.com");
        Intent i = new Intent(Intent.ACTION_VIEW, u);
        startActivity(i);
    }

    public void call(View view) {
        Uri uri = Uri.parse("tel:1234567890");
        Intent i = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(i);
    }

    public void myLocation(View view) {
        //Uri gmmIntentUri = Uri.parse("geo:16.463054,80.506849?z=21");
        //Searching Restaurants
        //Uri gmmIntentUri = Uri.parse("geo:16.463054,80.506849?q=1Restaurants");
        //Adding a Marker
        //Uri gmmIntentUri = Uri.parse("geo:16.463054,80.506849?q=<16.463054>,<80.506849>");
        //NearBy Restaurants
        // gmmIntentUri = Uri.parse("geo:0,0?q=restaurants");
        //for hospitals
        //Uri gmmIntentUri = Uri.parse("geo:0,0?q=Hospitals");
        //for Atm
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=ATM");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
}