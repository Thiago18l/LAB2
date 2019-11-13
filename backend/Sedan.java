
public class Sedan extends AluguelAut{

	private double vdiaria = 95.00;
	
	public Sedan() {
		
	}
	public Sedan(String data, String hora, String destino, String finalidade, String placa, int quantidadedeDias, int condicao) {
		super(data,hora,destino,finalidade, placa, quantidadedeDias);
	}
	
	@Override
	public void CondicaoV(int condicao) {
		if(condicao == 10) {
			System.out.println("Condi��o do Veiculo � igual as condi��es quando foi colocado.");
		}
		else if (condicao != 10) {
			System.out.println("A condi��o do veiculo n�o est� em perfeitas condi��es.");
		}
	}
	public void Devolucao() {
			
	}

	public double getVdiaria() {
		return vdiaria;
	}

	public void setVdiaria(double vdiaria) {
		this.vdiaria = vdiaria;
	}
	
	
	
	
}
