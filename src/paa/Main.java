package paa;

public class Main {

    public static void main(String[] args) {
        Main teste = new Main();
        int[] dados = {1, 2, 3, 89, 45, 56, 95};
        System.out.println(teste.buscaBinaria(dados, 7, 1));
    }

    public int buscaBinaria(int[] dados, int qtd, int busca) {

        return encontre(dados, 1, qtd, busca);
    }

    public int encontre(int[] dados, int esq, int dir, int busca) {
        int meio = (esq + dir) / 2;
//        System.out.println(meio);
        if (busca == dados[meio]) {
            return meio;
        }
        if (esq > dir) {
            return -1;
        } else {
            if (busca < dados[meio]) {
                return encontre(dados, esq, meio - 1, busca);
            } else {
                return (encontre(dados, meio + 1, dir, busca));
            }
        }
    }
}
