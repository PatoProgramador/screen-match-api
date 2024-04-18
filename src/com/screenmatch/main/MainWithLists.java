package com.screenmatch.main;

import com.screenmatch.models.Pelicula;
import com.screenmatch.models.Serie;
import com.screenmatch.models.Titulo;

import java.util.ArrayList;

public class MainWithLists {
    public static void main(String[] args) {
        Pelicula miPeli = new Pelicula("The shawshank redemption", 1994);
        miPeli.evalua(9);
        Pelicula peliculaDePato = new Pelicula("El señor de los anillos", 2001);
        peliculaDePato.evalua(6);
        Serie casaDragon = new Serie("La casa del dragón", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPeli);
        lista.add(peliculaDePato);
        lista.add(casaDragon);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula.getClasificacion());
            }
        }
    }
}
