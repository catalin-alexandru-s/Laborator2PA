import java.util.ArrayList;
import java.util.List;

public class Solution {
    int matrixcost[][] = {{2, 3, 1}, {5, 4, 8}, {5, 6, 8}};
    List<Destination> listDestination = new ArrayList<Destination>();
    List<Source> listSource = new ArrayList<Source>();


    public List<Source> getListSource() { //getter for initializing list
        return listSource;
    }

    public void setListSource(List<Source> listSource) { //setter for initializing list
        this.listSource = listSource;
    }


    public List<Destination> getListDestination() { // getter for initializing list
        return listDestination;
    }

    public void setListDestination(List<Destination> listDestination) { //setter for initializing list
        this.listDestination = listDestination;
    }

   /* public void rezolvare() {
        for (int i = 0; i < listSource.size(); i++)
            for (int j = 0; j < listDestination.size(); j++)

    } */ //attempted solution

}
