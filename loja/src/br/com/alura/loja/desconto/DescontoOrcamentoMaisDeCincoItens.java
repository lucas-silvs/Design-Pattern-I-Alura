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
    public BigDecimal calcular(Orcamento orcamento){
        if(orcamento.getQuantidadeItens() >5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
