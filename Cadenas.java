
public class Cadenas {
	public static void main(String[] args) {
		String nombre_usuario = "vmonsalve";
		String nombre_usuario_prueba = "Vmonsalve";
		
		/* Probando algunos metodos de la clase string. */
		
		System.out.println("Método length: "+nombre_usuario.length());
		System.out.println("Método chartAt: "+nombre_usuario.charAt(3));
		System.out.println("Método substring: "+nombre_usuario.substring(1, 4));
		System.out.println("Método equals: "+nombre_usuario.equals(nombre_usuario_prueba));
		System.out.println("Método equalsIgnoreCase: "+nombre_usuario.equalsIgnoreCase(nombre_usuario_prueba));
	}

}
