package com.utec.jnn.repuestos;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.resource;

/**
 * Created by Jnn on 22/09/2017.
 */

public class Adaptador_Productos extends ArrayAdapter {

    public Context context;
    public String a_productos[];
    public String a_descripciones[];
    public int[] imagenes;
    View fila;

    public Adaptador_Productos(Context contexto, String[] producto, int[] imagen, String[] descripcion) {
        super(contexto, R.layout.productos_fila,descripcion);
        this.context=contexto;
        this.a_productos=producto;
        this.a_descripciones=descripcion;
        this.imagenes=imagen;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        fila = inflater.inflate(R.layout.productos_fila,parent,false);

        TextView tvPro = (TextView)fila.findViewById(R.id.titulo_producto);
        TextView tvDes = (TextView)fila.findViewById(R.id.descripcion_producto);
        ImageView img = (ImageView)fila.findViewById(R.id.img_producto);

        tvPro.setText(a_productos[position]);
        tvDes.setText(a_descripciones[position]);
        img.setImageResource(imagenes[position]);

        return fila;
    }
}
