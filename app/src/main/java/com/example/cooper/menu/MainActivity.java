package com.example.cooper.menu;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView text1 = findViewById(R.id.menu_item_1);
        Log.i("Menu App","We have the delicious: " + text1);

        // Find second menu item TextView and print the text to the logs
        TextView text2 = findViewById(R.id.menu_item_2);
        Log.i("Menu App", "We have the delicious: " + text2);

        // Find third menu item TextView and print the text to the logs
        TextView text3 = findViewById(R.id.menu_item_3);
        Log.i("Menu App", "We have the delicious: " + text3);

    }
}