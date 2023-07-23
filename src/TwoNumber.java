public class TwoNumber {

    Integer a;

    Integer b;

    public TwoNumber(){

    }

    public TwoNumber(int a,int b){
        this.a= a;
        this.b =b;
    }

    TwoNumber swap(Integer number1, Integer number2){
        //1 100
        int number3 = 0;
        number3=number1;
        number1 = number2;//100
        number2 = number3;//1


        TwoNumber twoNumber = new TwoNumber(number1,number2);

        return twoNumber;
    }

}
