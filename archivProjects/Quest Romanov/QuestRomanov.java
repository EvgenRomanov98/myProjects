//Квест
import java.util.Scanner;

public class QuestRomanov {
    public static void main(String[] args)
    {
        int q3 = 0, q4 = 0, q5 = 0, q3a=0, q4a = 0, q6 = 0, q6a = 0, q6b = 0, q7 = 0, q8 = 0, q9 = 0, q9a = 0, q12a = 0, q10 = 0, q11 = 0, q12 = 0, q13 = 0, q14 =0, q14a = 0, q15a = 0;
        int q15 = 0, q16 = 0, q17 = 0;

        //Вопросс 1.-------------------------------------------------------------------------------------------------------------------------------------------- 2
        question1 ();
        //Вопрос 2.-------------------------------------------------------------------------------------------------------------------------------------------- 1
        int q2 = question2 ();

        //Вопрос 3.-------------------------------------------------------------------------------------------------------------------------------------------- 3
        if(q2 ==1)
        {
            q3 = question3 ();
        }
        if(q2 >=2 && q2 <=4)
        {
            q3a = question3a();
        }

        //Вопрос 4.-------------------------------------------------------------------------------------------------------------------------------------------- 2
        if(q3 == 3)
        {
            q4 = question4 ();
        }
        switch (q3a)
        {
            case 1:
                question4a();
                return;
            case 2:
                question4aa();
                return;
        }
        if(q3 == 1 || q3 == 2)
        {
            question4b();
            return;
        }
        if(q3 == 4)
        {
            question4bb();
            return;
        }

        //Вопрос 5.-------------------------------------------------------------------------------------------------------------------------------------------- 2
        if(q4 == 2)
        {
            q5 = question5 ();
        }
        if (q4 == 1 || q4 == 4)
        {
            question5a();
            return;
        }
        if (q4 == 3)
        {
            question5aa();
            return;
        }
        //Вопрос 6.-------------------------------------------------------------------------------------------------------------------------------------------- 3
        if(q5 == 2)
        {
           q6 = question6 ();
        }
        if (q5 == 1)
        {
            q6a = question6a ();
        }
        if (q6a == 1 || q5 == 3)
        {
            q6b = question6b();
        }

        //Вопрос 7.-------------------------------------------------------------------------------------------------------------------------------------------- 2
        if (q6b == 1 || q6 == 3)
        {
            q7 = question7 ();
        }
        if (q6b == 2 || q6 == 2 )
        {
            question7a();
            return;
        }

        //Вопрос 8.-------------------------------------------------------------------------------------------------------------------------------------------- 1
        if (q7 == 2)
        {
            q8 = question8 ();
        }
        if (q7 == 1)
        {
            question7a();
            return;
        }
        //Вопрос 9.-------------------------------------------------------------------------------------------------------------------------------------------- 3
        if (q8 == 1 || q8 == 3)
        {
            q9 = question9();
        }
        if (q8 == 2)
        {
            question8a();
            q9a = question9a ();
        }

        //Вопрос 10.-------------------------------------------------------------------------------------------------------------------------------------------- 2
        if(q9 == 1 || q9 == 3 || q9a == 1 || q9a == 3)
        {
           q10 = question10 ();
        }
        if (q9 == 2 || q9a == 2)
        {
            q12a = question12a();
        }
        //Вопрос 11.-------------------------------------------------------------------------------------------------------------------------------------------- 2
        if (q10 == 1)
        {
            question7a ();
            return;
        }
        if (q10 == 2 || q10 == 3)
        {
            q11 = question11();
        }
        //Вопрос 12.-------------------------------------------------------------------------------------------------------------------------------------------- 1
        if (q11 == 2 || q11 == 3)
        {
            q12 = question12();
        }
        if (q11 == 1)
        {
            question7a ();
            return;
        }
        //Вопрос 13.-------------------------------------------------------------------------------------------------------------------------------------------- 1
        if (q12 == 1 || q12a == 1)
        {
            q13 = question13 ();
        }
        if (q12 == 2 || q12a == 2)
        {
            question12b();
            return;
        }
        //Вопрос 14.-------------------------------------------------------------------------------------------------------------------------------------------- 2
        if (q13 == 1)
        {
           q14 = question14 ();
        }
        if (q13 == 2)
        {
            question14a ();
            q15a = question15a();
        }
        //Вопрос 15.-------------------------------------------------------------------------------------------------------------------------------------------- 2
        if (q14 == 2)
        {
            q15 = question15 ();
        }
        if (q14 == 1 || q14 == 3)
        {
            question15b();
            return;
        }
        //Вопрос 16.-------------------------------------------------------------------------------------------------------------------------------------------- 1
        if (q15 == 2 || q15a == 2)
        {
            q16 = question16();
        }
        if (q15 == 1 || q15 == 3 || q15a == 1 || q15a == 3)
        {
            question16a();
            return;
        }
        //Вопрос 17.-------------------------------------------------------------------------------------------------------------------------------------------- 2
        if(q16 == 1)
        {
            q17 = question17 ();
        }
        if (q16 == 2 || q16 == 3)
        {
            question16a();
            return;
        }
        //Вопрос 18.-------------------------------------------------------------------------------------------------------------------------------------------- 1
        if (q17 == 1 || q17 == 3)
        {
            question18a();
            return;
        }
        else
        {
            System.out.println("Герой швырнул нож в змею, попав её в голову, ненадолго оглушив её. Он побежал что есть мочи." +
                    " Вскоре виднелись селения, он вышел на открытое пространство, нашел людей и был спасен!");
        }
    }

    public static int otv1 ()
    {
        Scanner in1 = new Scanner(System.in);
        int otv1 = in1.nextInt();
        switch (otv1) {
            case 1:
                System.out.println("упс, похоже что это слишким быстро. Средняя скорость ходьбы составляет 5 км/час.(учтите так же, что это лес и движение будет немного замедленно)");
                break;
            case 2:
                System.out.println("Верно, молодец!)");
                break;
            case 3:
                System.out.println("упс, похоже что это слишким долго. Средняя скорость ходьбы составляет 5 км/час.(учтите так же, что это лес и движение будет немного замедленно)");
                break;
            case 4:
                System.out.println("упс, похоже что это слишким долго. Средняя скорость ходьбы составляет 5 км/час.(учтите так же, что это лес и движение будет немного замедленно)");
                break;
            default:
                System.out.println("Вы ввели неверный ответ, повторите!");
        }
        return otv1;
    }

    public static int otv ()
    {
        Scanner in1 = new Scanner(System.in);
        int otv1 = in1.nextInt();
        switch (otv1) {
            case 1:
                System.out.println("Хорошо, продолжим!");
                break;
            case 2:
                System.out.println("Хорошо, продолжим!");
                break;
            case 3:
                System.out.println("Хорошо, продолжим!");
                break;
            case 4:
                System.out.println("Хорошо, продолжим!");
                break;
            default:
                System.out.println("Вы ввели неверный ответ, повторите!");
        }
        return otv1;
    }

    public static int otv3 ()
    {
        Scanner in1 = new Scanner(System.in);
        int otv1 = in1.nextInt();
        switch (otv1) {
            case 1:
                System.out.println("Хорошо, продолжим!");
                break;
            case 2:
                System.out.println("Хорошо, продолжим!");
                break;
            case 3:
                System.out.println("Хорошо, продолжим!");
                break;
            default:
                System.out.println("Вы ввели неверный ответ, повторите!");
        }
        return otv1;
    }

    public static int otv2 ()
    {
        Scanner in1 = new Scanner(System.in);
        int otv1 = in1.nextInt();
        switch (otv1) {
            case 1:
                System.out.println("Хорошо, продолжим!");
                break;
            case 2:
                System.out.println("Хорошо, продолжим!");
                break;
            default:
                System.out.println("Вы ввели неверный ответ, повторите!");
        }
        return otv1;
    }

    public static int otv4 ()
    {
        Scanner in1 = new Scanner(System.in);
        int otv1 = in1.nextInt();
        switch (otv1) {
            case 1:
                System.out.println("Хорошо, продолжим!");
                break;
            default:
                System.out.println("Вы ввели неверный ответ, повторите!");
        }
        return otv1;
    }

    public static void question1 ()
    {
        System.out.println("Итак, перед вами стоит нелегкая задача, помочь Питеру найти правильный выход из гремучего тропического леса, который кишит неожидонностями " +
                "и ловушками! При нем имеется лишь клинок");
        System.out.println("После авиакатастрофы частного самолета Питер на парашуте спустились куда-то в лес. Он подвелся, осмотрелся. Сейчас полдень. Герой держал курс на юг" +
                "и пролетел большую часть пути. Пока он спускался на парашуте, то прикинул, что ему олсталось пройти примерно 40 км.  За какое примерное " +
                "время Питер сможете приодалеть эту дистанцию? ");

        System.out.println("1 - 5 часов");
        System.out.println("2 - 10-15 часов");
        System.out.println("3 - 30 часов");
        System.out.println("4 - 40 часов");

        for (; ; ) {
            if (otv1() == 2) break;
        }

    }

    public static int question2 ()
    {

        System.out.println("Куда Питеру следует лучше двигаться?");

        System.out.println("1 - На юг");
        System.out.println("2 - На север");
        System.out.println("3 - На запад");
        System.out.println("4 - На восток");
        int n = 0;
        for (;;)
        {
            n = otv();
            if(n > 0 && n < 5) break;
        }
        return n;
    }

    public static int question3 ()
    {
        System.out.println("Питер начал двигаться, но вдруг встречает на своем пути зверя, но он точно не разбирался в них, да и не мог разглядеть его... что ему лучше всего делать?");

        System.out.println("1 - подобраться ближе к зверю, что-бы понять, что это");
        System.out.println("2 - резко напасть на зверя, так как у него есть клинок");
        System.out.println("3 - попытаться забраться на дерево и наблюдать за ним");
        System.out.println("4 - упасть на землю и притвориться мертвым");
        int n = 0;
        for (;;)
        {
            n = otv();
            if(n > 0 && n < 5) break;
        }

        return n;

    }
    //**************************************************
    public static int question3a ()
    {
        System.out.println("Питер начал двигаться в указанном направлении. Вокруг стояла тишина. за все время он шел," +
                " встречал различных животных, которые не составляли опассности. Смеркалось. Что делать Питеру?");

        System.out.println("1 - Продолжить путь");
        System.out.println("2 - Осстаться на ночлег");
        int n = 0;
        for (;;)
        {
            n = otv2();
            if(n > 0 && n < 3) break;
        }
        return n;
    }

    public static int question4 ()
    {
        System.out.println("Питер взобрался на дерево, начал наблюдать. К его счастью это был зверь не умеющий лазить по деревьям. Зверь все ближе подбирался к его дереву" +
                "что делать Питеру?");

        System.out.println("1 - поиграться с животным, когда оно подойдет ближе, покидать в него кору, подразнить его");
        System.out.println("2 - оставаться на дереве и вести себя как можно тише");
        System.out.println("3 - спрыгнуть и убежать");
        System.out.println("4 - метнуть в животного нож");
        int n = 0;
        for (;;)
        {
            n = otv();
            if(n > 0 && n < 5) break;
        }
        return n;
    }
    //**************************************************1
    public static void question4a ()
    {
        System.out.println("Питер продолжил путь. в темных тропиках лучше не гулять ночью, на Питера напал хищник и к сожалению питер не смог от него защититься. Начните квест занонво");
    }
    //**************************************************2
    public static void question4aa ()
    {
        System.out.println("Питер построил шалаш, переночивал в лесу. На утро он продолжил движение," +
                " но к сожалению он попросту заблудился, так как изначально выбрал не верный путь. Начните квест занонво");
    }
    //**************************************************1,2
    public static void question4b ()
    {
        System.out.println("Из-за своей неосторожности и неопыдности Питер был скушан заживо. Начните квест заново!");
    }
    //**************************************************4
    public static void question4bb ()
    {
        System.out.println("Питер лег на землю и притаился. Но ему не повезло -- это животное было не одно. Его быстро отыскали по запаху и скушали. Начните квест заново!");
    }

    public static int question5 ()
    {

        System.out.println("Питер остался на дереве и вскоре он увидел, что этот зверь не один, их стая. Он оставался сидеть на дереве. Прошло около 2 часов с начала приключения," +
                "солнце уже ушло с зенита, поэтому точно двигаться на юг уже не получится. Животные скрылись, их не слышно, нужно продолжать двигаться. " +
                "Питеру очень хотелось есть и пить. Что же делать дальше");

        System.out.println("1 - искать еду и воду, обыскать местность");
        System.out.println("2 - двигаться вперед, пытаясь не сбиться с курса");
        System.out.println("3 - непонятно, успеет ли он до вечера выйти, может обустроить ночлег?");
        int n = 0;
        for (;;)
        {
            n = otv3();
            if(n > 0 && n < 4) break;
        }
        return n;
    }
    //**************************************************1,4
    public static void question5a ()
    {
        System.out.println("После того, как Питер дал о себе знать, жиотные попросту начали за ним следить." +
                " Он попытался от них убежать, когда как он думал, они ушли, но животные следили за ним, догнали и скушали! Начните квест заново");
    }
    //**************************************************3
    public static void question5aa ()
    {
        System.out.println("Ну тут все просто. Животные же бегают быстрее людей. К тому же, это животное было не одно. Питер не выжил. Начните квест заново.");
    }

    public static int question6 ()
    {

        System.out.println("Питер продолжил движение несмотря на жажду, надеясь встретить по пути хотя бы что-то. " +
                "Внезапно солнце перестало светить, послышались раскаты грома. Что делать Питеру? ");

        System.out.println("1 - двигаться, несмотря ни на что");
        System.out.println("2 - быстрее найти убежище");
        System.out.println("3 - Соорудить самый простой шалаш, что бы хоть как-то укрыться от дождя");
        int n = 0;
        for (;;)
        {
            n = otv3();
            if(n > 0 && n < 4) break;
        }
        return n;
    }
    //**************************************************1
    public static int question6a () {
        System.out.println("После неудачных поисков, он едва ли не сбился с курса. после он все равно продолжил движение на юг. Внезапно послышались раскаты грома, что делать Питеру?");

        System.out.println("1 - Соорудить самый простой шалаш, что бы хоть как-то укрыться от дождя");
        int n = 0;
        for (;;)
        {
            n = otv4();
            if(n > 0 && n < 2) break;
        }
        return n;
    }
    //**************************************************3
    public static int question6b () {
        System.out.println("Питер построил шалаш." +
                "Он прилег, что бы отдохнуть. Внезапно послышались раскаты грома, что делать Питеру?");

        System.out.println("1 - Оставаться в шалаше");
        System.out.println("2 - БЕЖАТЬ!");
        int n = 0;
        for (;;)
        {
            n = otv2();
            if(n > 0 && n < 3) break;
        }
        return n;
    }



    public static int question7 ()
    {

        System.out.println("Так как Питер не смыслит в строительстве, да и в виживании тоже, он не смог за короткий промежуток построить нормальный шалаш. Начался сильный дождь," +
                "поднялся сильный ветер и его шалаш просто снесло. Что делать дальше?");

        System.out.println("1 - пытяться найти убежище");
        System.out.println("2 - оторвать большой лист и напиться воды");
        int n = 0;
        for (;;)
        {
            n = otv2();
            if(n > 0 && n < 3) break;
        }
        return n;
    }
    //**************************************************
    public static void question7a ()
    {
        System.out.println("Из-за того, что Питер начал судорожно бегать по лесу, он заблудился. Он попал в болото и просто утонул там. " +
                "Начните квест заново");
    }
    public static int question8 ()
    {
        System.out.println("Питеру удалось уталить жажду, еще немного и дождь прекратился. Начинает выглядывать солнце. Он промок до нитки. Что  же предпримет Питер?");

        System.out.println("1 - выкрутить всю одежду и продолжать движение");
        System.out.println("2 - развесить одежду и высушить ее");
        System.out.println("3 - не тратить время на сушку одежды, а иди вперед");
        int n = 0;
        for (;;)
        {
            n = otv3();
            if(n > 0 && n < 4) break;
        }
        return n;
    }
    //**************************************************
    public static void question8a ()
    {
        System.out.println("Питер высушил одежду и продолжил путь");
    }

    public static int question9 ()
    {
        System.out.println("Прошло примерно 5 часов после начала, он шел, одежда почти высохла. Тут на пути у Питера встречаются незнакомые ягоды, " +
                "крассные такие, пахнут, напоминают землянику. " +
                "Питер очень хочет есть, ему кажеться, что если он не съест эти якоды, то он помрет от голоду. Что делать?");

        System.out.println("1 - поесть");
        System.out.println("2 - не трогать их");
        System.out.println("3 - попробовать одну, если хуже не станет, то наестся вдоволь");
        int n = 0;
        for (;;)
        {
            n = otv3();
            if(n > 0 && n < 4) break;
        }
        return n;
    }
    //**************************************************
    public static int question9a ()
    {
        System.out.println("Прошло примерно 5 часов после начала, он шел. Тут на пути у Питера встречаются незнакомые ягоды, " +
                "крассные такие, пахнут, напоминают землянику. " +
                "Питер очень хочет есть, ему кажеться, что если он не съест эти якоды, то он помрет от голоду. Что делать?");

        System.out.println("1 - поесть");
        System.out.println("2 - не трогать их");
        System.out.println("3 - попробовать одну, если хуже не станет, то наестся вдоволь");
        int n = 0;
        for (;;)
        {
            n = otv3();
            if(n > 0 && n < 4) break;
        }
        return n;
    }
    public static int question10 ()
    {
        System.out.println("Питер попробовал, ему хуже не стало, он их наелся. Он спокойно продолжил путь, пытаясь не сбиться с курса. " +
                "вдруг он видит, как черви, огромные черви выползают из земли, начинают приближаться к Питеру. Что же делать?");

        System.out.println("1 - БЕЖАТЬ!");
        System.out.println("2 - упасть на землю и лежать");
        System.out.println("3 - достать кинжал и отбиваться");
        int n = 0;
        for (;;)
        {
            n = otv3();
            if(n > 0 && n < 4) break;
        }
        return n;
    }

    public static int question11 ()
    {

        System.out.println("Питер упал на землю, начал сильно дрожать, черви подползали ближе. Он начал кричать от боли, они кусали его за ноги, рукки, очень больно. Что делать?");

        System.out.println("1 - БЕЖАТЬ, ПОКА НЕ ПОЗДНО!");
        System.out.println("2 - что-то странное, какие еще хищные черви?");
        System.out.println("3 - достать кинжал и отбиваться");
        int n = 0;
        for (;;)
        {
            n = otv3();
            if(n > 0 && n < 4) break;
        }
        return n;
    }

    public static int question12 ()
    {
        System.out.println("Тут герой понимает, что это галюцинации от тех якод, он лежит, притаивштсь, терпит боль, понимая, что это все нериально. " +
                "Прошло некоторо время, он открывает глаза, похоже, что он потерял сознание. Дикая слабость одолела его." +
                " Прошло около 8  часов от авиакатастрофы. Солнце уже на закате. Что Питеру делать дальше?");

        System.out.println("1 - Устроить ночлег, так как нужно отдохнуть, набраться сил, сегодня он уже не успеет добраться до цели");
        System.out.println("2 - продолжить путь невзирая на усталость");
        int n = 0;
        for (;;)
        {
            n = otv2();
            if(n > 0 && n < 3) break;
        }
        return n;
    }
    //**************************************************
    public static int question12a () {
        System.out.println("Дикая слабость одолела его." +
                " Прошло около 8  часов от авиакатастрофы. Солнце уже на закате. Что Питеру делать дальше?");

        System.out.println("1 - Устроить ночлег, так как нужно отдохнуть, набраться сил, сегодня он уже не успеет добраться до цели");
        System.out.println("2 - Продолжить путь, невзирая на усталость");
        int n = 0;
        for (; ; ) {
            n = otv2();
            if (n > 0 && n < 3) break;
        }
        return n;
    }
    //**************************************************
    public static void question12b () {
        System.out.println("Усталость взяла свое. ночью, пока оне шел он сбился с курса, ему стало хуже. Питер потерял сознание и больше не просснулся. Начните квест заново!");
    }


    public static int question13 ()
    {
        System.out.println("Он соорудил шалаш, простилил на пол веток и листьев, попытался сделать шалаш как можно более закрытым, что бы насекомые не смогли до него добраться." +
                "Залез туда и уснул. Утро, он проснулся. Он полон сил, нужно продолжать движение." +
                "Он шел около 2 часов, вдруг он попал в брод по колена. Питер думает, следует ли продолжать движение? ");

        System.out.println("1 - Продолжить, так как нельзя терять время на поиски другого пути, еще и заблудиться можно");
        System.out.println("2 - Поискать другой путь");
        int n = 0;
        for (;;)
        {
            n = otv2();
            if(n > 0 && n < 3) break;
        }
        return n;
    }

    public static int question14 ()
    {
        System.out.println("Питер следует дальше, но все же попадает в болото. Что делать?");

        System.out.println("1 - Барахтаться и пытаться выбраться");
        System.out.println("2 - замереть, росставить руки в стороны и искать ветки, что бы зацепиться");
        System.out.println("3 - Барахтаться и искать зацепы, ветки");
        int n = 0;
        for (;;)
        {
            n = otv3();
            if(n > 0 && n < 4) break;
        }
        return n;
    }
    //**************************************************
    public static void question14a ()
    {
        System.out.println("Питер пошел искать обход болота. Она потратил больше часа, но его старания небыли напрассными, он обошел болото. ");
    }

    public static int question15 ()
    {
        System.out.println("Питер замер, нашел ветку, взялся за нее крепко и ждал, пока остановиться тонуть. " +
                "Остановился, начал тянуться за ветку и неспеша выбрался. Он весь в грязи, но нужно двигаться дальше. Тропики заметно начали рядеть, это означает, " +
                "что скоро он выйдет. Тут внезапно он видит людей. Что делать?");

        System.out.println("1 - привлеч их внимание");
        System.out.println("2 - спрятаться");
        System.out.println("3 - Напасть с кинжалом");
        int n = 0;
        for (;;)
        {
            n = otv3();
            if(n > 0 && n < 4) break;
        }
        return n;
    }
    //**************************************************
    public static int question15a ()
    {
        System.out.println("Тропики заметно начали рядеть, это означает, " +
                "что скоро он выйдет. Тут внезапно он видит людей. Что делать?");

        System.out.println("1 - привлеч их внимание");
        System.out.println("2 - спрятаться");
        System.out.println("3 - Напасть с кинжалом");
        int n = 0;
        for (;;)
        {
            n = otv3();
            if(n > 0 && n < 4) break;
        }
        return n;
    }
    //**************************************************
    public static void question15b ()
    {
        System.out.println("Из-за барахтанья Питер погруз в болото и захлебнулся, мучительная смерть, не так ли? Начните квест заново!");
    }

    public static int question16 ()
    {
        System.out.println("Герой спрятался, наблюдая за людьми. Это оказались какие то попуасы, они вооружены. что делать?");

        System.out.println("1 - Дождаться, пока они уйдут");
        System.out.println("2 - Привлечь внимание и попросить о помощи");
        System.out.println("3 - убить их кинжалом");
        int n = 0;
        for (;;)
        {
            n = otv3();
            if(n > 0 && n < 4) break;
        }
        return n;
    }
    public static void question16a ()
    {
        System.out.println("Папуасы по какой-то непонятной причине стали стрелять по Питеру. Он почти не чувствовал боли, когда пуля попала ему в голову. Начните квест заново!");
    }

    public static int question17 ()
    {
        System.out.println("Питер дождался, пока они уйдут, вылез, но тут его уже ждала хищная замея. Она нападает на героя. Что он предпримет?");

        System.out.println("1 - Зарубать её кинжалом");
        System.out.println("2 - Кинуть в нее кинжалом и попытаться убежать");
        System.out.println("3 - Взять за голову и выбросить");
        int n = 0;
        for (;;)
        {
            n = otv3();
            if(n > 0 && n < 4) break;
        }
        return n;
    }
    public static void question18a ()
    {
        System.out.println("К сожалению, Питер не настолько ловок, что бы сражаться с ядовитой и агрессивной змеей. Она его укусила и от яда Питер потерял сознание и больше не очнулся." +
                "Начните квест заново! ");
    }
}
