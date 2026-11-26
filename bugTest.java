import java.util.Scanner;

class bugTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 操作回数
        int X = sc.nextInt();   // エラー操作番号

        //String[] Ns = sc.nextLine().split(" "); //ｎ回分の操作

        int[] Nsint = new int[N];
        for (int i = 0; i < N; i++) { 
            Nsint[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < Nsint.length; i++) {
            if (Nsint[i] == X) {
                count +=1;
            } 
        }
        System.out.println(count);

    }
}        
