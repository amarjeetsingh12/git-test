
import java.util.Scanner;

public class ACODE {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String in = scanner.nextLine();
            if (in.equals("0")) break;
            in=new StringBuilder(in).reverse().toString();
            int[] countArr = new int[in.length()];
            countArr[0] = 1;
            for (int i = 1; i < in.length(); i++) {
                char prev = in.charAt(i - 1);
                int tmp = Integer.parseInt(new String(new char[]{in.charAt(i), prev}));
                if (tmp < 27) {
                    if (i >= 2)
                        countArr[i] =countArr[i-2]+countArr[i-1];
                    else
                        countArr[i] = 2;
                }else{
                    countArr[i]=countArr[i-1];
                }
            }
            System.out.println(countArr[in.length()-1]);
        }

    }
}
