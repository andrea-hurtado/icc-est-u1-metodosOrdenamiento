public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 0, -5, 5, 15, 2};
        System.out.println("Estudiante: Andrea Hurtado");

        SortBubble sortBubble = new SortBubble();
        SortSelection sortSelection = new SortSelection();

         System.out.println("Array Original:");
         sortBubble.printArray(numeros);
        // System.out.println("Ordenado Ascendente:");
        // sortBubble.sortAscendente(numeros);
        // sortBubble.printArray(numeros);
        // System.out.println("Ordenado Decendente:");
        // sortBubble.sortDecendente(numeros);
        // sortBubble.printArray(numeros);

        //Sort Selection
        System.out.println("Método de Selección Ascendente:");
        sortSelection.sortAscendente(numeros);
        sortSelection.printArray(numeros);
        System.out.println("Método Selección Descendente");
        sortSelection.sortDescendente(numeros);
        sortSelection.printArray(numeros);
    }
}
