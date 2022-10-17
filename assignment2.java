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
        
        String[] myFirstName = {"G","A","B","R","I","E","L"};

        for (int counter = 0; counter < myFirstName.length; counter++) {
            System.out.println(myFirstName[counter]);
        }

        // char array in reverse
        
        String[] myfirstname = {"L","E","I","R","B","A","G"};

        for (int l = 0; l < myFirstName.length; l++) {
            System.out.println(myfirstname[l]);
        }
    }
}
