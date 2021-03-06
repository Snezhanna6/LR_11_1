package Main;

//Компилятор делфи, наследник класса компилятор
public class DelphiCompilator extends Compilator{

    //Реализация абстрактных методов

    @Override
    public void lexicalAnalysis(){
        System.out.println("$ Проведен лексический анализ $");
    }


    @Override
    public void syntacticAnalysis(){
        System.out.println("$ Проведен синтаксический анализ $");
    }


    @Override
    public void optimization(){
        System.out.println("$ Код оптимизирован $");
    }

    @Override
    public void codeGeneration(){
        System.out.println("$ Генерация кода выполнена $");
    }
}
