import calculator.Book;
import calculator.ICalculator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ICalculator sum = (a,b) -> (a+b);
        ICalculator sub = (a,b) -> Math.abs(a-b);
        ICalculator mul = (a,b) -> (a*b);
        ICalculator div = (a,b) -> b==0?0:(a/b);

        System.out.println("Hello World!");
        System.out.println(" sum: "+sum.calculate(4,2));
        System.out.println(" sub: "+sub.calculate(4,2));
        System.out.println(" mul: "+mul.calculate(4,2));
        System.out.println(" div: "+div.calculate(4,2));



        // Episode Book
        Book book1 = new Book(1,"Henry the King", "Austin Henry",3,395,"ISBN231238");
        Book book2 = new Book(5,"Life of the King", "Beck Henry",4,400,"ISBNA38393");
        Book book3 = new Book(7,"Life is what you make it", "Preeti Shenoy",5,250,"ISBNK39383");
        Book book4 = new Book(4,"Three States", "Kathy Bert",1,398,"ISBNZ37838");
        Book book5 = new Book(6,"Idiot", "Sierra Kurt",3,544,"ISBN90390");
        Book book6 = new Book(3,"Blue sky", "Hunter Beth",2,290,"ISBN00930321");
        Book book7 = new Book(2,"Ocean", "Genelia Dsouza",4,314,"ISBNLMN2928");

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        listOfBooks.add(book5);
        listOfBooks.add(book6);
        listOfBooks.add(book7);

        listOfBooks.stream().forEach((book)-> System.out.println(book.toString()));
int[] nums = {3,7,7,10,10,11,11};
        System.out.println(" manual"+(8^11));
    singleNonDuplicate(nums);
    }
    public static int singleNonDuplicate(int[] nums) {
        if(nums == null || nums.length ==0 ) return 0;
        int ele = 0;
        for(int i:nums){
            ele ^= i;
            System.out.println(ele);
        }
        return ele;
    }
}
