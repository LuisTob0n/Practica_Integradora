package dispositivoelectronico;

/**
 * @author Luis Tobon
 */

public interface Cargable {
    
    public void addEnergia(double porcentaje);
    
    public double getEnergia();
    
    public void usarEnergia(double porcentaje);
    
    
}
