package exam02;

public class Practice02 { // 중간고사!!
    public static void main(String[] args) {
        String slist[] = {"Seoul", "Daejeon", "Pusan", "Kwangju"};
        System.out.print("원래의 배열: ");
        int i;
        for (i = 0; i < slist.length; i++){
            System.out.print(slist[i] + " ");
        }
        System.out.println();
        System.out.print("역순된 배열: ");
        for (i = slist.length-1 ; 0 <= i ; i--) {
            System.out.print(slist[i] + " ");
        }
    }
}
/* 결과
원래의 배열: Seoul Daejeon Pusan Kwangju
역순된 배열: Kwangju Pusan Daejeon Seoul
 */