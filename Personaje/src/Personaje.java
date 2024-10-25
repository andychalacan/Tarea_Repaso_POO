
public class Personaje {
    private String nombre;
    private int anioonacimiento;
    private String telefono;

    public Personaje(String nombre, int anioonacimiento,String telefono){
        this.nombre=nombre;
        this.anioonacimiento=anioonacimiento;
        this.telefono=telefono;
    }

    public String getNombre(){
        return nombre;
    }
    public int getAnioonacimiento(){
        return anioonacimiento;
    }
    public String getTelefono(){
        return telefono;
    }
    public String setTelefono(String telefono){

        this.telefono=telefono;
        return telefono;
    }

}