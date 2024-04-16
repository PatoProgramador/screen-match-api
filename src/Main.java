import com.screenmatch.calculations.CalculadoreDeTiempo;
import com.screenmatch.calculations.FiltrarRecomendaciones;
import com.screenmatch.models.Episodio;
import com.screenmatch.models.Pelicula;
import com.screenmatch.models.Serie;

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

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnnica();

        CalculadoreDeTiempo calculadora = new CalculadoreDeTiempo();
        calculadora.incluye(miPeli);
        calculadora.incluye(casaDragon);
        System.out.println("Tiempo necesario para ver tus titulos favoritos estas  es de " + calculadora.getTiempoTotal() + " minutos");

        FiltrarRecomendaciones filtroRecomendacion = new FiltrarRecomendaciones();
        filtroRecomendacion.filtrar(miPeli);

        Episodio episodio = new Episodio();
        episodio.setNombre("La casa Targayen");
        episodio.setNumero(1);
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);

        filtroRecomendacion.filtrar(episodio);
    }
}