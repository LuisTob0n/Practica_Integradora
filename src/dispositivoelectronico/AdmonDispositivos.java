package dispositivoelectronico;

import java.util.ArrayList;

/**
 * @author Luis Tobon
 */

public class AdmonDispositivos {

    public static void main(String[] args) {
        
        ArrayList <DispositivoElectronico> dispositivos = new ArrayList<>();
        
        
        TelefonoCel t1 = new TelefonoCel("Samsung", true, "Telcel");
        //System.out.println(t1.toString());
        
        Lampara l1 = new Lampara("3500 MAh", "Alexa", true);
        //System.out.println(l1.toString());
        
        Laptop p1 = new Laptop(true, "HP", "Intel", "Nvidia", "OMEN", true);
        //System.out.println(p1.toString());
        
        Calculadora c1 = new Calculadora("Casio", false, "RP-ZWIZ");
        //System.out.println(c1.toString());
        
        ComputadoraPC pc1 = new ComputadoraPC("Asus", "Amd", "Nvidia", "LTOB", true);
        //System.out.println(pc1.toString());
        
        dispositivos.add(t1);
        dispositivos.add(l1);
        dispositivos.add(p1);
        dispositivos.add(c1);
        dispositivos.add(pc1);
        
        for(int i = 0; i < dispositivos.size(); i ++){
            DispositivoElectronico dispositivo = dispositivos.get(i);
            System.out.println(dispositivo.toString() + "\n");
        }
        
    }
    
}
