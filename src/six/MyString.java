package six;

public class MyString {
    String str;

    public MyString(String str) {
        this.str = str;
    }

    public boolean equals(Object obj) {

        String str1 = this.str; //hello
        MyString myStr = (MyString) obj;
        String str2 = myStr.str; //hello

        return str1 == str2;

    }
}
