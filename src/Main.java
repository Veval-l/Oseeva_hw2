public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4.0;
        System.out.println(dog);
        cat = cat + 4.0;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        System.out.println("Вес первого боксёра" + firstBoxerWeight);
        var secondBoxerWeight = 82.7;
        System.out.println("Вес второго боксёра" + secondBoxerWeight);
        var boxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух боксеров " + boxersWeight + " кг");
        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница веса между двумя боксерами " + differenceWeight + " кг");
        var diffWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница веса между двумя боксерами " + diffWeight + " кг");

        var allTime = 640;
        System.out.println("Всего часов работы " + allTime);
        var oneEmployeeTime = 8;
        System.out.println("Каждый сотрудник отрабатывает " + oneEmployeeTime + " часов");
        var allEmployee = allTime / oneEmployeeTime;
        System.out.println("Если в компании работает " + allEmployee + " человек, то всего " + allTime + " часов работы может быть поделено между сотрудниками");

    }
}