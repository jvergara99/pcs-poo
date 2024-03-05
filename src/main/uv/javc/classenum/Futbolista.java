package main.uv.javc.classenum;

public class Futbolista {
    private int numeroPlayera;
    private String nombre;
    private Posicion posicion;
    private Equipo equipo;
    
    public Futbolista(int numeroPlayera, String nombre, Posicion posicion, Equipo equipo) {
        this.numeroPlayera = numeroPlayera;
        this.nombre = nombre;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public Futbolista() {
    }

    public int getNumeroPlayera() {
        return numeroPlayera;
    }

    public void setNumeroPlayera(int numeroPlayera) {
        this.numeroPlayera = numeroPlayera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void viajar() {
        System.out.println("Viajo a la sede del juego...");
    }

    public void concentrarse() {
        System.out.println("Me concentro en juego...");
    }

    public void jugarPartido() {
        System.out.println("Juego partido de fut...");
    }

    @Override
    public String toString() {
        return "Futbolista [numeroPlayera=" + numeroPlayera + ", nombre=" + nombre + ", posicion=" + posicion
                + ", equipo=" + equipo + "]";
    }
}
