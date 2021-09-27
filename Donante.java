/**
 * Método base que nos ayuda a crear a los donantes que se van a registrar en
 * nuestra aplicacion.
 * 
 * @author Esteban Donis
 * @since
 * @version 1.0
 */

public class Donante {
    private String ubicacion;
    private String nombre;

    Donante (String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}