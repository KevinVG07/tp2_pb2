package ar.edu.unlam.pb2.tp2;

public class Cuenta {
	protected Double saldo;
	
	public Cuenta(){
		saldo = 0.0;
	}
	
	public void depositar(Double valor){
		saldo = saldo + valor;
	}
	
	public Boolean extraer(Double valor){
		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}

	protected Double getSaldo() {
		return saldo;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
