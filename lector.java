/*
Profesor: Douglas Leonel Barrios
Auxiliares: Fernanda Esquivel y Francisco Castillo
INTEGRANTES: 
José Santiago Pereira Alvarado, 22318
Nancy Gabriela Mazariegos Molina, 22513
Hoja de Trabajo 8
Curso: Algoritmos y Estructuras de datos
Sección: 20
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lector {

    public static int conversor (String string, int num){
        try{
            num = Integer.parseInt(string);
        }catch(NumberFormatException e){
            num = 0;
        }
        return num;
    }

    public static void lectorar(){
        String nFichero = "procesos.txt";
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader(nFichero));
            String txt = br.readLine();
            while(txt != null){
                
            }
        }catch(){

        }
    }
}