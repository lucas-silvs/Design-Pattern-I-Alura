package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.Pedido;

public interface AcoesAposGerarPedido {

    public void executar(Pedido pedido);
}
