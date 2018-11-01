// 修飾子とアクセス制御 / カプセル化 / アクセッサ

/*
クラスやフィールド、メソッドの性質を指定するもの。
アクセスを制御するためのものは「アクセス修飾子」と呼ぶ。

＊アクセス修飾子
public    -> 他のどのクラスからもアクセス出来る    *privateの反対 1ファイルに1つ
protected -> 子クラス、または同じパッケージ内のクラスからしかアクセス出来ない
なし      -> 同一パッケージのクラスからしかアクセス出来ない
private   -> 同じクラス内からしかアクセス出来ない  *publicの反対


＊カプセル化
private修飾子を使用すると、他のクラスからアクセス出来ない「不可視」になる。
他のクラスからインスタンス変数を隠すことを「カプセル化」と呼ぶ。
不可視化 = カプセル化
外部からの書き換えを防止し、見るだけにするために「カプセル化」する。


＊アクセッサ
privateでカプセル化された変数などに、アクセスするための方法。
publicメソッドを経由してprivate変数を見る。
その際は、private変数を持つクラスは「public」でなくてはいけない。
Javaでは、1ファイルに「public」は1つしか付けられない。


＊「final」
以降の変更を禁止する修飾子
finalクラス      -> 子クラスを作れない
finalメソッド    -> 子クラスでオーバーライド出来ない
finalフィールド  -> 値の変更が出来ない(定数)。可読性が高くなり、保守性が上がる。


＊「static」
クラス変数、クラスメソッドを宣言するときに使用する。
*/


public class Test15{
  public static void main(String[] args) {
    Person p = new Person();              // Personインスタンスを設定
    p.setName("tarou");                   // setNameメソッドで名前を設定
    p.setAge(20);                         // setAgeメソッドで名前を設定
    System.out.println(p.getName());      // getNameメソッドで名前を参照
    System.out.println(p.getAge());       // getAgeメソッドで名前を参照

    Robot robo = new Robot("ロボ");       // コンストラクタでインスタンス化
    System.out.println(robo.getName());   // getNameメソッドで名前を参照
  }
}


class Person {
  private String name;                // privateフィールド
  private int age;

  public void setName(String name){   // 名前を設定するメソッド
    this.name = name;
  }

  public void setAge(int age){        // 年齢を設定するメソッド
    if (age < 0) {
      System.out.println("値が正しくありません(マイナスの値です)");
    }else{
      this.age = age;
    }
  }

  public String getName(){            // 名前を参照するメソッド
    return this.name;
  }

  public int getAge(){                // 年齢を参照するメソッド
    return this.age;
  }
}


class Robot {
  private String name;

  Robot(String s){                    // コンストラクタで代入
    this.name = s;
  }

  public String getName(){            // 名前を参照するメソッド
    return this.name;
  }
}
