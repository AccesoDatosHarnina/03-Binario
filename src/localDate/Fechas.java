package localDate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

public class Fechas {
	public static void main(String[] args) throws InterruptedException {
		// Este me da la fecha actual
		// No es visible
		LocalDate mi = LocalDate.now();
		// El constructor no es accesible
		// LocalDate otra = new LocalDate(0, 0, 0);
		LocalDate otra = LocalDate.of(1996, 2, 12);
		System.out.println(otra);
		System.out.println(mi);
		System.out.println(otra.isBefore(mi));
		System.out.println(otra.isAfter(mi));
		System.out.println(otra.isEqual(mi));
		// En febrero
		ValueRange range = otra.range(ChronoField.DAY_OF_MONTH);
		System.out.println(range.getMinimum());
		System.out.println(range.getMaximum());
		System.out.println(range);
		// En mayo 31
		System.out.println(mi.range(ChronoField.DAY_OF_MONTH));
		System.out.println(mi.range(ChronoField.EPOCH_DAY));
		// Duracion en tiempo no en fecha
		Duration d1 = Duration.between(LocalTime.of(11, 30), LocalTime.of(12, 40));
		System.out.println(d1);

		// La duracion con fechas es periodo
		Period p = Period.of(2, 5, 10);
		System.out.println(p);
		LocalDate d = LocalDate.now();
		System.out.println(d);
		// Entre dos fechas
		Period p1 = Period.between(LocalDate.now(), LocalDate.of(2021, 1, 1));
		System.out.println(p1);
		Period p2 = Period.between(otra, mi);
        System.out.println(p2);
        System.out.println(p2.getYears());
        LocalDate plusDays = otra.plusDays(10);
        otra = otra.plusDays(20);
        System.out.println(otra);
        System.out.println(plusDays);
        //Cronometremos
        LocalTime ahora=LocalTime.now();
        for (int i = 0; i < 10; i++) {
			System.out.println("hola");
			Thread.sleep(10);
		}
        LocalTime luego=LocalTime.now();
        System.out.println(Duration.between(ahora,luego).getNano());
	}
}
