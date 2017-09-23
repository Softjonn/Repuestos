package com.utec.jnn.repuestos;

import android.app.ListActivity;
import android.os.Bundle;

public class Productos extends ListActivity {

    String[] producto;
    String[] descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_productos);

        producto = getResources().getStringArray(R.array.productos);
        descripcion = getResources().getStringArray(R.array.productos_descripcion);
        int[] imagen = {R.drawable.balero, R.drawable.chumacera,
                R.drawable.cruceta, R.drawable.fajas,
                R.drawable.retenedor, R.drawable.pinones,
                R.drawable.silicon};
        setListAdapter(new Adaptador_Productos(this, producto, imagen, descripcion));
    }
}
