
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
public String findSimpleGene(String dna,String startc,String stopc){
    
    int c1=dna.indexOf(startc);
    String st="";
    if (c1==-1)
    {
        st="";
}
else{
    int c2=dna.indexOf(stopc,c1+3);
    if (c2==-1)
    
    {
        st="";
    }
    else
    {
        if ((c2-c1)%3==0)
        {
            st= dna.substring(c1,c2+3);
        }}}
    return st;
    }

public void testSimPleGene()
{
 String dna1="AGTCGCTACGTACGTAATCACGTA"; // NO ATG
 String dna2="GCAGTATGCGAGT" ;//NO TAA
 String dna3="ACTGACGCTCAGTCA"; //NEITHER ATG NOR TAA
 String dna4="CAGTATGCTGCAGCTAGCATAACTAGACT" ;//BOTH WITH 3 MULTIPLE
 String dna5="GATCGTATGCTAGCATCGATAAGTACGT" ;// BOTH WITHOUT 3 MULTIPLE
String start_Codon="ATG";
String stop_Codon="TAA";
String test1=findSimpleGene(dna1,start_Codon,stop_Codon);
System.out.println("gene"+test1);
String test2=findSimpleGene(dna2,start_Codon,stop_Codon);
System.out.println("gene"+test2);
String test3=findSimpleGene(dna3,start_Codon,stop_Codon);
System.out.println("gene"+test3);
String test4=findSimpleGene(dna4,start_Codon,stop_Codon);
System.out.println("gene"+test4);
String test5=findSimpleGene(dna5,start_Codon,stop_Codon);
System.out.println("gene"+test5);
}
}
