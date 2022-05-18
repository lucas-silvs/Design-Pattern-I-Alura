package br.com.alura.loja.orcamento;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel{
    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    //ao tornar a classe Orcamento em um item Orcavel, é possivel compor ele dentro dessa lista de itens, assim não sendo necessário lidar com todos os dados
    // ao utilizar dados de um orcamento antigo
    private List<Orcavel> itensOrcamento;

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }



    public Orcamento(){
        this.situacao = new EmAnalise();
        this.itensOrcamento = new ArrayList<>();
        this.valor = BigDecimal.ZERO;
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
        this.situacao = new EmAnalise();
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public boolean isFinalizado() {

        return this.getSituacao().getClass().equals(Finalizado.class);
    }

    public void adicionarItem(Orcavel itemOrcamento){
        this.valor = this.valor.add(itemOrcamento.getValor());
        this.itensOrcamento.add(itemOrcamento);
    }
}
