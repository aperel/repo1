public class Date {

	int day;
	int month;
	int year;

	public Date(int day, int month, int year){ 

		this.day=day;
		this.month=month;
		this.year=year;
}

public boolean isSameYear( int anio){
 
	if (this.year==anio){

	return true ;

	}else{ 

	return false;
	}
}



public boolean isSameMonth(int mes){

	if (this.month==mes){

	return true;

	}else{

	return false;
	}
}



public boolean isSameDay(int dia){

	if (this.day==dia){

	return true;

	}else{

	return false;
	}
}



public boolean isSame(Date fecha2){

	if ((this.day==fecha2.day)&&(this.month==fecha2.month)&&(this.year==fecha2.year)){
	return true;

	}else{	

	return false;
}

}
public String MonthName(int mes1){

	String name=null;

	switch(this.month){
	
	case 1:
	name="Enero";
	break;

	case 2:
	name="Febrero";
	break;
	
	case 3:
	name="Marzo";
	break;

	case 4:
	name="Abril";
	break;

	case 5:
	name="Mayo";
	break;

	case 6:
	name="Junio";
	break;

	case 7:
	name="Julio";
	break;

	case 8:
	name="Agosto";
	break;

	case 9:
	name="Septiembre";
	break;

	case 10:
	name="Octubre";
	break;

	case 11:
	name="Noviembre";
	break;

	case 12:
	name="Diciembre";
	break;

	default:
	System.out.println("error en el numero metido ");
	
	}
	return name;

	
}

public int DiasDelMes (int mes1){

int number=0;
	
	switch (this.month){
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	
	number=31;
	break;

	case 4:
	case 6:
	case 9:
	case 11:

	number=30;
	break;
	
	case 2:
	number=28;
	break;

	default:
	number=-1;
	}
	return number;

}

public String Estacion (int mes1){

	String name=null;
	
	switch(this.month){
	
	case 1:
	case 2:
	case 3:
		
	name="Invierno";	
	break;

	case 4:
	case 5:
	case 6:
		
	name="Primavera";	
	break;

	case 7:
	case 8:
	case 9:
		
	name="Verano";	
	break;

	case 10:
	case 11:
	case 12:
		
	name="Otoño";	
	break;

	default:
	System.out.println("error en el numero metido ");
	}
	return name;

}

public int MesFinAnio(int mes1){

int number=0;

for(int i=mes1;i<12;i++){
number++;
}

return number;
}





}














