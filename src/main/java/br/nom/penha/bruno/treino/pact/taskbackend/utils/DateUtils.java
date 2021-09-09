package br.nom.penha.bruno.treino.pact.taskbackend.utils;

import java.time.LocalDate;

public class DateUtils {

	public static boolean isEqualOrFutureDate(LocalDate date) {
		return date.isEqual(LocalDate.now()) || date.isAfter(LocalDate.now());
	}
}
