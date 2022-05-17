package br.com.alura.loja.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
// ao implementar a interface adapter, torna muito mais facil implementar novos tipos de infraestruturas diferentes
//tornando o código extensivel e flexivel
public class JavaHttpClient implements HttpAdapter {
    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlDaApi = new URL(url);
            URLConnection openConnection = urlDaApi.openConnection();
            System.out.println("postado os dados em um banco de dados ficticio");
            openConnection.connect();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
