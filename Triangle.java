public class Triangle extends Shape {

    public Triangle(String color, char character, int base, int height){
        super(color, character, base, height);
    }

    @Override
    public double getArea() {
        return((base * height) / 2);
    }

    @Override
    public double getPerimeter() {
        double sidec = Math.sqrt((base ^ 2) + (height ^ 2));
        return(base + height + sidec);
    }

    @Override
    public void draw(){
        super.draw();

        //Draw triangle here
        for (int i = 1; i <= height; i++) {
            int currentWidth = (int) Math.round(((double) i / height) * base);
            
            for (int j = 0; j < (base - currentWidth) / 2; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < currentWidth; k++) {
                if (k == 0 || k == currentWidth - 1 || i == height) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        

        System.out.println(); // Goes to next line
        System.out.println(); // Prints blank line
        System.out.println("Your shape has been created!");


    }
}
