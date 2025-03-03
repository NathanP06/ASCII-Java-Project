public abstract class Shape {
    protected String color; //will print the color as a text, since you cannot color change in terminal
    protected char character; //the character we will draw with
    protected int length; //length of our bounding box
    protected int width; //width of our bounding box

    //Creates a shape
    public Shape(String color, char character, int length, int width){
        this.color = color;
        this.character = character;
        this.length = length;
        this.width = width;
    }

    //Two methods that are for all sub-classes of "shape".
    abstract public double getArea();
    abstract public double getPerimeter();

    //the "Draw" method which is also used by all classes under "shape".
    public void draw(){
        
        System.out.println("Generating your shape...");
        System.out.println("Imagine the shape you are about to see is " + color.toLowerCase() + ".");
        System.out.println(); // prints blank line to seperate the shape from the rest of the text.

    }
}