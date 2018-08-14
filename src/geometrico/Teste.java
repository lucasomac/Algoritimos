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
        pontoProximoQuad();
    }

    public static double pontoProximoQuad() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; i < array.length - 1; j++) {
                if ((Math.sqrt(((array[i].getX() - array[j].getX()) ^ 2) + ((array[i].getY() - array[j].getY()) ^ 2))) < distance) {
                    distance = Math.sqrt(((array[i].getX() - array[j].getX()) ^ 2) + ((array[i].getY() - array[j].getY()) ^ 2));
                    System.out.println(distance);
                }
            }
        }
        return distance;
    }

}
