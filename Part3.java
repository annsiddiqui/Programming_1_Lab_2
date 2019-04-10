import java.util.Scanner;
public class Part3{   
    public static void main(){
        int teamMembers;
        int numFruit;
        int fruitPerMem;
        int fruitReturn;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of team members: ");
        teamMembers = in.nextInt();
        System.out.println("Enter the number of fruits: ");
        numFruit = in.nextInt();
        fruitPerMem = (numFruit/teamMembers);
        fruitReturn = (numFruit%teamMembers);
        System.out.println("Each team member has: " + fruitPerMem + " fruits");
        System.out.println(fruitReturn + " pieces of fruit were returned.");
    }
}