
public class Cliente extends Pessoa {

	protected String codCliente;
	protected String cnpj;

	public Cliente() {

	}

	public Cliente(String nome, String codCliString) {
		super(nome);
		setCodCliente(codCliente);
	}

	public Cliente(String nome, String end, String codCliente) {
		super(nome, end);
		setCodCliente(codCliente);
	}

	public String getCodCliente() {
		return this.codCliente;
	}

	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}

	@Override
	public String toString() {
		return "Código do Cliente:" + this.getCodCliente() + "\n Nome:" + this.getNome() + "\n Endereço:"
				+ this.getEnd();
	}

}
