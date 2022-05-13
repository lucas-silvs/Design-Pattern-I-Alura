package br.com.alura.loja.teste;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class testeCalculoDesconto {
// Desingn Pattern - Chain of Responsability
    public static void main(String[] args) {

        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        Orcamento orcamento = new Orcamento(new BigDecimal(100),1);

        System.out.println("calcular desconto com apenas 1 item: "+calculadoraDeDesconto.calcular(orcamento));

        orcamento = new Orcamento(new BigDecimal(100),10);

        System.out.println("calcular desconto com 10 itens: "+calculadoraDeDesconto.calcular(orcamento));

        orcamento = new Orcamento(new BigDecimal(1000),2);

        System.out.println("calcular desconto valor de 1000 dol: "+calculadoraDeDesconto.calcular(orcamento));


    }
}
