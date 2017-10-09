package CajeroUdec;

public class Usuario {
	private int cedula;
	private String nombre;
	private String apellido;
	private String clave;
	private int saldo;
	
	public Usuario(int cedula, String nombre, String apellido,String clave, int saldo) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.saldo = saldo;
	}

	public int getCedula() {
		return cedula;
	}



	public void setCedula(int cedula) {
		this.cedula = cedula;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getClave() {
		return clave;
	}



	public void setClave(String clave) {
		this.clave = clave;
	}



	public int getSaldo() {
		return saldo;
	}



	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}



	
	

	@Override
	public String toString() {
		return "Usuario->" +"Cedula: " + cedula +"Nombre: " + nombre + " Apellido: " + apellido + "" + " Clave:" + clave + " Saldo:" + saldo +"\n";
	}

}
