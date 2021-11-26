package Main;


public class Main {

    public static void main(String[] args) {

        //Выбираем язык и создаем компилятор
        Сreature creature = new Сreature();
        Compilator myCompilator = creature.createCompilator();

        //Задаем файл компилятору
        InitFile initFile = new InitFile();
        initFile.entryFile(myCompilator);

        //Компиляция
        Compilation compilation = new Compilation();
        compilation.go(myCompilator);


    }
}
