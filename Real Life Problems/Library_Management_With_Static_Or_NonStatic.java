public class Library_Management_With_Static_Or_NonStatic {
    String memberName; //non static mean unique to each number
    int booksBorroweed; //non static
    static int totalBooks = 100; //this is static  mean sheared accross all

    //constricture to initialize member detials
    Library_Management_With_Static_Or_NonStatic(String name , int books) {
        this.memberName = name;
        this.booksBorroweed = books;
        totalBooks = totalBooks-books;//reduce the number of books
    }
    //method to display member details
    void diaplayMemberDetails() {
          System.out.println("member name  "+ memberName);
          System.out.println("Borrowed books "+booksBorroweed);
    }
    //method to diaplay total books left in library
    static void displayTotalBooks () {

        System.out.println("total books in library "+totalBooks);
    }
    public static void main(String[] args) {
        Library_Management_With_Static_Or_NonStatic member1 = new Library_Management_With_Static_Or_NonStatic("pravin", 3);
        Library_Management_With_Static_Or_NonStatic member2 = new Library_Management_With_Static_Or_NonStatic("saurabh", 5);
        member1.diaplayMemberDetails();
        member2.diaplayMemberDetails();
        //Display total left in the library
        Library_Management_With_Static_Or_NonStatic.displayTotalBooks();
    }
}