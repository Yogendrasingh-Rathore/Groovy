import groovy.json.JsonSlurper 
import java.io.File

class Slurper
{
    static void main(String[] args)
    {
        File f = new File("example_2.json")
       
        def slurper = new JsonSlurper()
        def obj = slurper.parseText(f.text)
        
            println obj.quiz.sport.q1.question

            for(j in 0..obj.quiz.sport.q1.options.size()-1)
            {
                println obj.quiz.sport.q1.options[j]
            }

            println "Correct Answer : " + obj.quiz.sport.q1.answer
        
    }
}