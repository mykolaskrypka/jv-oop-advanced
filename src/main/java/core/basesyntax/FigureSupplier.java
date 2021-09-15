package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                return new Square(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(10) + 1);
            case 2:
                return new Circle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(10) + 1);
            case 3:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(10) + 1,
                        new Random().nextInt(10) + 1,
                        new Random().nextInt(10) + 1);
            case 4:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(10) + 1,
                        new Random().nextInt(10) + 1);
            default:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(10) + 1,
                        new Random().nextInt(10) + 1);
        }
    }
}
