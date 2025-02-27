package PCK_GestionEmpresa;

/**
 * @author Nereida Rodríguez Orenes 1ºDAM
 * @since 18/02/2025
 */


public class Ropa extends Producto{
	private String genero;
	
	//Constructores
		public Ropa(String genero, int idProducto, String nombreProducto, int cantProducto, float precioUnitario, TipoProducto tipoProducto) {
			super(idProducto, nombreProducto, cantProducto, precioUnitario, tipoProducto);
			this.genero = genero;
		}

		public Ropa(int idProducto) {
			super(idProducto);
			this.genero = "";
		}
		
		//Getters y setters
		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}
		
		//toString()
		@Override
		public String toString() {
			return "Ropa [genero=" + this.genero + ", tipoProducto=" + this.tipoProducto + ", IdProducto="
					+ this.getIdProducto() + ", NombreProducto=" + this.getNombreProducto() + ", CantProducto="
					+ this.getCantProducto() + ", PrecioUnitario=" + this.getPrecioUnitario() + "]";
		}
}
