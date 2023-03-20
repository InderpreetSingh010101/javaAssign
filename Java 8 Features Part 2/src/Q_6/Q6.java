package Q_6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

//  Using java 8 date/time api:
//
//    WAP to get two dates from user and print if the first date occurs bfore or after the second date supplied by the user.
//    WAP to print current date and time in 3 different time zones.
public class Q6 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        System.out.println("Enter The First Date In YYYY-MM-DD");
        String d1 = scn.nextLine() ;
        System.out.println("Enter The Second Date Date In YYYY-MM-DD");
        String d2 = scn.nextLine() ;

        // Compare 2 dates

        try{
            LocalDate date1 = LocalDate.parse(d1) ;
            LocalDate date2 = LocalDate.parse(d2) ;

            if(date1.equals(date2)){
                System.out.println("Dates are Equal");
            }else if(date1.isBefore(date2)){
                System.out.println("First Date Is Before");
            }else{
                System.out.println("First Date is After");
            }

        }catch (Exception e){
            System.out.println("INVALID Date");
        }





//        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
////
//        System.out.println(LocalDateTime.now());
//        ZoneId id1 = ZoneId.of("America/Marigot") ;
//        ZoneId id2 = ZoneId.of("Europe/London") ;
//        ZoneId id3 = ZoneId.of("Canada/Mountain") ;
//        System.out.println(ZonedDateTime.of(LocalDateTime.now(), id1));
//        System.out.println(ZonedDateTime.of(LocalDateTime.now(), id2));
//        System.out.println(ZonedDateTime.of(LocalDateTime.now(), id3));


        // Time and Date of Different Regions

        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        df.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
        System.out.println("Date and time in Madrid: " + df.format(date));

        df.setTimeZone(TimeZone.getTimeZone("America/Denver"));
        System.out.println("Date and time in Denver: " + df.format(date));

        df.setTimeZone(TimeZone.getDefault());
        System.out.println("Date and time in India: " + df.format(date));



    }
}
