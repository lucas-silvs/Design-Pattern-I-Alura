package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Imposto imposto, Orcamento orcamento){
        return imposto.calcular(orcamento);
    }
}
