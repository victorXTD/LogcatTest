package com.victor_xiao.logcattest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String TAG="LogTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btwv=(Button)findViewById(R.id.Log_v);
        Button btwd=(Button)findViewById(R.id.Log_d);
        Button btwi=(Button)findViewById(R.id.Log_i);
        Button btww=(Button)findViewById(R.id.Log_w);
        Button btwe=(Button)findViewById(R.id.Log_e);

        btwv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG,"This is a log from Log.v.");
            }
        });

        btwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"This is a log from Log.d.");
            }
        });

        btwi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"This is a log from Log.i.");
            }
        });

        btww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.w(TAG,"This is a log from Log.w.");
            }
        });

        btwe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"This is a log from Log.e.");
            }
        });

    }
}
