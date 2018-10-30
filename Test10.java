// メソッド基礎 その３ インスタンスメソッド・コンストラクタ

/*
クラスの基本構造

class クラス名{
  フィールドの宣言....情報
  String 〇〇
  int 〇〇

  メソッドの宣言......機能
  void メソッド名(){
    命令文
  }
}

class内のメソッドを「インスタンスメソッド」と呼ぶ。
「static」が付かないメソッド
「this」が使用でき、自分自身を参照できる


コンストラクタ
インスタンス化(new)をした時に自動で実行される特別なメソッド
クラス内に受け取る為のメソッドを書く
クラス名と同じでなければいけない
戻り値は設定出来ない

基本構文

クラス名(型 変数){
  this.変数 = 変数;
}

コンストラクタを使う時は、<No.2>で書き方を統一させる必要がある。
<No.1>通常インスタンス化
ss[0] = new Student(); ss[0].name = "Taro"; ss[0].age = 19;

<No.2>コンストラクタ
ss[0] = new Student("Taro", 30);

*/

public class Test10{
  public static void main(String[] args) {
    Student[] ss = new Student[3];          // 配列を作成
    //ss[0] = new Student(); ss[0].name = "Taro"; ss[0].age = 19;
    ss[0] = new Student("Taro", 30);        // 配列の要素を作成し、代入
    //ss[1] = new Student(); ss[1].name = "Hanako"; ss[1].age = 20;
    ss[1] = new Student("Hanako", 22);
    //ss[2] = new Student(); ss[2].name = "Jiro"; ss[2].age = 18;
    ss[2] = new Student("Jiro", 18);

    ss[0].printInfo();                      // インスタンスメソッドの呼び出し
    ss[1].printInfo();
    ss[2].printInfo();


    Rectangle r = new Rectangle(0.5, 3.13); // インスタンス化と代入を同時に行う
    System.out.println("rの幅は " + r.width + " rの高さは " +
                        r.height + " です。");
  }
}

class Student {
  String name;                      // 名前
  int age;                          // 年齢

  Student(String name, int age){    // コンストラクタ
    this.name = name;
    this.age = age;
  }

  void printInfo(){                 // thisを使って名前と歳を出力
    System.out.println("私の名前は " + this.name + " です。" +
                      this.age + "歳です。");
  }
}

class Rectangle {
  double width;
  double height;

  Rectangle(double width, double height){ // コンストラクタ
    this.width = width;
    this.height = height;
  }
}
