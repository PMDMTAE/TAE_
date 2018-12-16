package com.example.jessi.tae;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.io.Serializable;
import java.util.Locale;

public class ajustesActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToogle;
    private Usuario usuario;
    private RadioButton botonEspanol;
    private RadioButton botonIngles;
    private RadioButton botonFrances;
    private RadioButton botonItaliano;
    private RadioButton botonPortugues;
    private int nuevoIdioma;
    private Button actualizar;
    private EditText editText;
    private EditText editText2;
    private TextView textView2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        usuario = (Usuario)bundle.getSerializable("usuario");
        nuevoIdioma = usuario.getIdioma();
        EstablecerIdioma(usuario.getIdioma());
        setContentView(R.layout.activity_ajustes);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.ajustes);
        mToogle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.abrir,R.string.cerrar);
        mDrawerLayout.addDrawerListener(mToogle);
        mToogle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navAjustes);
        View headerView = navigationView.getHeaderView(0);
        TextView _email = (TextView) headerView.findViewById(R.id.txtemail);
        _email.setText(usuario.getEmail());

        editText=(EditText) findViewById(R.id.editText);
        editText.setText(usuario.getEmail());
        editText2=(EditText) findViewById(R.id.editText2);
        editText.setText(usuario.getPassword());
        textView2=(TextView) findViewById(R.id.textView2);
        textView3=(TextView) findViewById(R.id.textView3);

        if(usuario.getId()==0){
            editText.setVisibility(View.INVISIBLE);
            editText2.setVisibility(View.INVISIBLE);
            textView2.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
        }

        botonEspanol=(RadioButton) findViewById(R.id.radioButton1);
        botonEspanol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //usuario.setIdioma(1);
                nuevoIdioma=1; }
        });
        botonIngles=(RadioButton) findViewById(R.id.radioButton2);
        botonIngles.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //usuario.setIdioma(2);
                nuevoIdioma=2;}
        });
        botonFrances=(RadioButton) findViewById(R.id.radioButton3);
        botonFrances.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //usuario.setIdioma(3);
                nuevoIdioma=3;}
        });
        botonItaliano=(RadioButton) findViewById(R.id.radioButton4);
        botonItaliano.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //usuario.setIdioma(4);
                nuevoIdioma=4;}
        });
        botonPortugues=(RadioButton) findViewById(R.id.radioButton5);
        botonPortugues.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //usuario.setIdioma(5);
                nuevoIdioma=5;}
        });


        actualizar=(Button) findViewById(R.id.buttonActualizar);
        actualizar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent principal = new Intent(getApplicationContext(), principalActivity.class);
                usuario.setIdioma(nuevoIdioma);
                principal.putExtra("usuario", (Serializable) usuario);
                startActivity(principal);
          }
      });


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.historia:
                        Intent historia = new Intent(getApplicationContext(), ajustesActivity.class);
                        historia.putExtra("usuario", (Serializable) usuario);
                        startActivity(historia);
                        break;
                    case R.id.saludo:
                        Intent saludo = new Intent(getApplicationContext(), saludoActivity.class);
                        saludo.putExtra("usuario", (Serializable) usuario);
                        startActivity(saludo);
                        break;
                    case R.id.ponercinturon:
                        Intent ponercinturon = new Intent(getApplicationContext(), ponercinturonActivity.class);
                        ponercinturon.putExtra("usuario", (Serializable) usuario);
                        startActivity(ponercinturon);
                        break;
                    case R.id.nivelescinturon:
                        Intent nivelescinturon = new Intent(getApplicationContext(),nivelescinturonActivity.class);
                        nivelescinturon.putExtra("usuario", (Serializable) usuario);
                        startActivity(nivelescinturon);
                        break;
                    case R.id.amarillo:
                        Intent amarillo = new Intent(getApplicationContext(),amarilloActivity.class);
                        amarillo.putExtra("usuario", (Serializable) usuario);
                        startActivity(amarillo);
                        break;
                    case R.id.naranja:
                        Intent naranja = new Intent(getApplicationContext(),naranjaActivity.class);
                        naranja.putExtra("usuario", (Serializable) usuario);
                        startActivity(naranja);
                        break;
                    case R.id.verde:
                        Intent verde = new Intent(getApplicationContext(),verdeActivity.class);
                        verde.putExtra("usuario", (Serializable) usuario);
                        startActivity(verde);
                        break;
                    case R.id.azul:
                        Intent azul = new Intent(getApplicationContext(),azulActivity.class);
                        azul.putExtra("usuario", (Serializable) usuario);
                        startActivity(azul);
                        break;
                    case R.id.marron:
                        Intent marron = new Intent(getApplicationContext(),marronActivity.class);
                        marron.putExtra("usuario", (Serializable) usuario);
                        startActivity(marron);
                        break;
                    case R.id.negro:
                        Intent negro = new Intent(getApplicationContext(),negroActivity.class);
                        negro.putExtra("usuario", (Serializable) usuario);
                        startActivity(negro);
                        break;
                    case R.id.terminologia:
                        Intent terminologia = new Intent(getApplicationContext(),terminologiaActivity.class);
                        terminologia.putExtra("usuario", (Serializable) usuario);
                        startActivity(terminologia);
                        break;
                    case R.id.partescuerpo:
                        Intent partescuerpo = new Intent(getApplicationContext(),partescuerpoActivity.class);
                        partescuerpo.putExtra("usuario", (Serializable) usuario);
                        startActivity(partescuerpo);
                        break;
                    case R.id.sobrenosotros:
                        Intent sobrenosotros = new Intent(getApplicationContext(), sobrenosotrosActivity.class);
                        sobrenosotros.putExtra("usuario", (Serializable) usuario);
                        startActivity(sobrenosotros);
                        break;
                    case R.id.frases:
                        Intent frases = new Intent(getApplicationContext(), frasesActivity.class);
                        frases.putExtra("usuario", (Serializable) usuario);
                        startActivity(frases);
                        break;
                    case R.id.federaciones:
                        Intent federaciones = new Intent(getApplicationContext(), federacionesActivity.class);
                        federaciones.putExtra("usuario", (Serializable) usuario);
                        startActivity(federaciones);
                        break;
                    case R.id.reglamento:
                        Intent reglamento = new Intent(getApplicationContext(), reglamentoActivity.class);
                        reglamento.putExtra("usuario", (Serializable) usuario);
                        startActivity(reglamento);
                        break;
                    case R.id.mapa:
                        Intent mapa = new Intent(getApplicationContext(), mapaActivity.class);
                        mapa.putExtra("usuario", (Serializable) usuario);
                        startActivity(mapa);
                        break;
                    case R.id.ajustes:
                        Intent ajustes = new Intent(getApplicationContext(), ajustesActivity.class);
                        ajustes.putExtra("usuario", (Serializable) usuario);
                        startActivity(ajustes);
                        break;
                    case R.id.salir:
                        finish();
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });
    }

    private void EstablecerIdioma(int idioma) {
        switch (idioma) {
            case 2:
                Locale locale2 = new Locale("en");
                Locale.setDefault(locale2);
                Configuration config2 = new Configuration();
                config2.locale = locale2;
                getBaseContext().getResources().updateConfiguration(config2, getBaseContext().getResources().getDisplayMetrics());
                break;

            case 3:
                Locale locale3 = new Locale("fr");
                Locale.setDefault(locale3);
                Configuration config3 = new Configuration();
                config3.locale = locale3;
                getBaseContext().getResources().updateConfiguration(config3, getBaseContext().getResources().getDisplayMetrics());
                break;

            case 4:
                Locale locale4 = new Locale("it");
                Locale.setDefault(locale4);
                Configuration config4 = new Configuration();
                config4.locale = locale4;
                getBaseContext().getResources().updateConfiguration(config4, getBaseContext().getResources().getDisplayMetrics());
                break;

            case 5:
                Locale locale5 = new Locale("pt");
                Locale.setDefault(locale5);
                Configuration config5 = new Configuration();
                config5.locale = locale5;
                getBaseContext().getResources().updateConfiguration(config5, getBaseContext().getResources().getDisplayMetrics());
                break;

            default:
                Locale locale = new Locale("es");
                Locale.setDefault(locale);
                Configuration config = new Configuration();
                config.locale = locale;
                getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        ////this.mMenu = menu;
        //MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.menu.drawermenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToogle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}