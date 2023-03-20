package Q_1;

  //Write a program to display values of enums using a
  // constructor & getPrice() method (Example display house & their prices)
public enum EnumClass {

    NORMAL_HOUSE(300000) , MID_HOUSE(1000000) , DELUX_HOUSE(2000000);

    private int price ;

    private EnumClass(int price){
        this.price = price ;
    }

    public int getPrice(){
        return this.price ;

    }



}
