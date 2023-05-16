echo "# adlfkja" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Destroyer156/adlfkja.git
git push -u origin main
/**
 * Write a description of class Dna here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dna
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Dna
     */
    public Dna()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
