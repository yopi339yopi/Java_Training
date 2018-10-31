// 標準入力

/*
ユーザーからの入力を受け取る

基本構文
import java.util.Scanner;

public static void main(String[] args) {
  Scanner 変数名 = new Scanner(System.in);
  型 変数 = Scanner変数名.next型();
}

int型    -> 変数名.nextInt();
double型 -> 変数名.nextDouble();
String型 -> 変数名.next();

*/

import java.util.Scanner;   // Scannerクラスをインポート

public class Test12{
  public static void main(String[] args) {
    // 整数の入力
    Scanner s0 = new Scanner(System.in); // Scannerクラスのs0をインスタンス化
    // new Scanner(System.in)で、ユーザーからの入力を準備
    System.out.println("2つの整数の和を計算します");
    System.out.println("1つ目の整数を入力してください");
    int a = s0.nextInt();                // 入力された整数を、変数aに代入
    System.out.println("2つ目の整数を入力して下さい");
    int b = s0.nextInt();                // 入力された整数を、変数bに代入
    int sum = a + b;
    System.out.println("合計は " + sum + " です。");
    System.out.println();                // 結果確認用の空行


    // 文字列の入力
    Scanner s1 = new Scanner(System.in); // Scannerクラスのs1をインスタンス化
    System.out.println("文字を入力してください");
    String str = s1.next();              // 入力された文字列を、変数strに代入
    System.out.println("入力されたのは " + str + " です。");


    // 数値と文字の入力
    Scanner s2 = new Scanner(System.in); // Scannerクラスのs2をインスタンス化
    System.out.println("お名前は？");
    String name = s2.next();             // 名前を入力
    System.out.println("身長は？(m)");
    double tall = s2.nextDouble();       // 身長を入力
    System.out.println("体重は(kg)？");
    double weight = s2.nextDouble();     // 体重を入力
    double bmi = weight /(tall * tall);  // BMIを計算
    String himando = "";                 // 空の変数himandoを定義
    if (bmi < 18.5){                     // if文でhimandoに足す
      himando += "痩せ型です";
    }else if (bmi < 25){
      himando += "普通です";
    }else if (bmi < 30){
      himando += "肥満度１です";
    }else if (bmi < 35){
      himando += "肥満度２です";
    }else if (bmi < 40){
      himando += "肥満度３です";
    }else{
      himando += "肥満度４です";
    }
    System.out.println(name + " さんのBMIは " +
                      String.format("%.2f",bmi) + " で、" + himando);
  }
}
