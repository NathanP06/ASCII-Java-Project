public class Oval extends Shape {
    protected double pi = 3.14;

    public Oval(String color, char character, int length, int width){
        super(color, character, length, width);
    }

    @Override
    public double getArea() {
        return (((length / 2) ^ 2) * pi);
    }

    @Override
    public double getPerimeter() {
        return (length * pi);
    }

    @Override
    public void draw(){
        super.draw();
    }
}