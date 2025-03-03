import java.util.Scanner;

public class Main {
        public static void main (String args[]){
        Scanner scnr = new Scanner(System.in);

        //Prompts user for the shape
        System.out.println("Please input the shape you wish to create.");
        String userShape = scnr.nextLine();

        while (!userShape.toLowerCase().equals("rectangle")){
            System.out.println("Invalid input, please select from the following: {Rectangle}.");
            userShape = scnr.nextLine();
        }

        //Gets more details for the shape including color, character, length and width.
        System.out.println("Please input the imaginary color of the shape you wish to create.");
        String userColor = scnr.nextLine();

        System.out.println("Please input the character of the shape you wish to create.");
        char userChar = scnr.nextLine().charAt(0);

        System.out.println("Please input the length of the shape you wish to create.");
        int userLength = scnr.nextInt();
        scnr.nextLine(); //Consumes new line

        System.out.println("Please input the width of the shape you wish to create.");
        int userWidth = scnr.nextInt();
        scnr.nextLine(); //Consumes new line

        //Closes scanner & Prints new line
        scnr.close();
        System.out.println();
        System.out.println("--------------------------");

        //Finds the shape the user wants to be created and constructs, then prints it using the users inputs

        //Rectangles && Squares
        if (userShape.toLowerCase().equals("rectangle")){

            //Checks if rectangle is a square (length = width)
            if (userLength == userWidth){
                Square userSquare = new Square(userColor, userChar, userLength);

                userSquare.draw();
                System.out.println();
                System.out.println("Shape Stats: ");                
                System.out.println("The perimeter is: " + userSquare.getPerimeter());
                System.out.println("The area is: " + userSquare.getArea());
            }

            //Any non-squares (rectangles)
            else {
                Rectangle userRectangle = new Rectangle(userColor, userChar, userLength, userWidth);

                userRectangle.draw();
                System.out.println();
                System.out.println("Shape Stats: ");
                System.out.println("The perimeter is: " + userRectangle.getPerimeter());
                System.out.println("The area is: " + userRectangle.getArea());
            }
        }

    }
}
