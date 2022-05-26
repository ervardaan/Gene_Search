
/**
 * Write a description of debug_part_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class debug_part_1 {
public void replacecharacter(String a,String b)
{
    int pos=b.indexOf(a);int pos1=0;
    if (pos==-1){
        System.out.println("not found");
    }
    else{
        while(pos!=-1)
    {
      System.out.print(b.substring(pos1,pos));
      System.out.print(a.substring(1,a.length()));
      pos1=pos+a.length();
      pos=b.indexOf(a,pos1);
      System.out.println();
}
System.out.print(b.substring(pos1));}
}}
