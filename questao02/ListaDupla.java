
public class ListaDupla {

    public static class No {
        int valor;
        No anterior;
        No proximo;
    }

    No primeiro;
    int tamanho = 0;

    public void insirirNoInicio(int valor) {
        No novoNo = new No();
        novoNo.valor = valor;

        if (primeiro != null) {
            novoNo.proximo = primeiro;
            primeiro.anterior = novoNo;
        }
        primeiro = novoNo;
        tamanho++;
    }

    public void inserirNoFinal(int valor) {
        No novoNo = new No();
        novoNo.valor = valor;

        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            No ultimo = primeiro;
            while (ultimo.proximo != null) {
                ultimo = ultimo.proximo;
            }
            ultimo.proximo = novoNo;
            novoNo.anterior = ultimo;
        }
        tamanho++;
    }

    public void removerNoInicio() {
        if (primeiro != null) {
            primeiro = primeiro.proximo;
            if (primeiro != null) {
                primeiro.anterior = null;
            }
            tamanho--;
        }
    }

    public void removerNoFinal() {
        if (primeiro != null) {
            No ultimo = primeiro;
            while (ultimo.proximo != null) {
                ultimo = ultimo.proximo;
            }
            if (ultimo.anterior != null) {
                ultimo.anterior.proximo = null;
            } else {
                primeiro = null;
            }
            tamanho--;
        }
    }

    public void removerNaPosicao(int pos) {
        No atual = primeiro;
        for (int i = 0; i < pos && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual == null) return;

        if (atual.anterior != null) {
            atual.anterior.proximo = atual.proximo;
        }
        if (atual.proximo != null) {
            atual.proximo.anterior = atual.anterior;
        }

        tamanho--;
    }

    public int tamanho() {
        return tamanho;
    }

    public void exibir() {
        No atual = primeiro;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}


