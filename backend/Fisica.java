
public class Fisica extends Cliente {

    protected String cpf;

    public Fisica() {
    }

    public Fisica(String nome, String end, String cod, String cpf) {
        super(nome, end, cod);
        setCpf(cpf);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    @Override
    public String toString() {
        return ("\n Nome : " + this.getNome() + " \n Endereço:" + this.getEnd() + "\n Código:" + this.getCodCliente()
                + "\n CPF:" + this.getCpf());
    }

}