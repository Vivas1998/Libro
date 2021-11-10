
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
    }
    
    // Devuelve el autor del libro
    public String getAutor() {
        return autor;
    }
    
    // Devuelve el autor del libro
    public String getTitulo() {
        return titulo;
    }
    
    // Imprime el autor del libro
    public void imprimeAutor() {
        System.out.println("El autor del libro es: " + autor);
    }
    
    // Imprime el titulo del libro
    public void imprimeTitulo() {
        System.out.println("El titulo del libro es: " + titulo);
    }
    
}
