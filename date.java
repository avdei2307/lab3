import java.util.Scanner;

public class date {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите существующую дату в формате: dd/mm/yyyy");
        String date = console.nextLine();
        if (!date.matches("^\\d{2}[1-31]/\\d{2}[1-12]/\\d{4}$")) {
            System.out.println("неверный формат");
        } else {
            String [] a = date.split("/");
            String str_year = a[a.length-1];
            int year = Integer.parseInt(str_year);
            if (year >= 1990 && year <= 9999){
                System.out.println("введена дата в верном формате");

            }
            else{
                System.out.println("неверный год");
            }

        }







    }

}
