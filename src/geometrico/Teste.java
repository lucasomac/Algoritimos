package geometrico;

public class Teste {
    private static Ponto[] array;
    private static double distance = Double.MAX_VALUE;

    static {
        array = new Ponto[]{new Ponto(8, 5), new Ponto(8, 95), new Ponto(18, 15),
                new Ponto(8, 554), new Ponto(540, 5), new Ponto(123, 896), new Ponto(83, 85), new Ponto(1028, 5000)};
    }

    public static void main(String args[]) {
        HeapSortPointX.heapSort(array);
        for (Ponto i : array) {
            System.out.println(i.toString());
        }
        HeapSortPointY.heapSort(array);
        for (Ponto i : array) {
            System.out.println(i.toString());
        }
        System.out.println(pontoProximoQuad());

        pontoProximoLog(array, array.length);
    }

    public static double pontoProximoQuad() {
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if ((distancia(array[i], array[j]) < distance)) {
                    distance = Math.sqrt(((array[i].getX() - array[j].getX()) ^ 2) + ((array[i].getY() - array[j].getY()) ^ 2));
                }
            }
        }
        return distance;
    }

    public static double pontoProximoLog(Ponto[] array, int n) {
        HeapSortPointX.heapSort(array);
        Ponto[] X = array;
        HeapSortPointY.heapSort(array);
        Ponto[] Y = array;
        pontoProximoLogRec(X, Y, X.length);
        return 0;
    }

    public static double pontoProximoLogRec(Ponto[] X, Ponto[] Y, int n) {
        if (n <= 3) {
            int dist = 0;
            return Math.min(distancia(X[2], X[0]), Math.min(distancia(X[0], X[1]), distancia(X[1], X[2])));
        }else{
continuar pagina 48
        }
    }

    public static double distancia(Ponto ini, Ponto fim) {
        return Math.sqrt(((ini.getX() - fim.getX()) ^ 2) + ((ini.getY() - fim.getY()) ^ 2));
    }
}
