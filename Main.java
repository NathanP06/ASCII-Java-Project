import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner scnr = new Scanner(System.in);

        //Prompts user for the shape
        System.out.println("Please input the shape you wish to create.");
        String userShape = scnr.nextLine();

        while (!userShape.toLowerCase().equals("rectangle") && !userShape.toLowerCase().equals("oval") && !userShape.toLowerCase().equals("triangle")){
            System.out.println("Invalid input, please select from the following: {Rectangle, Oval}.");
            userShape = scnr.nextLine();
        }

        //Gets more details for the shape including color, character, length and width.
        System.out.println("Please input the imaginary color of the shape you wish to create.");
        String userColor = scnr.nextLine();

        System.out.println("Please input the character of the shape you wish to create.");
        char userChar = scnr.nextLine().charAt(0);

        System.out.println("Please input the length of the shape you wish to create.");
        int userBase = scnr.nextInt();
        scnr.nextLine(); //Consumes new line

        System.out.println("Please input the height of the shape you wish to create.");
        int userHeight = scnr.nextInt();
        scnr.nextLine(); //Consumes new line

        //Closes scanner & Prints new line
        scnr.close();
        System.out.println();
        System.out.println("--------------------------");
    

        //Finds the shape the user wants to be created and constructs, then prints it using the users inputs

        //Rectangles & Squares
        if (userShape.toLowerCase().equals("rectangle")){

            //Checks if rectangle is a square (length = width)
            if (userBase == userHeight){
                Square userSquare = new Square(userColor, userChar, userBase);
                userSquare.draw();
                System.out.println();
                userSquare.stats();
            }

            //Any non-squares (rectangles)
            else {
                Rectangle userRectangle = new Rectangle(userColor, userChar, userBase, userHeight);

                userRectangle.draw();
                System.out.println();
                userRectangle.stats();
            }
        }

        //Ovals & Circles
        if (userShape.toLowerCase().equals("oval")){

            //Checks if oval is a circle
            if (userBase == userHeight){
                Circle userCircle = new Circle(userColor, userChar, userBase);

                userCircle.draw();
                System.out.println();
                userCircle.stats();              
            }

            //Any non-circles (ovals)
            else {
                Oval userOval = new Oval(userColor, userChar, userBase, userHeight);

                userOval.draw();
                System.out.println();
                userOval.stats();
            }            
        }

        //Triangles
        if (userShape.toLowerCase().equals("triangle")){
            Triangle userTriangle = new Triangle(userColor, userChar, userBase, userHeight);

            userTriangle.draw();
            System.out.println();
            userTriangle.stats();
            
        }

    }
}
