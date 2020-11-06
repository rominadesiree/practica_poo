package magos;

import magos.hechizos.ExpectoPatronable;

public class Harry extends Mago implements ExpectoPatronable {
	
	private String tipoExpectoPatronum;
	
	public Harry() {
		super();
		this.setNombre("Harry Potter");
		this.setCasa("Griffindor");
		this.setTipoExpectoPatronum("Ciervo");
	}
	
	public void expectoPatronum() {
		System.out.println("Harry se manda alto expecto patronum en forma de: " + this.getTipoExpectoPatronum());
	}
	
	public String getTipoExpectoPatronum() {
		return this.tipoExpectoPatronum;
	}

	public void setTipoExpectoPatronum(String tipoExpectoPatronum) {
		this.tipoExpectoPatronum = tipoExpectoPatronum;
	}

}
