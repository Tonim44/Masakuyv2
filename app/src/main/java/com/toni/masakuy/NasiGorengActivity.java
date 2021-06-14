package com.toni.masakuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.app.AppCompatActivity;

public class NasiGorengActivity extends AppCompatActivity {

    ActionBar actionBar;
    VideoView videoNasgor;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_nasigoreng);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        videoNasgor = (VideoView)findViewById(R.id.videoView3);
        videoNasgor.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.nasigorengvideo));
        videoNasgor.setMediaController(new MediaController(this));
        videoNasgor.start();


    }



    @Override
    public  boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent( NasiGorengActivity.this, ResepActivity.class);
        startActivity(intent);
        finish();
    }



}

