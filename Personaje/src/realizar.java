public class realizar {
    public static void main(String[] args){
        Personaje personaje=new Personaje("Roberto",2000,"0915729413");
        System.out.println("Nombre: "+personaje.getNombre()+" Año Nacimiento:"+personaje.getAnioonacimiento()+" Telefono: "+personaje.getTelefono());
        personaje.setTelefono("0941257615");
        System.out.println("Telefono nuevo: "+personaje.getTelefono());
    }
}
