import java.util.Scanner;
public class Minefield
{
   public static boolean[]  work= {true};
    public static void Matris (int row, int colum )
    {
        int counter =0 ;
        Scanner input = new Scanner(System.in);
        int numMine = (row*colum)/4;
        String[][] safeArea = new String[row][colum];
        String[][] mine = new String[row][colum];
        System.out.println(numMine);

        Print(row,colum,safeArea,mine);

        for(int i = numMine; i>=0;i--)
        {

            int selectedRow = (int) (Math.random()*(row));
            int selectedColum = (int) (Math.random()*(colum));

            if (mine[selectedRow][selectedColum] .equals("*"))
            {
                i++;
                continue;
            }

           mine[selectedRow][selectedColum] = "*";

        }




        for(int i= 3 * numMine ; i>0;i--  )
        {


            System.out.print("Enter row: ");
            int enterRow = input.nextInt();
            System.out.println("Enter colum: ");
            int enterColum =input.nextInt();

            if(mine[enterRow-1][enterColum-1].equals("*"))
            {
                safeArea[enterRow-1][enterColum-1]="*";
                Print(row,colum,safeArea,mine);
                System.out.println("You are died");
                System.exit(0);
            }
            else
            {

                for (int k = enterRow-1 ; k<=enterRow+1; k++ )
                {
                    for (int j = enterColum-1 ; j<=enterColum+1;j++)
                    {
                        if(k>row-1)
                        {
                            continue;
                        }

                       else if(j>colum-1)
                        {
                            continue;
                        }

                       else if(mine[k][j] == "*")
                        {
                            System.out.println(k + j);
                            counter++;
                        }
                    }
                }
                safeArea[enterRow-1][enterColum-1] = String.valueOf(counter);

                Print(row,colum,safeArea,mine);
                counter=0;
            }


        }



    }

    public static void Print(int row , int colum,String[][] safeArea , String[][] mine)
    {
        for (int i= 0 ; i<row;i++)
        {
            for (int j=0;j<colum;j++) {

                if (work[0])
                {
                    safeArea[i][j] = "-";
                    mine[i][j] = "-";
                }
                System.out.print(safeArea[i][j]);
            }
            System.out.println();
        }
        work[0] = false;
    }
}
