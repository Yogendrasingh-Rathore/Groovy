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
            println "True"
        }
        else
        {
            println "False"
        }

    /* 
        def regex = /(?:yuvi)/
        def str = "I am yuvi" =~ regex


        def file = new File("JsonSlurper.groovy")
        file.eachLine{ line, lineNo ->
        println lineNo line
        def regex1 = /(?:json)/
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