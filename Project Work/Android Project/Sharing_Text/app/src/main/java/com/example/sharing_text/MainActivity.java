package com.example.sharing_text;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=findViewById(R.id.text);

    }

    public void Submit(View view) {
        String txt = t.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share with : ")
                .setText(txt)
                .startChooser();
    }
}