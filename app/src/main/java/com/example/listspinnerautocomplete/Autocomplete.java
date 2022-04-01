package com.example.listspinnerautocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Autocomplete extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    String day[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autocomplete);

        autoCompleteTextView = findViewById(R.id.autocompletemethod);
        arrayAdapter = new ArrayAdapter(Autocomplete.this, android.R.layout.simple_list_item_1,day);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(1);

    }
}