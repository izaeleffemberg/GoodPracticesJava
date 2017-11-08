import AluraProject.Interface.Documento;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

import AluraProject.model.Pagamento;
import lombok.Getter;


public class Pagamentos implements Iterable<Pagamento> {

    @Getter
    private double valorPago;
    private Collection<Pagamento> pagamentos = new ArrayList<Pagamento>();

    public void registra(Pagamento pagamento) {
        double valor = pagamento.getValor();
        if (valor < 0) {
            throw new IllegalArgumentException("Valor invalido para pagamento");
        }
        if (valor > 100) {
            valor = valor - 8;
        }
        this.valorPago += valor;
        this.pagamentos.add(pagamento);
    }

    public Collection<Pagamento> pagamentosAntesDe(Calendar data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getData().before(data)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

    public Collection<Pagamento> pagamentosDo(Documento documentoPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getDocumentoPagador().equals(documentoPagador)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

    public Collection<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

    @Override
    public Iterator<Pagamento> iterator() {
        return this.pagamentos.iterator();
    }
}