import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3,4);
        shapes[2] = new Square(4);


        Circle shape4 = new Circle(5);
        Random generator = new Random(100);
        double value = generator.nextDouble();
         for (Shape shape : shapes){
             System.out.println(shape);

         }

    }
}
