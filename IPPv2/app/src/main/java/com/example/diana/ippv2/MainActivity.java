package com.example.diana.ippv2;

import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageButton;
import com.google.android.gms.maps.*;
import android.view.View.OnClickListener;


public class MainActivity extends MapFragment
{
    GoogleMapOptions options = new GoogleMapOptions();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton mapButton = (ImageButton) findViewById(R.id.mapButton);
        mapButton.setOnClickListener(mapListener);
    }

    private OnClickListener mapListener = new OnClickListener()
    {
        public void onClick(View v)
        {
            Intent i = new Intent(MainActivity.this, MapFragment.class);
            startActivity(i);
        }
    };
}
