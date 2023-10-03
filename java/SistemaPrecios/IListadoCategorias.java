public interface IListadoCategorias{
	public final String rutaArchivoListado = "C:\Users\piragna\Desktop\SistemaPrecios\archivoListados";
	public boolean agregarCategoria(String nombreCat);
	public boolean eliminarCategoria(String nombreCat);
	public boolean agregarProducto(Producto producto);
	public boolean eliminarProducto(String nombreProd);
	public void modificarInformacionProducto(String nombreProd);
	public void modificarInformacionProducto(int indiceProd);
	public void modificarNombreProducto(String nombreProd);
	public void modificarPrecioProducto(int precioProd);
	public void modificarComercioProducto(String nombreCom);
	public void modificarCategoriaProducto(String nombreCat);
}