package pr_13.T3;

public class Main {
    public static void main(String[] args) {
        String addressString1 = "Russia, Moscow, Moscow, 16-aya Parkovaya, 26, 3, 148";
        String addressString2 = "Russia; Moscow; Moscow; Golyanovo; 78; A; 223";
        String addressString3 = "Russia";
        Address address1 = Address.parseComma(addressString1);
        Address address2 = Address.parseAll(addressString2);
        Address address3 = Address.parseAll(addressString3);
        if (address1 != null) System.out.print(address1);
        if (address2 != null)System.out.print(address2);
        if (address3 != null)System.out.print(address3);
    }
}
