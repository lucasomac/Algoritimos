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

    public Ponto getInicio() {
        return inicio;
    }

    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }

    public Ponto getFim() {
        return fim;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
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

    public double distancia() {
        return Math.sqrt(((fim.getX() - inicio.getX()) ^ 2) + ((fim.getY() - inicio.getY()) ^ 2));
    }
}
