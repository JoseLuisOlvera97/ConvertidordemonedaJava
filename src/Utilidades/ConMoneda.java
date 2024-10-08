package Utilidades;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConMoneda {
    public ObValorMon BuMoneda (String mon1, String mon2){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c08e4b62e1361a83c5a602f8/pair/" + mon1 + "/" + mon2);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ObValorMon.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontro la moneda a convertir");
        }
    }

}
