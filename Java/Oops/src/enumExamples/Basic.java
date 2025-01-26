package enumExamples;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        //These are enum constants
        //They are public, static & final
        // Since, they are final we can't make child enums
        // These are the type of "Week".


//        Week() {
//            System.out.println("Constructor call for " + this);
//        }

        /*
        * This is not public or protected, only private or default
        * Because we don't want to create new objects
        * this is not the enum concepts, That's why
        * Internally : public static final Week Monday = new Week();
        */
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for (Week days : Week.values()){
            System.out.println(days);
        }
        // Gives the index of defined week value.
        System.out.println(week.ordinal());
    }
}
