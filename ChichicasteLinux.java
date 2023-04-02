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
import java.util.*;

public class ChichicasteLinux implements Comparable<ChichicasteLinux>{

    private String Nproceso;
    private String Nusuario;
    private int Nice;
    private int prioridad;

    public ChichicasteLinux(String Nproceso, String Nusuario, int Nice, int prioridad) {
        this.Nproceso = Nproceso;
        this.Nusuario = Nusuario;
        this.Nice = Nice;
        this.prioridad = prioridad;
    }
    
    public String getNproceso() {
        return Nproceso;
    }

    public void setNproceso(String Nproceso) {
        this.Nproceso = Nproceso;
    }

    public String getNusuario() {
        return Nusuario;
    }

    public void setNusuario(String Nusuario) {
        this.Nusuario = Nusuario;
    }

    public int getNice() {
        return Nice;
    }

    public void setNice(int Nice) {
        this.Nice = Nice;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(ChichicasteLinux p){
        int p1 = 20+this.Nice;
        int p2 = 20+p.getNice();
        return Integer.compare(p1, p2);
    }

    @Override
    public String toString(){
        int prioridad = 120 + Nice;
        return Nproceso + "," + Nusuario + "," + Nice + "prioridad" + prioridad;
    }

    



}