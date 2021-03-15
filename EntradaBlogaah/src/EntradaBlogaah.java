/**
 * This Class to handle blog entries.
 * We have 4 attributes ID, texto and autor.
 * The inputs will have the following format:
 * 
 * ENTRADA DE:autor
 *	text
 * 
 * @author heber
 * @version 15-03-2021, 1.0
 * @since 1.0
 */

public class EntradaBlogaah {	
	
	private int id;
	private String texto;
	private String autor;
	
	/**
	 * Class constructor
	 * @param id input number
	 * @param autor name of the user
	 * @param texto the text that the user wants to show
	 * @throws IllegalArgumentException if the id is <0 throws an Exception
	 */
	public EntradaBlogaah(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	/**
	 * Method toString to print the objects of the class with the following format:
	 * ENTRADA DE:autor
 	 *	text
	 */
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE:"+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * This method return the number that the user introduce
	 * @return id attribute
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * This method return the text that the user introduce
	 * @return text attribute
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * This method return the autor who did the entry, or the name that he specified.
	 * @return autor attribute in upper case
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * Main method, let's test that the program works correctly 
	 * @param args
	 */
	public static void main(String[] args) {
		EntradaBlogaah e1=new EntradaBlogaah(3,"Heber","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}