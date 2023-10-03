public class Controladora{
	public static Scanner scanner = new Scanner(System.in);
	public static void main (){
		ListadoCategorias listadoCategorias = new ListadoCategorias();
		File file = new File(IListadoCategorias.rutaArchivoListado);
		if (!(file.exists())){file.createNewFile();}
		//	Corregir. Si no existe el archivo consultar por la creacion de uno nuevo.
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		ObjectInputStream objectInputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try{
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			listadoCategorias = objectInputStream.readObject();
			}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		//	Despersistencia de los datos de la lista.
		//	Opcion para crear una lista nueva. Se tiene que eliminar la anterior o crear una nueva en otra ruta.
		int eleccion, confirmacion;
		do {
			System.out.println(Menu.mostrarOpciones());
			eleccion = scanner.nextInt();
			switch(eleccion){
				case 0:break;
				case 1:	//Agregar categoría.
				String nombreCategoria;
				System.out.println("Ingresar el nombre de la categoría: ");
				nombreCategoria = scanner.nextLine();
				if (nombreCategoria.charAt(0).equals("0")){}
				else {Categoria categoria = new Categoria(nombreCategoria);}
				
				break;	
				case 2:	//Eliminar categoría.
				break;
				case 3:	//Agregar producto.
				break;
				case 4:	//Eliminar producto.
				break;
			}
		} while (eleccion != '0');
		//	Persistencia de los datos de la lista.
		//	Si la lista ya existia entonces se sobreescriben los datos. Sino se opta por eliminar los datos anteriores o crear un nuevo archivo.
	}
}
