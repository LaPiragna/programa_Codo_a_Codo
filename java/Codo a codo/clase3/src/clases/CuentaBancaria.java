package clases;

public class CuentaBancaria {
	private String cbu;
	private String alias;
	private double saldo;
	
	public CuentaBancaria(String cbu, String alias) {
		this.cbu = cbu;
		this.alias = alias;
		this.saldo = 0;
	}
	public CuentaBancaria(String cbu, String alias, double saldo) {
		this.cbu = cbu;
		this.alias = alias;
		this.saldo = saldo;
	}
	public void cambioDeAlias(String nuevoAlias) {
		this.alias = nuevoAlias;
	}
	public void depositar(double saldo) {
		this.saldo += saldo;
	}
	public String toString() {
		return "CBU: " + cbu + "\n" +
				"Alias: " + alias + "\n" + 
				"Saldo: " + saldo + ".";
	}
}
