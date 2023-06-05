package dispositivoelectronico;

/**
 * @author Luis Tobon
 */

public class Calculadora extends DispositivoElectronico implements Cargable{

    public double bateria;
    public String modelo;
    
    public Calculadora(String nombre, boolean encendidoOn, String modelo) {
        super(nombre, encendidoOn);
        this.modelo = modelo;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString() {
        return "Calculadora: \n\n" +
                "Nombre: " + getNombre() +
                "\nEncendido: " + getEncendidoOn() +
                "\nModelo: " + getModelo() + 
                "\nEstado de la bateria: " + getEnergia();
    }
    
}
