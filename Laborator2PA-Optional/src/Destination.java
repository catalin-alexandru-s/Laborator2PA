import java.util.Objects;

public class Destination {
    private String name;
    private int commodity;//destinations

    Destination()  //constructor with 0 arguments
    {
        System.out.println("Instantiation Destination");
    }

    /**
     * Getter for name
     */
    public String getName() {   //Getter method for the name
        return name;
    } //getter for name


    public void setName(String name) { // Setter method for the name
        this.name = name;
    } //setter for name

    public int getCommodity() {  //Getter method for the commodity
        return commodity;
    } //getter for commodity

    public void setCommodity(int commodity) { //Setter method for the commodity
        this.commodity = commodity;
    } //setter for commodity

    @Override
    public String toString() {  //toString method is overridden
        return "Destination{" +
                "name='" + name + '\'' +
                ", commodity=" + commodity +
                '}';
    }

    @Override //equals method overriden
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destination that = (Destination) o;
        return commodity == that.commodity && Objects.equals(name, that.name);
    }

}
