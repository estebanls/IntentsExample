package cr.degustarte.formtarea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity {
    EditText idNombre,idCorreo, idEdad,idContrasena,idUsuario;
    Button idBotonGuardar;
    Persona persona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        initComponents();
        persona = new Persona();
        persona = (Persona) getIntent().getSerializableExtra("persona");
        idUsuario.setText(persona.getUsuario());
    }

    public void initComponents(){
        idNombre = (EditText) findViewById(R.id.idNombre);
        idEdad = (EditText) findViewById(R.id.idEdad);
        idCorreo = (EditText) findViewById(R.id.idCorreo);
        idUsuario = (EditText) findViewById(R.id.idUsuario);
        idContrasena = (EditText) findViewById(R.id.idContrasena);
        idBotonGuardar = (Button) findViewById(R.id.idBotonGuardar);

        idBotonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Esto se realiza en clase (Share Preference)
            }
        });
    }


}
