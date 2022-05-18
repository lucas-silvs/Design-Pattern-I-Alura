package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

//transformando um item de orcamento e um orcamento em um item comum para aplicar a composição
public interface Orcavel {

    BigDecimal getValor();
}
