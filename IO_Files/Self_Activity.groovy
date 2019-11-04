/*
Create a Directory in which create 3 files f1,f2,f3
f1 containes json code & f2 contains groovy code
Convert f1 code into groovy using JsonSlurper & Convert f2 code into json using JsonOutput
Copy the contents of f1 and f2 files into f3 file
Display Total No Of Lines, Size of File, isFile and contents of f3
*/

import groovy.json.JsonSlurper 
import groovy.json.JsonOutput
import java.io.File


class Example
{
    static def nol

    static void main(String[] args)
    {
        //Create a Self_Activity Directory

        def d = new File("/home/cuelogic.local/yogendrasingh.rathor/Notes/Groovy/IO_Files/Self_Activity")
        d.mkdir()

        //Create a files f1,f2,f3 inside Self_Activity Directory

        File f1 = new File("/home/cuelogic.local/yogendrasingh.rathor/Notes/Groovy/IO_Files/Self_Activity/f1.txt")
        File fjson = new File("/home/cuelogic.local/yogendrasingh.rathor/Notes/Groovy/IO_Files/example_2.json")
        f1.write(fjson.text)

        File f2 = new File("/home/cuelogic.local/yogendrasingh.rathor/Notes/Groovy/IO_Files/Self_Activity/f2.txt")
        File fgroove = new File("/home/cuelogic.local/yogendrasingh.rathor/Notes/Groovy/collections.groovy")
        f2.write(fgroove.text)


        // Parsing json file to groovy

        def slurper = new JsonSlurper()
        def obj1 = slurper.parseText(f1.text)

        // Parsing groovy file to json

        def obj2 = JsonOutput.toJson(f2.text)


        // Creating file f3 and adding contents of f1 and f2 in file f3
        
        File f3 = new File("/home/cuelogic.local/yogendrasingh.rathor/Notes/Groovy/IO_Files/Self_Activity/f3.txt")
        
        f3.write(" \n")
        f3 << obj1
        f3 << "\n\n"        
        
       
        f3 << obj2

        println f3.length() + "Bytes"
        println "Is File : " + f3.isFile() 

        f3.eachLine{ line, lineNo ->
        println lineNo + "${line}"
        nol = lineNo
        }

        println "Total No of lines : "+nol

    }
}