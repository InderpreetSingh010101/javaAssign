package Q3;


import java.util.Scanner;

// Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(),
// isFull() and an additional operation getMin() which should return minimum element from the SpecialStack.
// (Expected complexity ­ O(1))
public class Q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        System.out.println("enter the max Size of Stack");
        int sz = scn.nextInt();

        LlToStack st = new LlToStack(sz) ;


        int ch = 0 ;
        while(ch != 6){
            System.out.println(" 1.Push \n 2.pop \n 3.isEmpty() \n 4.isFull \n 5.Display \n 6 .Exit" );
            ch = scn.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter The Ele To Be Entered");
                    int e = scn.nextInt() ;
                    st.push(e);
                    break ;

                case 2:
                    System.out.println("Popping");
                    st.pop();
                    break;
                case 3:
                    System.out.println(st.isEmpty());
                    break;
                case 4:
                    System.out.println(st.isFull());
                    break;
                case 5:
                    st.toDisplay();
                    break ;
            }

        }
    }
}
