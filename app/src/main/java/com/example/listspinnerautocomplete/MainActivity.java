package com.example.listspinnerautocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String viewtype[]={"Spinner","AutoComplete","MultiAutocomplete"};
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview1);
        arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,viewtype);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (viewtype[position]){
                    case "Spinner":
                    {Toast.makeText(MainActivity.this,viewtype[position],Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,SpinnerActivity.class);
                        startActivity(intent);
                    break;}
                    case "AutoComplete":

                    {
                        Toast.makeText(MainActivity.this, viewtype[position], Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(MainActivity.this,Autocomplete.class);
                        startActivity(intent2);
                        break;
                    }
                    case "MultiAutocomplete":
                    {

                        Toast.makeText(MainActivity.this, viewtype[position], Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(MainActivity.this,MultiAutoComplete.class);
                        startActivity(intent3);
                        break;
                    }
                }
            }
        });
    }
}