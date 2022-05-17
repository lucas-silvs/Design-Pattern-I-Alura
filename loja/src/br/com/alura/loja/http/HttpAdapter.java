package br.com.alura.loja.http;

import java.util.Map;

//interface adapter, que será utilizada pela classe principal
public interface HttpAdapter {

    void post(String url, Map<String, Object> dados);
}
