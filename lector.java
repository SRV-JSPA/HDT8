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

    
    private ArrayList<ChichicasteLinux> pr = new ArrayList<>();
    
    public void lectorar() throws IOException{
       
       File nArchivo=new File("procesos.txt");
       FileReader reader=new FileReader(nArchivo);
       BufferedReader lb=new BufferedReader(reader);

       try(lb){
        String l="";
        while((l=lb.readLine())!=null){
            String[] lista=l.split(",");
            if(lista.length!=3){
                System.out.println("Error");
            }
            String a=lista[0];
            String b=lista[1];
            int c=Integer.parseInt(lista[2]);
            int proceso=0;

            ChichicasteLinux pro=new ChichicasteLinux(b, a, c, proceso);
            this.pr.add(pro);

        }

       }catch(Exception e){
        System.out.println(e);
       }
    

            
        
    }

    public ArrayList<ChichicasteLinux> getPR(){
        return this.pr;
    }

}