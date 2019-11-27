
public class Juridica extends Cliente {

    protected String cnpj;

    public Juridica() {

    }

    public Juridica(String nome, String cod, String cnpj) {
        super(nome, cod);
        setCnpj(cnpj);
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }
    @Override
    public String toString() {
        return " Nome:"+this.getNome()+"\n CNPJ:"+this.getCnpj()+"\n Código:"+this.getCodCliente();
    }
}