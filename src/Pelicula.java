public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;

    int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    void muestraFichaTecnnica() {
        System.out.println("El nombre de la película es: "+ nombre);
        System.out.println("Su fecha de lanzamiento es: "+ fechaDeLanzamiento);
        System.out.println("Su duración en minutos es: "+ duracionEnMinutos);
    }

    void evalua(double nota) {
        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }

    double calcularMedia() {
        return sumaDeEvaluaciones / totalEvaluaciones;
    }
}
