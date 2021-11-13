
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
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;
    
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginasLibro) {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginasLibro;
        numeroReferencia = "";
        vecesPrestado = 0;
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
    
    // Devuelve el numero de páginas
    public int getPagiansLibro() {
        return numeroPaginas;
    }
    
    // Imprimir detalles
    public void imprimirDetalles() {
        String printDetalles = getDetalles();
        System.out.println(printDetalles);
    }
    
    // Devuelve los detalles
    public String getDetalles() {
        String segundoNumeroReferencia = "ZZZ";
        String detalles = ("Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + numeroPaginas + ", Veces Prestado: " + vecesPrestado + ", Numero de Referencia: ");
        if (numeroReferencia != "") {
            detalles =  detalles + (numeroReferencia); 
        }
        else {
            detalles = detalles + (segundoNumeroReferencia);
        }
        return detalles;
    }
    
    // Cambiar el numero de refencia
    public void setNumeroReferencia(String nuevoNumeroReferencia) {
        if (nuevoNumeroReferencia.length() >= 3) {
            numeroReferencia = nuevoNumeroReferencia;   
        }
        else {
            System.out.println("Error: El numero de referencia debe contener al menos 3 caracteres");
        }
    }
    
    // Devuelve el numero de refencia
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    // Incrementar el valor de veces prestado el libro
    public void prestar() {
        vecesPrestado = vecesPrestado + 1;
    }
    
    //Devuelve las veces que se ha prestado el libro
    public int getPrestar() {
        return vecesPrestado;
    }
}
