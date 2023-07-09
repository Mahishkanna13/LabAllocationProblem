// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lab1=sc.nextInt();
        int lab2=sc.nextInt();
        int lab3=sc.nextInt();
        int allocation=sc.nextInt();
        int num=0;
        ArrayList <Integer> arr=new ArrayList<Integer> ();
        arr.add(lab1);
        arr.add(lab2);
        arr.add(lab3);
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>allocation){
                num=arr.get(i);
                break;
            }
        }
        if(lab1==num){
            System.out.println("L1");
        }
        else if(lab2==num){
            System.out.println("L2");
        }
        else{
            System.out.println("L3");
        }

    }
}