import groovy.json.JsonSlurper 
import java.io.File

class Slurper
{
    static void main(String[] args)
    {
                def body = 
        '''
            {
                "model":
                [
                    {
                        "id": 1,
                        "name": "yuvi"
                    },
                    {
                        "id": 2,
                        "name": "advait"
                    },
                    {
                        "id": "3",
                        "name": "rey"
                    }
                ]
            }
        '''
       
        def slurper = new JsonSlurper()
        def obj = slurper.parseText(body)
        
        String modelname = "rey"

        for(i in 0..obj.model.size()-1)
        {
            if (obj.model[i].name.equals(modelname))
            {
                println obj.model[i].id + ' ' + obj.model[i].name
            }
        }
        

    }
}