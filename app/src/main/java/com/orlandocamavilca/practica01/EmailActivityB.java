package com.orlandocamavilca.practica01;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class EmailActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_b);
        Button btnSend = (Button) findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                /* obtenemos los datos para el env’o del correo */
                EditText etEmail = (EditText) findViewById(R.id.etEmail);
                EditText etSubject = (EditText) findViewById(R.id.etSubject);
                EditText etBody = (EditText) findViewById(R.id.etBody);
                CheckBox chkAttachment = (CheckBox) findViewById(R.id.chkAttachment);

                /* es necesario un intent que levante la actividad deseada */
                Intent itSend = new Intent(android.content.Intent.ACTION_SEND);

                /* vamos a enviar texto plano a menos que el checkbox estŽ marcado */
                itSend.setType("plain/text");

                /* colocamos los datos para el env’o */
                itSend.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{ etEmail.getText().toString()});
                itSend.putExtra(android.content.Intent.EXTRA_SUBJECT, etSubject.getText().toString());
                itSend.putExtra(android.content.Intent.EXTRA_TEXT, etBody.getText());

                /* revisamos si el checkbox est‡ marcado enviamos el ’cono de la aplicaci—n como adjunto */
                if (chkAttachment.isChecked()) {
                    /* colocamos el adjunto en el stream */
                    itSend.putExtra(Intent.EXTRA_STREAM, Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.icon));

                    /* indicamos el tipo de dato */
                    itSend.setType("image/png");
                }

                /* iniciamos la actividad */
                startActivity(itSend);

            }
        });
    }
}
