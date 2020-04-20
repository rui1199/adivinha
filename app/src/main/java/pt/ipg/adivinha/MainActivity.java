package pt.ipg.adivinha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private Random random = new Random();
    private int numeroadivinha = random.nextInt(11);

    private EditText textInputNumero;
    private EditText textViewresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBotaosubmeter (View view) {
        EditText textInputNumero = (EditText) findViewById(R.id.textInputNumero);

        String numero1 = textInputNumero.getText().toString();
        int numero;
        try {
            numero = Integer.parseInt(numero1);
        }catch (NumberFormatException e){
            textInputNumero.setError("diga um numero de 0 a 10");
            textInputNumero.requestFocus();
            return;
        }
        if(numero <0||numero>10){
            textInputNumero.setError("tem de ser entre 0 e 10");
            textInputNumero.requestFocus();
            return;
        }
        if(numero==numeroadivinha){
            textViewresultado.setText("Correto");
        }else{
            textViewresultado.setText("Errado");
        }
    }
}
