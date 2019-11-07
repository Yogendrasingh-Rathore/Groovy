import java.io.File

class Validate
{
    static void main(String[] arg)
    {
        def f = new File("Value.csv")
        def f1 = new File("/home/cuelogic.local/yogendrasingh.rathor/Notes/Groovy/Output.csv")

        def data = f.text
        String[] line = data.split("\n")
        

        for (i in 0..<line.size())
        {

            String[] elements = line[i].split(",")
        
            String e = elements[0] 
            String a = elements[1] 
            String u = elements[2] 
    
            def regex_email = /\w+@\w+\.\w{2,6}/
            if (!(e ==~ regex_email))
            {
                f1.append('\n Invalid Email,')
            }


            def regex_alpaNumeric = /\w{3}\d{3}\w{2}/
            if (!(a ==~ regex_alpaNumeric))
            {
                f1.append('Invalid AlphaNumeric,')
            }


            def regex_url = $/https://www.\w+.\w{2,3}/$
            if (!(u ==~ regex_url))
            {
                f1.append('Invalid URL')
            }
        }
            
        f1.eachLine{ line1, lineNo ->
            println "${lineNo} ${line1}"
         }


    }
     
       
}