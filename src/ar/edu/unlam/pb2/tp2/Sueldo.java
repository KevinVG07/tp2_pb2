package ar.edu.unlam.pb2.tp2;

public class Sueldo extends Cuenta {
	
	public Sueldo(){
		
	}
	
	@Override
	public void depositar(Double valor){
		super.depositar(valor);
	}
	
	@Override
	public Boolean extraer(Double valor){
		return super.extraer(valor);
	}
}
