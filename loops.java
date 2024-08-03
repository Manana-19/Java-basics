class loops {
    public static void main(String[] Args) {

        // again, 2 types of loops
        // for loop

        //printing 20 prime numbers

        int num = 1;


        // Using num++ instead of count++ because i need 20 prime numbers, not prime numbers in the range of 20......

        for (int count = 0; count < 20; num++) {
            
            while(true) {

                for (int x = 2; x<=num; x++) {
                    
                    if ((num%x)==0) {
                    
                        if (num == x) {
                            
                            System.out.println("Remainder => "+num%x + " " + "Num => "+num + " .. x => "+x);
                            count++;
                            break;
                            
                        }
                        else break;
                    }
        
                }

                break;

            }

        }

        System.out.println("Program completed!");

    }
}
