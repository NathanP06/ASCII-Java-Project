public abstract class Shape {
    protected String color; //will print the color as a text, since you cannot color change in terminal
    protected char character; //the character we will draw with
    protected int base; //length of our bounding box
    protected int height; //width of our bounding box

    //Creates a shape
    public Shape(String color, char character, int base, int height){
        this.color = color;
        this.character = character;
        this.base = base;
        this.height = height;
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

    //the "stats" method which is used by all classes under "shape".
    public void stats(){
        System.out.println("Shape Stats: ");                
        System.out.println("The perimeter is: " + getPerimeter()); //gets and prints perimeter of shape
        System.out.println("The area is: " + getArea()); //gets and prints perimeter of shape
    }
}