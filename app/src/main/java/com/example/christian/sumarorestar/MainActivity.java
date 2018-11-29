package com.example.christian.sumarorestar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNum1;
    private EditText etNum2;
    private TextView tv1;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       etNum1= (EditText)findViewById(R.id.txtNum1);
       etNum2=(EditText)findViewById(R.id.txtNum2);
       tv1= (TextView)findViewById(R.id.txtResultado);
       rb1= (RadioButton)findViewById(R.id.rbSumar);
       rb2= (RadioButton)findViewById(R.id.rbRestar);
    }

    public void Calcular (View  view) {

        String num1String  = etNum1.getText().toString();
        String num2String  = etNum2.getText().toString();

        int num1Int = Integer.parseInt(num1String);
        int num2Int = Integer.parseInt(num2String);

        if (rb1.isChecked()== true){

            int suma = num1Int +num2Int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);

        }else if (rb2.isChecked()==true){
            int resta= num1Int-num2Int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);


        }



    }


}
