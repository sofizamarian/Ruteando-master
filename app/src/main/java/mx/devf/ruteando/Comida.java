package mx.devf.ruteando;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Comida extends ActionBarActivity {

    ListView listaDeRutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);



        listaDeRutas = (ListView)findViewById(R.id.lista_comida);
        //solo para prueba
        String nombresDeRutas [] = {"Mexicana","Argentina","Italiana","Chatarra"};

        //para adaptar los arreglos a la vista, osea los string
        ArrayAdapter<String> adaptadorDeLista = new ArrayAdapter<String>(Comida.this,
                R.layout.item_lista_rutas,
                R.id.item_ruta,
                nombresDeRutas);

        listaDeRutas.setAdapter(adaptadorDeLista);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_comida, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
