public class App {
    public static void main(String[] args) throws Exception {
    
    one();
    two();
    three();
    four();
    five();
    six();
    seven();
    eight();
    nine();
    ten();

}       
static void one() {
    System.out.print("");
    System.out.println("1. WORD 1");

char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};
    for(int rows = 0; rows < 4; rows++) 
            
    
        for (int column = 0; column <4; column++){
            
            if (rows == 0) {
                System.out.print(mdArray [rows][column]);  
            }
            else{
                System.out.print("");
        }
    }
}


static void two() {


System.out.println("");
System.out.println("2. WORD 2"); 

char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};
for(int rows = 0; rows < 4; rows++) 
    
    for (int column = 0; column <4; column++){

        if (rows == 1) {
            System.out.print(mdArray [rows][column]);
        }
        else{
            System.out.print("");

        }
    }
}
    

static void three() {


    System.out.println("");
    System.out.println("3. WORD 3"); 

    char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};
        for(int rows = 0; rows < 4; rows++) 
            
            for (int column = 0; column <4; column++){

                if (rows == 2) {
                    System.out.print(mdArray [rows][column]);
                }
                else{
                    System.out.print("");

                }
            }
        }
        

static void four() {


    System.out.println("");
    System.out.println("4. WORD 4"); 

    char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};
        for(int rows = 0; rows < 4; rows++) 
            
            for (int column = 0; column <4; column++){

                if (rows == 3) {
                    System.out.print(mdArray [rows][column]);
                }
                else{
                    System.out.print("");

                }
            }
        }
    

static void five() {


    System.out.println("");
    System.out.println("5. WORD 5"); 

    char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};
        for(int rows = 0; rows < 4; rows++) 
            
            for (int column = 0; column <4; column++){

                if (column == 0) {
                    System.out.println(mdArray [rows][column]);
                }
                else{
                    System.out.print("");

                }
            }
        }
                
static void six() {


    System.out.println("");
    System.out.println("6. WORD 6"); 

    char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};
        for(int rows = 0; rows < 4; rows++) 
            
            for (int column = 0; column <4; column++){

                if (column == 1) {
                    System.out.println(mdArray [rows][column]);
                }
                else{
                    System.out.print("");

                }
            }
        }
                    
static void seven() {


    System.out.println("");
    System.out.println("7. WORD 7"); 

    char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};
        for(int rows = 0; rows < 4; rows++) 
            
            for (int column = 0; column <4; column++){

                if (column == 2) {
                    System.out.println(mdArray [rows][column]);
                }
                else{
                    System.out.print("");

                }
            }
        }
                        

static void eight() {


    System.out.println("");
    System.out.println("8. WORD 8"); 

    char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};
        for(int rows = 0; rows < 4; rows++) 
            
            for (int column = 0; column <4; column++){

                if (column == 3) {
                    System.out.println(mdArray [rows][column]);
                }
                else{
                    System.out.print("");

                }
            }
        }
    
    
    static void nine() {


        System.out.println("");
        System.out.println("9. WORD 9"); 
    
        char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};
            for(int rows = 0; rows < 4; rows++) {
                System.out.println();
                for (int column = 0; column <4; column++){
                    if (rows == 1 && (column == 1 || column == 2)) {
                        System.out.print(" ");
                    } else if (rows == 2 && (column == 1 || column == 2)) {
                        System.out.print(" ");
                    }
                    else {
                        
                        System.out.print(mdArray [rows][column]);
                    }
                }
            }
    }
    

    static void ten() {


        System.out.println("");
        System.out.println("10. WORD 10"); 
    
        char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};
            for(int rows = 0; rows < 4; rows++) {
                System.out.println();
                for (int column = 0; column <4; column++){
                    if (rows == 0 && (column == 1 || column == 2)) {
                        System.out.print(" ");
                    } else if (rows == 1 && (column == 0 || column == 3)) {
                        System.out.print(" ");
                    }else if (rows == 2 && (column == 0 || column == 3)) {
                        System.out.print(" ");
                    }else if (rows == 3 && (column == 1 || column == 2)) {
                        System.out.print(" ");      
                    }
                    else {
                        
                        System.out.print(mdArray [rows][column]);
                    }
                }
            }
        }
    }
