package dispositivoelectronico;

/**
 * @author Luis Tobon
 */

public class Laptop extends ComputadoraPC implements Cargable{

    boolean screenTouch;
    public double bateria;

    public Laptop(boolean screenTouch, String marca, String cpu, String gpu, String nombre, boolean encendidoOn) {
        super(marca, cpu, gpu, nombre, encendidoOn);
        this.screenTouch = screenTouch;
        this.bateria = 100;
    }

    @Override
    public void addEnergia(double porcentaje) {
        this.bateria = bateria + porcentaje;
        if(this.bateria > 100){
            this.bateria = 100;
        }
    }

    @Override
    public double getEnergia() {
        return this.bateria;
    }
    
    @Override
    public void usarEnergia(double porcentaje) {
        this.bateria = bateria - porcentaje;
        if(this.bateria <= 0){
            this.bateria = 0;
        }
    }

    public boolean getScreenTouch() {
        return screenTouch;
    }

    public void setScreenTouch(boolean screenTouch) {
        this.screenTouch = screenTouch;
    }
    
    @Override
    public String toString() {
        return "Laptop: \n\n" +
                "Nombre: " + getNombre() +
                "\nEncendido: " + getEncendidoOn() +
                "\nPantalla tactil: " + getScreenTouch() +
                "\nEstado de la bateria: " +getEnergia()+
                "\nMarca: " + getMarca() +
                "\nCPU: " + getCpu() +
                "\nGPU: " + getGpu();
    }
    
}
