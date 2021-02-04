package salario;

public class Salario {

	private String tipo;
	private int salarioBase;
	private int ventasMes;
	private int horasExtra;

	Salario() {
		this.tipo = null;
		this.salarioBase = 0;
		this.ventasMes = 0;
		this.horasExtra = 0;		
	}

	public float calculaSalarioBruto(String tipo, int ventasMes, int horasExtra) {		
		float salarioBruto = 0;
		
		if (tipo == "vendedor") {
			this.salarioBase = 1000;
		}else if (tipo == "encargado") {
			this.salarioBase = 1500;
		}
		if (ventasMes >= 1000) {
			this.salarioBase += 100;
		}else if (ventasMes >= 1500) {
			this.salarioBase += 200;
		}
		this.salarioBase += (horasExtra*20);		
		
		salarioBruto = this.salarioBase;
		
		return salarioBruto;
	}
	
	public float calculaSalarioNeto (float salarioBruto) {
		float salarioNeto = 0;
		
		
		return salarioNeto;
	}
	
	

}
/*
 *  float calculaSalarioBruto( String tipo, float ventasMes,float horasExtra)
 * El salario base será 1000 euros si el empleado es de tipo vendedor, y de
 * 1500 euros si es de tipo encargado. A esta cantidad se le sumará una prima
 * de 100 euros si ventasMes es mayor o igual que 1000 euros, y de 200 euros si
 * fuese al menos de 1500 euros. Por último, cada hora extra se pagará a 20
 * euros.  float calculaSalarioNeto( float salarioBruto) Si el salario bruto es
 * menor de 1000 euros, no se aplicará ninguna retención. Para salarios a
 * partir de 1000 euros, y menores de 1500 euros se les aplicará un 16%, y a
 * los salarios a partir de 1500 euros se les aplicará un 18%. Deberéis de
 * realizar pruebas de estos métodos en JUnit, las cuales serán: Obviar las
 * pruebas donde en las salidas den un BRException ya que las excepciones
 * todavía no las hemos dado.
 */