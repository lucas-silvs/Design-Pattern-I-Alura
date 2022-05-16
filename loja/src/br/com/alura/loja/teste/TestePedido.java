package br.com.alura.loja.teste;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GerarPedidoHandler;
import br.com.alura.loja.pedido.Pedido;
import br.com.alura.loja.pedido.acao.AcoesAposGerarPedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TestePedido {

    public static void main(String[] args) {
        String cliente = "Lucas";
        BigDecimal valorOrcamento = new BigDecimal("200");
        int quantidadedeItens = 3;
        GeraPedido geradorDePedido = new GeraPedido(cliente,valorOrcamento,quantidadedeItens);


        List<AcoesAposGerarPedido> acoesAposGerarPedidos = new ArrayList<>();
        acoesAposGerarPedidos.add(new EnviarEmailPedido());
        acoesAposGerarPedidos.add(new SalvarPedidoNoBancoDeDados());
        //inscrevendo as ações
        GerarPedidoHandler gerarPedidoHandler = new GerarPedidoHandler(acoesAposGerarPedidos);

        gerarPedidoHandler.executa(geradorDePedido);




    }



}
