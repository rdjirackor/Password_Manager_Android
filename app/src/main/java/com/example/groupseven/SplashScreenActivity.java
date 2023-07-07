package com.example.groupseven;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    private static final String VIDEO_PATH = "android.resource://com.example.groupseven/" + R.raw.splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        VideoView videoView = findViewById(R.id.videoView);
        Uri videoUri = Uri.parse(VIDEO_PATH);
        videoView.setVideoURI(videoUri);
        videoView.setOnCompletionListener(mp -> {
            openMainActivity();
            finish();
        });
        videoView.start();
    }

    
}
