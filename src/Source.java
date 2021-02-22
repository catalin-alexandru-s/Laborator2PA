public class Source {

    public enum Type {  //The enum function for available types
        WAREHOUSE,
        FACTORY;
    }

    private String name;
    private int capacity;

    Type s1 = Type.FACTORY; //We set that s1 is a factory
    Type s2 = Type.WAREHOUSE; // We set that s2 and s3 are warehouses
    Type s3 = Type.WAREHOUSE;

    Source()  //constructor with 0 arguments
    {
        System.out.println("Instantiation Source");
    }

    public String getName() { // Getter method for the name
        return name;
    }  // Getter method for the name

    public void setName(String name) {  // Setter method for the name
        this.name = name;
    }

    public int getCapacity() {  //Getter method for the capacity
        return capacity;
    } //Getter method for the capacity

    public void setCapacity(int capacity) {  //Setter method for the capacity
        this.capacity = capacity;
    } // Setter method for the capacity

    @Override
    public String toString() { //toString method is overridden
        return "Source{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", s1=" + s1 +
                ", s2=" + s2 +
                ", s3=" + s3 +
                '}';
    }
}
