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

        Source s1 = new Source();
        s1.setName("Buenos Aires");
        s1.setCapacity(4); //Set the value for capacity

        Source s2 = new Source();
        s2.setName("Santa Fe");
        s2.setCapacity(7);

        Source s3 = new Source();
        s3.setName("Rosario");
        s3.setCapacity(9);


    }
}
