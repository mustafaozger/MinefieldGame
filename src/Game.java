import java.util.Scanner;
public class Game
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numRow=0;
        int numColum=0;

        do {


            System.out.println("Enter the number of row");
             numRow = input.nextInt();
            System.out.println("Enter the number of colum ");
             numColum = input.nextInt();
            if (numRow * numColum < 4)
                System.out.println("Please enter more value\n\n ");
        }while (numRow * numColum < 4);


        Minefield.Matris(numRow,numColum);
    }


}
