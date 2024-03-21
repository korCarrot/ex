//package jungsuk.ch10;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//
//public class Ex10_2 {
//
//	static int paycheckCount(Calendar from, Calendar to) {
//
//		if(from == null || to == null) {
//			return 0;
//		}else if( (from == to) == 21) {
//			return 1;
//		}
//		
//		
//		
//		return monDiff;
//	}
//
//	static void printResult(Calendar from, Calendar to) {
//		Date fromDate = from.getTime();
//		Date toDate = to.getTime();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//		System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ":");
//		System.out.println(paycheckCount(from, to));
//	}
//
//	public static void main(String[] args) {
//		Calendar fromCal = Calendar.getInstance();
//		Calendar toCal = Calendar.getInstance();
//		
//		fromCal.set(2010, 0, 1);
//		toCal.set(2010, 0, 1);
//		printResult(fromCal, toCal);
//		
//		fromCal.set(2010, 0, 21);
//		toCal.set(2010, 0, 21);
//		printResult(fromCal, toCal);
//	
//		fromCal.set(2010, 0, 1);
//		toCal.set(2010, 2, 1);
//		printResult(fromCal, toCal);
//	
//		fromCal.set(2010, 0, 1);
//		toCal.set(2010, 2, 23);
//		printResult(fromCal, toCal);
//	
//		fromCal.set(2010, 0, 23);
//		toCal.set(2010, 2, 21);
//		printResult(fromCal, toCal);
//	
//		fromCal.set(2011, 0, 22);
//		toCal.set(2010, 2, 21);
//		printResult(fromCal, toCal);
//	}
//}
