import java.util.Scanner;
    public class t2woDArray {
        public static void main(String[]args){

            Scanner s = new Scanner(System.in);

                int row,colum;

            System.out.println("\n\n ====================  ---  Benzic ---  ====================\n\n ");

            System.out.print("Enter the row number you want: ");
            row = s.nextInt();

            System.out.print("Enter the colum number you want: ");
            colum = s.nextInt();


                int[][] twoDArray = new int[row][colum];
                


                for (int i = 0 ; i < twoDArray.length ; i++){
                    for(int j = 0 ; j < twoDArray[i].length ;j++ ){

                        System.out.printf("my Nummber[%d][%d]: ",i,j);
                        twoDArray[i][j] = s.nextInt(); 


                    }
                }


        }
    }