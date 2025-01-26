package properties.inheritance;

public class BoxPrice extends BoxWeight {
    double cost;

    public BoxPrice(double cost) {
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice old) {
        super(old);
        this.cost = old.cost;
    }

    // This will show of the child class flow
    // i.e. BoxPrice(side,weight,cost) --> BoxWeight(side,weight) --> Box(side)
    BoxPrice(double side, double weight, double cost){
        // See how this super keyword works.
        super(side,weight);
        this.cost = cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }
}
