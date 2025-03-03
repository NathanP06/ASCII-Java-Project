public class Rectangle extends Shape {
    public Rectangle(String color, char character, int length, int width){
        super(color, character, length, width);
    }

    @Override
    public double getArea() {
        return (length * width);
    }

    @Override
    public double getPerimeter() {
        return (2 * length + 2 * width);
    }

    //Creates the shape
    @Override
    public void draw(){
        super.draw();
        
        //Prints the first line of the shape
        for (int i = 0; i < length; i++){
            System.out.print(character + " ");
        }

        System.out.println();

        //Prints the middle section of the shape, leaving room for the final line.
        for (int i = 1; i < width - 1; i++){
            System.out.print(character); 
            for (int j = 1; j < (length * 2) - 2; j++){
                System.out.print(" ");
            }
            System.out.print(character);
            System.out.println();
        }

        //Prints the last line of the shape
        for (int i = 0; i < length; i++){
            System.out.print(character + " ");
        }

        System.out.println(); // Goes to next line
        System.out.println(); // Prints blank line
        System.out.println("Your shape has been created!");

    }
}
