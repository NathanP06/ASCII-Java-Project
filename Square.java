public class Square extends Rectangle {

    public Square(String color, char character, int size){
        super(color, character, size, size);
    }

    @Override
    public void draw(){
        super.draw();        
        System.out.println("Your rectangle is actually a square! It's length and width are the same, making it a square!");
    }
    
}
