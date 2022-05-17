package br.com.alura.loja.teste;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistrosDeOrcamento;
import br.com.alura.loja.orcamento.situacao.Finalizado;

import java.math.BigDecimal;
// ao instanciar o o RegistroDeOrcamento, pode-se escoljer que tipo de implementação http será implementado
public class TesteAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(200),3);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistrosDeOrcamento registrosDeOrcamento = new RegistrosDeOrcamento(new JavaHttpClient());
        registrosDeOrcamento.registrar(orcamento);


    }

}
