import java.util.Scanner;
public class Part2
{
    public static void main(){
        double side;
        double perimeter;
        double area;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the side length: ");
        side = in.nextDouble();
        perimeter = (4 * side);
        area = Math.pow(side,2);
        
        System.out.println("A square side of: " + side);
        System.out.println("has a perimeter of: " + perimeter);
        System.out.println("and an area of: " + area);
    }
}
