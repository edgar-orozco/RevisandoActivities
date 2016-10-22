package mx.lxl.revisandoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Mostrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        Bundle extras = getIntent().getExtras();

        TextView tvNombre = (TextView) findViewById(R.id.textViewNombre);
        TextView tvTelefono = (TextView) findViewById(R.id.textViewTelefono);
        TextView tvFechaNacimiento = (TextView) findViewById(R.id.textViewFechaNacimiento);
        TextView tvEmail = (TextView) findViewById(R.id.textViewEmail);
        TextView tvDescirpcionContacto = (TextView) findViewById(R.id.textViewDescripcionContacto);

        tvNombre.setText((CharSequence) extras.get("nombre"));
        tvFechaNacimiento.setText((CharSequence) extras.get("fechaNacimiento"));
        tvTelefono.setText((CharSequence) extras.get("telefono"));
        tvEmail.setText((CharSequence) extras.get("email"));
        tvDescirpcionContacto.setText((CharSequence) extras.get("descripcionContacto"));

        Button btnEditar = (Button) findViewById(R.id.buttonEditar);
        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
