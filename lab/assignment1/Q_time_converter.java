import java.util.*;

public class Q_time_converter {

public static void seconds_to_hours (int total_seconds){
    int hours = total_seconds/3600;
    int remaining = total_seconds % 3600;
    int minutes = remaining / 60;  
    int seconds = remaining % 60;

    System.out.printf("The %d seconds = %d hours, %d minutes, %d seconds", total_seconds, hours, minutes, seconds);
}
    public static void main(String[] args) {
        // System.out.println(seconds_to_hours(60));
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the no. of seconds: ");
        int total_seconds = sc.nextInt();

        seconds_to_hours(total_seconds);
    }
}
