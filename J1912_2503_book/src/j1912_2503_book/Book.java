
package j1912_2503_book;


public class Book extends Product{
    private int numberOfPage;
    
    
    public Book(){
        
    }
    public Book(int numberOfPage,
            String code, 
            String name, 
            String description,
            String procedure,
            double price) {
        super(code, name, description, procedure, price);
        this.numberOfPage = numberOfPage;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
    
    public void createBook(){
        super.CreateProduct();
        System.out.println("Enter number of page : ");
        this.numberOfPage=(Menu.getScanner().nextInt());   
        
    }

    @Override
    public String toString() {
        return  super.toString() + "Book{" + "numberOfPage=" + numberOfPage + '}';
    }
    
}
