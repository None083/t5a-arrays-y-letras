/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ej1;

import javax.swing.JOptionPane;


/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {
        
        int numPalabras = numPalabras();
        
        String[] arrayPalabras = crearArrayPalabras(numPalabras);
        
        mostrarPosicionPalabras(arrayPalabras);
        
        
        
        
    }
    
    public static int numPalabras(){
        
        int numero = 0;
        
        try{
            numero = Integer.parseInt(JOptionPane.showInputDialog(
                "Introduce el número de palabras que tendrá tu array"));
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Eso no es un número");
        }
        
        
        return numero;
    }
    
    public static String[] crearArrayPalabras(int npalabras){
        String[] arrayPalabras = new String[npalabras];
        
        for (int i = 0; i < arrayPalabras.length; i++) {
            arrayPalabras[i] = JOptionPane.showInputDialog("Introduce la palabra nº" + i);
        }
        
        return arrayPalabras;
    }
    
    public static void mostrarPosicionPalabras(String[] arrayPalabras){
        String texto = "";
        
        for (int i = 0; i < arrayPalabras.length; i++) {
            texto += "Posicion " + i + " - Palabra: " + arrayPalabras[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public static String[] palabrasTresVocales(String[] arrayPalabras){
        int contadorPalabras = 0;
        for (String palabra : arrayPalabras) {
            int contadorVocales = 0;
            for (int i = 0; i < arrayPalabras[i].length(); i++) {
                
                if(arrayPalabras[i].toLowerCase().charAt(i) == 'a'
                        || arrayPalabras[i].toLowerCase().charAt(i) == 'e'
                        || arrayPalabras[i].toLowerCase().charAt(i) == 'i' 
                        || arrayPalabras[i].toLowerCase().charAt(i) == 'o'
                        || arrayPalabras[i].toLowerCase().charAt(i) == 'u'){
                    contadorVocales++;
                }  
            }
            if(contadorVocales >= 3){
                
            }
        }
        
        String[] arrayTresVocales = new String[contadorPalabras];
        
        return arrayTresVocales;
        
    }    
}
