package salario;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalarioTest {

	@Test
	public void testCalculaSalarioNeto01() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioNeto(2000);
		double esperado = 1640;
		assertEquals(esperado,resultado,0.1);
	}
	@Test
	public void testCalculaSalarioNeto02() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioNeto(1500);
		double esperado = 1230;
		assertEquals(esperado,resultado,0.1);
	}
	
	@Test
	public void testCalculaSalarioNeto03() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioNeto(1499.99);
		double esperado = 1259.9916;
		assertEquals(esperado,resultado,0.1);
	}
	@Test
	public void testCalculaSalarioNeto04() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioNeto(1250);
		double esperado = 1050;
		assertEquals(esperado,resultado,0.1);
	}
	@Test
	public void testCalculaSalarioNeto05() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioNeto(1000);
		double esperado = 840;
		assertEquals(esperado,resultado,0.1);
	}
	//en este no habría que cambiar el tipo a double en la definición de los metodos?
	@Test
	public void testCalculaSalarioNeto06() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioNeto(999.99);
		double esperado = 999.99;
		assertEquals(esperado,resultado,0.1);
	}
	@Test
	public void testCalculaSalarioNeto07() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioNeto(500);
		double esperado = 500;
		assertEquals(esperado,resultado,0.1);
	}
	@Test
	public void testCalculaSalarioNeto08() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioNeto(0);
		double esperado = 0;
		assertEquals(esperado,resultado,0.1);
	}
	
	
	@Test
	public void testCalculaSalarioBruto01() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioBruto("vendedor",2000,8);
		double esperado = 1360;
		assertEquals(esperado,resultado,0.1);
	}
	@Test
	public void testCalculaSalarioBruto02() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioBruto("vendedor",1500,3);
		double esperado = 1260;
		assertEquals(esperado,resultado,0.1);
	}
	@Test
	public void testCalculaSalarioBruto03() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioBruto("vendedor",1499.99,0);
		double esperado = 1100;
		assertEquals(esperado,resultado,0.1);
	}
	@Test
	public void testCalculaSalarioBruto04() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioBruto("encargado",1250,8);
		double esperado = 1760;
		assertEquals(esperado,resultado,0.1);
	}
	@Test
	public void testCalculaSalarioBruto05() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioBruto("encargado",1000,0);
		double esperado = 1600;
		assertEquals(esperado,resultado,0.1);
	}
	@Test
	public void testCalculaSalarioBruto06() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioBruto("encargado",999.99,3);
		double esperado = 1560;
		assertEquals(esperado,resultado,0.1);
	}
	@Test
	public void testCalculaSalarioBruto07() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioBruto("encargado",500,0);
		double esperado = 1500;
		assertEquals(esperado,resultado,0.1);
	}
	@Test
	public void testCalculaSalarioBruto08() {
		Salario salario = new Salario();
		double resultado = salario.calculaSalarioBruto("encargado",0,8);
		double esperado = 1660;
		assertEquals(esperado,resultado,0.1);
	}
}
