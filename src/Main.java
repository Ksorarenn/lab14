import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        String text = in.nextLine();
        String regex = "\\b(1?\\d?\\d|2[0-4]\\d|25[0-5])(\\.(1?\\d?\\d|2[0-4]\\d|25[0-5])){3}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Найденный ip-адрес: ");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
