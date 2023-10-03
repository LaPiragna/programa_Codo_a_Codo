/**
	Esta clase representa a una única lista de productos correspondiente a una
	única categoría. Tiene como atributos una variable de tipo 'Categoría' y una
	colección de tipo HashSet para almacenar los diferentes productos.
*/
public ListadoProducto<Categoria> {
	/*La categoría.*/
	private Categoria categoria;
	/*La colección de productos.*/
	private HashSet<Producto> hashSetProductos;
	/**
		Constructor de la clase.
		@param Categoría La categoría de la lista.
	*/
	public ListadoProducto(Categoria categoria){
		this.categoria = categoria;
		this.hashSetProductos = new HashSet<Producto>();
	}
	/*Getters*/
	/**
		Getter del nombre de la categoría de la lista.
		@return nombre el nombre de la categoría en formato String.
	*/
	public String getNombreCategoria(){return this.categoria.getNombre();}
	/*Métodos*/
	/**
		Este método se utiliza para agregar un producto a un listado perteneciente a una 
		categoría en particular.
		@param producto El producto.
	*/
	public void agregarProducto(Producto producto){
		//COMPROBAR QUE EL PRODUCTO PERTENEZCA A LA CATEGORÍA CORRECTA.
		this.hashSetProductos.add(producto);
		}
	/**
		Este método se utiliza para eliminar un producto del listado.
		@param producto El nombre del producto
		@return true si se elimina correctamente, false de lo contrario.
	*/
	public boolean eliminarProducto(String nombre){
		Iterator<HashSet<Producto>> iterador = this.hashSetProductos.iterator();
		while(iterador.hasNext())
		{
			Producto producto = iterador.next();
			if (producto.getNombre().equals(this.categoria.getNombre())){
				this.hashSetProductos.remove(producto);
				return true;
			}
		}
		return false;
	}
	/**
		
	*/
	public Producto getProducto(){return this.}
}