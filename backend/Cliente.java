
public class Cliente extends Pessoa {

	protected int codCliente;
	protected int cpf;
	protected int cnpj;

	public Cliente() {

	}

	public Cliente(String nome, int cnpj, int codCliente) {
		super(nome);
		setCnpj(cnpj);
		setCodCliente(codCliente);
	}

	public Cliente(String nome, String end, int cpf, int codCliente) {
		super(nome, end);
		setCpf(cpf);
		setCodCliente(codCliente);

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
		return "Cliente \nCodigo do Cliente=" + codCliente + " Nome do Cliente: " + this.getNome()
				+ " Endereço do Cliente: " + this.getEnd();
	}

}
