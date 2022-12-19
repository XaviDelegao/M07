package com.example.m07_buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class Buttons_Extended extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_extended);
    }

    public void rPagina(View v){
        Intent i = new Intent(this, activity6.class);
        startActivity(i);

    }
    public void nPagina(View v){
        Intent i = new Intent(this, Formulari.class);
        startActivity(i);

    }
    boolean carne = false;
    boolean queso = false;
    boolean pan = false;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_meat:
                if (checked) {
                    carne = true;
                }else {
                    carne = false;
                    break;
                }
            case R.id.checkbox_cheese:
                if (checked) {
                    queso = true;
                }else {
                    queso = false;
                    break;
                }

        }
    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radio_normal:
                if (checked)
                    pan = false;
                break;
            case R.id.radio_integral:
                if (checked)
                    pan = true;
                break;
        }



    }

    public void canvi(View view) {
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText("Hola Mon!");

        if(carne == true && queso == true && pan == true){
            tv.setText("Tu bocata es de pan integral con carne y queso");
        }

        if(carne == false && queso == true && pan == true){
            tv.setText("Tu bocata es de pan integral con queso");
        }
        if(carne == true && queso == false && pan == true){
            tv.setText("Tu bocata es de pan integral con carne");
        }

        if(carne == true && queso == true && pan == false){
            tv.setText("Tu bocata es de carne y queso");
        }

        if(carne == false && queso == true && pan == false){
            tv.setText("Tu bocata es de queso");
        }
        if(carne == true && queso == false && pan == false){
            tv.setText("Tu bocata es de carne");
        }
        if(carne == false && queso == false){
            tv.setText("Pan con pan comida de tontos!");
        }

    }
}