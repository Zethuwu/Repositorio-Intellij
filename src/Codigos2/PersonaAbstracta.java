package Codigos2;
//Creacion de la clase persona a abstracta
public abstract class PersonaAbstracta {
        //Creacion de las variables de la clase padre
        protected String nombre;
        protected int edad;
        protected int estatura;
        protected String nacimiento;
        private String colorfav;
        //constructor


        public PersonaAbstracta(String nombre, int edad , int estatura, String nacimiento,String colorfav) {
            this.nombre = nombre;
            this.edad = edad;
            this.estatura = estatura;
            this.nacimiento = nacimiento;
            this.colorfav = colorfav;
        }

        //getter and setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEstatura() {
            return estatura;
        }

        public void setEstatura(int estatura) {
            this.estatura = estatura;
        }

        public String getNacimiento() {
            return nacimiento;
        }

        public void setNacimiento(String nacimiento) {
            this.nacimiento = nacimiento;
        }

        public String getColorfav() {
            return colorfav;
        }

        public void setColorfav(String colorfav) {
            this.colorfav = colorfav;
        }
        //Metodos por si lo necesitan

        public void Personalidad(){

        }
        public void Gustos(){
            System.out.println("Los gustos depende de cada persona");
        }
        //Impresion de lo que tenga el objeto
        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    ", estatura=" + estatura +
                    ", nacimiento='" + nacimiento + '\'' +
                    '}';
        }
}
