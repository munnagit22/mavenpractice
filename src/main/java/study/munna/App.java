package study.munna;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("project imported successfull.......!!!");
		
    }
	void countVowel()
	{
		String s="computer";
		 long count= s.char().stream().filtter((v->v=='a'||v=='e'||v=='i')).count();
		 System.ou.println("Total vowel are:->"+count);
	}
}
