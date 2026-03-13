package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a){
        this(a,0); //-> 다른 생성자로 호출 그래서 밑에 잇는 생성자를 호줄한다.
        System.out.println("ClassB 생성자 a = "+ a);
    }

    public ClassB(int a, int b){
        super();//기보 생성자 생략 가능, 부보 생성자 호출
        System.out.println("ClassB 생성자 a = "+ a + ", b = "+ b);
    }
}
