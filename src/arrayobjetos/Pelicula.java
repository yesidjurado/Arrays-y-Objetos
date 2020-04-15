package arrayobjetos;
public class Pelicula {
    
    private String nombre;
    private String director;
    private int año;
    private String reseña;
    //private int cantidad;
    //private int precio;
    
    public Pelicula(String nom, String dir, int a, String re){
        nombre = nom;
        director = dir;
        año = a;
        reseña = re;
    }

    @Override
    public String toString(){ 
    return ("Nombre: "+nombre+"\nDirector: "+director+"\nAño: "+ año+"\nReseña: "+reseña); 
    } 
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    public int getAño(){
        return this.año;
    }
    
    public String getReseña(){
        return this.reseña;
    }

}
