package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento {
    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(BigDecimal valor, Orcamento orcamento) {
        this.valor = valor;
        this.orcamento = orcamento;
    }

    //é verificado se o valor é nulo, se sim é realizado o chamado externo, senão utiliza o da propria classe
    @Override
    public BigDecimal getValor() {
        if (valor == null){
            this.valor = orcamento.getValor();
        }
        return this.valor;
    }
}
