public class Book{
    private int[] stack;   
    private int top;       
    private int max;   

    //stack from array
    public Book(int[] books){
        max = books.length;   
        stack = new int[max];
        top = -1;
        for (int b : books){
          push(b);   
        }
    }

    //stack from size
    public Book(int size){
        max = size;
        stack = new int[max];
        top = -1;
    }


    //push one book
    public void push(int id){
        if (top == max - 1){
            System.out.println("overflow");
        } else{ 
          ++top;
            stack[top] = id;
        }
    }

    //push two books together
    public void push(int book1, int book2){
        push(book1);
        push(book2);
    }


    //pop one book
    public void pop(){
        if (top == -1){
            System.out.println("underflow");
        } else {
            System.out.println(stack[top--] + " removed");
        }
    }

    //pop multiple books
    public void pop(int p){
        for (int i = 0; i < p; i++) {
            pop();
        }
    }


    //display all books
    public void display(){
        if (top == -1) {
            System.out.println("empty");
        } else{
            System.out.print("books in stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i]);
            }
        }
    }

    //display top r books
    public void display(int r){
        if (top == -1) {
            System.out.println("empty");
        } else {
            System.out.print("top " + r + " books: ");
            for (int i = top; i > top - r && i >= 0; i--){
                System.out.print(stack[i]);
            }
        }
    }
}

