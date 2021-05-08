package com.example.capture_image;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnCaptureImage;
    ImageView imageDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCaptureImage = (Button) findViewById(R.id.btn_captureImage);
        imageDisplay = (ImageView) findViewById(R.id.imageCapture);

        btnCaptureImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode,int resultcode, Intent data) {
        super.onActivityResult(requestCode, resultcode, data);

        Bitmap bitmap = (Bitmap)data.getExtras().get("data");
        imageDisplay.setImageBitmap(bitmap);
    }
}