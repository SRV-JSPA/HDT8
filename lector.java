import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lector {

    private ArrayList<ChichicasteLinux> pr = new ArrayList<>();

    

    public  void lectorar() throws IOException{
       
        Scanner in = new Scanner("procesos.txt");
        while(in.hasNextLine()){
            String proc = in.nextLine();
            String [] ls =proc.split(",");
            try{
                String nproceso = ls[0];
                String nusuario = ls[1];
                int nice = Integer.parseInt(ls[2]);
                int prioridad = 0;

                ChichicasteLinux ch = new ChichicasteLinux(nproceso, nusuario, nice, prioridad);
                pr.add(ch);
            }catch(NumberFormatException e){
                System.out.println("Error en el ultimo dato");
            }   
        }
            
        
    }

    public ArrayList<ChichicasteLinux> getPR(){
        return this.pr;
    }
}