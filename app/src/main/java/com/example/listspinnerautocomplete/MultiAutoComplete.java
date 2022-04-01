package com.example.listspinnerautocomplete;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MultiAutoComplete extends AppCompatActivity {
    MultiAutoCompleteTextView multiAutoCompleteTextView;
    String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_auto_complete);
        multiAutoCompleteTextView = findViewById(R.id.multiautoview);

        arrayAdapter = new ArrayAdapter(MultiAutoComplete.this, android.R.layout.simple_list_item_1,days);
        multiAutoCompleteTextView.setAdapter(arrayAdapter);
        multiAutoCompleteTextView.setThreshold(1);

    }
}