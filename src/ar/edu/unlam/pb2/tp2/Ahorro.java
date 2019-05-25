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
			if(super.getSaldo() >= valor){
			return super.extraer(valor);
			}
			return false;
		}
		else{
			if(super.getSaldo() >= valor){
			valor = valor + 6;
			return super.extraer(valor);
			}
			return false;
		}
		
	}
	public Integer getCantExtracciones() {
		return cantExtracciones;
	}
	public void setCantExtracciones(Integer cantExtracciones) {
		this.cantExtracciones = cantExtracciones;
	}
}
