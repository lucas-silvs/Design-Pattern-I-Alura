package br.com.alura.loja.orcamento;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.http.HttpAdapter;

import java.util.Map;
//ao adicionar o parâmetro genérico, torna o código flexivel a novas implementações futuras
public class RegistrosDeOrcamento {

    private HttpAdapter adapter;

    public RegistrosDeOrcamento(HttpAdapter adapter) {
        this.adapter = adapter;
    }

    public void registrar(Orcamento orcamento){

        if (orcamento.isFinalizado()) {
            String url = "http://teste.api.externa/orcamento";
            Map<String, Object> dados = Map.of(
                    "valor", orcamento.getValor(),
                    "quantidadeItens", orcamento.getQuantidadeItens()
            );
            adapter.post(url, dados);
        }
        else {
            throw new DomainException("Orcamento ainda não finalizado");
        }
        //chamada HTTP para uma API externa

    }
}
