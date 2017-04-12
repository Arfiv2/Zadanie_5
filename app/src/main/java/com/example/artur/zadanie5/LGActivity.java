package com.example.artur.zadanie5;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LGActivity extends Activity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lg);
        imageView = (ImageView)findViewById(R.id.imageView);
    }

    public void Powrot(View view)
    {
        finish();
    }
}
