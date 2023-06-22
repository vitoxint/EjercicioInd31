public class Honorario extends Trabajador implements mostrarInterface{

    private String giro;
    private int anio_iniciacion;

    public Honorario(){

    }

    public Honorario(String nombres, String apellidos, String run, String telefono, int edad, String giro, int anio_iniciacion) {
        super(nombres, apellidos, run, telefono, edad);
        this.giro = giro;
        this.anio_iniciacion = anio_iniciacion;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getAnio_iniciacion() {
        return anio_iniciacion;
    }

    public void setAnio_iniciacion(int anio_iniciacion) {
        this.anio_iniciacion = anio_iniciacion;
    }

    @Override
    public String toString() {
        return "Honorario{" +
                "giro='" + giro + '\'' +
                ", anio_iniciacion=" + anio_iniciacion +
                "} " + super.toString();
    }

    /*@Override
    public void mostrarDatos() {

        System.out.println("Teléfono: " + this.getTelefono() + "\nEdad: " + this.getEdad());

    }*/
}
