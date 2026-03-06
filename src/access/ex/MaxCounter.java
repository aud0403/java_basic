package access.ex;

public class MaxCounter {

   private int count ;
   private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){
        if(count < max){
            count++;
        }else{
            System.out.println("최대값을 초과할 수 없습니다.");
        }
        //일런 방식도 있음 검증과 실행 분리 하는 로직
//        //검증 로직
//        if (count >= max) {
//            System.out.println("최대값을 초과할 수 없습니다.");
//            return;
//        }
//        //실행 로직
//        count++;

    }
    int getCount(){

        return count;
    }
}
