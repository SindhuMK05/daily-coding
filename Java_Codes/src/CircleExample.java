import java.util.*;
public class CircleExample {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius=sc.nextDouble();
        if(radius>0) {


            double area = Math.PI * Math.pow(radius, 2);
            double circumference = 2 * Math.PI * radius;
            System.out.println("Circle Area:"+area);
            System.out.println("circumference"+circumference);
        } else if (radius<0) {
            System.out.println("Error:Radius Cannot be Negative");

        }else{
            System.out.println("Please enter valid numerical value");
        }

    }
}
