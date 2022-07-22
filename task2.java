import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        System.out.println("Введите имя");
        Scanner s = new Scanner(System.in);
        String name1;
        String name2 = "Вячеслав";
        name1 = s.nextLine();
        if (name1.equals(name2)){
            System.out.println("Привет, " + name2);
        } else{
            System.out.println("Нет такого имени");
        }

    }
}
