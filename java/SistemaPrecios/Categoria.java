/**
	Esta clase representa a través de un dato de tipo String a la categoría que corresponderá 
	con algún producto en particular.
*/
public class Categoria{
	/*El nombre de la categoría*/
	public String nombre;
	/**
	El constructor de la clase.
	@param nombre el nombre de la categoría.
	*/
	public Categoria(String nombre){
		this.nombre = nombre;
	}
	/*Getters*/
	/**
		Getter del nombre de una categoría.
		@return nombre el nombre de la categoría en formato String.
	*/
	public String getNombre(){
		return this.nombre;
	}
	/*Setters*/
	/**
		Setter del nombre de una categoría.
		@param nombre El nombre de la categoría que se busca asignar.
	*/
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
}