package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

//Pattern Chain of Responsability - Classe de desconto abstrata que vai ser herdada por cada desconto que será verificado
public abstract class Desconto {

    protected Desconto proximo;

    //Para evitar códigos repetidos do padrão Chain of Responsability
    // foi aplicado o Design Pattern Template Method
    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    // a estrutura de decisão foi adicionada na classe mãe de Desconto, ou seja, não é necessário mais repetir os if's
    // ao introduzir os novos descontos
    //isso foi possivel pois utilizamos a herança do da classe mãe para os descontos existentes
    // assim as classes filhos apenas tem a sua regra de decisão, e a aplicação do desconto
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    public BigDecimal calcular(Orcamento orcamento){
        return deveAplicar(orcamento) ? efetuarCalculo(orcamento) : proximo.calcular(orcamento);
    }

    // foi adicionado um novo método abstrato que é a verificação que cada desconto tem
    public abstract boolean deveAplicar(Orcamento orcamento);

}
