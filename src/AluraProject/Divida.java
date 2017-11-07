package AluraProject;

public class Divida {

    private double total;
    private double valorPago;
    private String credor;
    private String cnpjDoCredor;

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

    public void setTotal(double total) {
        this.total = total;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public void setCnpjDoCredor(String cnpjDoCredor) {
        this.cnpjDoCredor = cnpjDoCredor;
    }

    public void pagar (double valor){
        if (valor < 0){
            throw new ValorInvalidoException();
        }
        // taxa bancaria
        valor = (valor > 100) ? valor - 8 : valor;
        this.valorPago += valor;
    }
}