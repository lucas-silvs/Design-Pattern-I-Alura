package br.com.alura.loja.orcamento;

import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItens;

    private SituacaoOrcamento situacao;

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }



    public void aplicarDescontoExtra(){
        BigDecimal valorDescontoExtra = this.situacao.CalcularValorDescontoExtra(this);
        this.valor = this.valor.multiply(valorDescontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }
    public void finalizar(){
        this.situacao.finalizar(this);
    }
    public void reprovar(){
        this.situacao.reprovar(this);
    }
    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
