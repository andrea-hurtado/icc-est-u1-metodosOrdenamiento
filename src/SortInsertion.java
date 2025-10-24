public class SortInsertion {

    public SortInsertion(){

    }

    public void sortAscendente(int[] numeros, boolean pasos){

        for (int i = 1; i < numeros.length; i++) {
                int j = i - 1;
                int aux = numeros[i];
                if (pasos){
                    System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
                }
                while (j >= 0 && numeros[j] > aux) {
                    if (pasos) //cuando no tiene llaves afecta solo a la siguiente linea
                    System.out.println("Compara aux: " + aux + " con numeros [" + j + "]: " + numeros[j] );
                    numeros[j + 1] = numeros[j];
                    if (pasos)
                    printArray(numeros);
                    j--;
                    if (pasos)
                    System.out.println("Mueve numeros[" + (j + 1) + "] a numeros [" + (j + 2) + "]");
            }
            numeros[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posicion " + (j + 1));
                System.out.println("Estado actual");
                printArray(numeros);
            }             
        }
    }

    public void sortDescendente(int[] numeros, boolean pasos){
        for (int i = 1; i < numeros.length; i++) {
                int j = i - 1;
                int aux = numeros[i];
                if (pasos){
                    System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
                }
                while (j >= 0 && numeros[j] < aux) {
                    if (pasos) //cuando no tiene llaves afecta solo a la siguiente linea
                    System.out.println("Compara aux: " + aux + " con numeros [" + j + "]: " + numeros[j] );
                    numeros[j + 1] = numeros[j];
                    if (pasos)
                    printArray(numeros);
                    j--;
                    if (pasos)
                    System.out.println("Mueve numeros[" + (j + 1) + "] a numeros [" + (j + 2) + "]");
            }
            numeros[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posicion " + (j + 1));
                System.out.println("Estado actual");
                printArray(numeros);
            }             
        }
    }

    public void sortByName(String[] nombres, boolean pasos){
        for (int i = 1; i < nombres.length; i++) {
                int j = i - 1;
                String aux = nombres[i];

                if (pasos){
                    System.out.println("i: " + i + ", j: " + j + ", aux: " + aux);
                }
                while (j >= 0 && nombres[j].compareTo(aux) > 0) {
                    if (pasos) //cuando no tiene llaves afecta solo a la siguiente linea
                    System.out.println("Compara aux: " + aux + " con nombres [" + j + "]: " + nombres[j] );
                    nombres[j + 1] = nombres[j];
                    if (pasos)
                    printArray(nombres);
                    j--;
                    if (pasos)
                    System.out.println("Mueve nombres[" + (j + 1) + "] a nombres [" + (j + 2) + "]");
            }
            nombres[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posicion " + (j + 1));
                System.out.println("Estado actual");
                printArray(nombres);
            }             
        }
       

    }
    
    public void sortPersonasByAge(Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            int j = i - 1;
            Persona aux = personas[i];
            while (j >= 0 && aux.getAge() < personas[j].getAge()) { // para ordenar por nombre solo es getName y usamos compareTo
                personas[j + 1] = personas[j];
                j--;                
            }
            personas[j + 1] = aux;       
        }       
    }

    public void sortPersonasByName(Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            int j = i - 1;
            Persona aux = personas[i];
            while (j >= 0 && aux.getName().compareTo(personas[j].getName()) < 0 ) { 
                personas[j + 1] = personas[j];
                j--;                
            }
            personas[j + 1] = aux;       
        }       
    }

    public void printArrayPersonas(Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getName() +
            "Edad: " + personas[i].getAge());
            
        }
    }
    
    public void printArray(String[] nombres){
         System.out.print("[");
        for (int i = 0; i < nombres.length; i++) {
            if (i == nombres.length - 1){
                System.out.print(nombres[i]);
            }else{
            System.out.print(nombres[i]+",");
            }
        }
        System.out.println("]");
    }   

    public void printArray(int[] numeros){
         System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1){
                System.out.print(numeros[i]);
            }else{
            System.out.print(numeros[i]+",");
            }
        }
        System.out.println("]");
    }   
    
}
