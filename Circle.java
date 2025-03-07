public class Circle extends Oval {

    public Circle(String color, char character, int size){
        super(color, character, size, size);
    }

    @Override
    public double getArea() {
        return (((base / 2) ^ 2) * pi);
    }

    @Override
    public double getPerimeter() {
        return (pi * base);
    }

    @Override
    public void draw(){
        super.draw();        
        System.out.println("Your oval is actually a circle! It's length and height are the same, making it a circle!");
    }
    
}
