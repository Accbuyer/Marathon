package day8;

public class Task1 {
    public static void main(String[] args) {
    String str = "";
    StringBuilder sb = new StringBuilder();
    long before = System.currentTimeMillis();
    for(int i = 0; i < 20000; i ++){
        str += i + " ";
    }

        System.out.println(str);

        long after = System.currentTimeMillis();
        System.out.println("String: " + (after - before));

        before = System.currentTimeMillis();
        for(int i = 0; i < 20000; i ++){
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
        after = System.currentTimeMillis();

        System.out.println("StringBuilder: " + (after - before));
    }
}
