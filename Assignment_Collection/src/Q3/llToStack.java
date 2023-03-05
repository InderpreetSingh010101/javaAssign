package Q3;

import java.util.LinkedList;
// Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(),
// isFull() and an additional operation getMin() which should return minimum element from the SpecialStack.
// (Expected complexity ­ O(1))
public class llToStack {

    private LinkedList<Integer> ll ;

    private int size ;
  private int min = (int) 1e9;


  public llToStack(int size){
      ll = new LinkedList<>() ;
      this.size = size ;

  }

  public int push(int e){
      if(ll.isEmpty() && size > 0){
          ll.add(e);
          this.size = this.size - 1 ;
          this.min = e ;
      }else if(size > 0 ){
          ll.addFirst(e);
          this.size = this.size - 1 ;
          if(e < this.min){
              this.min = e ;
          }
      }else{
          System.out.println("Stack Full");
      }

      return e ;
  }

  public void pop(){
      if(ll.isEmpty()){
          System.out.println("Linked List Is Empty");
      }else{
          System.out.println("Element Poped" + ll.getFirst());
          ll.removeFirst() ;
          this.size = this.size + 1 ;
          for(int e : ll){
              if(this.min > e){
                  this.min = e ;
              }
          }
      }
  }

  public boolean isEmpty(){
      return ll.isEmpty();
  }

  public int getMin(){
      return this.min ;
  }

  public  boolean isFull(){
      if(this.size == 0){
          return true ;
      }else{
          return false ;
      }
  }

  public void toDisplay(){
      System.out.println(ll);
  }








}
