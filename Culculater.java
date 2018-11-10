import java.util.*;

public class Culculater{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String[] calcs = {"+", "-", "*", "/", "%"};
    List<String> calc = Arrays.asList(calcs);

    System.out.println("計算機です。");
    System.out.println("数値を入力して、Enterを押してください");
    double a = 0;
    while(true){
      try{
        String x = s.next();
        a += Double.parseDouble(x);
        break;
      } catch(NumberFormatException x){
        System.out.println("数値ではありません。");
        continue;
      }
    }


    System.out.println("[+]:[-]:[*]:[/]:[%]のどれかを入力して、Enterを押して下さい");
    int c = 0;
    while(true){
      String z = s.next();
      if(calc.indexOf(z) > -1){
        c += calc.indexOf(z);
        break;
      }else {
        System.out.println("正しく入力してください");
        continue;
      }
    }

    System.out.println("数値を入力して、Enterを押してください");
    double b = 0;
    while(true){
      try{
        String y = s.next();
        b += Double.parseDouble(y);
        break;
      } catch(NumberFormatException y){
        System.out.println("数値ではありません。");
        continue;
      }
    }

    String sum = "";

    switch(c){
      case 0: sum = String.valueOf(a + b); break;
      case 1: sum = String.valueOf(a - b); break;
      case 2: sum = String.valueOf(a * b); break;
      case 3: sum = String.valueOf(a / b); break;
      case 4: sum = String.valueOf(a % b); break;
    }

    if (sum.matches("^.*\\.0+$")){
      System.out.println("合計は: " +
       sum.substring(0, sum.indexOf(".")) + " です。");
    }else{
      System.out.println("合計は: " + sum + " です。");
    }
  }
}
