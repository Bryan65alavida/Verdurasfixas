package bryan.proyect.verduras;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText texto;
    EditText costoVerdurasEditText;
    EditText totalPorHectareasEditText;
    Button botonCalcular;
    Button botonLimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.txtVerduras);
        botonCalcular = findViewById(R.id.btnCalcular);
        botonLimpiar = findViewById(R.id.btnLimpiar);
        costoVerdurasEditText = findViewById(R.id.txtVerduras);
        totalPorHectareasEditText = findViewById(R.id.txtHectarea);


        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mostrar resultados en el TextView
                // INTENTO DE CALCULO
                String costoVerdurasTexto = costoVerdurasEditText.getText().toString();
                String totalPorHectareasTexto = totalPorHectareasEditText.getText().toString();
                double costoTotalVerduras = Double.parseDouble(costoVerdurasTexto);
                double totalHectareas = Double.parseDouble(totalPorHectareasTexto);
                double resultado = costoTotalVerduras * totalHectareas;



                Intent intent = new Intent(getApplicationContext(), tercera.class);
                intent.putExtra("mensaje", resultado);
                startActivity(intent);
                finish();
            }
        });
        botonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // LIMPIAR CAMPOS
                costoVerdurasEditText.setText("");
                totalPorHectareasEditText.setText("");
            }
        });
    }
}