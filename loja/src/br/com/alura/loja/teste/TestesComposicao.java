package br.com.alura.loja.teste;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesComposicao {

    public static void main(String[] args) {
        Orcamento orcamentoAntigo = new Orcamento();
        orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        orcamentoAntigo.reprovar();

        Orcamento orcamentoNovo = new Orcamento();
        orcamentoNovo.adicionarItem(orcamentoAntigo);
        orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal("300")));

        System.out.println(orcamentoNovo.getValor());

    }
}
