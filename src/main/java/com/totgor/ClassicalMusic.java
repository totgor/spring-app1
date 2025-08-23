package com.totgor;

public class ClassicalMusic implements Music {

    //Ограничили создание объекта ClassicalMusic через оператор new - конструктьор тупо доступен, только внутри класса 
    ClassicalMusic() {} 

    //Создадим статический метод для создания объекта ClassicalMusic, 
    //Если метод будет не статическим, его тупо нельзя будет вызвать до создания экземпляра объекта. А значит и создать объект.
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }


    public void initMethod() {
        System.out.println("Doing initMethod() from class ClassicalMusic");
    }

    public void destroyMethod() {
        System.out.println("Doing destroyMethod() from class ClassicalMusic()");
    }

    @Override
    public String getSong() {
        return "Классическая композиция 1";
    }   
}
