import java.util.PriorityQueue;

public class Main2 {
    public static void main(String[] args) {
        
    lector r = new lector();
    PriorityQueue<ChichicasteLinux> cp = new PriorityQueue<>(r.getPR());
    ChichicasteLinux pa = cp.poll();

    String x = String.format("%-10s %-10s %-10s\n",pa.getNproceso(),pa.getNusuario(),pa.getNice());
    System.out.println(x);

    for (ChichicasteLinux chichicasteLinux : cp){
        String y = String.format("%-10s %-10s %-10s %-10s\n",pa.getNproceso(),pa.getNusuario(),pa.getNice(), pa.getPrioridad());
        System.out.println(y);
    }
    }
}
