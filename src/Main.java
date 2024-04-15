public class Main {
    public static void main(String[] args) {
        Pelicula miPeli = new Pelicula();
        miPeli.nombre = "The shawshank redemption";
        miPeli.fechaDeLanzamiento = 1994;
        miPeli.duracionEnMinutos = 120;

        System.out.println("Mi pelicula es: "+ miPeli.nombre);
        System.out.println("Su fecha de lanzamiento es: "+ miPeli.fechaDeLanzamiento);
    }
}