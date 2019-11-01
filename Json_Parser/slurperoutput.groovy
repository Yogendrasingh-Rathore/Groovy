import groovy.json.JsonOutput
import java.io.File

class jsonOutput
{
    static void main(String []args)
    {

        def info = [name: "Yuvi", age: "24"]
        def json = JsonOutput.toJson(info)

        println "This is json : " + json
        println "This is a groovy map : " + info
        println "${json.class}"

        def newJson = '{"name":"Yuvi","age":"24"}'
        assert(json == newJson)

    }

 

}
