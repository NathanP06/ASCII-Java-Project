public class Oval extends Shape {
    protected double pi = 3.14;

    public Oval(String color, char character, int base, int height){
        super(color, character, base, height);
    }

    @Override
    public double getArea() {
        return (((base / 2) * (height / 2)) * pi);
    }

    @Override
    public double getPerimeter() {
        return (pi * ( 3 * (base + height) - Math.sqrt(((3 * base) + height) * (base + (3 * height)))));
    }

    @Override
    public void draw(){
        super.draw();
        System.out.println("Oh no! Ovals are to difficult to accurately print, therefore oval and circle functionality is disabled.");
        System.out.println(); // Goes to next line
        System.out.println(); // Prints blank line
        System.out.println("Your shape has been created!");
    }
}