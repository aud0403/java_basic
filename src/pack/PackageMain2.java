package pack;

import pack.a.*;


public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();//import
        User2 user2 = new User2();//import
        pack.b.User userb = new pack.b.User(); // 패키지가 달라도 클래스 이름이 같아서 그냥 쓸수가 없다 (안그럼 헷갈려;;)

    }
}
