package dispositivoelectronico;

/**
 * @author Luis Tobon
 */

public class Lampara extends DispositivoElectronico{
    
    public String TamanioBateria;

    public Lampara(String TamanioBateria, String nombre, boolean encendidoOn) {
        super(nombre, encendidoOn);
        this.TamanioBateria = TamanioBateria;
    }

    public String getTamanioBateria() {
        return TamanioBateria;
    }

    public void setTamanioBateria(String TamanioBateria) {
        this.TamanioBateria = TamanioBateria;
    }
    
    @Override
    public String toString() {
        return "Lampara: \n\n" +
                "Nombre: " + getNombre() +
                "\nEncendido: " + getEncendidoOn() +
                "\nTamano de la bateria: " + getTamanioBateria();
    }
}
