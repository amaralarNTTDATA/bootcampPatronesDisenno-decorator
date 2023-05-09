public class Person implements IPerson {

    private String name;
    private int age;

    public Person() {

        this.name = "Juan";
        this.age = 25;

    }

    public String getName() {

        return name;

    }

    public int getAge() {

        return age;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setAge(int age) {

        this.age = age;

    }

    @Override
    public void caminar() {

        System.out.println("La persona está andando....");

    }

    @Override
    public void parar() {

        System.out.println("La persona se ha parado");

    }


}
