
public class Funcionario extends Pessoa {

	private double salario;
	private String data;
	private String codFun;

	public Funcionario() {

	}

	public Funcionario(String nome, String end, double salario, String data, String codFun) {
		super(nome, end);
		setSalario(salario);
		setCodFun(codFun);
		setData(data);
	}

	@Override
	public String toString() {
		return "Funcionarios:\n Nome:"+this.getNome()+"\nEndereço:"+this.getEnd()+"\nRemuneração:"+this.getSalario()+
		"\nData de entrada:"+this.getData()+"\nCódigo do Funcionario:"+this.getCodFun();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
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
