public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 0, -5, 5, 15, 2};
        System.out.println("Estudiante: Andrea Hurtado");

        //SortBubble sortBubble = new SortBubble();
        //SortSelection sortSelection = new SortSelection();
        SortInsertion sortInsertion = new SortInsertion();

         System.out.println("Array Original:");
        //sortInsertion.printArray(numeros);
        //sortBubble.printArray(numeros);
        // System.out.println("Ordenado Ascendente:");
        // sortBubble.sortAscendente(numeros);
        // sortBubble.printArray(numeros);
        // System.out.println("Ordenado Decendente:");
        // sortBubble.sortDecendente(numeros);
        // sortBubble.printArray(numeros);

        //Sort Selection
        // System.out.println("Método de Selección Ascendente:");
        // sortSelection.sortAscendente(numeros);
        // sortSelection.printArray(numeros);
        // System.out.println("Método Selección Descendente");
        // sortSelection.sortDescendente(numeros);
        // sortSelection.printArray(numeros);

        //Sort Insertion
        // System.out.println("Metodo de Insercion Ascendente");
        // sortInsertion.sortAscendente(numeros, false); //false para que no se vean los pasos
        // sortInsertion.printArray(numeros);
        // System.out.println("Metodo de Insercion Descendente");
        // sortInsertion.sortDescendente(numeros, false);
        // sortInsertion.printArray(numeros);

        // String[] nombres = { "Pedro", "Ana", "Maria", "Luis", "Juan"};
        // System.out.println("Array de Nombres Original:");
        // sortInsertion.printArray(nombres);
        // sortInsertion.sortByName(nombres, false);
        // System.out.println("Ordenado por Nombre:");
        // sortInsertion.printArray(nombres);

        Persona[] personas = new Persona[]{
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28),
        };
        System.out.println("Array de Personas Original:");
        sortInsertion.printArrayPersonas(personas);
        System.out.println("\nOrdenado por Nombre de Personas:");
        sortInsertion.sortPersonasByName(personas);
        sortInsertion.printArrayPersonas(personas);
    }
}
