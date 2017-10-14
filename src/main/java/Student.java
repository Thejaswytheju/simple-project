class Student {

    private int age;
    private String name;
    private String city;

    Student(int age,String name,String city){
        this.age = age;
        this.name = name;
        this.city = city;
    }
    public String toString(){
        return age+" "+name+" "+city;
    }



}
