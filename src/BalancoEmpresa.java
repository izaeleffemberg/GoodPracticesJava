import OOReview.Divida;

public class BalancoEmpresa {

    public void registrarDivida(String credor, String cnpjDoCredor, double valor) {
        Divida divida = new Divida();
        divida.setCredor(credor);
        divida.setTotal(valor);
        divida.setCnpjDoCredor(cnpjDoCredor);
    }

}
