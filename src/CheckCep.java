import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CheckCep {

    public Address searchAddress(String cep) {
        URI address = URI.create("https://viacep.com.br/ws/" + cep + "/json");


        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();


        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Address.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP");
        }


    }
}
