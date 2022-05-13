package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
//Pattern State - classe abstrata que representa a situação do orcamento
// é implementada para cada método uma implementação default, onde as situações que não são permitidas
// usarão. E para implementar um método, é necessário que a classe filha de um Override no método
//assim aplicando a própria regra baseada na situação

//RESUMO: cada classe que quiser implementar um método, deverá sobrescrever os métodos herdados da classe mãe (SituacaoOrcamento)
public abstract class SituacaoOrcamento {


    public void aprovar(Orcamento orcamento) {
        throw new DomainException("O orcamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("O orcamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("O orcamento não pode ser finalizado");
    }

    //O desconto extra utiliza o padrão strategy, onde o valor vai varia de acordo com a situação atual Orcamento
    public BigDecimal CalcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }


}
