package AluraProject.model;

import AluraProject.Interface.Documento;

public class Cpf implements Documento {

    private String valor;

    public Cpf() {
        super();
    }

    public Cpf(String cnpj) {
        this.valor = cnpj;
    }


    public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();
    }

    @Override
    public String getValor() {
        return null;
    }

    private int primeiroDigitoCorreto() {
        // Extrai o primeiro dígito verificador do CNPJ armazenado
        // no atributo cnpj
        return 0;
    }

    private int primeiroDigitoVerificador() {
        // Extrai o segundo dígito verificador do CNPJ armazenado
        // no atributo cnpj
        return 0;
    }

    private int segundoDigitoCorreto() {
        // Calcula o primeiro dígito verificador correto para
        // o CNPJ armazenado no atributo cnpj
        return 0;
    }

    private int segundoDigitoVerificador() {
        // Calcula o primeiro dígito verificador correto para
        // o CNPJ armazenado no atributo cnpj
        return 0;
    }

    public boolean equals(Object o) {
        if(!(o instanceof Cpf)) {
            return false;
        }
        Cpf outro = (Cpf) o;
        return this.valor.equals(outro.valor);
    }

    public int hashCode() {
        return this.valor.hashCode(); // delegamos a geracao do hashCode da classe Cnpj para seu atributo String valor
    }

    @Override
    public String toString() {
        return valor;
    }
}