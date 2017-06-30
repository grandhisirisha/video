package com.example.mlrit.video;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView v=(VideoView)findViewById(R.id.v1);

        String uripath="android.resource://"+getPackageName()+"/"+R.raw.samplevideo;

        v.setVideoURI(Uri.parse(uripath));
        v.requestFocus();
        v.start();

    }
}
