package grouplearning.corejava.basics.controlFlows;

public class ControlFlow2 {
    public static void main(String[] args) {
        int i1 = 1;
        i1 = i1 + 10;
        System.out.println(i1);
        long l1 = 1;
        float f1 = 123.4f;
        double d1 = 123.4;
        String s1 = "hello ";
        String s2 = "how are you";
        String s3 = s1 + s2;
        System.out.println(s3);

        int arr[] = new int[10];
        double arr2[] = new double[20];
        String arr3[] = new String[15];
        long arr4[] = new long[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i*10;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        int i = 0;
        while (i < 10){
            System.out.println(i*2);
            i++;
        }

        long l10 = 10;
        if (l10 > 50){
            System.out.println("your long variable l10 is greater than 50");
        }
        else {
            System.out.println("your long variable l10 is less than 50");
        }
    }
}
