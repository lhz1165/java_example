package six;

public class Fish extends Animal {


    int age;


    public Fish() {
       super();
    }

    public Fish(int age, String name){
        this.name = name;
        this.age = age;
    }



    public void eat(int a) {
        System.out.println("鱼吃东西");
    }


    @Override
    public String toString() {
        return "Fish{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
