public class Main {
    public static void main(String[] args) {
       //задание 1
        System.out.println("Задание 1");
        String firstName ="Семён ";
        String middleName ="Семёнович ";
        String lastName ="Иванов ";
        String fullName= lastName+firstName+middleName;
        fullName = fullName.replace('ё','e');
        System.out.println("ФИО сотрудника - "+fullName);
        String upperFullName=fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета- "+upperFullName);


    }
}