package Main;

import java.util.Scanner;

/**
 * Класс создания компилятора
 */
class Сreature {

    public Compilator createCompilator(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер одного из предложенных " +
                "языков программирования:\n" +
                "1.Java\n" +
                "2.Ruby\n" +
                "3.Delphi");

        System.out.print("Ввод: ");
        String choice = in.nextLine();

        switch (choice){
            case "1":
                System.out.println("Выбран язык Джава");
                return new JavaCompilator();
            case "2":
                System.out.println("Выбран язык Руби");
                return new RubyCompilator();
            case "3":
                System.out.println("Выбран язык Делфи");
                return new DelphiCompilator();
            default:
                return null;
        }
    }

}

class InitFile{

    public void entryFile(Compilator compilator){
        System.out.print("Ввод пути к файлу: ");
        Scanner in = new Scanner(System.in);
        compilator.setFile(in.nextLine());
    }

}

class Compilation{

    public void go(Compilator compilator){
        compilator.start();
    }

}
