import java.util.stream.*;

/*
"""
We will use this script to teach Java to absolute beginners
The script is an example of Fizz-Buzz implemented in Java
The FizzBuzz problem: 
For all integers between 1 and 99 (include both):
    # print fizz for multiples of 3
    # print buzz for multiples of 5 
    # print fizzbuzz for multiples of 3 and 5"
"""
*/

class challenge_10 {
    static void fizzbuzz(int max_num) {
        /* This Method implements fizbuzz */
        String three_mul = "fizz";
        String five_mul = "buzz";
        int num1 =3; 
        int num2=5;

        for(int i=1; i<max_num; i++)
            {
                String s = String.valueOf(i);
                if (i%num1==0 && i%num2==0){
                    System.out.println(s + "\t" + three_mul + five_mul);
                } else if (i%num1==0) {
                    System.out.println(s + "\t" + three_mul);
                } else if (i%num2==0) {
                    System.out.println(s + "\t" + five_mul);
                } else
                    System.out.println(i); /* Not multiples of 3 or 5 */
            }
    }
    static void fizzbuzz(int max_num) {
        /* This Method implements fizbuzz */
        String three_mul = "fizz";
        String five_mul = "buzz";
        int num1 =3; 
        int num2=5;

        IntStream.rangeClosed(1,max_num)
        .mapToObj(i -> i%num1 == 0 ? (i%num2 == 0 ? three_mul+five_mul : three_mul) : (i%num2 == 0 ? five_mul : i))
        .forEach(System.out::println);

    }

    /* START of the Java Program */
    public static void main(String[] args) {
        fizzbuzz(20);
    }
}

