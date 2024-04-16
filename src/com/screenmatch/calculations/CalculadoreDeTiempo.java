package com.screenmatch.calculations;
import com.screenmatch.models.Titulo;

public class CalculadoreDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
