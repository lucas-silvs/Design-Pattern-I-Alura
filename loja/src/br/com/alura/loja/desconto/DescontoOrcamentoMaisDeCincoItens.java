package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
//Classe que extenderá a classe abstrata Desconto
public class DescontoOrcamentoMaisDeCincoItens extends Desconto{
    // O construtor recebe o próximo desconto que será aplicado
    public DescontoOrcamentoMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }
    // Ao verificar se o desconto é aplicavel, se sim é aplicado o desconto e retornado, senão é chamado o próximo desconto
    // assim funciona a dinâmica do Desing Pattern Chain of Responsability
    public BigDecimal efetuarCalculo(Orcamento orcamento) {

        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() >5;
    }
}
