import java.util.Arrays;

public class ArrayMthds {
  public static void main(String[] args) {
    char name[] = {'w', 'i', 'l', 'l'};

    System.out.println(Arrays.toString(name));
    // retorna [w, i, l, l]

    System.out.println(Arrays.binarySearch(name, 'i'));
    // retorna o indice do elemento, no caso 1

    char newArr[] = name;
    name[0] = 'x';
    name[1] = 'x';
    System.out.println(Arrays.toString(newArr));
    // retorna xxll, pois ao atribuir um array a outro array, o valor é passado por referência, ou seja, apontam para o mesmo lugar na memória

    char arrayCopy[] = Arrays.copyOf(name, 4);
    System.out.println(Arrays.toString(arrayCopy));
    // cria uma verdadeira cópia do array em outro lugar da memória, não sendo mais passado por referência

    Arrays.sort(name, 0, 4);
    System.out.println(Arrays.toString(name));
    // retorna o array sorteado em ordem alfabética. obs: altera o array original

    Arrays.fill(name, 0, 4, 'z');
    System.out.println(Arrays.toString(name));
    // retorna [z, z, z, z] pois preenche com 'z' os indices dentro do range de 0 a 4
  }
}
