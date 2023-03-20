import java.util.*;

public class emp{
    private int id ;
    private int sal;

    public int getId() {
        return id;
    }

    public int getSal() {
        return sal;
    }

    public String getName() {
        return name;
    }

    private String name;

    emp(int id, int sal,  String name) {
        this.id = id;
        this.name = name;
        this.sal = sal;


//        compareTo(Object obj) {
//
//            emp e = (emp) obj;
//
//            if (e.getSal < this.sal)
//
//        }
    }

    @Override
    public String toString() {
        return this.id + " " + this.sal + " " + this.name;
    }
}

    class mn{
        public static void main(String[] args) {
            List<emp> ls = new ArrayList<>() ;

            ls.add(new emp(1,2000,"BPS"));
            ls.add(new emp(2,2000,"IPS"));
            ls.add(new emp(3,3000,"CPS"));


            Collections.sort(ls , Comparator.comparing(emp::getSal).reversed().thenComparing(emp::getName));

//            Collections.sort(ls , (a,b)->{
//                if(a.getSal() == b.getSal()){
//                    return a.getName().compareTo(b.getName()) ;
//                } else {
//                    return b.getSal()- a.getSal() ;
//                }
//            });

//            Collections.sort(ls , (a, b)->{
//                if(a.getSal() > b.getSal()){
//                    return -1 ;
//                }else if(a.getSal() < b.getSal()){
//                    return 1 ;
//                }else{
//                    // on the basis of name
//                    return  (b.getName().compareTo(a.getName() ) ) ;
//
//
//                }
//            });

            System.out.println(ls);


        }

        String[] arr = {"aa" , "aa" , "aa"} ;
     List<String> ls = Arrays.asList(arr);


    }