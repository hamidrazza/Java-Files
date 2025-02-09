import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import org.json.simple.*;

import java.util.Map;
import java.util.Scanner;

public class TaskCLI {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("This is a Task Tracker CLI version.");

        boolean repeat = true;
        while(repeat){
            System.out.println("1. Add a new Task");
            System.out.println("2. Update a task");
            System.out.println("3. Delete a task");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1 :
                    add();
                    break;
                case 2 :
                    update();
                    break;
                case 3 :
                    delete();
                    break;
                default :
                    System.out.println("INVALID INPUT !!");
            }

            System.out.print("Want to continue 1/0: ");
            int cont = sc.nextInt();
            if(cont == 0)   repeat = false;
        }
    }
    public static void add() throws FileNotFoundException {
        System.out.println("Writing Data into JSON");
        JSONObject obj = new JSONObject();
        obj.put("ID",1);
        obj.put("task3","Lunch");
        obj.put("task4","Have some Chai");

        Map m = new LinkedHashMap(3);
        m.put("roadNo", 10);
        m.put("area", "GachiBowli");
        m.put("landmark", "Mukesh PG");

        obj.put("address", m);

        JSONArray arr = new JSONArray();
        m = new LinkedHashMap(2);
        m.put("type", "home");
        m.put("contact", "8877322331");

        arr.add(m);

        m = new LinkedHashMap(2);
        m.put("type", "work");
        m.put("contact", "5533244891");
        arr.add(m);

        obj.put("contact", arr);

        PrintWriter pw = new PrintWriter("demo.json");
        pw.write(obj.toJSONString());

        pw.flush();
        pw.close();

        System.out.println("Completed...!!");
    }
    public static void update(){
        System.out.println("You're inside update()");
    }
    public static void delete(){
        System.out.println("You're inside delete()");
    }
}