public class Main{
    public static void main(String[] args) {
      
        int[] Books = {59, 34, 76};
        Book s1 = new Book(Books);
        s1.display();

        Book s2 = new Book(5);

        s2.push(41);
        s2.push(26, 35);
        s2.push(19);

        s2.display();

        s2.pop();
        s2.display();


        s2.pop(2);
        s2.display();


        s2.display(1);
    }
}