import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void Main(String[] args) {

        Destination d1 = new Destination(); //we declare an object
        d1.setName("Sao Paulo"); // we set a name for it
        d1.setCommodity(6); // and it's value for commodity
        //These comments are available for all beneath
        Destination d2 = new Destination();
        d2.setName("Rio de Janeiro");
        d2.setCommodity(10);

        Destination d3 = new Destination();
        d3.setName("Brasilia");
        d3.setCommodity(4);
        List<Destination> listDestination = new ArrayList<Destination>(); // declared list for destination
        listDestination.add(d1);
        listDestination.add(d2);
        listDestination.add(d3);

        Source s1 = new Factories();
        s1.setName("Buenos Aires");
        s1.setCapacity(4); //Set the value for capacity

        Source s2 = new Warehouse();
        s2.setName("Santa Fe");
        s2.setCapacity(7);

        Source s3 = new Warehouse();
        s3.setName("Rosario");
        s3.setCapacity(9);
        List<Source> listSource = new ArrayList<Source>(); //declared list for source
        listSource.add(s1); //we add in the list
        listSource.add(s2);
        listSource.add(s3);

    }
}
