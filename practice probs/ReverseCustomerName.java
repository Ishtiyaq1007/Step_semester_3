public class ReverseCustomerName {

    // Method to reverse the customer name
    public static String reverseCustomerName(String customerName) {
        StringBuilder reversed = new StringBuilder(customerName);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String name = "Sunil";
        String reversedName = reverseCustomerName(name);

        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reversedName);
    }
}
