package work01;

public class Test5 {

	public static void main(String[] args) {
		
		record Person(String name, int age) {}
		
        // Person型のrecordインスタンスを作成
        Person person1 = new Person("Alice", 30);

        // person1の参照を別の変数に代入
        Person person2 = person1;

        // person1とperson2は同じオブジェクトを参照している
        System.out.println(person1); // Person[name=Alice, age=30]
        System.out.println(person2); // Person[name=Alice, age=30]
        
        person2 = new Person("aaa", 5);
        
        System.out.println(person1); // Person[name=Alice, age=30]
        System.out.println(person2); // Person[name=Alice, age=30]
        
        // 参照の比較
        System.out.println(person1 == person2); // true



	}

}
