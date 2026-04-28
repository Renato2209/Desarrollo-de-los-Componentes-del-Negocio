// Clase principal
public class usuarios {
    public static void main(String[] args) {
    
        Admin admin = new Admin("Renato", "admin@gmail.com", "12345");
        Cliente cliente = new Cliente("Carlos", "cliente@gmail.com", "abcd");

        System.out.println("=== ADMIN ===");
        admin.verDatosCompletos();

        System.out.println("\n==== CLIENTE ===");
        cliente.mostrarPerfil();

        System.out.println("\nEl admin cambia su contraseña.......");
        admin.actualizarPassword("nueva123");

        admin.verDatosCompletos();
    }
}


// Clase base
class Usuario {
    private String nombre;
    private String email;
    private String password;

    public Usuario(String nombre, String email, String password){
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public String verPerfil(){
        return "Nombre: " + nombre + " | Email: " + email;
    }

    protected void cambiarPassword(String nuevaPassword){
        this.password = nuevaPassword;
        System.out.println("Contraseña actualizada correctamente.");
    }

    protected String getPassword(){
        return password;
    }
}

// Clase Admin
class Admin extends Usuario {

    public Admin(String nombre, String email, String password){
        super(nombre, email, password);
    }

    public void verDatosCompletos(){
        System.out.println(verPerfil());
        System.out.println("Password: " + getPassword());
    }

    public void actualizarPassword(String nuevaPassword){
        cambiarPassword(nuevaPassword);
    }
}

// Clase Cliente
class Cliente extends Usuario {

    public Cliente(String nombre, String email, String password){
        super(nombre, email, password);
    }

    public void mostrarPerfil(){
        System.out.println(verPerfil());
    }
}