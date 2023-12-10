public class Customer {
    private String name;
    private int idNum;
    // constructs a Customer with given name and ID number 
    public Customer(String name, int idNum) {
        this.name = name;
        this.idNum = idNum;
    }

    // returns the customer's name
    public String getName() {
        return this.name;
    }

    // returns the customer's id
    public int getID() {
        return this.idNum;
    }


    // returns 0 when this customer is equal to other;
    //      a positive integer when this customer is greater than other;
    //      a negative integer when this customer is less than other
    public int compareCustomer(Customer other) {
        /*
         * this is a reference to the current instance of the class. When you use this within an instance method, 
         * you're referring to the instance variables or methods of that particular object.
         * ama this demesen de çalışacaktı çünkü getName() methodu zaten Customer class'ında bir objecte referans gösteriyor
        */
        if(this.getName().compareTo(other.getName()) == 0) {
            if(this.getID() == other.getID()) {
                return 0;
            } else if (this.getID() > other.getID()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return this.getName().compareTo(other.getName());
        }
    }


    /*
     * fills results with customers merged from the beggining og list1 and list2
     * result contains no duplicates and is sorted in ascending order by customer
     *    precondition: 
     *      - results.length > 0;
     *      - (list1.length && list2.length) >= result.length;
     *      - list1 && list 2 contain no duplicates
     *      - list1 && list2 are sorted in ascending order by customer
     *    postcondition: 
     *      - list1 && list2 are not modified 
    */
    public static void prefixMerge(Customer[] list1, Customer[] list2, Customer[] result) {
        int index = 0;
        while(index < result.length) {
            for(int i = 0; i < list1.length; i++) {
                for(int j = 0; j < list2.length; j++) {
                    if(list1[i]compareTo(list2[j]) < 0) {
                        result[index] = list1[i];
                    } else if(list1[i]compareTo(list2[j]) > 0) {
                        result[index] = list2[j];
                    } 
                    index++;
                }
            }
        }
    }
}