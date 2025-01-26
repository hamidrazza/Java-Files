package generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }
        Consumer<Integer> ans = (item) -> System.out.println(item*2);
        list.forEach(ans);


        // Lambda Functions
        Operation sum = (a,b) -> (a+b);
        Operation sub = (a,b) -> (a-b);
        Operation prod = (a,b) -> (a*b);
        Operation div = (a,b) -> (a/b);

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operator(5,3,sum));
        System.out.println(myCalculator.operator(5,3,sub));
        System.out.println(myCalculator.operator(5,3,prod));
        System.out.println(myCalculator.operator(5,3,div));

    }
    public int operator(int a , int b, Operation op){
        return op.operation(a,b);
    }
}
interface Operation{
    int operation(int a, int b);
}
