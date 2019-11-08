import java.io.File
import groovy.json.JsonOutput

class Validate
{
    static void main(String[] arg)
    {
        def f = new File("Value.csv")
        
        def data = f.text
        String[] line = data.split("\n")
       
        f.text = ''

        for (i in 0..<line.size())
        {

            String[] elements = line[i].split(",")
        
            String e = elements[0] 
            String a = elements[1] 
            String u = elements[2] 
    
            f.append("${line[i]}")

            def regex_email = /\w+@\w+\.\w{3}/
            def regex_email2 = /\w+@\w+\.\w{2}\.\w{2}/
            def regex_email3 = /\w+@\w+\.\w{3}\.\w{2}/

            if (!(e ==~ regex_email) && !(e ==~ regex_email2) && !(e ==~ regex_email3))
            {
                
                f.append(',Invalid Email,')
            }
            else
            {
                f.append(',Valid Email,')
            }


            def regex_alpaNumeric = /[a-zA-Z]{3}[0-9]{3}[a-zA-Z]{2}/
            if (!(a ==~ regex_alpaNumeric))
            {
                f.append('Invalid AlphaNumeric,')
            }
            else
            {
                f.append('Valid AlphaNumeric,')
            }


            def regex_url = $/https://www.\w+.\w{2,3}/$
            if (!(u ==~ regex_url))
            {
                f.append('Invalid URL\n')
            }
            else
            {
                f.append('Valid URL\n')
            }

        }

            
            def data2 = f.text
            String[] line2 = data2.split("\n")
            def jsonlist = [:]

            for (i in 0..<line2.size())
            {
                String[] elements2 = line2[i].split(",")

                
                jsonlist.put("${++i}",["${elements2[3]}","${elements2[4]}","${elements2[5]}"])


            }

           jsonlist.each { item -> println "$item.key $item.value" }
         
            def json = JsonOutput.toJson(jsonlist)
            println json


    }

    
       
}