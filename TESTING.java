
/**
 * Write a description of TESTING here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// NOTE THAT THIS CLASS IS JUST A LEARNING CLASS-IT DOESN'T PRODUCE THE DESIRED RESULTS(FOR THE FINAL CLASS,GO TO CLASS debug_part_1)
public class TESTING {
public void findAbc(String input) // this method works only for input of length 4 and not for any input of any size-so if we give it abcd,it gives us bcd but when we give it abcdttabcff it still gives us bcd which is wrong
{
    
    int index = input.indexOf("abc");
    while (true) {
        if (index == -1 || index>input.length()-4)// answer will still be wrong but error or exception will not be shown
        {
            break;
        }
        System.out.println("index is"+index);
        String found = input.substring(index+1, index+4);// this line gives the exception
        System.out.println(found);
        index = input.indexOf("abc", index+3);
        System.out.println("index after updating " + index);
        
    }
}
   public void test() {
    //findAbc("abcd");
    //findAbc("abcdabc");// gives an error exception of ArrayIndexOutOfBounds because when the method gets index=4 it tries to get index=7 but it can't get 7 as maximum index of input string is 6
    //findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
    findAbc("abcabcabcabca");
}
}
