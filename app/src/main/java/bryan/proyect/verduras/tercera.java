package bryan.proyect.verduras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tercera extends AppCompatActivity {

    TextView texto;
    Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        texto = findViewById(R.id.txtResultado);
        volver = findViewById(R.id.btnVolver);
        double resultado = getIntent().getDoubleExtra("mensaje",0);

        texto.setText((String.valueOf(resultado)));
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });


    }
}




