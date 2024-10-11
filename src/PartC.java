import java.util.Random;
import java.util.Scanner;

public class PartC
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        Random gen = new Random();

        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int dieRoll = 0;
        int dieSum = 0;
        String continueYN = "";
        String trash = "";
        boolean done = false;
        boolean conDone = false;



        System.out.println("Roll#\tDie1\tDie2\tDie3\tDie Sum");
        System.out.println("_________________________________________");
        System.out.println();

        do
        {
            do
            {
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                dieRoll++;
                dieSum = die1 + die2 + die3;

                System.out.printf("%6d\t%4d\t%4d\t%4d\t%4d\n", dieRoll, die1, die2, die3, dieSum);

            } while (!(die1 == die2 && die2 == die3));

                do
                {
                    System.out.print("Would you like to play again [YN]: ");
                    if(in.hasNextLine())
                    {
                        continueYN = in.nextLine();

                        if(continueYN.equalsIgnoreCase("N"))
                        {
                            done = true;
                            conDone= true;
                        }
                        else if(continueYN.equalsIgnoreCase("Y"))
                        {
                            dieRoll = 0;
                            done = false;
                            conDone= true;
                        }
                        else
                        {
                            System.out.println(continueYN + " is not a valid input, try again!");
                            conDone= false;
                        }
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println(trash + " is not a valid input, try again!");
                        conDone= false;
                    }
                }while(!conDone);
        } while (!done);
    }
}
