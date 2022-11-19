package Ejercicios;
public class Ejercicios_tema_8 {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(24);
        System.out.println(persona.getEdad()); 

        persona.setNombre("Azzemod");
        System.out.println(persona.getNombre()); 

        persona.setTelefono(58123456789L);
        System.out.println("+"+persona.getTelefono()); 

         
        }

         static class Persona {
            private int edad; 
            private String nombre;
            private Long telefono;

            public void setEdad(int edad) {
                this.edad = edad;  
            }
            public int getEdad() {
                return this.edad;     
            }
            public String getNombre() {
                return nombre;
            }
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
            public Long getTelefono() {
                return telefono;
            }
            public void setTelefono(Long telefono) {
                this.telefono = telefono;
            }
        
    }
}
