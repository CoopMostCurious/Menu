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
        TextView textViewItem1 = findViewById(R.id.menu_item_1);
        String text1 = textViewItem1.getText().toString();
        Log.i("Menu App","We have the delicious: " + text1);

        // Find second menu item TextView and print the text to the logs
        TextView textViewItem2 = findViewById(R.id.menu_item_2);
        String text2 = textViewItem2.getText().toString();
        Log.i("Menu App", "We have the delicious: " + text2);

        // Find third menu item TextView and print the text to the logs
        TextView textViewItem3 = findViewById(R.id.menu_item_3);
        String text3 = textViewItem3.getText().toString();
        Log.i("Menu App", "We have the delicious: " + text3);

    }
}