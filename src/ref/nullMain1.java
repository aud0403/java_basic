package ref;

public class nullMain1 {
    public static void main(String[] args) {

        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        System.out.println("2. data = " + data.value);
        data = null; // 다시 null 처리가 되면 위의 new Data()로 만든 객체의 참조 주소를 알수가 없다...
        // 다시new 를 하면 그건 새로운 객체라서 이전 이랑은 다르다
        System.out.println("3. data = " + data);


    }
}
