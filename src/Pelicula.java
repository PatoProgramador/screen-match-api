public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeEvaluaciones;
    int totalEvaluaciones;

    void muestraFichaTecnnica() {
        System.out.println("El nombre de la película es: "+ nombre);
        System.out.println("Su fecha de lanzamiento es: "+ fechaDeLanzamiento);
    }

    void evalua(double nota) {
        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }

    double calcularMedia() {
        return sumaDeEvaluaciones / totalEvaluaciones;
    }
}
