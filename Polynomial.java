package eg.edu.alexu.csd.datastructure.linkedList;

import java.util.Scanner ; 

class Polynomial implements IPolynomialSolver {
   
 static DoubleLinkedList Ac = new DoubleLinkedList();
     static DoubleLinkedList Bc = new DoubleLinkedList();
     static DoubleLinkedList Cc = new DoubleLinkedList();
     static DoubleLinkedList Rc = new DoubleLinkedList();
     static DoubleLinkedList Ae = new DoubleLinkedList();
     static DoubleLinkedList Be = new DoubleLinkedList();
     static DoubleLinkedList Ce = new DoubleLinkedList();
     static DoubleLinkedList Re = new DoubleLinkedList();

     @Override
     public void setPolynomial(char poly, int[][] terms) {

         if (poly == 'A') {
             for (int i = 0; i < terms.length; i++) {
                 Ac.add(terms[i][0]);
                 Ae.add(terms[i][1]);
             }
         } else if (poly == 'B') {

             for (int i = 0; i < terms.length; i++) {
                 Bc.add(terms[i][0]);
                 Be.add(terms[i][1]);
             }
         } else if (poly == 'C') {
             for (int i = 0; i < terms.length; i++) {
                 Cc.add(terms[i][0]);
                 Ce.add(terms[i][1]);
             }
         } else throw new IllegalArgumentException("Unrcognisable poly");

     }

     //@Override
     public static String print(char poly) {
         String string = new String("");
         if (poly == 'A') {

             for (int i = 0; i < Ac.size; i++) {
                 if ((int) Ac.get(i) > 0) {
                     if (i != 0) string = string + "+";
                 } else if ((int) Ac.get(i) == 0)
                     continue;
                 if ((int) Ae.get(i) > 1) {
                     if ((int) Ac.get(i) == 1 || (int) Ac.get(i) == -1)
                         if ((int) Ac.get(i) == -1)
                             string = string + "-X^" + Ae.get(i);
                         else
                             string = string + "X^" + Ae.get(i);
                     else
                         string = string + Ac.get(i) + "X^" + Ae.get(i);
                 } else if ((int) Ae.get(i) == 1) {

                     if ((int) Ac.get(i) == 1 || (int) Ac.get(i) == -1)
                         if ((int) Ac.get(i) == -1)
                             string = string + "-X";
                         else
                             string = string + "X";
                     else
                         string = string + Ac.get(i) + "X";
                 } else
                     string = string + Ac.get(i);
             }

         } else if (poly == 'B') {
             for (int i = 0; i < Bc.size; i++) {
                 if ((int) Bc.get(i) > 0) {
                     if (i != 0) string = string + "+";
                 } else if ((int) Bc.get(i) == 0)
                     continue;
                 if ((int) Be.get(i) > 1) {
                     if ((int) Bc.get(i) == 1 || (int) Bc.get(i) == -1)
                         if ((int) Bc.get(i) == -1)
                             string = string + "-X^" + Be.get(i);
                         else
                             string = string + "X^" + Be.get(i);
                     else
                         string = string + Bc.get(i) + "X^" + Be.get(i);
                 } else if ((int) Be.get(i) == 1) {

                     if ((int) Bc.get(i) == 1 || (int) Bc.get(i) == -1)
                         if ((int) Bc.get(i) == -1)
                             string = string + "-X";
                         else
                             string = string + "X";
                     else
                         string = string + Ac.get(i) + "X";
                 } else
                     string = string + Bc.get(i);
             }
         } else if (poly == 'C') {
             for (int i = 0; i < Cc.size; i++) {
                 if ((int) Cc.get(i) > 0) {
                     if (i != 0) string = string + "+";
                 } else if ((int) Cc.get(i) == 0)
                     continue;
                 if ((int) Ce.get(i) > 1) {
                     if ((int) Cc.get(i) == 1 || (int) Cc.get(i) == -1)
                         if ((int) Cc.get(i) == -1)
                             string = string + "-X^" + Ce.get(i);
                         else
                             string = string + "X^" + Ce.get(i);
                     else
                         string = string + Cc.get(i) + "X^" + Ce.get(i);
                 } else if ((int) Ce.get(i) == 1) {

                     if ((int) Cc.get(i) == 1 || (int) Cc.get(i) == -1)
                         if ((int) Cc.get(i) == -1)
                             string = string + "-X";
                         else
                             string = string + "X";
                     else
                         string = string + Cc.get(i) + "X";
                 } else
                     string = string + Cc.get(i);
             }
         } else if (poly == 'R') {
             for (int i = 0; i < Rc.size; i++) {
                 if ((int) Rc.get(i) > 0) {
                     if (i != 0) string = string + "+";
                 } else if ((int) Rc.get(i) == 0)
                     continue;
                 if ((int) Re.get(i) > 1) {
                     if ((int) Rc.get(i) == 1 || (int) Rc.get(i) == -1)
                         if ((int) Rc.get(i) == -1)
                             string = string + "-X^" + Re.get(i);
                         else
                             string = string + "X^" + Re.get(i);
                     else
                         string = string + Rc.get(i) + "X^" + Re.get(i);
                 } else if ((int) Re.get(i) == 1) {

                     if ((int) Rc.get(i) == 1 || (int) Rc.get(i) == -1)
                         if ((int) Rc.get(i) == -1)
                             string = string + "-X";
                         else
                             string = string + "X";
                     else
                         string = string + Rc.get(i) + "X";
                 } else
                     string = string + Rc.get(i);
             }
         } else throw new IllegalArgumentException("Wrong poly name");

         return string;
     }

     @Override
     public void clearPolynomial(char poly) {
         if (poly == 'A') {
             Ae.clear();
             Ac.clear();
         } else if (poly == 'B') {
             Be.clear();
             Bc.clear();
         } else if (poly == 'C') {
             Ce.clear();
             Cc.clear();
         } else throw new IllegalArgumentException("Wrong Entry");
     }

     @Override
     public float evaluatePolynomial(char poly, float value) {
         float f = 0;
         if (poly == 'A') {
             for (int i = 0; i < Ac.size; i++) {
                 f += (float) Ac.get(i) * Math.pow(value, (double) Ae.get(i));
             }
         } else if (poly == 'B') {
             for (int i = 0; i < Bc.size; i++) {
                 f += (float) Bc.get(i) * Math.pow(value, (double) Be.get(i));
             }
         } else if (poly == 'C') {
             for (int i = 0; i < Cc.size; i++) {
                 f += (float) Cc.get(i) * Math.pow(value, (double) Ce.get(i));
             }
         } else throw new IllegalArgumentException("Wrong index");
         return f;

     }

     @Override
     public int[][] add(char poly1, char poly2) {
         if (poly1 == 'A' && poly2 == 'B') {
             add(Ac, Bc, Ae, Be);
         } else if (poly1 == 'A' && poly2 == 'A') {
             add(Ac, Ac, Ae, Ae);
         } else if (poly1 == 'A' && poly2 == 'C') {
             add(Ac, Cc, Ae, Ce);
         } else if (poly1 == 'B' && poly2 == 'B') {
             add(Bc, Bc, Be, Be);
         } else if (poly1 == 'B' && poly2 == 'C') {
             add(Bc, Cc, Be, Ce);
         } else if (poly1 == 'C' && poly2 == 'C') {
             add(Cc, Cc, Ce, Ce);
         } else if ((poly1 == 'R' && poly2 == 'C') || (poly1 == 'C' && poly2 == 'R')) {
             add(Rc, Cc, Re, Ce);

         } else if ((poly1 == 'R' && poly2 == 'B') || (poly1 == 'B' && poly2 == 'R')) {
             add(Rc, Bc, Re, Be);

         } else if ((poly1 == 'R' && poly2 == 'A') || (poly1 == 'A' && poly2 == 'R')) {
             add(Rc, Ac, Re, Ae);

         }


         int[][] arr = new int[Rc.size][2];
         for (int i = 0; i < Rc.size; i++) {
             arr[i][0] = (int) Rc.get(i);
             arr[i][1] = (int) Re.get(i);
         }
         return arr;
     }

     public static void add(DoubleLinkedList c1, DoubleLinkedList c2, DoubleLinkedList e1, DoubleLinkedList e2) {
         DoubleLinkedList list1c = new DoubleLinkedList();
         DoubleLinkedList list2c = new DoubleLinkedList();
         DoubleLinkedList list1e = new DoubleLinkedList();
         DoubleLinkedList list2e = new DoubleLinkedList();
         list1c = copy(c1);
         list2c = copy(c2);
         list1e = copy(e1);
         list2e = copy(e2);
         Re.clear();
         Rc.clear();
         DoubleLinkedList.DNode tmp1e = list1e.head;
         DoubleLinkedList.DNode tmp2e = list2e.head;
         DoubleLinkedList.DNode tmp1c = list1c.head;
         DoubleLinkedList.DNode tmp2c = list2c.head;
         while (tmp1e != null && tmp2e != null) {
             if ((int) tmp1e.element > (int) tmp2e.element) {
                 Re.add(tmp1e.element);
                 Rc.add(tmp1c.element);
                 tmp1c = tmp1c.Next;
                 tmp1e = tmp1e.Next;

             } else if ((int) tmp1e.element < (int) tmp2e.element) {
                 Re.add(tmp2e.element);
                 Rc.add(tmp2c.element);
                 tmp2c = tmp2c.Next;
                 tmp2e = tmp2e.Next;
             } else {
                 int sum = (int) tmp1c.element + (int) tmp2c.element;
                 Re.add(tmp1e.element);
                 Rc.add(sum);
                 tmp2c = tmp2c.Next;
                 tmp2e = tmp2e.Next;
                 tmp1c = tmp1c.Next;
                 tmp1e = tmp1e.Next;
             }
         }
         while (tmp1e != null) {
             Re.add(tmp2e.element);
             Rc.add(tmp2c.element);
             tmp1c = tmp1c.Next;
             tmp1e = tmp1e.Next;

         }
         while (tmp2e != null) {
             Re.add(tmp2e.element);
             Rc.add(tmp2c.element);
             tmp2c = tmp2c.Next;
             tmp2e = tmp2e.Next;
         }
     }

     public int[][] subtract(char poly1, char poly2) {

         if (poly1 == 'A' && poly2 == 'B') {
             subtract(Ac, Bc, Ae, Be);
         } else if (poly1 == 'A' && poly2 == 'A') {
             subtract(Ac, Ac, Ae, Ae);
         } else if (poly1 == 'A' && poly2 == 'C') {
             subtract(Ac, Cc, Ae, Ce);
         } else if (poly1 == 'B' && poly2 == 'B') {
             subtract(Bc, Bc, Be, Be);
         } else if (poly1 == 'B' && poly2 == 'C') {
             subtract(Bc, Cc, Be, Ce);
         } else if (poly1 == 'C' && poly2 == 'C') {
             subtract(Cc, Cc, Ce, Ce);
         } else if (poly1 == 'C' && poly2 == 'B') {
             subtract(Cc, Bc, Ce, Be);
         } else if (poly1 == 'B' && poly2 == 'A') {
             subtract(Bc, Ac, Be, Ae);
         } else if (poly1 == 'R' && poly2 == 'R') {
             subtract(Rc, Rc, Re, Re);
         } else if (poly1 == 'R' && poly2 == 'A') {
             subtract(Rc, Ac, Re, Ae);
         } else if (poly1 == 'R' && poly2 == 'B') {
             subtract(Rc, Bc, Re, Be);
         } else if (poly1 == 'R' && poly2 == 'C') {
             subtract(Rc, Cc, Re, Ce);
         } else if (poly1 == 'C' && poly2 == 'R') {
             subtract(Cc, Rc, Ce, Re);
         } else if (poly1 == 'A' && poly2 == 'R') {
             subtract(Ac, Rc, Ae, Re);
         } else if (poly1 == 'B' && poly2 == 'R') {
             subtract(Bc, Rc, Be, Re);
         }


         int[][] arr = new int[Rc.size][2];
         for (int i = 0; i < Rc.size; i++) {
             arr[i][0] = (int) Rc.get(i);
             arr[i][1] = (int) Re.get(i);
         }
         return arr;

     }

     public static void subtract(DoubleLinkedList c1, DoubleLinkedList c2, DoubleLinkedList e1, DoubleLinkedList e2) {
         DoubleLinkedList list1c = new DoubleLinkedList();
         DoubleLinkedList list2c = new DoubleLinkedList();
         DoubleLinkedList list1e = new DoubleLinkedList();
         DoubleLinkedList list2e = new DoubleLinkedList();
         list1c = copy(c1);
         list2c = copy(c2);
         list1e = copy(e1);
         list2e = copy(e2);


         Re.clear();
         Rc.clear();
         DoubleLinkedList.DNode tmp1e = list1e.head;
         DoubleLinkedList.DNode tmp2e = list2e.head;
         DoubleLinkedList.DNode tmp1c = list1c.head;
         DoubleLinkedList.DNode tmp2c = list2c.head;
         while (tmp1e != null && tmp2e != null) {
             if ((int) tmp1e.element > (int) tmp2e.element) {
                 Re.add(tmp1e.element);
                 Rc.add(tmp1c.element);
                 tmp1c = tmp1c.Next;
                 tmp1e = tmp1e.Next;

             } else if ((int) tmp1e.element < (int) tmp2e.element) {
                 Re.add(-1 * (int) tmp2e.element);
                 Rc.add(-1 * (int) tmp2c.element);
                 tmp2c = tmp2c.Next;
                 tmp2e = tmp2e.Next;
             } else {
                 int sum = (int) tmp1c.element - (int) tmp2c.element;
                 Re.add(tmp1e.element);
                 Rc.add(sum);
                 tmp2c = tmp2c.Next;
                 tmp2e = tmp2e.Next;
                 tmp1c = tmp1c.Next;
                 tmp1e = tmp1e.Next;
             }
         }
         while (tmp1e != null) {
             Re.add(tmp2e.element);
             Rc.add(tmp2c.element);
             tmp1c = tmp1c.Next;
             tmp1e = tmp1e.Next;

         }
         while (tmp2e != null) {
             Re.add(-1 * (int) tmp2e.element);
             Rc.add(-1 * (int) tmp2c.element);
             tmp2c = tmp2c.Next;
             tmp2e = tmp2e.Next;
         }
     }

     public int[][] convert(DoubleLinkedList A, DoubleLinkedList B) {
         int[][] sa = new int[20][2];
         int j = 0;
         for (int i = 0; i < A.size() * 2; i++) {
             if (i % 2 == 0) {
                 sa[j][0] = (int) A.get(j);
             } else {
                 sa[j][1] = (int) B.get(j);
             }
             if (i % 2 == 1) {
                 j++;
             }
         }
         return sa;
     }

     public static int[][] multiply(char poly1, char poly2) {


         DoubleLinkedList Fe = new DoubleLinkedList();
         DoubleLinkedList Fc = new DoubleLinkedList();

         if (poly1 == 'A' && poly2 == 'A') {
             return mutlibly(Ac, Ac, Ae, Ae);
         } else if (poly1 == 'B' && poly2 == 'B') {
             return mutlibly(Bc, Bc, Be, Be);
         } else if (poly1 == 'C' && poly2 == 'C') {
             return mutlibly(Cc, Cc, Ce, Ce);
         } else if (poly1 == 'A' && poly2 == 'B') {
             return mutlibly(Ac, Bc, Ae, Be);
         } else if (poly1 == 'A' && poly2 == 'C') {
             return mutlibly(Ac, Cc, Ae, Ce);
         } else if (poly1 == 'C' && poly2 == 'B') {
             return mutlibly(Cc, Bc, Ce, Be);
         } else if ((poly1 == 'R' && poly2 == 'A') || (poly1 == 'A' && poly2 == 'R')) {
             return mutlibly(Rc, Ac, Re, Ae);
         } else if ((poly1 == 'R' && poly2 == 'B') || (poly1 == 'B' && poly2 == 'R')) {
             return mutlibly(Rc, Bc, Re, Be);
         } else if ((poly1 == 'R' && poly2 == 'C') || (poly1 == 'C' && poly2 == 'R')) {
             return mutlibly(Rc, Cc, Re, Ce);
         } else throw new IllegalArgumentException("Wrong Entry");


     }

     public static int[][] mutlibly(DoubleLinkedList list1c, DoubleLinkedList list2c, DoubleLinkedList list1e, DoubleLinkedList list2e) {
         DoubleLinkedList c1 = new DoubleLinkedList();
         DoubleLinkedList c2 = new DoubleLinkedList();
         DoubleLinkedList e1 = new DoubleLinkedList();
         DoubleLinkedList e2 = new DoubleLinkedList();
         c1 = copy(list1c);
         c2 = copy(list2c);
         e1 = copy(list1e);
         e2 = copy(list2e);
         if (c1.isEmpty() || c2.isEmpty()) throw new IllegalArgumentException("index is empty");
         Rc.clear();
         Re.clear();
         for (int i = 0; i < c1.size(); i++) {
             for (int j = 0; j < c2.size(); j++) {
                 int y = (int) e1.get(i) + (int) e2.get(j);
                 int x = (int) c1.get(i) * (int) c2.get(j);
                 Re.add(y);
                 Rc.add(x);
             }
         }
         for (int i = 0; i < Rc.size(); i++) {
             int sum = (int) Rc.get(i);
             for (int j = i + 1; j < Re.size(); ) {
                 if ((int) Re.get(i) == (int) Re.get(j)) {
                     sum = sum + (int) Rc.get(j);
                     Rc.remove(j);
                     Re.remove(j);
                 } else j++;
             }

         }
         int[][] arr = new int[Rc.size][2];
         for (int i = 0; i < Rc.size; i++) {
             arr[i][0] = (int) Rc.get(i);
             arr[i][1] = (int) Re.get(i);
         }
         return arr;
     }

     static DoubleLinkedList copy(DoubleLinkedList deslist) {
         DoubleLinkedList give = new DoubleLinkedList();
         if (deslist.head == null)
             give.head = give.tail = null;                       // if "otherList" is empty the new list is empty too.
         else {
             give.size = deslist.size;
             give.head = new DoubleLinkedList.DNode(deslist.head.element, deslist.head.Next, deslist.head.Prev);      // allocate head and copy data
             DoubleLinkedList.DNode tempOther = deslist.head.Next;
             DoubleLinkedList.DNode temp = give.head;
             while (tempOther != null) {
                 temp.Next = new DoubleLinkedList.DNode(tempOther.element, tempOther, tempOther.Prev); // allocate next elemnt and copy data ( predecessor is "temp" )
                 temp = temp.Next;                                      // temp refers to last element of list
                 tempOther = tempOther.Next;                            // step one forward
             }
             give.tail = temp;
         }
         return give;
     }

public static void main (String args[]) {
        int z = 0;
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
         Polynomial abdel = new Polynomial();
        for(int h = 0;h<10 ; h++) {
        System.out.println("Please choose an action\r");
           System.out.println("-----------------------\r");
           System.out.println("1- Set a polynomial variable\r\n" + "2- Print the value of a polynomial variable\r\n" + "3- Add two polynomials\r\n" + "4- Subtract two polynomials\r\n"+"5- Multiply two polynomials\r\n"+"6- Evaluate a polynomial at some point\r\n"+"7- Clear a polynomial variable\r\n"+"====================================================================\r\n");  
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int [] term2 = new int [40]   ;
        if(input==1)
        {
        System.out.println("Insert the variable name: A, B or C\r\n" );
        String poly = sc.next() ;
        System.out.print("Insert the polynomial terms in the form:\r\n" + "(coeff1, exponent1), (coeff2, exponent2), ..\r\n" );
        String essam = null;
        try {
            essam = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
       
        int d = 0 ;
        System.out.println("====================================================================\r\n");
        int [][] term = new int[20][2];
        for(int f = 0; f< essam.length() ; f++) {
            char A = '0' ;
            if(essam.charAt(f)!=' '&&essam.charAt(f)!=','&&essam.charAt(f)!='('&&essam.charAt(f)!=')') {
                term2[d]=Character.getNumericValue(essam.charAt(f))-Character.getNumericValue(A);
                d++;
            }
            }
        int r = 0 ; int q = 0 ; int t = 0 ;
        for(int i = 0; i<term2.length ; i++) {
            if(i%2==0) {
                term [q][0] = term2[r] ;
                r++;
            }
            else {
                term [q][1] = term2 [r] ;
                r++;
            }
            if(i%2==1) {
                q++;
            }
        }
        abdel.setPolynomial(poly.charAt(0),term);
        System.out.print("Polynomial " );
        System.out.print(poly);System.out.println(" "+ "is set\n");
        }
        else if (input==2) {
            System.out.println("Insert the variable name: A, B, C or R");
            String poly = sc.next();
        String output = abdel.print(poly.charAt(0));
        System.out.print(output);
        System.out.println("====================================================================\r\n");
        }
        else if (input==3) {System.out.println("Enter the Poly1\r\n");
        String poly1 = sc.next();
        System.out.println("Enter the Poly2\r\n");
        String poly2 = sc.next();
        int array[][] ;
        array = abdel.add(poly1.charAt(0),poly2.charAt(0));
        for(int e = 0;e<array.length-1 ; e++ ) {
            System.out.print("("+" "+array[e][0]+","+" "+array[e][1]+")"+" , ");
        }
        System.out.println("====================================================================\r\n");
        }
        else if (input==4) {
        System.out.println("Enter the Poly1\r\n");
        String poly11 = sc.next();
        System.out.println("Enter the Poly2\r\n");
        String poly22 = sc.next();
        int array2 [] [];
        array2  = abdel.subtract(poly11.charAt(0),poly22.charAt(0));
        for(int e = 0;e<array2.length-1 ; e++ ) {
            System.out.print("("+" "+array2[e][0]+","+" "+array2[e][1]+")"+" , ");
        }
        System.out.println("====================================================================\r\n");
        }
        else if (input==5) {
           
        System.out.println("Enter the Poly1\r\n");
        String poly111 = sc.next();
        System.out.println("Enter the Poly2\r\n");
        String poly222 = sc.next();
        int array3 [] [];
        array3  = abdel.subtract(poly111.charAt(0),poly222.charAt(0));
        for(int e = 0;e<array3.length-1 ; e++ ) {
            System.out.print("("+" "+array3[e][0]+","+" "+array3[e][1]+")"+" , ");
        }       System.out.println("====================================================================\r\n");
        }
        else if (input==6) {
            System.out.println("Enter the poly \r\n ");
            String Poly = sc.next();
            System.out.println("Enter the Value\r\n");
            float zezo = sc.nextFloat();
            float sasa = abdel.evaluatePolynomial( Poly.charAt(0) , zezo);
            System.out.println(" "+sasa);
            System.out.println("====================================================================\r\n");
 
        }
        else if (input==7) {
            String c = sc.next() ;
            abdel.clearPolynomial( c.charAt(0) );
            System.out.println("====================================================================\r\n");
        }
        else {System.out.println("Invaild Please try again\n") ;}
        }
    }
}
