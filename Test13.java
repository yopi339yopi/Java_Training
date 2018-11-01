// 継承 / 代入の可否 / オーバーライド / 「super」

/*
＊継承
すでにあるクラス(親クラス)の機能を新しいクラス(子クラス)が引き継ぐこと。
親クラスの内容を再度書くことなく、機能の追加・拡張が容易になる。
親クラスの内容が変更されると、子クラスにも適用される。
「extends」によって継承させる

＊様々な呼び方
「親クラス」は「スーパークラス」とも呼ばれる
「子クラス」は「サブクラス」とも呼ばれる
子クラスは、親クラスを「継承」したクラス
子クラスは、親クラスから「派生」したクラス

基本構文
class A {
  クラスAの内容
}

class B extends A{
  追加する内容
}


＊代入の可否
親クラスの型の変数に、子クラスのインスタンスを「代入できる」。
子クラスの型の変数に、親クラスのインスタンスを「代入できない」。

今までの構文
親クラス 変数名 = new 親クラス();
子クラス 変数名 = new 子クラス();

代入の構文
親クラス 変数名 = new 親クラス();


＊オーバーライド
親クラスにあるメソッドを、同じ名前・同じ引数で子クラスで上書きすること。
オーバーライドの場合、子クラスが優先される。


＊「super」
親クラスのメソッドやコンストラクタを、子クラスで実行するときには「super」をつける。

メソッド       -> super.メソッド名(引数);
コンストラクタ -> super(引数);
*/

public class Test13{
  public static void main(String[] args) {
    //Pet pt = new Pet("太郎");
    Bird pt = new Bird("二郎");
    // Pet pt = new Bird("三郎");   // 子クラスのインスタンスを代入
    pt.printInfo();
    pt.run();
    pt.sleep();
    pt.eat();
    pt.fly();
    pt.printInfo();
  }
}

class Pet {
  String name;
  int HP;
  int maxHP;

  Pet(String name){       // コンストラクタ
    this.name = name;
    this.HP = 100;
    this.maxHP = 1000;
  }

  void printInfo(){       // インスタンスメソッド
    System.out.println("名前：" + this.name);
    System.out.println("体力：" + this.HP);
    System.out.println("最大体力" + this.maxHP);
  }

  void run(){             // インスタンスメソッド
    if (this.HP < 10){
      System.out.println(name + "は体力が足りなくて走れません");
    }else {
      System.out.println(name + "は走りました。体力：-10 最大体力：+10");
      this.HP -= 10;
      this.maxHP += 10;
    }
  }

  void sleep(){           // インスタンスメソッド
    System.out.println(name + "は眠りました。体力完全回復");
    this.HP = this.maxHP;
  }

  void eat(){             // インスタンスメソッド
    System.out.println(name + "は食事をしました。体力回復：+30");
    this.HP += 30;
    if (this.HP > this.maxHP){
      this.HP = this.maxHP;
    }
  }
}


class Bird extends Pet {             // Petクラスを継承したBirdクラス
  Bird(String name) { super(name); } //コンストラクタの生成

  void run(){                        // runメソッドをオーバーライド
    System.out.println(name + "は鳥なので走れません");
  }

  void fly(){                        // flyメソッドを追加
    System.out.println("I'm Fly");
  }
}
