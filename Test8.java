// メソッド基礎 その１ 基本 / 引数 / 戻り値
/*
メソッドとは、名前を付けた命令文の集まり
関数とも呼ばれる

＊メソッドの宣言の基本構文
public static void メソッド名(){
  命令文
}

＊メソッドの実行(呼び出し)
メソッド名();


＊引数
メソッド名の()に値を渡す

＊引数のあるメソッドの基本構文
public static void メソッド名(型 変数名){
  命令文
}

＊引数のあるメソッドの実行(呼び出し)
メソッド名(値);


＊戻り値
メソッドから値を戻す

＊戻り値のあるメソッドの基本構文
puclic static 戻り値の型 メソッド名(引数列){
  return 値;
}

＊メソッドを実行して値を受け取る
変数 = メソッド名(引数列);

＊戻り値の型
boolean 真偽値
String  文字列
double  浮動小数点数
int     整数
void    戻り値が無い

*/

public class Test8{
  public static void main(String[] args) {
    countdown();              // countdownメソッドを実行
    methodA(12);              // methodAの引数aに12を代入して実行
    methodA(4);               // methodAの引数aに4を代入して実行
    methodB(10,4);            // methodBの引数startに10を、endに4を代入して実行
    methodB(5,0);             // methodBの引数startに5を、endに0を代入して実行
    int sum = getSum(3, 5);   // getSumに引数を渡して、戻り値を変数sumに代入
    System.out.println(sum);
  }

  // 基本メソッド
  public static void countdown(){   // countdownというメソッドを定義
    for (int i = 10; i >= 0; i--){
      System.out.println(i);
      countup();                    // countupメソッドを実行
    }
  }

  public static void countup(){     // countupというメソッドを定義
    for (int i = 0; i <= 10; i++){
      System.out.println(i);
    }
  }


  // 引数ありメソッド
  public static void methodA(int a){  // int型引数aをもつmethodAを定義
    System.out.println("値 " + a + " を受け取りました。");
  }

  public static void methodB(int start, int end){
  // 2つの引数startとendを持つmethodBを定義
    for (int i = start; i >= end; i--){
      System.out.println(i);
    }
  }


  // 戻り値ありメソッド
  public static int getSum(int a, int b){   // int型の値を戻すメソッドを定義
    return a + b;                           // 引数aとbを足した値を戻す
  }

}
