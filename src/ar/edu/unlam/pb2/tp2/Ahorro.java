package ar.edu.unlam.pb2.tp2;

public class Ahorro extends Cuenta {
	private Integer cantExtracciones;
	
	public Ahorro(){
		cantExtracciones = 0;
	}
	@Override
	public void depositar(Double valor){
		super.depositar(valor);
	}
	
	@Override
	public Boolean extraer(Double valor){
		cantExtracciones++;
		if (cantExtracciones < 6) {
			return super.extraer(valor);
		}
		else{
			valor = valor + 6;
			return super.extraer(valor);
		}
		
		
		
		
	}
}
