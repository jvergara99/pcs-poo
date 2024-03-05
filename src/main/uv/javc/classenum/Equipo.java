package main.uv.javc.classenum;

public enum Equipo {
    PUMAS("Pumas UNAM", 7), MONTERREY("CF Monterrey", 1),
    AMERICA("Club América", 4), CRUZAZUL("Cruz Azul", 2);

    private String nombreClub;
    private int posicionTablaLigaMX;

    private Equipo(String nombreClub, int puestoLiga) {
        this.nombreClub = nombreClub;
        this.posicionTablaLigaMX = puestoLiga;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public int getPuestoLiga() {
        return posicionTablaLigaMX;
    }
    
}
