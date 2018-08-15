package geometrico;

public class Triangulo implements FiguraGeometrica {
    private Segmento lado1;
    private Segmento lado2;
    private Segmento lado3;

    public Triangulo(Segmento lado1, Segmento lado2, Segmento lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimetro() {
        return 0;
    }
}
