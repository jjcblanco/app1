/*
* Agregado de cabecera
*
* */

package com.example.miap1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText nro1;
    EditText nro2;
    TextView res;
    String dato1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        boton = findViewById(R.id.botonito);
        nro1 = findViewById(R.id.editTextNumber);
        nro2 = findViewById(R.id.editTextNumber2);
        res = findViewById(R.id.textView);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Bienvenido a mi app .. tocaste el boton");
                dato1= nro1.getText().toString();
                Toast pepe= null;

                pepe = Toast.makeText(getApplicationContext(),"dfdfd",Toast.LENGTH_LONG);

                pepe.show();

                Intent login_error = new Intent(MainActivity.this, login_error.class);
                MainActivity.this.startActivity(login_error);

            }
        });

    }
}