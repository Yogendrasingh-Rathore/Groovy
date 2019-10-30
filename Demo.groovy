#!/usr/bin/env groovy

class Demo{
    static def name ='yuvi kool'
    static def stringexample()
    {
        

        def s1 = 'Single Quotes String'
        def s2 = "Double quotes string support string interpolation ${name}"
        def s3 = ''' Multi line
                    String
                    is here
                '''
        def triplequotes_doublestring = """
        hello ji
        welcome
        ${name}
        
        """
        println s1 + ' ' + s2 + " "+ s3
        println s2
        println s3
        println triplequotes_doublestring

    }

    static def Slashy_String()
    {
        def Slashy_String = /single line slashy string/

        String slashy = /slashy string ${Demo.name}/

        println Demo.name
        println slashy

        def Slashy_String2 = / multi-line
                                slashy string
                                ${name}
                                /
        
            println Slashy_String
            println Slashy_String2


            // if strings hv same value then there is only one instance of that string

            def s4 = "yuvi"
            def s5 = "yuvi"

            println s4.hashCode() + " " + s5.hashCode()

    }

    static def numbers()
    {
        // numbers in groovy

            def no = 10
            int no1 = 11

            println no + no1  // Output : 21
            println no +" "+ no1  // Output : 10 11

            // comparing variables

            if(!no.equals(no1))
            {
                // Three ways to compare are
                println no.equals(no1)
                println no == no1
                println no.compareTo(no1)==0
                println no.compareTo(no1)  // Output is -1 means false
            }
            

    }

    static def usingdef()
    {
        // Use of def

        def v = "bhai string hu"
        v = 20

        println v   // Output is 20

        String v1 = "string use kiya hai"
        v1 = 10 

        println v1   // Output is 10
        v1
       // return v  ... if return statement is used it will return v instead of v1
    }

    static void main(String[] args){
        
        stringexample()
        Slashy_String()
        numbers() 
        def a = usingdef()
        println a    // Output is 10, here a = v1
    
    }

}