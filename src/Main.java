import com.screenmatch.models.Pelicula;

public class Main {
    public static void main(String[] args) {
        Pelicula miPeli = new Pelicula();
        miPeli.nombre = "The shawshank redemption";
        miPeli.fechaDeLanzamiento = 1994;
        miPeli.duracionEnMinutos = 120;

        miPeli.muestraFichaTecnnica();
        miPeli.evalua(7.8);
        miPeli.evalua(10);
        System.out.println(miPeli.calcularMedia());
        System.out.println(miPeli.getTotalEvaluaciones());
    }
}