import java.util.*;

public class ChichicasteLinux {
    private String Nproceso;
    private String Nusuario;
    private int Nice;
    private int prioridad;
    
    public String getNproceso() {
        return Nproceso;
    }

    public void setNproceso(String nproceso) {
        Nproceso = nproceso;
    }

    public String getNusuario() {
        return Nusuario;
    }

    public void setNusuario(String nusuario) {
        Nusuario = nusuario;
    }

    public int getNice() {
        return Nice;
    }

    public void setNice(int nice) {
        Nice = nice;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public ChichicasteLinux(String nproceso, String nusuario, int nice, int prioridad) {
        Nproceso = nproceso;
        Nusuario = nusuario;
        Nice = nice;
        this.prioridad = prioridad;
    }


}