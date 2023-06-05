package dispositivoelectronico;

/**
 * @author Luis Tobon
 */

public class ComputadoraPC extends DispositivoElectronico{
    
    public String marca, cpu, gpu;

    public ComputadoraPC(String marca, String cpu, String gpu, String nombre, boolean encendidoOn) {
        super(nombre, encendidoOn);
        this.marca = marca;
        this.cpu = cpu;
        this.gpu = gpu;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
    
    @Override
    public String toString() {
        return "PC: \n\n" +
                "Nombre: " + getNombre() +
                "\nEncendido: " + getEncendidoOn() +
                "\nMarca: " + getMarca() +
                "\nCPU: " + getCpu() +
                "\nGPU: " + getGpu();
    }
    
    
}
