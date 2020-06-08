package Convertor;

public class Data {
	static public void Info() {

    // # DATA - CONSTANTS    
    final int YEAR_DAYS = 365;
    final int MONTH_DAYS = 30;
    final int WEEKS_DAYS = 7; 

    // # DATA - variables
    int periodDays = 1234;
    int toYears;
    int toMonth;
    int toWeeks;
    int toDays ;

    // # CALCLATIONS
    toYears = periodDays / YEAR_DAYS; 
    toMonth = periodDays % MONTH_DAYS;
    toWeeks = periodDays % WEEKS_DAYS;
    toDays = periodDays % YEAR_DAYS % MONTH_DAYS % WEEKS_DAYS;

    // # PRINT RESULTS
    System.out.println(periodDays + " Days = " + toYears  + " Years, " + toMonth + " Months, " + toWeeks + " Weeks, " + toDays + " Days.");
	}

}
