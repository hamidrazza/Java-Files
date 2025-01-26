package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            int c = a/b;
//            divide(a,b);

            // Making an exception for check the double catch-expression
//            throw new Exception("Making exception for check");
            String name = "Azad";
            if(name.equals("Azad")){
                throw new MyException("Name is Azad");
            }
        }
        // Our custom MyException
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            // getMessage() --> gives the message about, what type of exception we got.
            System.out.println(e.getMessage());
            // here, getMessage() shows --> "/ by zero"
        }
        // You can also add more catch, but we have to make it in order
        // First catch strictly exception then catch another.
        catch (Exception e){
            System.out.println("Just a normal exception.");
        }
        finally {
            System.out.println("This will always execute.");
        }
    }

    /* Always add --> throws _EXCEPTION_NAME */
    static int divide(int a, int b) throws ArithmeticException{
        // Explicitly throwing an Exception
        if(b == 0){
            throw new ArithmeticException("Please don't divide by zero");
        }
        return a/b;
    }
}
