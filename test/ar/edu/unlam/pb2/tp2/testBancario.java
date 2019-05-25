package ar.edu.unlam.pb2.tp2;

import org.junit.Assert;

import org.junit.Test;

public class testBancario {

	@Test
	public void testCuentaSueldo() {
		Sueldo cuenta = new Sueldo();
		cuenta.depositar(7000.00);
		Assert.assertTrue(cuenta.extraer(4000.00));
		Double VE = 3000.00;
		Assert.assertEquals(VE, cuenta.getSaldo());
	}
	
	@Test
	public void testCuentaAhorro(){
		Ahorro cuenta = new Ahorro();
		cuenta.depositar(7000.00);
		for (int i = 0; i <= 4; i++) {
			cuenta.extraer(1000.00);
		}
		cuenta.extraer(500.00);
		Double VE = 1494.00;
		Assert.assertEquals(VE, cuenta.getSaldo());
		Assert.assertTrue(cuenta.extraer(1000.00));
		Assert.assertFalse(cuenta.extraer(500.00));
		
	}
	
	@Test
	public void testCuentaCorriente(){
		Corriente cuenta = new Corriente(2000.00);
		cuenta.depositar(4000.00);
		Assert.assertTrue(cuenta.extraer(1000.00));
		Assert.assertFalse(cuenta.extraer(5500.00));
		
	}
	

}
