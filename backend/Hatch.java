
public class Hatch extends AluguelAut {

	private double vdiaV = 75.00;
	private int condicao;
	
	public Hatch() {
		
	}
	
	public Hatch(String data, String hora, String destino, String finalidade, String placa, int quantidadedeDias, int condicao) {
		
		super(data,hora,destino,finalidade, placa, quantidadedeDias);
		setCondicao(condicao);
	}
	
	@Override
	public String toString() {
		return String.format("Veiculo -> Hatch:\n Informações:\n Valor da diaria: R$ "+this.getVdiaV()+"\n Destino: "+this.getDestino()+"\n Finalidade: "+this.finalidade+
				"\n Hora e Data: "+this.getHora()+" / "+this.getData()+" \n Placa do veiculo: "+this.getPlaca()+"\n Quantidade de dias Alugado: "+this.getQuantidadeDias()+" Dias"
				);
	}

	@Override
	public void CondicaoV(int condicao) {
		if(condicao == 10) {
			System.out.println("Condição do Veiculo é igual as condições quando foi colocado.");
		}
		else if (condicao != 10) {
			System.out.println("A condição do veiculo não esta em perfeitas condições.");
		}
	}
	@Override
	public void Devolucao() {
			
	}

	public double getVdiaV() {
		return vdiaV;
	}

	public void setVdiaV(double vdiaV) {
		this.vdiaV = vdiaV;
	}

	

	public int getCondicao() {
		return condicao;
	}

	public void setCondicao(int condicao) {
		this.condicao = condicao;
	}

	
	
	
	
}
