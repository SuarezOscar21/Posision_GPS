package ec.edu.tecnologicoloja.posision_gps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nombre, latitud, longitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void guardar(View v){
        

    }

    public void verlista(View v){
        Integer i = new Integer(this, list_puntos.class);
        i.putExtra("datos", nombre,latitud,latitud.getText().toString());
        startActivity(i);


    }
}