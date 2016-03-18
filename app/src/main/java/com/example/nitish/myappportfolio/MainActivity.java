package com.example.nitish.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    toast.setText(String.format(getString(R.string.toast_message), getString(R.string.app_name1)));
                    toast.show();
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    toast.setText(String.format(getString(R.string.toast_message), getString(R.string.app_name2)));
                    toast.show();
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setText(String.format(getString(R.string.toast_message), getString(R.string.app_name3)));
                toast.show();
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setText(String.format(getString(R.string.toast_message), getString(R.string.app_name4)));
                toast.show();
            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setText(String.format(getString(R.string.toast_message), getString(R.string.app_name5)));
                toast.show();
            }
        });

        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.setText(String.format(getString(R.string.toast_message), getString(R.string.app_name6)));
                toast.show();
            }
        });
    }
}
