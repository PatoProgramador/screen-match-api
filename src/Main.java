public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidx a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDePelicula = 8.2;

        double media = (notaDePelicula + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja
                La mejor película del fin del milenio
                Fue lanzada en: %d
                """.formatted(fechaDeLanzamiento);
        System.out.println(sinopsis);

        int clasificacion = (int) media / 2;
        System.out.println(clasificacion);
    }
}