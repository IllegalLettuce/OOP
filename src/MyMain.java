import java.util.Scanner;

/**
 * Main class for project
 */
public class MyMain {
    /**
     * This function prints the menu on screen to the user
     */
    public static void printMenu(){
        System.out.println();
        System.out.println("0. Exit");
        System.out.println("1. Purchase Item");
        System.out.println("2. Add new Coffee");
        System.out.println("3. Add new Crowbar");
        System.out.println("4. View Item info");
        System.out.println("5. View Sales Log");
        System.out.println("6. Load data from Disk");
        System.out.println("7. Save data to disk");
    }
    /**
     * Validation for integer option.
     * @param scanner - Scanner
     * @return valid integer option
     */
    public static int validInt(Scanner scanner){
        int result = -1;
        boolean correctInput = false;
        while(!correctInput){
            System.out.println("Enter an integer: ");
            try{
                result = scanner.nextInt();
                scanner.nextLine();
                correctInput = true;
            }
            catch(Exception e){
                System.out.println("Please enter an integer (a real number, 1, 2, 3, 4 etc)");
                scanner.next();
            }
        }
        return result;
    }
    /**
     * Validation for integer range
     * @param scanner - Scanner
     * @param min - Min value for range
     * @param max -Max value for range
     * @return valid integer option
     */
    public static int validInt(Scanner scanner, int min, int max){
        int result = -1;
        boolean correctInput = false;
        while (!correctInput) {
            System.out.println("Please enter an integer between " + min + " and " + max + ":");
            try{
                result = scanner.nextInt();
                scanner.nextLine();
                if ((result >= min) && (result <= max)){
                    correctInput = true;
                } 
                else{
                    System.out.println("Number not between "+ min + " and " + max);
                    scanner.next();
                }
            }
            catch(Exception e){
                System.out.println("Please enter an integer (a real number, 1, 2, 3, 4 etc)");
                scanner.next();
            }
        }
        return result;
    }

    /**
     * Validates String Entry
     * @param scanner - Scanner
     * @return - valid string entry
     */
    public static String validString(Scanner scanner){
        String result = "";
        boolean correctInput = false;
        while(!correctInput){
            System.out.println("Please enter a string: ");
            try{
                result = scanner.nextLine();
                if (result.length() > 0){
                    correctInput = true;
                }
                else {
                    System.out.println("Please enter a string");
                }
            }
            catch(Exception e){
                System.out.println("Please enter a string");
                scanner.next();
            }
        }
        return result;
    }

    /**
     * Valiadates boolean entry
     * @param scanner - scanner
     * @return boolean value
     */
    public static boolean validBool(Scanner scanner){
        boolean result = false;
        boolean correctInput = false;
        while(!correctInput){
            System.out.println("Enter an boolean: ");
            try{
                result = scanner.nextBoolean();
                correctInput = true;
            }
            catch(Exception e){
                System.out.println("Please enter an boolean (true/false)");
                scanner.next();
            }
        }
        return result;
    }

    public static void cleanScreen(){
       for (int i = 0; i < 100; i++){
        System.out.println(" ");
        }
    }
    
    /**
     * The session manager
     * @param receiptFileName - file name for recipt
     * @param itemFileName - file name for items
     * @param userFileName - file name for user
     */
    public static void session(String receiptFileName, String itemFileName, String userFileName){
        StoreFront store = new StoreFrontImplementation();

        boolean endProgram = false;
        int option;
        Scanner scanner = new Scanner(System.in);

        cleanScreen();

        while (!endProgram){
            printMenu();
            option = validInt(scanner, 0, 8);
            cleanScreen();
            switch (option) {
                case 0 -> endProgram = true;

                case 1 -> {
                    System.out.println("====Purchase Item====");
                    System.out.println("Enter name for Customer");
                    String customerName = validString(scanner);
                    int customerID = store.addNewCustomer(customerName);
                    System.out.println("Select product for " + customerName);
                    store.viewProductList();
                    System.out.println("\nEnter product ID:");
                    int choice = scanner.nextInt();
                    boolean receiptresult = store.purchaseItem(customerID, choice);
                    if (receiptresult){
                        System.out.println("Item succesfully purchased");
                    }
                    else{
                        System.out.println("Error");
                    }
                }
                case 2 -> {
                    System.out.println("====Add new Coffee====");
                    System.out.println("Enter name for coffee:");
                    String coffeeName = validString(scanner);
                    System.out.println("Enter price for coffee:");
                    int coffeePrice = validInt(scanner);
                    System.out.println("Enter amount of sugar for coffee:");
                    int coffeeSugarySpoons = validInt(scanner);
                    System.out.println("Enter if coffee has milk:");
                    boolean coffeeMilk = validBool(scanner);

                    boolean result = store.addNewCoffee(coffeePrice, coffeeName, coffeeSugarySpoons, coffeeMilk);
                    if (result){
                        System.out.println("Coffee succesfully added");
                    }
                }
                case 3 -> {
                    System.out.println("====Add new Crowbar====");
                    System.out.println("Enter name for Crowbar");
                    String crowbarName = validString(scanner);
                    System.out.println("Enter price for Crowbar");
                    int crowbarPrice = validInt(scanner);
                    System.out.println("Enter weight for Crowbar in Grams");
                    int crowbarWeight = validInt(scanner);
                    System.out.println("Enter type of Crowbar");
                    String crowbarType = validString(scanner);

                    boolean result = store.addNewCrowbar(crowbarPrice, crowbarName, crowbarWeight, crowbarType);
                    if (result){
                        System.out.println("Crowbar succesfully added");
                    }                    
                }
                case 4 -> {
                    System.out.println("====View Product Info====");
                    int itemPick = validInt(scanner);
                    store.viewItemInfo(itemPick);
                }
                case 5 -> {
                    System.out.println("====View Sales Log====");
                    store.viewSalesLog();
                }
                case 6 -> {
                    System.out.println("====Load data from disk====");
                    store.loadFromDisk(receiptFileName, itemFileName, userFileName);
                }
                case 7 -> {
                    System.out.println("====Save data to disk====");
                    store.saveToDisk(receiptFileName, itemFileName, userFileName);
                }
                    
            }
            
        }
    }


    public static void main(String[] args){
        String receiptFileName = "./database/receipt.txt";
        String itemFileName = "./database/item.txt";
        String userFileName = "./database/user.txt";
        session(receiptFileName, itemFileName, userFileName);
    }
}