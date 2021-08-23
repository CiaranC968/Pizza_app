import java.util.Scanner;

public class df {
    public static void main(String[] args) {
        System.out.println("1: Cheese\n2: Chicken\n3: Ham\n4: Bacon");



        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Please Enter number what pizza you would like:- ");
        int input1= sc.nextInt();

        double totalcost = 0;

        if (input1 == 1)
        {
            System.out.println("You have chosen Cheese.");
            totalcost = 5.40;
            System.out.println("your total cost is £" + totalcost);
        }
        else if (input1 ==  2)
        {
            System.out.println("You have chosen Chicken.");
            totalcost = 4.40;
            System.out.println("your total cost is £" + totalcost);
        }
        else if (input1 ==  3)
        {
            System.out.println("You have chosen Ham.");
            totalcost = 3.40;
            System.out.println("your total cost is £" + totalcost);
        }

        else if (input1 ==  4)
        {
            System.out.println("You have chosen Pineapple.");
            totalcost = 2.40;
            System.out.println("your total cost is £" + totalcost);
        }
        else
        {
            System.out.println("INVALID PIZZA SELECTION.");
        }




    }
}
