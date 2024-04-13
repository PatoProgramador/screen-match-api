public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDePelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Peliculas más nuevas");
        } else {
            System.out.println("Peliculas Retro que son shidas");
        }

        if (incluidoEnElPlan && tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no disponible para su tipo de plan actual");
        }
    }
}
