public class Main{

public static void main(String args []){

	Date fecha = new Date (27,03,2017);
	System.out.println(fecha.isSameYear(2016));
	System.out.println(fecha.isSameMonth(10));
	System.out.println(fecha.isSameDay(21));

	Date fecha2 = new Date (27,03,2017);
	System.out.println(fecha.isSame(fecha2));

	System.out.println(fecha.MonthName(3));
	System.out.println(fecha.DiasDelMes(3));
	System.out.println(fecha.Estacion(3));
	System.out.println(fecha.MesFinAnio(3));
	}





}


