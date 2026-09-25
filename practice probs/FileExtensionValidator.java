public class FileExtensionValidator {

    // Method to validate file extension
    public static String validateFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == filename.length() - 1) {
            return "Rejected — invalid file type";
        }

        String extension = filename.substring(dotIndex + 1);

        if (extension.equalsIgnoreCase("pdf") ||
            extension.equalsIgnoreCase("docx") ||
            extension.equalsIgnoreCase("zip")) {
            return "Accepted";
        } else {
            return "Rejected — invalid file type";
        }
    }

    public static void main(String[] args) {
        String file1 = "Assignment1.PDF";
        String file2 = "notes.txt";

        System.out.println(file1 + " → " + validateFileExtension(file1));
        System.out.println(file2 + " → " + validateFileExtension(file2));
    }
}
