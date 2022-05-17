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
        // iniciando o imposto icms e setando que ele não possui um outro imposto ao passar null como parâmetro do construtor
        Imposto icms = new ICMS(null);
        Orcamento orcamento = new Orcamento(new BigDecimal(100),1);

        System.out.println("ICMS: "+calculadoraDeImpostos.calcular(icms,orcamento));
        // decorando o imposto iss com o imposto icms ao passa-lo no construtor, alterando o comportamento original do calculo do imposto
        Imposto iss = new ISS(icms);

        System.out.println("ISS: "+calculadoraDeImpostos.calcular(iss,orcamento));
    }
}
