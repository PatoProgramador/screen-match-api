package com.screenmatch.main;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.screenmatch.models.Titulo;
import com.screenmatch.models.TituloOMDB;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lecture = new Scanner(System.in);
        System.out.println("Escriba el nombre de una pelicula: ");
        String search = lecture.nextLine();

        String apiKey = System.getenv("OMDB-API-KEY");

        String url = "https://www.omdbapi.com/?t=" + search +"&apikey=" + apiKey;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOMDB miTituloOmdb = gson.fromJson(json, TituloOMDB.class);
            System.out.println(miTituloOmdb);

            Titulo miTitulo = new Titulo(miTituloOmdb);
            System.out.println("Titulo convertido: " + miTitulo);
        } catch (NumberFormatException error) {
            System.out.println("Ocurrio un error: ");
            System.out.println(error.getMessage());
        } catch (IllegalArgumentException error) {
            System.out.println("Error en la URI, verifique la dirección");
        } catch (Exception error) {
            System.out.println("Ocurrio un error inesperado");
        }
        System.out.println("Finalizó la ejecución del programa");
    }
}
