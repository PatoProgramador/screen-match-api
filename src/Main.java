import com.screenmatch.models.Pelicula;

public class Main {
    public static void main(String[] args) {
        Pelicula miPeli = new Pelicula();
        miPeli.setNombre("The shawshank redemption");
        miPeli.setFechaDeLanzamiento(1994);
        miPeli.setDuracionEnMinutos(120);
        miPeli.setIncluidoEnElPlan(true);

        miPeli.muestraFichaTecnnica();
        miPeli.evalua(7.8);
        miPeli.evalua(10);
        System.out.println(miPeli.calcularMedia());
        System.out.println(miPeli.getTotalEvaluaciones());
    }
}