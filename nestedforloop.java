class nestedforloop{//this is a class called nestedloop.
    static public void main(String args[]){//this is a mandatory java syntax.
        int i;//first argument.
        int j;//second argument.
    int rows = 12;//assigniment of values.

for (i= rows; i<= 12; i--) { //condition for loop.
  
            // loop to print the number of stars in each row 
            for (j = 1; j <= 12 ; j++) { 
                System.out.print("* "); 
            } 
  
            // for new line after printing each row 
            System.out.println(); 
        } 
    } }
