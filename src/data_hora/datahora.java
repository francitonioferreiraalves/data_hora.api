package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * API de Data e Hora
 * 
 * LocalDate, LocalTime, LocalDateTime, Instant e ZonedDateTime.
 * 
 * @author Francitonio Ferreira Alves
 */

public class datahora {

	public static void main(String[] args) {
		// LocalDate - data: 06/08/1990
	    LocalDate ldNow = LocalDate.now();
	    System.out.println(ldNow);
	    
	    LocalDate ld = LocalDate.of(2020, Month.AUGUST, 6);
	    System.out.println(ld);
	    LocalDate ld2 = ld.plusWeeks(2).plusDays(1).minusMonths(1);
	    System.out.println(ld2);
	    
	    // LocalTime - hora: 00:00:00
	    LocalTime ltNow = LocalTime.now();
	    System.out.println(ltNow);
	    LocalTime lt = LocalTime.of(03, 06, 01, 100000);
	    System.out.println(lt);
	    
	    // LocalDateTime - data+hora:
	    // 03/06/1954 04:30:00
	    LocalDateTime ldtNow = LocalDateTime.now();
	    System.out.println(ldtNow);
	    LocalDateTime ldt = LocalDateTime.of(ld, lt);
	    System.out.println(ldt);
	    
	    // Instant - representa um instante/momento na
	    // linha do tempo (milissegundos a partir de 
	    // 01/01/1970 00:00:00
	    // 06/08/1990 11:40:00 GMT/UTC
	    Instant iNow = Instant.now();
	    System.out.println(iNow);
	    Instant i = Instant.ofEpochMilli(500000000000L);
	    System.out.println(i);
	    Instant plus = i.plus(1, ChronoUnit.DAYS);
	    System.out.println(plus);
	    
	    // ZonedDateTime - LocalDateTime com 
	    // TimeZone (fuso horário)
	    // 06/08/1990 11:40:00 GMT-3 (America/Sao_Paulo)
	    ZonedDateTime zdtNow = ZonedDateTime.now();
	    System.out.println(zdtNow);
	    ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
	    ZonedDateTime zdt = ZonedDateTime.of(ld, lt, zoneId);
	    System.out.println(zdt);
	    
	  }
	

}
