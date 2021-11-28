package com.khairurrafa.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button explicitintent;
    Button implicitintent;
    Button latgridlayout;
    Button tugridlayout;
    Button facebook;
    Button tiktok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button) findViewById(R.id.expicitintent);
        explicitintent.setOnClickListener(this);
        implicitintent = (Button) findViewById(R.id.implicitintent);
        implicitintent.setOnClickListener(this);
        latgridlayout = (Button) findViewById(R.id.latgridlayout);
        latgridlayout.setOnClickListener(this);
        tugridlayout = (Button) findViewById(R.id.tugridlayout);
        tugridlayout.setOnClickListener(this);
        facebook = (Button) findViewById(R.id.facebook);
        facebook.setOnClickListener(this);
        tiktok = (Button) findViewById(R.id.tiktok);
        tiktok.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.expicitintent:
                Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.implicitintent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3schools.com"));
                startActivity(implicit);
                break;
            case R.id.latgridlayout:
                Intent latgrid = new Intent(MainActivity.this, LatGridLayout.class);
                startActivity(latgrid);
                break;
            case R.id.tugridlayout:
                Intent tuggrid = new Intent(MainActivity.this, TugGridLayout.class);
                startActivity(tuggrid);
                break;
            case R.id.facebook:
                Intent facebook = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
                startActivity(facebook);
                break;
            case R.id.tiktok:
                Intent tiktok = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tiktok.com"));
                startActivity(tiktok);
                break;
            default:
                break;
        }
    }
}