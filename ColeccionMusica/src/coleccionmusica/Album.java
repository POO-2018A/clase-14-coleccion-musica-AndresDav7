package coleccionmusica;

public class Album {
    
    private int añoLanz;
    private String nombre;
    private int numCanciones;
    private String genero;
    private String artista;

    @Override
    public String toString() {
        return "\nAnio Lanzamiento = " + añoLanz + "\nNombre Album = " + 
                nombre + "\nNumero de Canciones = " + numCanciones + "\nGenero = " + 
                genero + "\nArtista = " + artista;
    }
    
     public Album(int añoLanz, String nombre, int numCanciones, String genero, String artista) {
        this.añoLanz = añoLanz;
        this.nombre = nombre;
        this.numCanciones = numCanciones;
        this.genero = genero;
        this.artista = artista;
    }
       
    public int getAñoLanz() {
        return añoLanz;
    }

    public void setAñoLanz(int añoLanz) {
        this.añoLanz = añoLanz;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
}