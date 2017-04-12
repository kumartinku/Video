package com.example.dilippc.video;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  call();
     b=(Button) findViewById(R.id.button);


        getWindow().setFormat(PixelFormat.UNKNOWN);

        //Displays a video file.
        VideoView mVideoView = (VideoView)findViewById(R.id.videoView);


       // String uripath="android.resource://com.example.dilippc.video/"+R.raw.spinner;
       // Uri uri = Uri.parse(uripath);
       // mVideoView.setVideoURI(uri);
       // mVideoView.requestFocus();
      //  mVideoView.start();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                VideoView videoView=(VideoView) findViewById(R.id.videoView);

                String uripath="android.resource://com.example.dilippc.video/"+R.raw.spinner;
                Uri uri=Uri.parse(uripath);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();



            }
        });

    }

    private void call() {



         int i=10;
    }


}
