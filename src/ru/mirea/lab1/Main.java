//
//public class Main {
//    public static void main(String[] args) {
//        double sum = 0;
//        double srednie = 0;
//        int[] b = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < 10; i++) {
//            sum+=b[i];
//        }
//        System.out.println((int)sum);
//        srednie=sum/b.length;
//        System.out.println(srednie);
//    }
//}
//
//
//
//import java.util.Arrays;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите длину массива");
//        if(sc.hasNextInt()) {
//            int l = sc.nextInt();
//            int[] a = new int [l];
//            for (int i = 0; i<l; i++){
//                System.out.println("Введите элемент " + i);
//                if(sc.hasNextInt()) {
//                    a[i]=sc.nextInt();
//                } else {
//                    System.out.println("Неправильное число");
//                    System.exit(0);
//                }
//            }
//            int sum=0;
//            int i=0;
//            while (i<l) {
//                sum+=a[i];
//                i++;
//            }
//            int f = 0;
//            int max = 0;
//            int min = 99999;
//            do {
//                if (a[f]< min) {
//                    min=a[f];
//                }
//                if (a[f] > max) {
//                    max=a[f];
//                }
//                f++;
//            } while (f<l);
//            System.out.println(sum);
//            System.out.println(max);
//            System.out.println(min);
//        } else {
//            System.out.println("Неправильное число");
//            System.exit(0);
//        }
//        }
//    }
//
//
//
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        for (double n = 1; n<11; n++) {
//            double q = 1/n;
//            System.out.println(q);
//        }
//    }
//}
//
//
//
//public class Main {
//        public static int fank(int a) {
//            int f = 1;
//            if (a==0) {
//                return 1;
//            } else {
//                for (int n = 1; n<a+1; n++) {
//                    f=f*n;
//                }
//                return f;
//            }
//
//        }
//        public static void main() {
//            int a = 0;
//            System.out.println(fank(a));
//        }
//    }
