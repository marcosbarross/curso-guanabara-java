package aulas;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	protected String tampaStatus;
	
	public void status() {
		System.out.println("Modelo:" + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga " + this.carga);
		
		// Decision's structures made by me
		if (this.tampada == true) {
			this.tampaStatus = "Sim";
		} else {
			this.tampaStatus = "Não";
		}
		
		System.out.println("Está tampada? " + this.tampaStatus);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
}