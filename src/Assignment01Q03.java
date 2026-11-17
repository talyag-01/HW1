public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int numOdd = 0;
        int fib1 = 1;
        int fib2 = 1;
        System.out.println("The first " + x + " Fibonacci numbers are:");
        for (int i = 0; i < x; i++) {
            int fibNum;
            if (i<=1) {
                fibNum = 1;
                System.out.print(fibNum);
            } else {
                fibNum = fib1 + fib2;
            System.out.print(fibNum);
            int temp = fibNum;
            fib1 = fib2;
            fib2 = temp;
            }
            if (fibNum % 2 == 1) {
                numOdd++;
            }
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space  
        }
        System.out.println();        
        System.out.println("The number of odd numbers is: " + numOdd);
    } 
}