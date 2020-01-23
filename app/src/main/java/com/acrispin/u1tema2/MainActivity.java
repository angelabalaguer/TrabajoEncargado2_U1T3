package com.acrispin.u1tema2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.acrispin.u1tema2.FragmentTabHost.MiFragmentTabhost;
import com.acrispin.u1tema2.Multimedia.Multimedia;
import com.acrispin.u1tema2.mireciclerview.MiRecyclerView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawerlayout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Navigation Drawer
        DrawerLayout drawer = (DrawerLayout) findViewById(
                R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                drawer, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(
                R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true; /** true -> el menú ya está visible */
    }
    @Override public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.accion_compartir) {
            Intent paramView;
            paramView = new Intent("android.intent.action.SEND");
            paramView.setType("text/plain");
            paramView.putExtra("android.intent.extra.TEXT", "Descarga nuestra app de la PlayStore" +
                    " \n" + "https://play.google.com/store/apps/details?id=app.product.demarktec.alo14_pasajero");
            startActivity(Intent.createChooser(paramView, "Comparte Nuestro aplicativo"));
            return true;
        }
        if (id == R.id.accion_salir) {
            finish();
            return true;
        }
        if (id == R.id.activity_intenciones) {
            startActivity(new Intent(this, Intenciones.class));
            return true;
        }
        if (id == R.id.activity_multimedia) {
            startActivity(new Intent(this, Multimedia.class));
            return true;
        }
        if (id == R.id.activity_permisos) {
            startActivity(new Intent(this, Permisos.class));
            return true;
        }
        if (id == R.id.activity_mirecyclerview) {
            startActivity(new Intent(this, MiRecyclerView.class));
            return true;
        }
        if (id == R.id.activity_fragmenttabhost) {
            startActivity(new Intent(this, MiFragmentTabhost.class));
            return true;
        }


        return super.onOptionsItemSelected(item);
    }


    public void Musica(View view) {
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_compartir:
                Intent paramView;
                paramView = new Intent("android.intent.action.SEND");
                paramView.setType("text/plain");
                paramView.putExtra("android.intent.extra.TEXT", "Descarga nuestra app de la PlayStore" +
                        " \n" + "https://play.google.com/store/apps/details?id=app.product.demarktec.alo14_pasajero");
                startActivity(Intent.createChooser(paramView, "Comparte Nuestro aplicativo"));
                break;
            case R.id.accion_salir:
                finish();
                break;
            case R.id.activity_intenciones:
                startActivity(new Intent(this, Intenciones.class));
                break;

            case R.id.activity_multimedia:
                startActivity(new Intent(this, Multimedia.class));
                break;
            case R.id.activity_permisos:
                startActivity(new Intent(this, Permisos.class));
                break;
            case R.id.activity_mi_recycler_view:
                startActivity(new Intent(this, MiRecyclerView.class));
                break;
            case R.id.activity_fragment_tab_host:
                startActivity(new Intent(this, MiFragmentTabhost.class));
                break;
            default:
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(
                R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(
                R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
