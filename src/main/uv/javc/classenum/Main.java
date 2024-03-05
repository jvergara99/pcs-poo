package main.uv.javc.classenum;

public class Main {

    public static void main(String[] args) {
        
        Posicion delantero = Posicion.DELANTERO;
        Posicion defensa = Posicion.DEFENSA;

        // Devuelve un String con el nombre de la constante
        System.out.println("delantero.name()= " + delantero.name());
        System.out.println("defensa.toString()= " + defensa.toString());

        // Devuelve un entero con la posición de la constante según está declarada.
        System.out.println("delantero.ordinal()= " + delantero.ordinal());

        // Compara el enum con el parámetro según el orden en el que están declaradas
        // las constantes.
        System.out.println("delantero.compareTo(defensa)= " + delantero.compareTo(defensa));
        System.out.println("delantero.compareTo(delantero)= " + delantero.compareTo(delantero));

        // Recorre todas las constantes de la enumeración
        for (Posicion pos : Posicion.values()) {
            System.out.print(pos.toString() + " - ");
        }

        System.out.println();

        // Instanciamos el enumerado
        Equipo pumas = Equipo.PUMAS;

        // Devuelve un String con el nombre de la constante
        System.out.println("pumas.name()= " + pumas.name());

        // Devuelve el contenido de los atributos
        System.out.println("pumas.getNombreClub()= " + pumas.getNombreClub());
        System.out.println("pumas.getPuestoLiga()= " + pumas.getPuestoLiga());

        Futbolista henry = new Futbolista(21, "Henry Martin", Posicion.DELANTERO, Equipo.AMERICA);
        Futbolista cesar = new Futbolista(12, "Cesar Huerta", Posicion.CENTROCAMPISTA, Equipo.PUMAS);
        Futbolista andres = new Futbolista(30, "Andres Gudiño", Posicion.PORTERO, Equipo.CRUZAZUL);
        Futbolista hector = new Futbolista(15, "Hector Moreno", Posicion.DEFENSA, Equipo.MONTERREY);

        System.out.println(henry.toString());
        System.out.println(cesar.toString());
        System.out.println(andres.toString());
        System.out.println(hector.toString());


    }
}
