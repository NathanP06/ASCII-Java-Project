public class Oval extends Shape {
    protected double pi = 3.14;

    public Oval(String color, char character, int length, int width){
        super(color, character, length, width);
    }

    @Override
    public double getArea() {
        return (((length / 2) * (width / 2)) * pi);
    }

    @Override
    public double getPerimeter() {
        return (pi * ( 3 * (length + width) - Math.sqrt(((3 * length) + width) * (length + (3 * width)))));
    }

    @Override
    public void draw(){
        super.draw();
        
        System.out.println(); // Goes to next line
        System.out.println(); // Prints blank line
        System.out.println("Your shape has been created!");
    }
}