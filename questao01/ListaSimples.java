 public class ListaSimples {

    public static class No {
        int valor;
        No proximo;
        int tamanho;
        
    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

    public No numero;
    public void inserirNoInicio(int valor){
        No novoNo = new No(valor);
        if (numero == null) {
            numero = novoNo;
        } else {
            novoNo.proximo = numero;
            numero = novoNo;
        }
    }

    public void inserirNoFinal(int valor) {
        No novoNo = new No(valor);
        if (numero == null) {
            numero = novoNo;
        } else {
            No ultimoNo = numero;
            while (ultimoNo.proximo != null) {
                ultimoNo = ultimoNo.proximo;
            }
            ultimoNo.proximo = novoNo;
        }
    }

public void inserirNaPosicao(int pos, int valor) {
    if (pos < 0) {
        System.out.println("Posição inválida!");
        return;
    }

    No novoNo = new No(valor);
    if (pos == 0) {
        novoNo.proximo = numero;
        numero = novoNo;
        return;
    }
    No atual = numero;
    for (int i = 0; i < pos - 1; i++) {
        if (atual == null) {
            System.out.println("Posição inválida!");
            return;
        }
        atual = atual.proximo;
    }
    if (atual == null) {
        System.out.println("Posição inválida!");
        return;
    }
    novoNo.proximo = atual.proximo;
    atual.proximo = novoNo;
}
   public void removerNoInicio(int valor) {
    if (numero != null) {
        if (numero.valor == valor) {
            numero = numero.proximo;
        } else {
            No noAtual = numero;
            No noAnterior = null;
            while (noAtual != null && noAtual.valor != valor) {
                noAnterior = noAtual;
                noAtual = noAtual.proximo;
            }
            if (noAtual != null) {
                noAnterior.proximo = noAtual.proximo;
            }
        }
    }
}
    
    public void removerNofinal(){
        if (numero != null) {
            No noAtual = numero;
            No noAnterior = null;
            while (noAtual.proximo != null) {
                noAnterior = noAtual;
                noAtual = noAtual.proximo;
            }
            if (noAnterior != null) {
                noAnterior.proximo = null;
            } else {
                numero = null;
            }
        }
    }
    
    public void removerNaPosicao(int pos){
        if (pos == 0) { 
            if (numero.proximo != null) {
                numero.valor = numero.proximo.valor;
                numero.proximo = numero.proximo.proximo;
            } else{
                numero = null;
            }
        } else {
            No noAtual = numero;
            No noAnterior = null;
            for (int i = 0; i < pos - 1; i++) {
                noAnterior = noAtual;
                noAtual = noAtual.proximo;
            }
            if (noAnterior != null) {
                noAnterior.proximo = noAtual.proximo;
                if (noAtual == numero) {
                    numero = noAtual.proximo;
                } else {
                    noAtual.proximo = null;
                }
            }
        }
    }
    public int tamanho(){
        int tamanho = 0;
        No noAtual = numero;
        while (noAtual != null) {
            tamanho++;
            noAtual = noAtual.proximo;
        }
        return tamanho;
    }
    public void exibir(){
        No noAtual = numero;
        while (noAtual != null) {
            System.out.println(noAtual.valor);
            noAtual = noAtual.proximo;
        }
    }

}
