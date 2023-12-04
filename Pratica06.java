package Java04;

public class Pratica06 {

    public static void main(String[] args) {
        String[] arrayTexto = {"a", "vida", "e", "bela"};

        StringBuilder textoYoda = new StringBuilder();

        for (int i = arrayTexto.length - 1; i >= 0; i--) {
            textoYoda.append(arrayTexto[i]).append(" ");
        }

        System.out.println(textoYoda.toString().trim().toUpperCase());
    }
}



