package com.apecssi.miprimeraappli;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button miBotonIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Enlace con la vista
        miBotonIngresar=findViewById(R.id.btnIngreso);//Enlazamos el elemento.
        iniciaControl();
    }

    private void iniciaControl(){
        miBotonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Enlazar el text usuario
                EditText miTxtUsario=findViewById(R.id.txtUsuario);
                //Obtengo el valor
                String usuario= miTxtUsario.getText().toString();
                //Comunicado los dos activities a traves intent
                Intent intent= new Intent(getApplicationContext(),MenuPrincipal.class);
                //Enviar toda informacion al activiy 2
                intent.putExtra("usuarioNombre",usuario);
                //Inicio la activity enlazado
                startActivity(intent);
            }
        });

    }
}