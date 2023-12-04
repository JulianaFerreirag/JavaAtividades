package Java04;

public class Pratica05 {

	public static void main(String[] args) {

		        String[] arrayTexto = {"A", "VIDA", "E", "BELA"};

		        StringBuilder textoFormatado = new StringBuilder();

		        for (String palavra : arrayTexto) {
		            textoFormatado.append(capitalizarPalavra(palavra)).append(" ");
		        }

		        System.out.println(textoFormatado.toString().trim());
		    }

		    private static String capitalizarPalavra(String palavra) {
		        if (palavra.length() > 1) {
		            return palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase();
		        } else {
		            return palavra.toUpperCase();
		        
		    }
		}

	}


