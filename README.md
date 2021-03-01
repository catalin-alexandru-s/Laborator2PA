# Laborator2PA
Laboratory 2 from Advanced Programming
For the compulsory part:
Firstly I had to create an OOP model of the problem with 3 classes: Source, Destination, Problem.
Sources and Destination have names. The sources will also have the property type. The available types will be implemented as an enum. The example in what I wrote is with  Warehouses and Factories.
S1-Factory, S2,S3-WAREHOUSES.
Each class should have constructors, getters and setters, in my case the constructor is with 0 arguments.
toString method is overriden for the classes Source and Destination.
Finally I had to print the instance of the problem which looks like this: https://profs.info.uaic.ro/~acf/java/labs/lab_02.html , I declared a matrix of strings, I'm goint throught it's coloumns and rows and show it on the screen.


Optional: Override the equals method form the Object class for the Source, Destination classes. The problem should not allow adding the same source or destination twice.
Instead of using an enum, create dedicated classes for warehouses and factories. Source will become abstract.
Create a class to describe the solution.
Implement a simple algorithm for creating a feasible solution to the problem (one that satisfies the supply and demand constraints).
Write doc comments in your source code and generate the class documentation using javadoc.
