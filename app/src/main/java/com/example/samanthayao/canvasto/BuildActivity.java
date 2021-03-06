package com.example.samanthayao.canvasto;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;

/**
 * Created by Samantha Yao on 5/25/2017.
 */

public class BuildActivity extends AppCompatActivity {

    Button mresBtn;
    Button meduBtn;
    Button mgovBtn;
    Button mComBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build);

        mresBtn = (Button) findViewById(R.id.resBtn);
        mresBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuildActivity.this, HousingActivity.class));
            }
        });

        meduBtn = (Button) findViewById(R.id.eduBtn);
        meduBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eduIntent = new Intent(BuildActivity.this, EducationActivity.class);
                BuildActivity.this.startActivity(eduIntent);
            }
        });
        mgovBtn = (Button) findViewById(R.id.govBtn);

        mComBtn = (Button) findViewById(R.id.comBtn);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*0.8),(int)(height*0.6));
    }
}
