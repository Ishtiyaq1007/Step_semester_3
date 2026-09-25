public class CsvStudentRecordParser {

    // Method to parse student record from CSV line
    public static void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String name = fields[0].trim();
        String rollNo = fields[1].trim();
        String dept = fields[2].trim();

        System.out.println("Name: " + name + " | Roll No: " + rollNo + " | Dept: " + dept);
    }

    public static void main(String[] args) {
        String record1 = "Ananya Verma,RA2211003010123,CSE";
        String record2 = "Ananya Verma,CSE";

        System.out.println("Record 1:");
        parseStudentRecord(record1);

        System.out.println("\nRecord 2:");
        parseStudentRecord(record2);
    }
}
