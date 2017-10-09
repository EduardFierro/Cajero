package CajeroUdec;

public class Usuario {
	private int cedula;
	private String apellido;
	private String nombre;
	private String clave;
	private int saldo;
	

	public Usuario(int cedula, String nombre, String apellido,String clave, int saldo) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.saldo = saldo;
	}

	

	@Override
	public String toString() {
		return "Usuario->" +"Cedula: " + cedula +"Nombre: " + nombre + " Apellido: " + apellido + "" + " Clave:" + clave + " Saldo:" + saldo +"\n";
	}

}
