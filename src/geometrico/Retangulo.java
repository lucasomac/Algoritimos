package geometrico;

public class Retangulo extends Quadrado implements FiguraGeometrica {
    private Segmento altura;

    public Retangulo(Segmento lado, Segmento altura) {
        super(lado);
        this.altura = altura;
    }

    public Segmento getAltura() {
        return altura;
    }

    @Override
    public double getArea() {
        return this.altura.getComprimento() * super.lado.getComprimento();
    }

    @Override
    public double getPerimetro() {
        return (this.altura.getComprimento() * 2) + super.getPerimetro() / 2;
    }
}
