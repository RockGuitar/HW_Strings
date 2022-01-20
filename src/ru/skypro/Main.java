package ru.skypro;

public class Main {

    public static void main ( String[] args ) {
//        Задача 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

//        Задача 2
//        Тут я использовал два варианта выполнения, через переменную и напрямую с fullName
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

//        Задача 3
//        Также использовал два варианта выполнения
        String fullNameReplace = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullNameReplace);
        System.out.println("Данные ФИО сотрудника для административного отдела — "
                + fullName.replace(" ", "; "));

//        Задача 4
//        Также использовал два варианта выполнения
        fullName = "Иванов Семён Семёнович";
        String fullNameChanged = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё", "е"));
        System.out.println("Данные ФИО сотрудника — " + fullNameChanged);
    }
}
