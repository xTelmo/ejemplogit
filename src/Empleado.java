import java.util.Date;

class Empleado {
    String nombre;
    Date birthDate;

    Empleado(String name, Date birthDate) {
        this.nombre = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " (nacido en 19" + birthDate.getYear() + ")";
    }

}
