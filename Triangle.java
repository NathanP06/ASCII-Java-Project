public class Triangle extends Shape {

    public Triangle(String color, char character, int length, int width){
        super(color, character, length, width);
    }

    @Override
    public double getArea() {
        return((length * width) / 2);
    }

    @Override
    public double getPerimeter() {
        double sidec = Math.sqrt((length ^ 2) + (width ^ 2));
        return(length + width + sidec);
    }

    @Override
    public void draw(){
        super.draw();

        //Draw triangle here

        System.out.println(); // Goes to next line
        System.out.println(); // Prints blank line
        System.out.println("Your shape has been created!");


    }
}
