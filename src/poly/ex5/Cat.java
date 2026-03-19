package poly.ex5;

import javax.print.attribute.SetOfIntegerSyntax;

public class Cat implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
