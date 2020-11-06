package pruebas;

import java.util.ArrayList;

import magos.ArgusFlitch;
import magos.Harry;
import magos.Hermione;
import magos.Mago;
import magos.hechizos.ExpectoPatronable;

public class Pruebas {

	public static void main(String[] args) {
		System.out.println("Holis!");

		//Crear Magos
		Harry harry = new Harry();
		Hermione hermione = new Hermione();
		ArgusFlitch argusFlitch = new ArgusFlitch();
		
		//Creo una lista de magos
		ArrayList<Mago> magos = new ArrayList<Mago>();
		magos.add(harry);
		magos.add(hermione);
		magos.add(argusFlitch);
		
		//Examen de aquamenti
		for(Mago mago: magos) {
			mago.aquamenti();
		}
		
		//Creo lista de magos que saben hacer expecto patronus
		ArrayList<ExpectoPatronable> magosBuenos = new ArrayList<ExpectoPatronable>();
		magosBuenos.add(harry);
		magosBuenos.add(hermione);
		
		//Examen de expecto patronus
		for(ExpectoPatronable expectoPatronable: magosBuenos) {
			expectoPatronable.expectoPatronum();
		}
	}

}
