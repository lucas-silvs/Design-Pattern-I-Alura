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



        /*
        Exemplo do Pattern Facade - Transferencia bancária entre duas contas
        Antes do Facade:
        Conta minhaConta = new Conta(); -- supondo que está pegando os dados da conta em um banco de dados
        Conta outraConta = new Conta();

        // se analisar, a ordem que os métodos são chamados importam, por isso se o cliente não souber a ordem correta, pode ser realizada uma
        transferencia indevida
        BigDecimal valorDaTransferencia = new BigDecimal("100");
        Transferencia transferencia = new Transferencia();
        transferencia,validarConta(minhaConta);
        transferencia,validarConta(outraConta);
        transferencia.checarSaldo(minhaConta), valorDaTransferencia;
        transferencia.executar(minhaConta, outraConta, valorDaTransferencia);

        Apos a implementação do Facade:
        // se analisar, o cliente só precisar chamar o método executar, não sendo necessário se importar com a ordem de chamada de métodos
        transferencia.executar(minhaConta, outraConta, valorDaTransferencia); -- abstraiu os detalhes para realizar uma transferencia

         */


    }



}
