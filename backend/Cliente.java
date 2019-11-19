
public class Cliente extends Pessoa {

	protected int codCliente;
	protected int cpf;
	protected int cnpj;

	public Cliente() {

	}

	public Cliente(String nome, String end, int cpf, int cnpj) {
		super(nome, end);
		setCnpj(cnpj);
		setCpf(cpf);

	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
	
	@Override
	public String toString() {
		return "Cliente [Codigo do Cliente=" + codCliente + " Nome do Cliente: " + this.getNome()
				+ " Endereço do Cliente: " + this.getEnd() + "]";
	}

}
