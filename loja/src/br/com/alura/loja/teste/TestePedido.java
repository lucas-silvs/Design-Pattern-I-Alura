package br.com.alura.loja.teste;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestePedido {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadedeItens = Integer.parseInt(args[2]);
        GeraPedido geradorDePedido = new GeraPedido(cliente,valorOrcamento,quantidadedeItens);
        geradorDePedido.executa();




    }



}
