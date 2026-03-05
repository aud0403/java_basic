package construct;

public class MemberConstruct   {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age) {
        this(name, age, 50); // 이건 무조건 생성자 코드의 첫줄에 작성해야한다. sout 도 안됨.
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = "+name+", age = "+age+", grade = "+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
