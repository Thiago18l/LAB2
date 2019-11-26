
public class Cliente extends Pessoa {

	protected String codCliente;
	protected String cpf;
	protected String cnpj;

	public Cliente() {

	}

	public Cliente(String nome, String cnpj, String codCliente) {
		super(nome);
		setCnpj(cnpj);
		setCodCliente(codCliente);
	}

	public Cliente(String nome, String end, String cpf, String codCliente) {
		super(nome, end);
		setCpf(cpf);
		setCodCliente(codCliente);

	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCodCliente() {
		return this.codCliente;
	}


	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}
	public String getCpf(){
		return this.cpf;
	}
	public String getCnpj(){
		return this.cnpj;
	}

	@Override
	public String toString() {
		return "Cliente \nCodigo do Cliente=" + codCliente + " Nome do Cliente: " + this.getNome()
				+ " Endereço do Cliente: " + this.getEnd();
	}

}
