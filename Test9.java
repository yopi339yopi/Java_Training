// メソッドの基礎 その２ 配列・インスタンスの参照

/*
メソッドの引数の型には2種類ある

＊参照型
引数で配列やインスタンスを渡すことで、所在地情報を渡す。
参照型では「入れ物ごと」渡し、「要素の値」に影響を与える。

基本構文
public static void メソッド名(引数型 変数名){
  命令文;
}

＊基本型
intやdouble、String、booleanなどの値を渡す。
基本型では「値だけ」渡し、「呼び出し元の値」には影響を与えない。

戻り値にも基本型と参照型の2種類ある

基本構文
public static 戻り値の型 メソッド名(引数型 変数名){
  型 変数 = new 型;
  return 変数;
}
*/

public class Test9{
  public static void main(String[] args) {
    int[] a = new int[3];              // 配列aをインスタンス化
    a[0] = 10;                         // aの要素に値を代入
    a[1] = 20;
    a[2] = 30;
    methodA(a);                        // methodAを呼び出し
    System.out.println();              // 結果確認用の空行

    System.out.println(getSum(a));     // getSumメソッドに、配列aを渡して出力
    System.out.println();

    int i = 40;                        // 変数iに10を代入
    methodB(i);                        // methodBに変数iを渡す
    System.out.println(i);             // 変数iを出力
    System.out.println();              // 結果確認用の空行

    int[] b = new int[2];              // 配列bをインスタンス化
    b[0] = 50;                         // bの要素に値を代入
    b[1] = 50;
    System.out.println(b[0]);          // 配列bの要素を出力
    System.out.println(b[1]);
    System.out.println();              // 結果確認用の空行

    Point p = new Point();             // インスタンスpを生成
    p.x = 60;
    p.y = 60;
    System.out.println(p.x);
    System.out.println(p.y);
    System.out.println();              // 結果確認用の空行
    methodD(p);                        // methodDにpを渡す
    System.out.println(p.x);
    System.out.println(p.y);
    System.out.println();

    int[] c = methodE();               // methodEで生成した配列を受け取る
    for (int j = 0; j < c.length; j++){
      System.out.println(c[j]);        // for文で受け取った配列を出力
    }
    System.out.println();              // 結果確認用の空行

    Point q = methodF();               // methodFで生成したインスタンスを受け取る
    System.out.println(q.x);
    System.out.println(q.y);
  }


  // 配列を参照するメソッド
  public static void methodA(int[] r){ // 配列aを「methodA内の配列r」で参照
    for (int i = 0; i < r.length; i++){
      System.out.println(r[i]);        // for文でメソッド内の配列aを順に出力
    }
  }


  // 配列を参照し、合計値を戻すメソッド
  public static int getSum(int[] x){   // 配列aを「getSum内の配列x」で参照
    int sum = 0;
    for(int i = 0; i < x.length; i++){
      sum += x[i];                     // for文でsumに配列xの値を足していく
    }
    return sum;                        // sumの値を戻す
  }


  // 値を受け取り、1足した値を出力するメソッド
  public static void methodB(int i){   // 「methodB内の変数i」に渡された値を代入
    i++;                               // 「methodB内のi」に、1を足す
    System.out.println(i);             // 「methodB内のi」を出力
  }


  // 配列を参照し、要素の値を変更するメソッド
  public static void methodC(int[] b){ // 配列bを「methodC内の配列b」で参照
    b[0]++;                            // 配列bの先頭要素に、1を足す
  }


  // インスタンスを参照し、値を変更するメソッド
  public static void methodD(Point p){ // インスタンスpを「methodD内のp」で参照
    p.x ++;
    p.y --;
  }


  // 配列を戻すメソッド
  public static int[] methodE(){       // int型の配列を戻すメソッドを定義
    int[] c = new int[3];              // メソッド内で配列cをインスタンス化
    c[0] = 15;
    c[1] = 25;
    c[2] = 35;
    return c;                          // 生成した配列cを戻す
  }


  // インスタンスを戻すメソッド
  public static Point methodF(){
    // Pointクラスのインスタンスを戻すメソッドを定義
    Point q = new Point();             // Point qをインスタンス化
    q.x = 70;
    q.y = 70;
    return q;                          // 生成したインスタンスqを戻す
  }
}

// Pointクラス
class Point{
  int x;
  int y;
}
