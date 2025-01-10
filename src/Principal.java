import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        System.out.println("Digite o nome de uma receita: ");
        var nomeReceita = leitura.nextLine();


        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("http://foo.com/"))
            .build();

    }
}
