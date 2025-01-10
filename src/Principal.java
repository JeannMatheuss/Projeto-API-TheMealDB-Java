import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner (System.in);
        System.out.println("Digite o nome de uma receita: ");
        var nomeReceita = leitura.nextLine();



        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("http://foo.com/"))
            .build();

        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());


            
    }
}
