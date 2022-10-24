public class Main {
    public static void main(String[] args) {


        //Задание 1
        System.out.println("Задание 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);


        //Задание 2
        System.out.println("Задание 2");
        dog += 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper += 4;
        System.out.println(paper);


        //Задание 3
        System.out.println("Задание 3");
        var dog1 = 8.0;
        dog1 -= 3.5;
        System.out.println(dog1);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);


        //Задание 4
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);


        //Задание 5
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);


        //Задание 6
        System.out.println("Задание 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес двух бойцов- " + (boxer1Weight + boxer2Weight));
        System.out.println("Разница в весе бойцов- " + (boxer2Weight - boxer1Weight));


        //Задание 7
        System.out.println("Задание 7");
        System.out.println("Разница в весе бойцов (1 способ)- " + (boxer2Weight - boxer1Weight));
        System.out.println("Разница в весе бойцов (2 способ)- " + (boxer2Weight % boxer1Weight));


        //Задание 8
        System.out.println("Задание 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkingHours / hoursPerDay;
        System.out.println("Всего работников в компании – " + totalEmployees + " человек");
        totalEmployees += 94;
        totalWorkingHours = totalEmployees * hoursPerDay;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + totalWorkingHours + " часа работы может быть поделено между сотрудниками");
    }
}