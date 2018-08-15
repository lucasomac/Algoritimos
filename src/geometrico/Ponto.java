package geometrico;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public String localizarNoPlano() {
        if (this.x > 0 && this.y > 0) {
            return "1º Quadrante";
        } else if (this.x < 0 && this.y > 0) {
            return "2º Quadrante";
        } else if (this.x < 0 && this.y < 0) {
            return "3º Quadrante";
        } else if (this.x > 0 && this.y < 0) {
            return "4º Quadrante";
        } else if (this.x != 0 && this.y == 0) {
            return "Ponto no eixo de X";
        } else if (this.y != 0 && this.x == 0) {
            return "Ponto no eixo de Y";
        } else {
            return "Origem";
        }
    }

    public double getDistancia(Ponto p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
