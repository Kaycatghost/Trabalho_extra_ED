 public class main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        lista.insirirNoInicio(1);
        lista.inserirNoFinal(2);
        lista.inserirNoFinal(3);
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());
        lista.removerNoInicio();
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());
    }
}


