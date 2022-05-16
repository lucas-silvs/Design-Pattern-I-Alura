package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcoesAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

//Patter Command Handler - com utilização de injeção de dependencia
// aqui ficaria a implementação dos contratos( salvar no banco, enviar email, etc.)
public class GerarPedidoHandler {

    private List<AcoesAposGerarPedido> acoesAposGerarPedidos;

    public GerarPedidoHandler(List<AcoesAposGerarPedido> acoesAposGerarPedidos) {
        this.acoesAposGerarPedidos = acoesAposGerarPedidos;
    }

    //construtor com injeção de dependencia: repository, service, etc.

    public void executa(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(dados.getCliente(),data,orcamento);
        // momento em que as ações inscritas são executadas
        acoesAposGerarPedidos.forEach(acao -> acao.executar(pedido));
    }
}
