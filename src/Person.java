public class Person extends Animal{
    String id;

    int gender;

    int age;

    //重载  overload

    //重写  overwrite
    public Person() {

    }

    public Person(String name, int age) {

    }

    @Override
    public void eat(int a) {
        System.out.println("人吃东西");
    }

    public Person(String name, int age, String id, int gender) {
        this.name = name;
        this.age=age;
        this.id=id;
        this.gender = gender;
    }


    public void eat() {
        System.out.println("人吃东西");
    }



     public int tellAgeToSb(){
        //做自己想是想的功能
        return age;
    }


     void walk() {
        System.out.println("走路了。。。");
    }


     void repeat(String sentence){
        System.out.println(sentence);
    }


    @Override
    public String toString() {
        return "pppppp{" +
                "id='" + id + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
