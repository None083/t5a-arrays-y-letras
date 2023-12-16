/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import javax.swing.JOptionPane;

/**
 *
 * @author noelia
 */
public class Ej1 {

    public static void main(String[] args) {

        int numPalabras = numPalabras();

        String[] arrayPalabras = crearArrayPalabras(numPalabras);

        mostrarPosicionPalabras(arrayPalabras);

        String[] palabrasTresVocales = palabrasTresVocales(arrayPalabras);
        JOptionPane.showMessageDialog(null,
                "Palabras con tres o más vocales:");
        mostrarPosicionPalabras(palabrasTresVocales);

        String[] palabrasDosVocales = palabrasDosVocales(arrayPalabras);
        JOptionPane.showMessageDialog(null,
                "Palabras con dos o menos vocales:");
        mostrarPosicionPalabras(palabrasDosVocales);

        int[] posicionDeLaLetra = posicionDeLaLetra(arrayPalabras, 'a');
        mostrarPosicionPosiciones(posicionDeLaLetra);

    }

    public static int numPalabras() {
        int numero = 0;

        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog(
                    "Introduce el número de palabras que tendrá tu array"));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Eso no es un número");
        }

        return numero;
    }

    public static String[] crearArrayPalabras(int npalabras) {
        String[] arrayPalabras = new String[npalabras];

        for (int i = 0; i < arrayPalabras.length; i++) {
            arrayPalabras[i] = JOptionPane.showInputDialog("Introduce la palabra nº" + i);
        }

        return arrayPalabras;
    }

    public static void mostrarPosicionPalabras(String[] arrayPalabras) {
        String texto = "";

        for (int i = 0; i < arrayPalabras.length; i++) {
            texto += "Posicion " + i + " - Palabra: " + arrayPalabras[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, texto);
    }

    public static void mostrarPosicionPosiciones(int[] arrayPosiciones) {
        String texto = "";

        for (int i = 0; i < arrayPosiciones.length; i++) {
            texto += "Posición en array " + i + " - Posición letra: "
                    + arrayPosiciones[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, texto);
    }

    public static String[] palabrasTresVocales(String[] arrayPalabras) {
        int contadorPalabras = 0;

        for (String palabra : arrayPalabras) {
            int contadorVocales = contadorVocales(palabra);
            if (contadorVocales >= 3) {
                contadorPalabras++;
            }
        }
        String[] arrayTresVocales = new String[contadorPalabras];

        contadorPalabras = 0;

        for (String palabra : arrayPalabras) {
            int contadorVocales = contadorVocales(palabra);
            if (contadorVocales >= 3) {
                arrayTresVocales[contadorPalabras] = palabra;
                contadorPalabras++;
            }
        }
        return arrayTresVocales;
    }

    public static String[] palabrasDosVocales(String[] arrayPalabras) {
        int contadorPalabras = 0;

        for (String palabra : arrayPalabras) {
            int contadorVocales = contadorVocales(palabra);
            if (contadorVocales <= 2) {
                contadorPalabras++;
            }
        }
        String[] arrayTresVocales = new String[contadorPalabras];

        contadorPalabras = 0;

        for (String palabra : arrayPalabras) {
            int contadorVocales = contadorVocales(palabra);
            if (contadorVocales <= 2) {
                arrayTresVocales[contadorPalabras] = palabra;
                contadorPalabras++;
            }
        }
        return arrayTresVocales;
    }

    public static int contadorVocales(String palabra) {
        int contadorVocales = 0;
        for (int i = 0; i < palabra.length(); i++) {
            palabra = palabra.toLowerCase();
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e'
                    || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o'
                    || palabra.charAt(i) == 'u') {
                contadorVocales++;
            }
        }
        return contadorVocales;
    }

    //Ej2
    public static int[] posicionDeLaLetra(String[] arrayPalabras, char letra) {
        int[] arrayPosicionesLetra = new int[arrayPalabras.length];

        for (int i = 0; i < arrayPalabras.length; i++) {
            String palabraActual = arrayPalabras[i].toLowerCase();
            
            boolean letraEncontrada = false;
            
            for (int j = 0; j < palabraActual.length(); j++) {
                letra = Character.toLowerCase(letra);

                if (palabraActual.charAt(j) == letra) {
                    arrayPosicionesLetra[i] = j;
                    letraEncontrada = true;
                    break;
                }
            }
            if (!letraEncontrada) {
                arrayPosicionesLetra[i] = -1;
            }
        }
        return arrayPosicionesLetra;
    }

}
