import javafx.scene.layout.BorderImage;

import java.time.LocalDateTime;

public class Main {
    //封装  继承 多态
    public static void main(String[] args) {
        // 子类声明 父类接收
        Animal a1 = new Person();


        Animal a2 = new Fish();

        a1.eat(1);
        a2.eat(1);
    }





}