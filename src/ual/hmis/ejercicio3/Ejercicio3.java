package ual.hmis.ejercicio3;

public class Ejercicio3 {
	public String diaSemana(int dia) {
			switch (dia) {
			case 1: return "lunes";
			case 2: return "martes";
			case 3: return "miércoles";
			case 4: return "jueves";
			case 5: return "viernes";
			case 6: return "sábado";
			case 7: return "domingo";
			default: return "ERROR!";
		}
	}
}