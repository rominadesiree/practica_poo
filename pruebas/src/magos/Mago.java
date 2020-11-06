package magos;

import pruebas.Persona;

public abstract class Mago extends Persona {
	
	private String nombre;
	private String casa;
	
	public Mago() {
		System.out.println("Soy un Mago!");
	}
		
	public void incendio() {
		System.out.println(nombre + " hace Incendio!");
	}
	
	public void aquamenti() {
		System.out.println(nombre + " hace aquamenti!");
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCasa() {
		return casa;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}

}
