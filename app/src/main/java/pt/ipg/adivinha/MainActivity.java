package pt.ipg.adivinha;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private int numeroAdivinhar = NumeroAleatorio.proximoNumero();
    private EditText textInputNumero;
    private EditText textViewresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int soma;
    public void onClickBotaosubmeter (View view) {
        EditText textInputNumero = (EditText) findViewById(R.id.textInputNumero);

        String numero1 = textInputNumero.getText().toString();
        int numero;
        try {
            numero = Integer.parseInt(numero1);
        }catch (NumberFormatException e){
            textInputNumero.setError(getString(R.string.numero_ob));
            textInputNumero.requestFocus();
            return;
        }
        if(numero <0||numero>10){
            textInputNumero.setError(getString(R.string.numero_lim));
            textInputNumero.requestFocus();
            return;
        }
        TextView textViewtentativas = findViewById(R.id.textViewtentativas);
        TextView textViewresultado = findViewById(R.id.textViewresultado);

        if(numeroAdivinhar == numero ){
            textViewresultado.setText(R.string.resultado_certo);
            textViewresultado.setTextColor(Color.BLUE);
            textViewresultado.requestFocus();
        } else{
            soma++;
            textViewresultado.setText(R.string.resultado_errado);
            textViewresultado.setTextColor(Color.RED);
            textViewtentativas.setText(String.valueOf(soma));
        }

    }
}
