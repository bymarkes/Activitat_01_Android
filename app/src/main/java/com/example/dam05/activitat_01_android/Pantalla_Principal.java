package com.example.dam05.activitat_01_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.CheckBox;

public class Pantalla_Principal extends AppCompatActivity {

    EditText txtName;
    EditText txtSurname;
    EditText txtAge;
    CheckBox permet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla__principal);

        txtName=(EditText)findViewById(R.id.name);
        txtSurname=(EditText)findViewById(R.id.surname);
        txtAge=(EditText)findViewById(R.id.age);
        permet=(CheckBox)findViewById(R.id.checkBoxPermet);
    }
    public void premerBoto(View v)
    {
        if(permet.isChecked()){
            Bundle b = new Bundle();
            b.putString("Nom",txtName.getText().toString());
            b.putString("Cognom",txtSurname.getText().toString());
            b.putString("Edat",txtAge.getText().toString());
            Intent intencio= new Intent(Pantalla_Principal.this,Segona_Pantalla.class);
            intencio.putExtras(b);
            startActivity(intencio);
        }
    }
}
