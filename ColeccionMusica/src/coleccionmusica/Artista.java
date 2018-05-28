package coleccionmusica;

import java.util.Arrays;
import java.util.Objects;

public class Artista {
    
    private String nombre;
    private String fechaNac;
    private String pais;
    private Album[] albums;   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Artista other = (Artista) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.fechaNac, other.fechaNac)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }

   
    @Override
    public String toString() {
        return "\nNombre Artista = " + nombre + "\nFecha Nacimiento = " + fechaNac + 
                "\nPais = " + pais;
    }

    public Artista(String nombre, String fechaNac, String pais) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.pais = pais;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }
        
    
    
}
