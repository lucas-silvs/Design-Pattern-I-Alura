package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcoesAposGerarPedido{

    public void executar(Pedido pedido){
        System.out.println("Salvando dados do pedido no banco de dados");
    }
}
