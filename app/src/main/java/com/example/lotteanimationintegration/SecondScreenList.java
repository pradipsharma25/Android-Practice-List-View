package com.example.lotteanimationintegration;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class SecondScreenList extends AppCompatActivity {

    ListView listview;
    Spinner spinner;
    AutoCompleteTextView actxtview;

    ArrayList<String> arrList = new ArrayList<>();
    ArrayList<String> spinList = new ArrayList<>();

    ArrayList<String> actList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second_screen_list);

        listview = findViewById(R.id.listview);
        spinner = findViewById(R.id.spinner);
        actxtview = findViewById(R.id.actxtview);

        arrList.add("Pradip");
        arrList.add("Aditya");
        arrList.add("Musharif");
        arrList.add("Siddartha");
        arrList.add("Pradip");
        arrList.add("Aditya");
        arrList.add("Musharif");
        arrList.add("Siddartha");
        arrList.add("Pradip");
        arrList.add("Aditya");
        arrList.add("Musharif");
        arrList.add("Siddartha");
        arrList.add("Pradip");
        arrList.add("Aditya");
        arrList.add("Musharif");
        arrList.add("Siddartha");
        arrList.add("Pradip");
        arrList.add("Aditya");
        arrList.add("Musharif");
        arrList.add("Siddartha");
        arrList.add("Pradip");
        arrList.add("Aditya");
        arrList.add("Musharif");
        arrList.add("Siddartha");

        ArrayAdapter<String> arrayAdap = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrList);
        listview.setAdapter(arrayAdap);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(getApplicationContext(),"Item 1 is clicked", Toast.LENGTH_LONG).show();
                } else if (position == 1) {
                    Toast.makeText(getApplicationContext(),"Item 2 is clicked",Toast.LENGTH_LONG).show();
                }

            }
        });

        spinList.add("Voter ID");
        spinList.add("Citizen ship");
        spinList.add("ID card");
        spinList.add("Passport");
        spinList.add("National Card");

        ArrayAdapter<String> spinAdap = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,spinList);
        spinner.setAdapter(spinAdap);


        //AutoCompleteTextView
        actList.add("C");
        actList.add("Java");
        actList.add("Python");
        actList.add("JavaScript");
        actList.add("C#");
        actList.add("Ruby");
        actList.add("C++");

        ArrayAdapter<String> acAdap = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,actList);
        actxtview.setAdapter(acAdap);
        actxtview.setThreshold(1);
    }
}