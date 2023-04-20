package Model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class BoletinUno implements Boletin {
    private Collection c1;
    private Collection<String> c2;

    public BoletinUno(){
        c1 = new ArrayList();
        c2 = new ArrayList<String>();
    }

    public Collection getC1() {
        return c1;
    }

    public Collection<String> getC2() {
        return c2;
    }

    @Override
    public String toString() {
        return "BoletinUno{" +
                "c1=" + c1 +
                ", c2=" + c2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoletinUno that = (BoletinUno) o;
        return Objects.equals(c1, that.c1) && Objects.equals(c2, that.c2);
    }

    // Resolución de los ejercicios del boletín 1

    private void ejercicio1() {
        c1.add("Primero");
        c1.add(Integer.valueOf(1));
        c1.add(Float.valueOf(3));
        c1.add(Double.valueOf(4));
        c1.add('J');
        c1.add(false);
        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i;
        }
        c1.add(arrayInt); // OJO, hay que añadirlo así porque si se añade con un for se añade cada elemento no el array.
        System.out.println(c1);
        System.out.println("A la pregunta si se ve la referencia, sí se ve ya que la Colección tiene implementado\n" +
                "un toString que imprime de esta forma los elementos pero sí se muestra la referencia del array.");
    }

    void ejercicio2() {
        c2.add("Joaquín");
        c2.add("Jouse");
        c2.add("María");
        c2.add("Lechuga");
        c2.add("Rafael");
        c2.add("Jurado");
        c2.add("Nacho");
        c2.add("Elena");
        c2.add("Ramón");
        System.out.println(c2);

        // Opcional
        List<String> l2 = (ArrayList<String>) c2; // Para poder usar el método get se debe castear la lista a ArrayList.
        System.out.println(l2.get(0));
        System.out.println(l2.get(1));
        System.out.println(l2.get(2));
        System.out.println(l2.get(3));
        System.out.println(l2.get(4));
        System.out.println(l2.get(5));
        System.out.println(l2.get(6));
        System.out.println(l2.get(7));
        System.out.println(l2.get(8));
        System.out.println(l2.get(9));
    }

    void ejercicio3() {
        c2.add("Joaquín");
        c2.add("Jouse");
        c2.add("María");
        c2.add("Lechuga");
        c2.add("Rafael");
        c2.add("Jurado");
        c2.add("Nacho");
        c2.add("Elena");
        c2.add("Ramón");

        Collection<String> c3 = new ArrayList<String>();

        c3.add("Jouse");
        c3.add("Rafael");
        c3.add("María");
        c3.add("Joaquín");
        c3.add("Lechuga");
        c3.add("Jurado");
        c3.add("Nacho");
        c3.add("Ramón");
        c3.add("Elena");
        // c3.retainAll(c2); // Intercambia todos los ele
        boolean bool = c3.retainAll(c2);
        System.out.println(bool);
        // System.out.println(c3.retainAll(c2));
        System.out.println(c2);
        System.out.println(c3);
    }

    void ejercicio4() {
        c2.add("Joaquín");
        c2.add("Jouse");
        c2.add("María");
        c2.add("Lechuga");
        c2.add("Rafael");
        c2.add("Jurado");
        c2.add("Nacho");
        c2.add("Elena");
        c2.add("Ramón");

        Collection<String> c3 = new ArrayList<String>();

        c3.add("Jouse");
        c3.add("Rafael");
        c3.add("María");
        c3.add("Joaquín");
        c3.add("Lechuga");
        c3.add("Jurado");
        c3.add("Nacho");
        c3.add("Ramón");
        c3.add("Elena");
        boolean bool = c3.removeAll(c2); //// TODO revisar explicación del método.
        System.out.println(bool);
        // System.out.println(c3.retainAll(c2));
        System.out.println(c2);
        System.out.println(c3);
    }

    void ejercicio5() {
        c2.add("Joaquín");
        c2.add("Jouse");
        c2.add("María");
        c2.add("Lechuga");
        c2.add("Rafael");
        c2.add("Jurado");
        c2.add("Nacho");
        c2.add("Elena");
        c2.add("Ramón");

        Collection<String> c3 = new ArrayList<String>();

        c3.add("Jouse");
        c3.add("Rafael");
        c3.add("María");
        c3.add("Joaquín");
        c3.add("Lechuga");
        c3.add("Jurado");
        c3.add("Nacho");
        c3.add("Ramón");
        c3.add("Elena");
        boolean bool = c3.containsAll(c2); //// TODO revisar explicación del método.
        System.out.println(bool);
        // System.out.println(c3.retainAll(c2));
        System.out.println(c2);
        System.out.println(c3);
    }

    void ejercicio6() {
        Collection<String> c3 = new ArrayList<String>();

        c3.add("Jouse");
        c3.add("Rafael");
        c3.add("María");
        c3.add("Joaquín");
        c3.add("Lechuga");
        c3.add("Jurado");
        c3.add("Nacho");
        c3.add("Ramón");
        c3.add("Elena");
        Object[] array = c3.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + " contiene el elemento " + array[i]);
            c3.remove(array[i]);
        }
        System.out.println(c3);
    }

    void ejercicio7() {
        Collection<String> c3 = new ArrayList<String>();

        c3.add("Jouse");
        c3.add("Rafael");
        c3.add("María");
        c3.add("Joaquín");
        c3.add("Lechuga");
        c3.add("Jurado");
        c3.add("Nacho");
        c3.add("Ramón");
        c3.add("Elena");
        Object[] array = c3.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + " contiene el elemento " + array[i]);
            c3.remove(array[i]);
        }
        System.out.println(c3.isEmpty());
    }

    void ejercicio8() {
        Collection<String> c3 = new ArrayList<String>();

        c3.add("Jouse");
        c3.add("Rafael");
        c3.add("María");
        c3.add("Joaquín");
        c3.add("Lechuga");
        c3.add("Jurado");
        c3.add("Nacho");
        c3.add("Ramón");
        c3.add("Elena");
        Object[] array = c3.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + " contiene el elemento " + array[i]);
            c3.remove(array[i]);
        }
        System.out.println(c3.size());
    }

    @Override
    public int menu() {
        System.out.println("***********************************");
        System.out.println("Boletin 1. Selecciona un ejercicio.");
        System.out.println("1. Ejercicio1: ");
        System.out.println("2. Ejercicio2: ");
        System.out.println("3. Ejercicio3: ");
        System.out.println("4. Ejercicio4: ");
        System.out.println("5. Ejercicio5: ");
        System.out.println("6. Ejercicio6: ");
        System.out.println("7. Ejercicio7: ");
        System.out.println("8. Ejercicio8: ");
        System.out.println("***********************************");
        int n = SC.nextInt();
        return n;
    }

    @Override
    public void run() {
        int n;
        do {
            n = menu();
            switch (n) {
                case 1: ejercicio1(); break;
                case 2: ejercicio2(); break;
                case 3: ejercicio3(); break;
                case 4: ejercicio4(); break;
                case 5: ejercicio5(); break;
                case 6: ejercicio6(); break;
                case 7: ejercicio7(); break;
                case 8: ejercicio6(); break;
                default:
                    System.out.println("Salindo del programa...");break;
            }
            c1.clear(); // Se vacía la colección.
            c2.clear();
        } while (n <= 0);
    }
}