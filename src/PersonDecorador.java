public class PersonDecorador implements IPerson {

    protected IPerson person;

    public PersonDecorador(IPerson person) {

        this.person = person;

    }

    @Override
    public void caminar() {

        System.out.println("La persona está andando.... y todavia sigue andando");

    }

    @Override
    public void parar() {

        System.out.println("La persona se ha parado de repente");

    }

}
