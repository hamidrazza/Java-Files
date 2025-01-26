public class operators {
    public static void main(String[] args) {
        System.out.println("Operators in Java : ");
        // 1. Arithmetic operator = means mathematics operators
        /*int a=5;
        int rem = a % 3; // This % (modulo) operator gives us remainder.
        int b = 5 + a;
        System.out.println(b);*/

        // 2. Assignment Operator
        int c = 5; // Here 5 is assign in 'c' using assignment operator '='
        c += 5; // It is equals to (c = c + 5)

        // 3. Comparison Operator
//        System.out.println(5>2);

        // 4. Logical Operator
       /* System.out.println(54>23 && 34<22);
        System.out.println(54>23 || 34<22);*/

        // 5. Bitwise Operator : It works on bit(0s and 1s)
        System.out.println(5&3);
        /*  101 == 5
            011 == 3
           _____ Using & bitwise operator
            001 == 1 */


    }
}