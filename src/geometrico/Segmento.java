package geometrico;

import java.util.Objects;

public class Segmento {
    private Ponto inicio;
    private Ponto fim;

    public Segmento() {
    }

    public Segmento(Ponto inicio, Ponto fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Segmento(double xi, double yi, double xf, double yf) {
        this.inicio = new Ponto(xi, yi);
        this.fim = new Ponto(xf, yf);
    }

    public Ponto getInicio() {
        return inicio;
    }

    public Ponto getFim() {
        return fim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Segmento)) return false;
        Segmento segmento = (Segmento) o;
        return Objects.equals(getInicio(), segmento.getInicio()) &&
                Objects.equals(getFim(), segmento.getFim());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInicio(), getFim());
    }

    public Double getComprimento() {
        return this.inicio.getDistancia(this.fim);
    }
}
