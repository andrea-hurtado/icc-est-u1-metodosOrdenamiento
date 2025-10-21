from sortSelection import SortSelection

def main():
    numeros = [5, 2, 9, 1, 5, 6]
    print("Estudiante: Andrea Hurtado")
    print("Original: ", numeros)
    
    #Instanciar la clase
    selection = SortSelection()
    selection.sort_ascendente(numeros)
    print("Ordenado ascendente: ", numeros)
    selection.sort_descendente(numeros)
    print("Ordenado descendente: ", numeros)

if __name__ == "__main__":
    main()