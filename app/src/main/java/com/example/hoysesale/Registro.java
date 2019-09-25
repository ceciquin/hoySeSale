package com.example.hoysesale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        final EditText nombreT = findViewById(R.id.editText3);
        final EditText apellidor = findViewById(R.id.editText4);
        final EditText emailH = findViewById(R.id.editText5);
        final EditText contraseñaY = findViewById(R.id.editText6);

        Button registrarse = findViewById(R.id.button);

        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = nombreT.getText().toString();
                String apellido = apellidor.getText().toString();
                String email = emailH.getText().toString();
                String contraseña = contraseñaY.getText().toString();

            }
        });

    }
}
