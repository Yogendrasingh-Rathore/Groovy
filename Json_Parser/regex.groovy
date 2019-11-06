import java.io.File

class regex
{
    static void main(String[] args)
    {

        def regex = /^\d+$/
        print "Enter a no : "
        def match = System.in.newReader().readLine() =~ regex 
        
        if(match)
        {
            println "All are numbers"
        }
        else
        {
            println "Only Numbers are Allowed"
        }

        println 'Groovy' =~ 'Groovy' 
  //      def regex = /(?:yuvi)/
  //      def str = "I am yuvi" =~ regex


// Code to replace all var with def in file slurper.groovy

        def file = new File("slurper.groovy")
        def content = file.text

        for (i in 1..3)
        {
            content = ( content =~ /var/).replaceAll("def")
        }
        file.write(content)


/*
        file.eachLine{ line, lineNo ->
        println lineNo line
        def regex1 = /(?:def)/
        def match = file.text() =~ regex1

        if(match)
        {
            file.eachLine{ line, lineNo ->
            println lineNo line match[0]
            }
        }
*/        
        
/*
        if(str)
        {
            println str[0] + " is at : " 
        }
        else
        {
            println "No Match Found for : ${regex[3..6]}"
        }
*/
        
        
    }
}