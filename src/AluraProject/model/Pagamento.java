package AluraProject.model;

import java.util.ArrayList;
import java.util.Calendar;

public class Pagamento extends ArrayList<Pagamento> {
    private String pagador;
    private String cnpjPagador;
    private double valor;
    private Calendar data;
    private double valorPago;
    public String getPagador() {
        return this.pagador;
    }
    public void setPagador(String pagador) {
        this.pagador = pagador;
    }
    public String getCnpjPagador() {
        return this.cnpjPagador;
    }
    public void setCnpjPagador(String cnpjPagador) {
        this.cnpjPagador = cnpjPagador;
    }
    public double getValor() {
        return this.valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Calendar getData() {
        return this.data;
    }
    public void setData(Calendar data) {
        this.data = data;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void registra(Pagamento pagamento) {
        double valor = pagamento.getValor();
        if (valor < 0) {
            throw new ValorInvalidoException();
        }
        if (valor > 100) {
            valor = valor - 8;
        }
        this.valorPago += valor;
        this.add(pagamento);
    }


}


