package mx.devf.ruteando;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;



//s<dfgchg


public class MainActivity extends ActionBarActivity {

    // significa que esta funcion esta sobrecargada en su papa, su papi es ActionBarActivity
    //onCreate significa abrir
    //super se refiere a que cuando se ejecute primero ejecuta las funciones de su papa
    //setontentView es mostra la vista
    //void es para especificar que la funcion no regresa nada
    //Toast es Imprimir


   Button btnAceptar; //todas estas son variables



   LinearLayout ocio;

   LinearLayout comida;

   LinearLayout cultura;

   LinearLayout compras;

  // tambien se podria poner: LinearLayout ocio, comida, compras, cultura; //


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ocio= (LinearLayout)findViewById(R.id.layout_ocio);
        ocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentOcio = new Intent(MainActivity.this,OcioActivity.class);
                startActivity(intentOcio);
            }
        });

        comida = (LinearLayout)findViewById(R.id.layout_comida);
        comida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentComida = new Intent(MainActivity.this,Comida.class);
                startActivity(intentComida);

            }
        });

        cultura = (LinearLayout)findViewById(R.id.layout_cultura);
        cultura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCultura = new Intent(MainActivity.this,Cultura.class);
                startActivity(intentCultura);

            }
        });

        compras = (LinearLayout)findViewById(R.id.layout_compras);
        compras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCompras = new Intent(MainActivity.this,Compras_Activity.class);
                startActivity(intentCompras);

            }
        });

        btnAceptar = (Button)findViewById(R.id.btn_aceptar);//al poner button entre parentesis estas diciendo que lo que sigue en esa oracion es un boton

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //"cada vez que toquen el boton vas a hacer esto:
                Intent intentMapas = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intentMapas);
            }
        });

        Log.i("Ciclo de vida"," se ejecuto el metodo on create");
  
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo de vida"," se ejecuto el metodo on start");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ciclo de vida"," se ejecuto el metodo on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ciclo de vida"," se ejecuto el metodo on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ciclo de vida"," se ejecuto el metodo on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ciclo de vida"," se ejecuto el metodo on destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ciclo de vida"," se ejecuto el metodo on restart");
    }

}
