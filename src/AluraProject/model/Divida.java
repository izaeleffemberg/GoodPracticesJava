package AluraProject.model;

import java.util.ArrayList;
import java.util.Calendar;

public class Divida {

    private double total;
    private double valorPago;
    private String credor;
    private String cnpjDoCredor;
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();

    public void pagar (double valor){
        if (valor < 0){
            throw new ValorInvalidoException();
        }
        addTaxaBancaria(valor);
    }

    private void addTaxaBancaria(double valor){
        valor = (valor > 100) ? valor - 8 : valor;
        this.valorPago += valor;
    }

    public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getData().before(data)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    private int primeiroDigitoCorretoParaCnpj() {
        // Calcula o primeiro dígito verificador correto para
        // o CNPJ armazenado no atributo valor
        return 0;
    }
    private int primeiroDigitoVerificadorDoCnpj() {
        // Extrai o primeiro dígito verificador do CNPJ armazenado
        // no atributo valor
        return 0;
    }
    public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        pagar(pagamento.getValor());
    }
    private int segundoDigitoCorretoParaCnpj() {
        // Calcula o segundo dígito verificador correto para
        // o CNPJ armazenado no atributo valor
        return 0;
    }
    private int segundoDigitoVerificadorDoCnpj() {
        // Extrai o segundo dígito verificador do CNPJ armazenado
        // no atributo valor
        return 0;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double valorAPagar() {
        return this.total - this.valorPago;
    }

    public double getTotal() {
        return this.total;
    }

    public double getValorPago() {
        return this.valorPago;
    }

    public String getCredor() {
        return this.credor;
    }

    public String getCnpjDoCredor() {
        return this.cnpjDoCredor;
    }

    public void setCnpjDoCredor(String cnpjDoCredor) {
        this.cnpjDoCredor = cnpjDoCredor;
    }

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

}
