package com.example.recycler_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    int images[] = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e,
            R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i,
            R.drawable.j, R.drawable.k, R.drawable.l, R.drawable.m,
            R.drawable.n, R.drawable.o, R.drawable.p, R.drawable.q, R.drawable.r};

    String Name[] = {"Alpha", "Beta", "Cupcake", "Donut", "Eclair", "Froyo", "GingerBread",
            "HoneyComb", "IceCreamSandwich", "Jellybean", "KitKat", "Lollipop", "Marshmallow",
            "Nougat", "Oreo", "Pie", "Q", "R"};

    String versionNumber[] = {"1.0", "1.1", "1.5", "1.6", "2.0 - 2.1", "2.2", "2.3", "3.0", "4.0",
            "4.1", "4.4", "5.0", "6.0", "7.0", "8.0", "9.0", "10.0", "11.0"};

    String ApiLevel[] = {"1", "2", "3", "4", "5-7", "8", "9-10", "11-13", "14-15", "16-18",
            "19-20", "21-22", "23", "24-25", "26-27", "28", "29", "30"};

    String ReleaseDate[] = {"23/09/08", "09/02/09", "27/04/09", "15/09/09", "26/10/09", "20/05/10", "6/12/10", "22/02/11",
            "18/10/11", "09/07/12", "31/10/13", "12/11/14", "05/10/15", "22/08/16", "21/08/17", "06/08/18", "03/09/19",
            "Not Released"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recycler);

        rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        MyAdapter adapter = new MyAdapter(MainActivity.this, images, Name, versionNumber, ApiLevel, ReleaseDate);
        rv.setAdapter(adapter);

    }
}