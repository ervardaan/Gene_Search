
/**
 * Write a description of Part5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Incessentgene {
public String findvalidgene(String dna)
{
    int pos1=dna.indexOf("ATG");
    int pos2=pos1;//share same values and not point to same object
    int pos=0;
    boolean check=false;
    while (pos!=-1 && check==false)
    {
        pos=dna.indexOf("TAA",pos1+1);
        if ((pos-pos2)%3==0)
        {
            check=true;
            
}
pos1=pos;
}
if (pos==-1)
{
    return "";
}
else
{
return dna.substring(pos2,pos+3);}}
public void testmethod()
{
    String gene="ATGATCGCTAATGCTTAAGCTATG";
    String getgene=findvalidgene(gene);
    System.out.println(getgene);

}}




