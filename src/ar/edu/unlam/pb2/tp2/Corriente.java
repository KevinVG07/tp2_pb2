package ar.edu.unlam.pb2.tp2;

public class Corriente extends Cuenta {
	private Double descubierto;
	private Double deuda = 0.0;
	
	public Corriente(Double descubierto){
		this.descubierto = descubierto;
	}
	
	@Override
	public void depositar(Double valor){
		super.depositar(valor - deuda);
		if (valor > deuda) {
			deuda = 0.0;
		}
	}
	
	@Override
	public Boolean extraer(Double valor){
		if (valor - super.getSaldo() < descubierto) {
			if (valor - super.getSaldo() > 0) {
			deuda = (valor - super.getSaldo()) + (valor - super.getSaldo() * 0.05);
			super.setSaldo(0.0);
			return true;
		}	
		
			super.setSaldo(super.getSaldo() - valor);
			return true;
	}
	return false;	
		
	}
}
