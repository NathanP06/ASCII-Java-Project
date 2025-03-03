public class Circle extends Oval {

    public Circle(String color, char character, int size){
        super(color, character, size, size);
    }

    @Override
    public double getArea() {
        return (((length / 2) ^ 2) * pi);
    }

    @Override
    public double getPerimeter() {
        return (pi * length);
    }

    @Override
    public void draw(){
        super.draw();        
        System.out.println("Your oval is actually a circle! It's length and width are the same, making it a circle!");
    }
    
}
