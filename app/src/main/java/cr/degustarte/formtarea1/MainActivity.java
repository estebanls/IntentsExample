package cr.degustarte.formtarea1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView idUsuarioLogin,idContrasenaLogin;
    Button idBotonLogin,idBotonRegistro;
    Persona persona;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;
        initComponents();
    }

    public void initComponents(){
        idUsuarioLogin = (TextView) findViewById(R.id.idUsuarioLogin);
        idContrasenaLogin = (TextView) findViewById(R.id.idContrasenaLogin);
        idBotonLogin = (Button) findViewById(R.id.idBotonLogin);
        idBotonRegistro = (Button) findViewById(R.id.idBotonRegistro);

        idBotonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        idBotonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                persona = new Persona();
                persona.setUsuario(idUsuarioLogin.getText().toString());
                Intent intentRegistro = new Intent(activity,RegistroActivity.class);
                intentRegistro.putExtra("persona",persona);
                startActivity(intentRegistro);
            }
        });
    }
}
