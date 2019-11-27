
public class Funcionario extends Pessoa {

	private int salario;
	private String data;
	private String codFun;

	public Funcionario() {

	}

	public Funcionario(String nome, String end, int salario, String data, String codFun) {
		super(nome, end);
		setSalario(salario);
		setCodFun(codFun);
		setData(data);
	}

	@Override
	public String toString() {
		return "Funcionario --- > Nome:" + this.getNome() + " Remuneração: " + this.getSalario() + " Endereço: "
				+ this.getEnd() + " Data de entrada na loCAR:" + this.getData() + " ";
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCodFun() {
		return codFun;
	}

	public void setCodFun(String codFun) {
		this.codFun = codFun;
	}

}
