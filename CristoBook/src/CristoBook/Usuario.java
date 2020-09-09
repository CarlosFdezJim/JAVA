
package CristoBook;

/**
 * @author Fernández
 */
public class Usuario {
    private String login;
    private String nombre;
    private String apellido;
    private String perfil_usuario;

    public Usuario(String login, String nombre, String apellido, String perfil_usuario) {
        System.out.println("********  CREANDO USUARIO  **********");
        this.login = login;
        this.nombre = nombre;
        this.apellido = apellido;
        this.perfil_usuario = perfil_usuario;
        System.out.println("El Usuario se ha creado correctamente.");
    }

    Usuario() {
        System.out.println("********  CREANDO USUARIO  **********");
        this.login = login;
        this.nombre = nombre;
        this.apellido = apellido;
        this.perfil_usuario = perfil_usuario;
        System.out.println("El Usuario se ha creado correctamente.");
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPerfil_usuario(String perfil_usuario) {
        this.perfil_usuario = perfil_usuario;
    }

    public String getLogin() {
        return login;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPerfil_usuario() {
        return perfil_usuario;
    }
    
    public void printUsuario(){
        
        //Imprimimos el usuario con todos sus miembros.
               System.out.println("Login: " +getLogin());
               System.out.println("\"Nombre: " +getNombre());
               System.out.println("Apellido: " +getApellido());
               System.out.println("Perfil de usuarios: " +getPerfil_usuario());
               System.out.println("--------------------------");

    }
    	
}
