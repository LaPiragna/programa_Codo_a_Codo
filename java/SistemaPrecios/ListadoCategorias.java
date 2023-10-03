/**
	Esta clase representa a la lista que contiene todos los listados de las diferentes
	categorías existentes.
*/
public ListadoCategorias implements ListadoCategorias{
	private LinkedList<ListadoProducto> listadoCategorias;
	/*Métodos*/
	/**
		Este método se utiliza para verificar la existencia de una categoría.
		@param nombreCat El nombre de la categoría.
		@return true Si existe tal categoría, false de lo contrario.
	*/
	public boolean existeCategoria(String nombreCat){
		for (ListadoProducto lp: this.listadoCategorias){
			if (lp.getNombreCategoria().equals(nombreCat)) return true;
		}
		return false;
	}
	/**
		Este método se utiliza para agregar un listado de una categoría nueva no existente
		al listado general de categorías.
		@param nombreCat El nombre de la categoría.
		@return true Si se ha agregado satisfactoriamente una categoría, false de lo contrario.
	*/
	public boolean agregarCategoria(String nombreCat){
		for (ListadoProducto lp: this.listadoCategorias){
			if (nombreCat.equals(lp.getNombreCategoria)) return false;
		}
		this.listadoCategorias.add(new ListadoProducto(new Categoria(nombreCat)));
		return true;
	}
	/**
		Este método se utiliza para eliminar una categoría ya existente en el listado general
		de categorías.
		@param nombreCat El nombre de la categoría.
		@return true Si se ha eliminado correctamente una categoría del listado, false en caso contrario.
	*/
	public boolean eliminarCategoria(String nombreCat){
		for (ListadoProducto lp: this.listadoCategorias){
			if (nombreCat.equals(lp.getNombreCategoria)){
				this.listadoCategorias.remove(lp);
				return true;
			}
		}
		this.listadoCategorias.add(new ListadoProducto(new Categoria(nombreCat)));
		return false;
	}
	/**
		Esta función se utiliza para agregar un producto nuevo a un listado de una categoría
		particular.
		@param producto El producto a agregar.
		@return true Si se ha agregado un producto de manera satisfactoria, false en caso contrario.
	*/
	public boolean agregarProducto(Producto producto){
		if (existeProducto(producto.getNombre())) return false;
		if (existeCategoria(producto.getNombreCategoria())){
			for (ListadoProducto lp: this.listadoCategorias){
				if (producto.getNombreCategoria().equals(lp.getNombreCategoria)){
					lp.agregarProducto(producto);
					return true;
				}
			}	
		}
		agregarCategoria(producto.getNombreCategoria());
		for (ListadoProducto lp: this.listadoCategorias){
				if (producto.getNombreCategoria().equals(lp.getNombreCategoria)){
					lp.agregarProducto(producto);
					return true;
				}
			}
	}
	/**
		Esta función se utiliza para eliminar un producto de alguno de los listados.
		@param nombreProd El nombre del producto que se busca eliminar.
		@return true Si se ha eliminado un producto de manera satisfactoria, false en caso contrario.
	*/
	public boolean eliminarProducto(String nombreProd){
		for (ListadoProducto lp: this.listadoCategorias)
			if (lp.eliminarProducto) return true;
		return false;
	}
	/**
		Esta función se utilizará para verificar la existencia de algún producto.
		@param nombreProd El nombre del producto.
		@return true Si existe el producto, false en caso contrario.
	*/
	public boolean existeProducto(String nombreProd){}
	/**
		Esta función se utilizará para acceder a un listado que pertenezca a la categoría
		ingresada.
		@param nombreCat El nombre de la categoría del listado.
		@return ListadoProducto el listado correspondiente.
		@throws NullPointerException en caso de no existir tal listado.
	*/
	public ListadoProducto getListadoProducto(String nombreCat){
		for (ListadoProducto lp: this.listadoCategorias)
		{
			if (lp.getNombreCategoria().getNombre().equals(nombreCat))
				return lp;
		}
		return null;
	}/**
		Esta función se utilizará para acceder a un listado a través de un índice.
		@param indiceListado El indice del listado.
		@return ListadoProducto el listado correspondiente.
		@throws IndexOutOfBoundsException en caso de no existir tal listado.
	*/
	public ListadoProducto getListadoProducto(int indiceListado){
		return this.listadoCategorias.get(indiceListado);
	}
	/**
		Esta función se utilizará para acceder a algún producto correspondiente a la categoría ingresada.
		@param nombreProd El nombre del producto.
		@param nombreCat El nombre de la categoría.
		@return Producto el producto encontrado, null en caso de no existir.
		@throws NullPointerException Si el producto que se quiere buscar no existe.
	*/
	public Producto getProducto(String nombreProd, String nombreCat){
		for (ListadoProducto lp: this.listadoCategorias)
		{
			if (lp.getNombreCategoria().getNombre().equals(nombreCat))
				return lp.;
		}
		return null;
	}
	/**
		Esta función se utilizará modificar el nombre de algún producto.
		@param nombreProd El nombre actual del producto.
		@param nombreCat El nombre de la categoría a la que pertenece el producto.
		@param nuevoNombre El nuevo nombre del producto.
	*/
	public void modificarNombreProducto(String nombreProd, String nombreCat, String nuevoNombre){
		Producto aux = getProducto(nombreProd, nombreCat);
		aux.setNombre(nuevoNombre);
	}
	/**
		Esta función se utilizará para modificar el precio de algún producto.
		@param nombreProd El nombre actual del producto.
		@param nombreCat El nombre de la categoría a la que pertenece el producto.
		@param nuevoPrecio El nuevo precio del producto.
	*/
	public void modificarPrecioProducto(String nombreProd, String nombreCat,int nuevoPrecio){
		Producto aux = getProducto(nombreProd, nombreCat);
		aux.setPrecio(nuevoPrecio);
	}
	/**
		Esta función se utilizará para modificar el nomobre del comercio donde se consigue un producto.
		@param nombreProd El nombre actual del producto.
		@param nombreCat El nombre de la categoría a la que pertenece el producto.
		@param nuevoCom El nuevo nombre del comercio donde se adquiere.
	*/
	public void modificarComercioProducto(String nombreProd, String nombreCat, String nuevoCom){
		Producto aux = getProducto(nombreProd, nombreCat);
		aux.setNombreComercio(nuevoCom);
	}
	/**
		Esta función se utilizará para modificar la categoría a la que pertenece un producto.
		@param nombreProd El nombre actual del producto.
		@param nombreCat El nombre de la categoría a la que pertenece el producto.
		@param nuevaCat El nombre de la nueva categoría del producto.
	*/
	public void modificarCategoriaProducto(String nombreProd, String nombreCat, String nuevaCat){
		Producto aux = getProducto(nombreProd, nombreCat);
		aux.setNombreCategoria(nuevaCat);
	}
	/**
		Función que reorganice los distintos productos dentro de los diferentes listados verificando
		que cuyo nombre de cada uno de los primeros mencionados concuerde con el nombre de los segundos
		mencionados, manteniendo una lógica basada por nomenclatura de categorías.
	*/
	public void actualizarListadoCategorias(){
		for (ListadoProducto lp: this.listadoCategorias)
		{
			for (Producto producto: lp){
				if (!(producto.getNombre().equals(lp.getNombreCategoria())))
				{
					agregarProducto(producto);
					eliminarProducto(producto.getNombre());
				}
			}
		}
	}
}