package br.com.alura.loja.teste;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteCalculoImposto {
    // Desingn Pattern - Strategy
    public static void main(String[] args) {

        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        Imposto icms = new ICMS();
        Orcamento orcamento = new Orcamento(new BigDecimal(100),1);

        System.out.println("ICMS: "+calculadoraDeImpostos.calcular(icms,orcamento));

        Imposto iss = new ISS();

        System.out.println("ISS: "+calculadoraDeImpostos.calcular(iss,orcamento));
    }
}
