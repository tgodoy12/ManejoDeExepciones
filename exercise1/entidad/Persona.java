package exercise1.entidad;

/**
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
 * sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
 * atributo, puede hacerlo. Los métodos que se implementarán son:
 *  Un constructor por defecto.
 *  Un constructor con todos los atributos como parámetro.
 *  Métodos getters y setters de cada atributo.
 */

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    /**
     * constructor por defecto
     */
    public Persona() {
    }

    /**
     * constructor por parámetro
     * @param nombre
     * @param edad
     * @param sexo
     * @param peso
     * @param altura
     */
    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * get nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * get edad
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * get sexo
     * @return sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * get peso
     * @return peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * get altura
     * @return altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * set nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * set edad
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * set sexo
     * @param sexo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * set peso
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * set altura
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * metodo toString
     * @return
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
