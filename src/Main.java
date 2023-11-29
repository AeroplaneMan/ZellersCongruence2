import java.util.Scanner;
public class Main {
    public static int zellerEquation(int day, int month, int year){
        if (month == 1 || month == 2){
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int h = (day + ((13 * (month + 1)) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        return h;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Enter the month (1-12): ");
        int month = input.nextInt();
        System.out.println("Enter the day of the week (1-31): ");
        int day = input.nextInt();
        int dayOfWeek = zellerEquation(day, month, year);
        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.printf("The day of the week is " + daysOfWeek[dayOfWeek]);
    }
}