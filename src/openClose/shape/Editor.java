package openClose.shape;

public class Editor {
    public void draw(Shape shape){
        if (shape.getType().equals("Rectangle")){
            System.out.println("Rectangle is drawing");
        } else if (shape.getType().equals("Cirle")) {
            System.out.println("Rectangle is circle");
        }else
            System.out.println("Mazgi wrong type");
    }
}
