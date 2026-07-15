public class LeapYearChecker{
    public static boolean isLeapYear(int year){
        if (year%400==0) return true;
        if (year%100==0) return false;
        return year%4==0;
    }
    public static void main(String[] args){
        System.out.println(isLeapYear(2028));
        System.out.println(isLeapYear(2007));
        System.out.println(isLeapYear(2006));
        System.out.println(isLeapYear(2000));
    }
}