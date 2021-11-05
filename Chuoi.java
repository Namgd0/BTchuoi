package BTChuoi;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Chuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        String chuoi = sc.nextLine();

        do {
            System.out.println("------------------------MENU------------------------");
            System.out.println("--1-- Đảo ngược chuỗi");
            System.out.println("--2-- Tách chuỗi và sắp xếp theo bảng chữ cái");
            System.out.println("--3-- Nhập số, in ra chữ ở vị trí đó");
            System.out.println("--4-- Tách thành chuỗi mới có độ dài bằng n nhập vào");
            System.out.println("--5-- Thoát MENU");
            System.out.println("Please choose your function");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: //Tách chuỗi và đảo ngược chuỗi
                    String[] list = chuoi.split("\\s+");
                    for (int i = list.length-1; i>=0; i--){
                        System.out.print(list[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2: // Tách chuỗi và sx chuỗi theo thứ tự bảng chữ cái
                    String[] list1 = chuoi.split("\\s+");
                    Collator col = Collator.getInstance(new Locale("en", "EN"));
                    Arrays.sort(list1, col);
                    String sorted = "";
                    for (int i = 0; i < list1.length ; i++)
                    {
                        sorted += list1[i] + " ";
                    }
                    System.out.println(sorted + " ");
                    break;
                case 3: // nhập 1 số, in ra thứ tự từ trong chuỗi đó theo chuỗi
                    String[] list2 = chuoi.split("\\s+");
                    System.out.println("select string position: ");
                    int n = sc.nextInt();
                    System.out.println("Ký tự thứ " + n + " trong chuỗi là: " +list2[n-1]);
                    break;
                case 4: // nhập 1 số, in ra số lượng từ trong số theo chuỗi
                    String[] list3 = chuoi.split("\\s+");
                    System.out.println("Nhập số chuỗi muốn tạo thành: ");
                    int tach = sc.nextInt();
                    for (int i= 0; i <= (tach - 1); i++)
                    {
                        System.out.print(list3[i] + " ");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Undefined function!!");
                    break;
            }
           // System.out.println("Farewell My Friend, See You Around");
        }while (true);
    }
}
