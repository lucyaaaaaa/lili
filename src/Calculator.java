import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static String getSum(String a, String b) {
        List<Integer> la = new ArrayList<Integer>();
        List<Integer> lb = new ArrayList<Integer>();
        String c = "";
        for (int i = a.length() - 1; i >= 0; --i) {
            la.add(a.charAt(i) - '0');
        }
        for (int i = b.length() - 1; i >= 0; --i) {
            lb.add(b.charAt(i) - '0');
        }
        //位数从低到高
        List<Integer> lc = new ArrayList<Integer>();
        int tmp = 0;
        int maxsize = Math.max(la.size(), lb.size());
        for (int i = 0; i < maxsize; i++) {
            if (i < la.size()) {
                tmp += la.get(i);
            }
            if (i < lb.size()) {
                tmp += lb.get(i);
            }
            lc.add(tmp % 10);

            tmp /= 10;
        }
        if (tmp > 0)
            lc.add(tmp % 10);
        for (int i = lc.size() - 1; i >= 0; i--) {
            c += lc.get(i);
        }
        return c;
    }
}
