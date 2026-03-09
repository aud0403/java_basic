package static1;

public class Data3 {

    public String name;
    public static int count;

    public Data3(String name){
        this.name = name;
        count++;
        // 생략 가능 Data3.count++;
    }
}
