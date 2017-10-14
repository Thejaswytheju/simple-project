public class Puppy {

    private final String name;
     int puppyAge;

    public Puppy(String name) {

        this.name = name;
    }

    public void setPuppyAge(int age) {

        puppyAge = age;
    }


    public int getPuppyAge() {

        System.out.println("puppy's age is" + puppyAge);
        return puppyAge;
    }

}
