package ar.edu.unlam.pb2.tp2;

public class Cuenta{
	private Double saldo;
	
	public Cuenta(){
		saldo = 0.0;
	}
	
	public void depositar(Double valor){
		saldo = saldo + valor;
	}
	
	public Boolean extraer(Double valor){
			saldo = saldo - valor;
			return true;
		}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
