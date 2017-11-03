package AluraProject;

import java.util.HashMap;

public class BalancoEmpresa {

    private HashMap<String, Divida> dividas = new HashMap<String, Divida>();

    public void registrarDivida(String credor, String cnpjDoCredor, double valor) {
        Divida divida = new Divida();
        divida.setCredor(credor);
        divida.setTotal(valor);
        divida.setCnpjDoCredor(cnpjDoCredor);
        dividas.put(cnpjDoCredor, divida);
    }

    public void pagaDivida(String cnpjDoCredor, double valor){
        Divida divida = dividas.get(cnpjDoCredor);
        if (divida != null) {
            divida.pagar(valor);
        }
    }

}
