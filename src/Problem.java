public class Problem {
    public static void main(String[] args) {
        //We have to create the instance of the problem described as in the example
        String[][] matrix = new String[][]{{" ", "D1","D2","D3","Supply"}, {"S1","2","3","1","10"},
                {"S2","5","4","8","35"},{"S3","5","6","8","25"},{"Demand","20","25","25", " "}};
        //I created a matrix string with the elements shown in the lab example
        for(int row=0;row< matrix.length;row++) // we are going through the rows
        {
            for(int coloumn=0;coloumn<matrix[0].length;coloumn++){ //through the coloumns
                System.out.print(matrix[row][coloumn] + " "); // we print the matrix
            }
            System.out.println(); //endline
        }


    }
}
