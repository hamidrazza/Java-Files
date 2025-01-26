public class methods {
    public static class  methods_arth {
        int sum(int x,int y){
            return x+y;
        }
        int sub(int x,int y){
            return x-y;
        }
    }
    public static void main(String args[]){
        int a=5;
        int b=6;
 methods_arth obj=new methods_arth();
 int c=obj.sum(a,b);
 int d=obj.sub(a,b);
 System.out.println("The value of c is "+c+" and value of d is "+d);
    }
}
