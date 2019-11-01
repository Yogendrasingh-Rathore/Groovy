import java.io.File 

class file
{
    static void main(String[] args)
    {
        File file2 = new File("collections.groovy")
        
        //to print the entire file
        println file2.text

        //to print only first 5 lines of file

        def line_range = 1..5
        file2.eachLine { line, lineNo -> 
        if( line_range.contains(lineNo))
        {
            println lineNo +' '+ "${line}"
        }
        }
    }
}
