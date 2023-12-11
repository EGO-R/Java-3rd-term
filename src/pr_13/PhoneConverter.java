package pr_13;
import java.util.Scanner;
public class PhoneConverter {
    private String PhoneNumber;
    public PhoneConverter(String phoneNumber){
        PhoneNumber = phoneNumber;
    }
    public String Converter(){
        if (PhoneNumber.startsWith("+")){
            if (PhoneNumber.length() >= 12){
                int temp = PhoneNumber.length() - 10;
                String countryCode = PhoneNumber.substring(1, temp);
                String areaCode = PhoneNumber.substring(temp, temp + 3);
                String localNumber1 = PhoneNumber.substring(temp + 3, temp + 6);
                String localNumber2 = PhoneNumber.substring(temp + 6);
                return String.format("+%s-%s-%s-%s", countryCode, areaCode, localNumber1, localNumber2);
            }
            else {
                return "Ошибка. Неправильны формат номера";
            }
        }
        else if (PhoneNumber.startsWith("8") && PhoneNumber.length() == 11){
            String localNumber = PhoneNumber.substring(1);
            return String.format("+7-%s-%s-%s", localNumber.substring(0, 3), localNumber.substring(3, 6), localNumber.substring(6));
        }
        else
            return "Ошибка. Неправильны формат номера";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        PhoneConverter convertor = new PhoneConverter(number);
        System.out.print(convertor.Converter());
    }
}
