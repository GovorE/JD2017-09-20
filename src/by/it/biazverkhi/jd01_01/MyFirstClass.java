package by.it.biazverkhi.jd01_01;

class MyFirstClass {
    // объявление члена класса , который хранит содержимое слогана
    private  String slogan="Hello World";

    //метод установки нового слогана
    void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    //определение метода вывода слогана на устройство (в данном случае консоль)
    void printSlogan() {System.out.println(this.slogan);}
}
