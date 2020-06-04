package ual.hmis.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio3Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"1, lunes",
				"2, martes",
				"3, miércoles",
				"4, jueves",
				"5, viernes",
				"6, sábado",
				"7, domingo",
				"8, ERROR!"})

	void testDiaSemana(int dia, String expected) {
		Ejercicio3 e = new Ejercicio3();
		assertEquals(expected, e.diaSemana(dia));
	}
}
