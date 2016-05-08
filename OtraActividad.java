package com.example.germanriveros.abrirotraactividad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by germanriveros on 08-05-16.
 */

public class OtraActividad extends Activity {


    private Button btn_volver;
    @Override
    protected void onCreate(Bundle saveInstanceState)
    {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.otra_actividad);


        btn_volver = (Button) findViewById(R.id.btn_volver);

        btn_volver.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                //de todas formas se puede volver presionando back <- en el dispositivo
                startActivity(new Intent(OtraActividad.this, MainActivity.class));
            }
        });

    }


}
