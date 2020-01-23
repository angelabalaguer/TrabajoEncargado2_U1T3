package com.acrispin.u1tema2.mireciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.acrispin.u1tema2.R;

import java.util.Vector;

public class MiRecyclerView extends AppCompatActivity implements InterfaceToast {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private MiAdaptador adaptador;
    private Vector<String> misdatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_recycler_view);
        recyclerView = findViewById(R.id.recycler_view);
        misdatos = new Vector<String>();
        misdatos.add("123000 Wilson Callisaya");
        misdatos.add("123000 Pepito Domingez");
        misdatos.add("123000 Pepito Domingez");
        misdatos.add("111000 Pedro Martinez");
        misdatos.add("011000 Paco Pérez");
        misdatos.add("123000 Pepito Domingez");
        misdatos.add("123000 Pepito Domingez");
        misdatos.add("123000 Pepito Domingez");
        misdatos.add("111000 Pedro Martinez");
        misdatos.add("011000 Paco Pérez");
        misdatos.add("123000 Pepito Domingez");
        misdatos.add("123000 Pepito Domingez");
        misdatos.add("123000 Pepito Domingez");
        misdatos.add("111000 Pedro Martinez");
        misdatos.add("011000 Paco Pérez");
        misdatos.add("123000 Pepito Domingez");
        misdatos.add("123000 Pepito Domingez");
        misdatos.add("123000 Pepito Domingez");
        misdatos.add("111000 Pedro Martinez");
        misdatos.add("011000 Paco Pérez");
        adaptador = new MiAdaptador(this, misdatos);
        recyclerView.setAdapter(adaptador);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void mensaje(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}