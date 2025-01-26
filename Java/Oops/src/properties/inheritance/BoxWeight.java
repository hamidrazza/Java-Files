package properties.inheritance;

// Inheritance using "extends" keyword.
public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(BoxWeight old) {
        super(old);
        this.weight = old.weight;
    }
    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    BoxWeight(double l, double h, double w, double weight){
        super(l,h,w); // This call the parent class constructor
        this.weight = weight;
    }
}
