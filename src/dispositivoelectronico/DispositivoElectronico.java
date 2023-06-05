package dispositivoelectronico;

/**
 * @author Luis Tobon
 */

public class DispositivoElectronico {
    
    String nombre;
    boolean encendidoOn;

    public DispositivoElectronico(String nombre, boolean encendidoOn) {
        this.nombre = nombre;
        this.encendidoOn = encendidoOn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEncendidoOn() {
        return encendidoOn;
    }

    public void setEncendidoOn(boolean encendidoOn) {
        this.encendidoOn = encendidoOn;
    }
    
    
    
}
