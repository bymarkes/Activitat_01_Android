package com.example.dam05.activitat_01_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Segona_Pantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segona__pantalla);

        TextView lblName = (TextView) findViewById(R.id.nameView);
        TextView lblSurname = (TextView) findViewById(R.id.surnameView);
        TextView lblAge = (TextView) findViewById(R.id.ageView);

        Bundle b = getIntent().getExtras();
        lblName.setText(b.getString("Nom"));
        lblSurname.setText(b.getString("Cognom"));
        lblAge.setText(b.getString("Edat"));

    }
}
