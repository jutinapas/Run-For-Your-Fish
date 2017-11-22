package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawingObject extends Canvas {

    private final double WIDTH;
    private final double HEIGHT;

    protected GraphicsContext gc;

    public DrawingObject(double x, double y, double width, double height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        gc = getGraphicsContext2D();
        gc.setFill(Color.WHITE);
        setTranslateX(x);
        setTranslateY(y);
        setWidth(width);
        setHeight(height);
    }

    protected void filpCanvas() {
        setScaleX(-getScaleX());
    }

    public double getX() {
        return getTranslateX();
    }

    public double getY() {
        return getTranslateY();
    }

    public double getWIDTH() {
        return WIDTH;
    }

    public double getHEIGHT() {
        return HEIGHT;
    }

}
