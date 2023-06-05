package dispositivoelectronico;

/**
 * @author Luis Tobon
 */

public class TelefonoCel extends DispositivoElectronico implements Cargable{

    public double bateria;
    public String operador;
    
    public TelefonoCel(String nombre, boolean encendidoOn, String operador) {
        super(nombre, encendidoOn);
        this.operador = operador;
        this.bateria = 100;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
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
    
    @Override
    public String toString() {
        return "Telefono: \n\n" +
                "Nombre: " + getNombre() +
                "\nEncendido: " + getEncendidoOn() +
                "\nEstado de la bateria: " + getEnergia() +
                "\nOperador: " + getOperador();
    }
    
}
