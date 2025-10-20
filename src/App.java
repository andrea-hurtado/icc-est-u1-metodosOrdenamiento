public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 0, -5, 5, 15, 2};

        SortBubble sortBubble = new SortBubble();

        System.out.println("Array Original:");
        sortBubble.printArray(numeros);
        System.out.println("Ordenado Ascendente:");
        sortBubble.sortAscendente(numeros);
        sortBubble.printArray(numeros);
        System.out.println("Ordenado Decendente:");
        sortBubble.sortDecendente(numeros);
        sortBubble.printArray(numeros);
    }
}
