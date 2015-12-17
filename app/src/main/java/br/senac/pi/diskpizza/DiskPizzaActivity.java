package br.senac.pi.diskpizza;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class DiskPizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disk_pizza);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        //My Code
        findViewById(R.id.txtBtnOp1).setOnClickListener(abrirMenu());
        findViewById(R.id.txtBtnCtt).setOnClickListener(abrirContato());
        findViewById(R.id.txtBtnSab).setOnClickListener(abrirSabores());
        findViewById(R.id.txtBtnProm).setOnClickListener(abrirPromocoes());
    }

    //My Code
    private View.OnClickListener abrirMenu(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiskPizzaActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        };
    }
    private View.OnClickListener abrirContato(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiskPizzaActivity.this, ContatoActivity.class);
                startActivity(intent);
            }
        };
    }
    private View.OnClickListener abrirSabores(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiskPizzaActivity.this, SaboresActivity.class);
                startActivity(intent);
            }
        };
    }
    private View.OnClickListener abrirPromocoes(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiskPizzaActivity.this, PromocoesActivity.class);
                startActivity(intent);
            }
        };
    }
    //End My Code

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_disk_pizza, menu);
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
