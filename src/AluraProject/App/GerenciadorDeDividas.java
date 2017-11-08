package AluraProject.App;

public class GerenciadorDeDividas {
    public void efetuaPagamento(Divida divida, double valor){
        divida.pagar(valor);
    }
}
