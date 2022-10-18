public class assignment2 {

    public static void main(String[] args) throws Exception {

        int count = 0;

         while (count !=3){

            System.out.println("GABRIEL");

            count ++;

        }

        // do while loop

         int i = 0;

         do {

            System.out.println("MERCADO");

             i ++;

         } while (i != 4);

    

         //for loop

         for (int l = 0; l != 5;  l++) {

            System.out.println("CATAPANG");

         }

         // char array

        

         char[] myFirstName = {'G','A','B','R','I','E','L'};

         for (int num = 0; num < myFirstName.length; num++) {

            System.out.print(myFirstName[num]);

         }

        

        System.out.println();

         // firstname reverse

         for (int num = myFirstName.length-1; num >= 0; num--) 

            System.out.print(myFirstName[num]);

        

    }

}
