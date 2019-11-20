
public class Sedan extends AluguelAut {

	private double vdiaria = 95.00;

	public Sedan() {

	}

	public Sedan(String data, String hora, String destino, String finalidade, String placa, int quantidadedeDias,
			int condicao) {
		super(data, hora, destino, finalidade, placa, quantidadedeDias);
	}

	@Override
	public void CondicaoV(int condicao) {
		if (condicao == 10) {
			System.out.println("Condição do Veiculo é igual as condições quando foi colocado.");
		} else if (condicao != 10) {
			System.out.println("A condição do veiculo não esta em perfeitas condições.");
		}
	}

	public void Devolucao() {

	}

	@Override
	public double ValorAlguel() {
			
			int nvalor = valor*0.10;
			return nvalor;
	
	}

	public double getVdiaria() {
		return vdiaria;
	}

	public void setVdiaria(double vdiaria) {
		this.vdiaria = vdiaria;
	}

	@Override
	public String ToString() {
		return String.format("Veiculo -> Sedan:\n Informações:\n Valor da diaria: R$ " + this.getVdiaV()
				+ "\n Destino: " + this.getDestino() + "\n Finalidade: " + this.finalidade + "\n Hora e Data: "
				+ this.getHora() + " / " + this.getData() + " \n Placa do veiculo: " + this.getPlaca()
				+ "\n Quantidade de dias Alugado: " + this.getQuantidadeDias() + " Dias");

	}
}
