package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getYear(){
		return this.year;
	}

	public int getMonth(){
		return this.month;
	}

	public int getDay(){
		return this.day;
	}

	boolean isSameYear (Date another){
		if ( this.year == another.getYear()){
			return true;
		} else {
			return false;
		}
	}

	boolean isSameMonth (Date another){
		if(this.month == another.getMonth()){
			return true;
		} else {
			return false;
		}
	}

	boolean isSameDay (Date another){
		if(this.day == another.getDay()){
			return true;
		} else {
			return false;
		}
	}
	
	boolean isSame (Date another){
		if((this.isSameYear(another)) && (this.isSameMonth(another)) && (this.isSameDay(another)){
			return true; 
		} else {
			return false;
		}
	}

	boolean isSameYearNoIf (Date another){
		return this.year == another.getYear();
		
	}

	boolean isSameMonthNoIf (Date another){
		return this.month == another.getMonth();
		
	}

	boolean isSameDayNoIf (Date another){
		return this.day == another.getDay();
		
	}
	
	boolean isSameNoIf (Date another){
		return this.isSameYear(another) && (this.isSameMonth(another) && (this.isSameDay(another);
		
	}

	public void monthName(){
		if(month == 1){
			System.out.println("Enero");
		} if(month == 2){
			System.out.println("Febrero");
		} if(month == 3){
			System.out.println("Marzp");
		} if(month == 4){
			System.out.println("Abril");
		} if(month == 5){
			System.out.println("Mayo");
		} if(month == 6){
			System.out.println("Junio");
		} if(month == 7){
			System.out.println("Julio");
		} if(month == 8){
			System.out.println("Agosto");
		} if(month == 9){
			System.out.println("Septiembre");
		} if(month == 10){
			System.out.println("Octubre");
		} if(month == 11){
			System.out.println("Noviembre");
		} if(month == 12){
			System.out.println("Diciembre");
		} 
	}

	boolean dayRight(){
		boolean right = false;
		switch(month){
			case 1:
			case 3: 
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
					if((day >= 1) && (day <= 31){
						right = true;
					}
						break; 	
				
			case 4: 
			case 6:
			case 9:
			case 11:
					if((day >= 1) && (day <= 30)){
						right = true;
					}
						break; 	
				
			case 2:
					if((day >= 1) && (day <= 28)){
						right = true;
					}
						break; 	
				
			
		}

		return right;
	}

	public void monthSeason(){
		switch(month){
			case 1:
			case 2: 
			case 3: System.out.pritnln("Invierno");
					break:
			case 4:
			case 5:
			case 6: System.out.pritnln("Primavera");
					break:
			case 7:
			case 8:
			case 9: System.out.pritnln("Verano");
					break:

			case 10:
			case 11:
			case 12: System.out.pritnln("Otoño");
					break:
		}

	}

	public int monthsUntilEndYear(){
		return 12-month;
	}

	public void printDate(){

	}

	public int daysUntilEndMonth(){
		switch(month){
			case 1:
			case 3: 
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: return 31-day;
						break;
			case 4: 
			case 6:
			case 9:
			case 11: return 30 - day;
						break;
			case 2: return 28 - day;
						break;
		}
	}

	public void sameNumberOfDays(){
		switch(month){
			case 1: System.out.println("Marzo, Mayo, Julio, Agosto, Octubre, Diciembre");
				break;
			case 2: System.out.println("Único mes con 28 días");
				break;
			case 3: System.out.println("Enero, Mayo, Julio, Agosto, Octubre, Diciembre");
				break;
			case 4: System.out.println("Abril, Junio, Septiembre, Noviembre");
				break;
			case 5: System.out.println("Enero, Julio, Agosto, Octubre, Diciembre");
				break;
			case 6: System.out.println("Abril, Septiembre, Noviembre");
				break;
			case 7: System.out.println("Enero, Mayo, Agosto, Octubre, Diciembre");
				break;
			case 8: System.out.println("Enero, Mayo, Octubre, Diciembre");
				break;
			case 9: System.out.println("Abril, Junio, Noviembre");
				break;
			case 10: System.out.println("Enero, Mayo, Agosto, Diciembre");
				break;
			case 11: System.out.println("Abril, Junio, Septiembre");
				break;
			case 12: System.out.println("Enero, Mayo, Agosto, Octubre");
				break;	
		}
	}

	public int daysSinceFirst(){
		int dias = 0;
		
		if(month == 1){
			dias = day;
		} if(month == 2){
			dias = day + 31;
		} if(month == 3){
			dias = day + 59;
		} if(month == 4){
			dias = day + 90;
		} if(month == 5){
			dias = day + 120;
		} if(month == 6){
			dias = day + 151;
		} if(month == 7){
			dias = day + 181;
		} if(month == 8){
		 	dias = day + 212;
		} if(month == 9){
			dias = day + 243;
		} if(month == 10){
			dias = day + 273;
		} if(month == 11){
			dias = day + 304;
		} if(month == 12){
			dias = day + 334;
		}

		return dias;
	}

	public void numberOfAttentsWithWhile(){
		int rday = ((int) Math.random()*365);
		int rmonth = ((int) Math.random()*12);
		int ryear = year;
		int contador = 0;

		while((day != rday) && (rmonth != month)){
			contador++;
		}

		System.out.println("Número de intentos: " +contador);

	}

	public void numberOfAttentsWithDoWhile(){
		int rday = ((int) Math.random()*365);
		int rmonth = ((int) Math.random()*12);
		int ryear = year;
		int contador = 0;

		do{
			contador++;

		} while((day != rday) && (rmonth != month));
		
		System.out.println("Número de intentos: " +contador);
	}

	public void numberOfWeek(){

	}

	public void tomorrow (){
		if((month==1) || (month==3) || (month==5) ||(month==7) ||(month==8) || (month==10)){
			if(day < 31){
				day + 1;
				System.out.println(day + " - " +month+ " - " +year);
			} else if(day == 31){
				month + 1;
				day = 1;
				System.out.println(day + " - " +month+ " - " +year);
			}
		}

		if((month==4) || (month==6) || (month==9) ||(month==11){
			if(day < 30){
				day + 1;
				System.out.println(day + " - " +month+ " - " +year);
			} else if(day == 30){
				month + 1;
				day = 1;
				System.out.println(day + " - " +month+ " - " +year);
			}
		}

		if(month == 2){
			if(day < 28){
				day + 1;
				System.out.println(day + " - " +month+ " - " +year);
			} else if(day == 28){
				month + 1;
				day = 1;
				System.out.println(day + " - " +month+ " - " +year);
			}
		}

		if(month == 12){
			if(day < 31){
				day + 1;
				System.out.println(day + " - " +month+ " - " +year);
			} else if(day == 31){
				year + 1;
				month = 1;
				day = 1;
				System.out.println(day + " - " +month+ " - " +year);
			}

		}
	}




	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}

	

}
