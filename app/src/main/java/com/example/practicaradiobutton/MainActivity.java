package com.example.practicaradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed1;
    private EditText ed2;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Relación de valores entre la parte gráfica y la parte lógica
        ed1 = (EditText)findViewById(R.id.txt_num1);
        ed2 = (EditText)findViewById(R.id.txt_num2);
        rb1 = (RadioButton)findViewById(R.id.rb_suma);
        rb2 = (RadioButton)findViewById(R.id.rb_resta);
        rb3 = (RadioButton)findViewById(R.id.rb_mult);
        rb4 = (RadioButton)findViewById(R.id.rb_div);
        tv1 = (TextView)findViewById(R.id.tv_resul);
    };

    // Método para realizar operaciones al dar click al botón
    public void Operaciones(View view){
        //Nos traemos el texto de la parte gráfica (llegan en formato String)
        String strNum1 = ed1.getText().toString();
        String strNum2 = ed2.getText().toString();

        //Pasamos los valores a enteros para poder hacer operaciones
        int Num1 = Integer.parseInt(strNum1);
        int Num2 = Integer.parseInt(strNum2);

        //Hacemos los cálculos
        if(rb1.isChecked() == true){
            int suma = Num1 + Num2;
            // Pasamos el resultado a String
            String result = String.valueOf(suma);
            // Enviamos el resultado a la GUI
            tv1.setText(result);
        }else if(rb2.isChecked() == true){
            int resta = Num1 - Num2;
            // Pasamos el resultado a String
            String result = String.valueOf(resta);
            // Enviamos el resultado a la GUI
            tv1.setText(result);
        }else if(rb3.isChecked() == true){
            int mult = Num1 * Num2;
            // Pasamos el resultado a String
            String result = String.valueOf(mult);
            // Enviamos el resultado a la GUI
            tv1.setText(result);
        }else if(rb4.isChecked() == true){
            if(Num2 == 0){
                Toast.makeText(this, "El segundo valor no debe ser cero !!!", Toast.LENGTH_SHORT).show();
            }else{
                int div = Num1 / Num2;
                // Pasamos el resultado a String
                String result = String.valueOf(div);
                // Enviamos el resultado a la GUI
                tv1.setText(result);
            }
        }


    }
}