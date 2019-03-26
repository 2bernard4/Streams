public class Persona {
    private int edad;
    private Integer dni;
    private String nombre;
    private String apellido;

    public Persona(int edad, Integer dni, String nombre, String apellido) {
        this.edad = edad;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "|Nombre: " + this.apellido + " " + this.nombre;
    }
}
