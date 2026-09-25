public class MaskedPhoneNumberFormatter {

    // Method to mask phone number
    public static String maskPhoneNumber(String phone) {
        // Validate length and digits
        if (phone.length() != 10 || !phone.matches("\\d{10}")) {
            return "Invalid phone number";
        }

        // Extract last 4 digits
        String lastFour = phone.substring(6);

        // Build masked version using StringBuilder
        StringBuilder masked = new StringBuilder("XXXXXX");
        masked.append("-").append(lastFour);

        return masked.toString();
    }

    public static void main(String[] args) {
        String phone1 = "9876543210";
        String phone2 = "98765";

        System.out.println(phone1 + " → " + maskPhoneNumber(phone1));
        System.out.println(phone2 + " → " + maskPhoneNumber(phone2));
    }
}
