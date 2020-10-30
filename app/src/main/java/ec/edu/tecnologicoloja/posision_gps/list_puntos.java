package ec.edu.tecnologicoloja.posision_gps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class list_puntos extends AppCompatActivity {

    private TextView nombre, latitud,longitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_puntos);

        nombre= (TextView)findViewById(R.id.tx_nom);
        latitud= (TextView)findViewById(R.id.tx_lat);
        longitud= (TextView)findViewById(R.id.tx_long);
        String datos =getIntent().getStringExtra("dato");
        nombre.setText(""+datos);
        latitud.setText(""+datos);
        latitud.setText(""+datos);
    }
    }
