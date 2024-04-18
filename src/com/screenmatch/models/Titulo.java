package com.screenmatch.models;

import com.google.gson.annotations.SerializedName;
import com.screenmatch.exceptions.ErrorEnConversionDeDuracionException;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOMDB miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")) {
            throw new ErrorEnConversionDeDuracionException("No pude convertir la duracion, " +
                    "porque contiene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ", ""));
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    public void muestraFichaTecnnica() {
        System.out.println("El nombre de la película es: "+ nombre);
        System.out.println("Su fecha de lanzamiento es: "+ fechaDeLanzamiento);
        System.out.println("Su duración en minutos es: "+ getDuracionEnMinutos());
    }

    public void evalua(double nota) {
        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calcularMedia() {
        return sumaDeEvaluaciones / totalEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", fecha de lanzamiento=" + fechaDeLanzamiento +
                ", duracion=" + duracionEnMinutos;
    }
}
