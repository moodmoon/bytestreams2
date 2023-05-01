package bytestreams2;

public class LAB1 {

    public static void main(String[] args) {
        Circle c = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(c);
        redCircle.draw();
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();
    }
}
 