package com.example.m07_buttons;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Formulari extends AppCompatActivity {

    private SharedPreferences mPreferences;
    private EditText email, nom, cognom, telefon,direccio;
    private android.widget.Spinner spin;

    public void sData(){
        mPreferences = getApplicationContext().getSharedPreferences(
                getString(R.string.preference_file_key), Context.MODE_PRIVATE) ;
        SharedPreferences.Editor preferencesEditor = mPreferences.edit();

        telefon =findViewById(R.id.telefono);
        email =findViewById(R.id.correo);
        nom =findViewById(R.id.nom);
        cognom =findViewById(R.id.apellido);
        direccio =findViewById(R.id.direccion);
        spin = findViewById(R.id.spinner_sexe);


        preferencesEditor.putString("Telefono", String.valueOf(telefon.getText()));
        preferencesEditor.putString("Email", String.valueOf(email.getText()));
        preferencesEditor.putString("Nom", String.valueOf(nom.getText()));
        preferencesEditor.putString("Cognom", String.valueOf(cognom.getText()));
        preferencesEditor.putString("Direccio", String.valueOf(direccio.getText()));
        preferencesEditor.putInt("Spin", spin.getSelectedItemPosition());
        preferencesEditor.apply();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulari);
        EditText nombre = (EditText) findViewById(R.id.nom);
        SpannableString mitexto = new SpannableString("Escribe tu nombre ");
        StyleSpan boldspan1 = new StyleSpan(Typeface.BOLD);
        StyleSpan boldspan2 = new StyleSpan(Typeface.BOLD);
        mitexto.setSpan(boldspan1,11,17,Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        mitexto.setSpan(boldspan2,18,mitexto.length(),Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        nombre.setText(mitexto);

        mPreferences = getSharedPreferences(getString(R.string.preference_file_key),Context.MODE_PRIVATE);
        telefon =findViewById(R.id.telefono);
        email =findViewById(R.id.correo);
        nom =findViewById(R.id.nom);
        cognom =findViewById(R.id.apellido);
        direccio =findViewById(R.id.direccion);
        spin = findViewById(R.id.spinner_sexe);

        telefon.setText(mPreferences.getString("Telefono",""));
        email.setText(mPreferences.getString("Email",""));
        nom.setText(mPreferences.getString("Nom",""));
        cognom.setText(mPreferences.getString("Cognom",""));
        direccio.setText(mPreferences.getString("Direccio",""));
        spin.setSelection(mPreferences.getInt("Spin",0));

        }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("hola", "onPause");
        sData();

    }
    public void nPagina(View v){
        Intent i = new Intent(this, Buttons_Extended.class);
        startActivity(i);


    }
    public void nPagina8(View v){
        Intent i = new Intent(this, Rycler.class);
        startActivity(i);


    }
}