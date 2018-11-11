import java.util.*;

public class Culculater{
  static Scanner s = new Scanner(System.in);

  public static void main(String[] args) {

    double[] nums = new double[2];
    String[] calcs = {"+", "-", "*", "/", "%"};
    List<String> calc = Arrays.asList(calcs);


    System.out.println("計算機です。");
    System.out.println("数値を入力して、Enterを押してください");
    nums[0] = num();


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
    nums[1] = num();

    String sum = "";

    switch(c){
      case 0: sum = String.valueOf(nums[0] + nums[1]); break;
      case 1: sum = String.valueOf(nums[0] - nums[1]); break;
      case 2: sum = String.valueOf(nums[0] * nums[1]); break;
      case 3: sum = String.valueOf(nums[0] / nums[1]); break;
      case 4: sum = String.valueOf(nums[0] % nums[1]); break;
    }

    if (sum.matches("^.*\\.0+$")){
      System.out.println("合計は: " +
       sum.substring(0, sum.indexOf(".")) + " です。");
    }else{
      System.out.println("合計は: " + sum + " です。");
    }
  }

  public static double num(){
    double z = 0;
    while(true){
      try{
        String x = s.next();
        z += Double.parseDouble(x);
        break;
      } catch(NumberFormatException e){
        System.out.println("数値ではありません。");
        continue;
      }
    }
    return z;
  }
}
