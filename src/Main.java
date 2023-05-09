public class Main {
    public static void main(String[] args) {

        IPerson persona = new Person();
        persona.caminar();
        persona.parar();

        IPerson persona2 = new PersonDecorador(persona);
        persona2.caminar();
        persona2.parar();


    }
}