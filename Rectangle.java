public class Rectangle extends Shape {
    public Rectangle(String color, char character, int base, int height){
        super(color, character, base, height);
    }

    @Override
    public double getArea() {
        return (base * height);
    }

    @Override
    public double getPerimeter() {
        return (2 * base + 2 * height);
    }

    //Creates the shape
    @Override
    public void draw(){
        super.draw();
        
        //Prints the first line of the shape
        for (int i = 0; i < base; i++){
            System.out.print(character + " ");
        }

        System.out.println();

        //Prints the middle section of the shape, leaving room for the final line.
        for (int i = 1; i < height - 1; i++){
            System.out.print(character); 
            for (int j = 1; j < (base * 2) - 2; j++){
                System.out.print(" ");
            }
            System.out.print(character);
            System.out.println();
        }

        //Prints the last line of the shape
        for (int i = 0; i < base; i++){
            System.out.print(character + " ");
        }

        System.out.println(); // Goes to next line
        System.out.println(); // Prints blank line
        System.out.println("Your shape has been created!");

    }
}
