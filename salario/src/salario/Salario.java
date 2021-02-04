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
	
	Salario(String tipo, int salarioBase, int ventasMes, int horasExtra){
		this.tipo = tipo;
		this.salarioBase = salarioBase;
		this.ventasMes = ventasMes;
		this.horasExtra = horasExtra;
	}

	public float calculaSalarioBruto(String tipo, int ventasMes, int horasExtra) {
		float salarioBruto = 0;

		if (tipo == "vendedor") {
			this.salarioBase = 1000;
		} else if (tipo == "encargado") {
			this.salarioBase = 1500;
		}
		if (ventasMes >= 1000) {
			this.salarioBase += 100;
		} else if (ventasMes >= 1500) {
			this.salarioBase += 200;
		}
		this.salarioBase += (horasExtra * 20);

		salarioBruto = this.salarioBase;

		return salarioBruto;
	}

	public float calculaSalarioNeto(float salarioBruto) {
		float salarioNeto = salarioBruto;

		if (salarioBruto >= 1000 && salarioBruto < 1500) {
			salarioNeto -= (salarioBruto * 0.16);
		} else if (salarioBruto >= 1500) {
			salarioNeto -= (salarioBruto * 0.18);
		}

		return salarioNeto;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSalarioBase() {
		return this.salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getVentasMes() {
		return this.ventasMes;
	}

	public void setVentasMes(int ventasMes) {
		this.ventasMes = ventasMes;
	}

	public int getHorasExtra() {
		return this.horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public String toString() {
		return "tipo: " + this.tipo + "\nsalario base: " + this.salarioBase + "\nventas mes: " + ventasMes
				+ "\nhoras extra: " + this.horasExtra;
	}

}