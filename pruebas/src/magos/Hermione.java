package magos;

import magos.hechizos.ExpectoPatronable;

public class Hermione extends Mago implements ExpectoPatronable{
	
	private String tipoExpectoPatronum;
	
	public Hermione() {
		super();
		this.setNombre("Hermione Granger");
		this.setCasa("Griffindor");
		this.setTipoExpectoPatronum("Nutria");
	}

	public void expectoPatronum() {
		System.out.println("Hermione se manda un buen expecto patronum en forma de: " + this.getTipoExpectoPatronum());
	}
	
	public String getTipoExpectoPatronum() {
		return this.tipoExpectoPatronum;
	}

	public void setTipoExpectoPatronum(String tipoExpectoPatronum) {
		this.tipoExpectoPatronum = tipoExpectoPatronum;
	}

}
