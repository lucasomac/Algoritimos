package geometrico;

public class Teste {
    private static Ponto[] array = new Ponto[]{new Ponto(8, 5), new Ponto(8, 95), new Ponto(18, 15),
            new Ponto(8, 554), new Ponto(540, 5), new Ponto(123, 896), new Ponto(83, 85), new Ponto(1028, 5000)};


    public static void main(String args[]) {
        HeapSortPointX.heapSort(array);
        for (Ponto i : array) {
            System.out.println(i.toString());
        }
        HeapSortPointY.heapSort(array);
        for (Ponto i : array) {
            System.out.println(i.toString());
        }
        System.out.println(pontoProximoQuad(array));

        pontoProximoLog(array, array.length);

    }

    public static double pontoProximoQuad(Ponto[] pontos) {
        double distance = Double.MAX_VALUE;
        for (int i = 0; i < pontos.length - 2; i++) {
            for (int j = 1; j < pontos.length - 1; j++) {
                if ((new Segmento(pontos[i], pontos[j]).getComprimento() < distance)) {
                    distance = new Segmento(pontos[i], pontos[j]).getComprimento();
                }
            }
        }
        return distance;
    }

    public static double pontoProximoLog(Ponto[] pontos, int n) {
        HeapSortPointX.heapSort(pontos);
        Ponto[] X = pontos;
        HeapSortPointY.heapSort(pontos);
        Ponto[] Y = pontos;
        pontoProximoLogRec(X, Y, 1, X.length);
        return 0;
    }

    public static double pontoProximoLogRec(Ponto[] X, Ponto[] Y, int esq, int dir) {
        if (dir <= esq + 2) {
            int dist = 0;
            return Math.min(new Segmento(X[2], X[0]).getComprimento(), Math.min(new Segmento(X[0], X[1]).getComprimento(), new Segmento(X[1], X[2]).getComprimento()));
        } else {
            int meio = (esq + dir);
            double xf = X[meio].getX();
            double desq = pontoProximoLogRec(X, Y, esq, meio);
            double ddir = pontoProximoLogRec(X, Y, meio + 1, dir);
            return combine(X, Y, esq, dir, desq, ddir);
        }
    }

    public static double combine(Ponto[] X, Ponto[] Y, int esq, int dir, double desq, double ddir) {

        return desq;
    }

    public Ponto[] candidatos(Ponto[] X, int esq, int dir, double dist, int xf) {
        int t = 0;
        for (int k = esq; k < dir; k++) {
            if (X[k].getX() - xf < dist) {
                t++;
            }

        }
        return X;
    }

    public static void intercale() {

    }
}
