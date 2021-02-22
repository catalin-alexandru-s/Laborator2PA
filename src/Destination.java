public class Destination {
    private String name;
    private int commodity;//destinations

    Destination()  //constructor with 0 arguments
    {
        System.out.println("Instantiation Destination");
    }

    public String getName() {   //Getter method for the name
        return name;
    }

    public void setName(String name) { // Setter method for the name
        this.name = name;
    }

    public int getCommodity() {  //Getter method for the commodity
        return commodity;
    }

    public void setCommodity(int commodity) { //Setter method for the commodity
        this.commodity = commodity;
    }

    @Override
    public String toString() {  //toString method is overridden
        return "Destination{" +
                "name='" + name + '\'' +
                ", commodity=" + commodity +
                '}';
    }
}
