/**
	Esta clase representa a un producto en particular. Tendrá el nombre del producto,
	el precio del producto, el nombre del comercio donde se adquiere y la categoría a la que
	el mismo pertenece.
*/
public class Producto{
	/*Nombre del producto.*/
	private String nombre;
	/*Precio del producto.*/
	private int precio;
	/*Nombre del comercio donde se adquiere.*/
	private String nombreComercio;
	/*Categoría a la que pertenece.*/
	private Categoria categoria;
	/**
		Constructor de la clase.
		@param nombre El nombre del producto.
		@param precio El precio del producto.
		@param nombreComercio El nombre del comercio donde se adquiere.
		@param categoría El nombre de la categoría a la que pertenece.
	*/
	public Producto(String nombre, int precio, String nombreComercio, Categoria categoria){
		this.nombre = nombre;
		this.precio = precio;
		this.nombreComercio = nombreComercio;
		this.categoria = categoria;
	}
	/*Getters*/
	/**
		Getter del nombre de un producto.
		@return nombre El nombre del producto.
	*/
	public String getNombre(){return this.nombre;}
	/**
		Getter del precio de un producto.
		@return precio El precio del producto.
	*/
	public int getPrecio(){return this.precio;}
	/**
		Getter del nombre del comercio al que pertenece el producto.
		@return nombre El nombre del comercio al que pertenece el producto.
	*/
	public String getNombreComercio(){return this.nombreComercio;}
	/**
		Getter del nombre de la categoría del producto.
		@return nombre El nombre de la categoría del producto.
	*/
	public String getNombreCategoria(){return this.categoria.getNombre();}
	/*Setters*/
	/**
		Setter del nombre de un producto.
		@param nombre El nombre del producto.
	*/
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	/**
		Setter del precio de un producto.
		@param nombre El precio del producto.
	*/
	public void setPrecio(int precio){
		this.precio= precio;
	}
	/**
		Setter del nombre del comercio al que pertenece el producto.
		@param nombre El nombre del comercio al que pertenece el producto.
	*/
	public void setNombreComercio(String nombreComercio){
		this.nombreComercio = nombreComercio;
	}
	/**
		Setter del nombre de la categoría del producto.
		@param nombre El nombre de la categoría que se busca asignar.
	*/
	
	public void setNombreCategoria(String nombreCategoria){
		this.categoria.setNombre(nombreCategoria);
	}
}