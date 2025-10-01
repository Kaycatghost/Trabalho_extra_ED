public class main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoInicio(10);
        lista.inserirNoFinal(20);
        lista.inserirNaPosicao(1, 30);
        lista.removerNoInicio(10);
        lista.removerNofinal();
        lista.removerNaPosicao(0);
        lista.inserirNoFinal(40);
        lista.inserirNoFinal(50);
        lista.inserirNoFinal(60);

        System.out.println("Tamanho da lista: " + lista.tamanho());
        lista.exibir();
    }
}
