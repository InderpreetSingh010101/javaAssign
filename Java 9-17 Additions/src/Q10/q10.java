package Q10;
// Demonstrate the use of repeat, strip, isBlank, indent, transform, stripIndent, translateEscapes, formatted String methods.
public class q10 {

    public static void main(String[] args) {
        System.out.println("q10");

      // Repeat
        String str1 = "Abc" ;

        int c = 3 ;
        System.out.println("Reapat Method " + str1.repeat(c));

         // strip

        System.out.println("strip() method");
        String str = "\n\t            this is a string           This is   ?\u2005" ;  // \u2005 where 2005 is code
        System.out.println(str.strip());

        // isBlank
        System.out.println("isBlank");

        String str2 = "\n\t" ;
        System.out.println(str2.isBlank());

        //indent

        String str3 = "            THIS IS A TEST OBJECT          " ;
        System.out.println(str3.indent(10));
        System.out.println(str3.indent(-10));

        // transform

        String newStr = str3.transform(s->new StringBuilder(s).reverse().toString());
        System.out.println(newStr);

        // stripIndent

        String str4 = str3.stripIndent() ;
        System.out.println(str4);


        // translateEscapes

        String str5 = " this is\ttest objects 2 for\n translate" ;
        System.out.println(str5);
        str5.translateEscapes();
        System.out.println(str5.translateEscapes());


        //formatted
        System.out.println("----------formatted -----------");
        String str6= String.format("%d Formatted Example %d" , 10,20) ;
        System.out.println(str6);

        //





    }
}
