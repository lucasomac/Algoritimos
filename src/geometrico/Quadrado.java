package geometrico;

public class Quadrado implements FiguraGeometrica {
    protected Segmento lado;

    public Quadrado(Segmento lado) {
        this.lado = lado;
    }

    public Segmento getLado() {
        return lado;
    }

    public double getArea() {
        return Math.pow(this.lado.getComprimento(), 2);
    }

    public double getPerimetro() {
        return this.lado.getComprimento() * 4;
    }
}
