    public class ExampleDataTypeIDNumber {

        public static void main(String[] args) {
            char bloodGroup = 'A';
            // byte tidak dapat menampung nilai sebanyak 130 maks 127 nilai
            //  byte distance = (byte) 130;
            short distance = 130;
            short theNumberOfResidents = 1025;
            float temperature = 60.50F;
            double weight = 0.5467812345;
            long balance = 150000000L; 
            int number = 0x10; // Decimal value 16 is assigned to 'number'
            
            System.out.println("Blood Group\t\t: " + bloodGroup);
            System.out.println("Distance\t\t: " + distance);
            System.out.println("The Number of Residents\t: " + theNumberOfResidents);
            System.out.println("Temperature\t\t: " + temperature);
            System.out.println("Weight\t\t\t: " + weight);
            System.out.println("Balance\t\t\t: " + balance);
            System.out.println("Number\t\t\t: " + number); 
        }
    }