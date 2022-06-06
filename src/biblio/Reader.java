package biblio;

public class Reader {

    private String fullName;
    private int readerTicketNumber;
    private String faculty;
    private String dateOfBirth;
    private int phone;

    public Reader (String fullName, int readerTicketNumber, String faculty, String dateOfBirth, int phone) {
        this.fullName = fullName;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public int getReaderTicketNumber() {
        return readerTicketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPhone() {
        return phone;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setReaderTicketNumber(int readerTicketNumber) {
        this.readerTicketNumber = readerTicketNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Reader[] arrayReaders (Reader reader1, Reader reader2){
        Reader[] arrayReaders = new Reader[2];
        arrayReaders[0] = reader1;
        arrayReaders[1] = reader2;

        return arrayReaders;
    }

    public void takeBook (int number) {
        System.out.println(this.fullName + " взял(а) " + number + " книг(и)");
    }

    public void takeBook (String ... bookName) {
        System.out.print(this.fullName + " взял(а) книги:");

        for (String book : bookName) {
            System.out.print(" " + book + ",");
         }
        System.out.println();
    }

    public void takeBook (Book... book) {
        System.out.print(this.fullName + " взял(а) книги:");

        for (Book books : book) {
            System.out.print(" " + books.getBookName() + ",");
        }
        System.out.println();
    }

    public void returnBook (int number) {
        System.out.println(this.fullName + " вернул(а) " + number + " книг(и)");
    }

    public void returnBook (String ... bookName) {
        System.out.print(this.fullName + " вернул(а) книги:");

        for (String book : bookName) {
            System.out.print(" " + book + ",");
        }
        System.out.println();
    }

    public void returnBook (Book ... book) {
        System.out.print(this.fullName + " вернул(а) книги:");

        for (Book books : book) {
            System.out.print(" " + books.getBookName() + " автор " + books.getAuthor() + ",");
        }
        System.out.println();
    }

}
