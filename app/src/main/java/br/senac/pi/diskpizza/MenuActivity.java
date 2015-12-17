package br.senac.pi.diskpizza;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    RadioButton cbAlhoeOleo, cbAlicci, cbAmericana, cbAtum, cbBacon,cbBaiana ,cbBolonhesa ,cbBrasileira ,cbBrócolis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cbAlhoeOleo = (RadioButton) findViewById(R.id.chkBox1);
        cbAlicci = (RadioButton) findViewById(R.id.chkBox2);
        cbAmericana = (RadioButton) findViewById(R.id.chkBox3);
        cbAtum = (RadioButton) findViewById(R.id.chkBox4);
        cbBacon = (RadioButton) findViewById(R.id.chkBox5);
        cbBaiana = (RadioButton) findViewById(R.id.chkBox6);
        cbBolonhesa = (RadioButton) findViewById(R.id.chkBox7);
        cbBrasileira = (RadioButton) findViewById(R.id.chkBox8);
        cbBrócolis = (RadioButton) findViewById(R.id.chkBox9);

        findViewById(R.id.btnSabores).setOnClickListener(abrirPedidos());

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    private View.OnClickListener abrirPedidos(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, PedidoActivity.class);
                startActivity(intent);
            }
        };
    }


}
