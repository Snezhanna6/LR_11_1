package Main;

import java.io.File;

//абстрактный класс "компилятор"
public abstract class Compilator {

    private File file;
    /**
     * Пуск компиляции
     */
    public void start(){
        System.out.println("Начата компиляция " + file.getName() + " ......");
        lexicalAnalysis();
        syntacticAnalysis();
        optimization();
        codeGeneration();
        System.out.println("КОМПИЛЯЦИЯ ПРОШЛА УСПЕШНО!");
    }

    /**
     * @param pathFile
     */
    public void setFile(String pathFile){
        file = new File(pathFile);
    }

    /**
     * Абстрактный метод лексического анализа
     */
    public abstract void lexicalAnalysis();

    /**
     * Абстрактный метод синтаксического анализа
     */
    public abstract void syntacticAnalysis();

    /**
     * Абстрактный метод оптимизации
     */
    public abstract void optimization();

    /**
     * Абстрактный метод Генерации кода
     */
    public abstract void codeGeneration();



}
