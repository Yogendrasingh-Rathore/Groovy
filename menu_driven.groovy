        def add(a,b)
        {
            def c = a + b
            c
        }

        def sub(a,b)
        {
            def c = a - b
            c
        }

        def mult(a,b)
        {
            def c = a * b
            c
        }

        def div(a,b)
        {
            assert b!=0
            def c = a / b
            c
        }                

        def ch = 0

        while(true)
        {
                println "1.Add\n2.Sub\n3.Mult\n4.Sub\n5.Exit"

                println "Enter your choice"
                ch = System.in.newReader().readLine() as Integer  


                switch(ch) {
                    case 1: println "Enter numbers to add"
                            def a = System.in.newReader().readLine() as Integer                           
                            def b = System.in.newReader().readLine() as Integer 
                            def c = add(a,b)
                          
                    break

                    case 2: println "Enter numbers to subtract"
                            def a = System.in.newReader().readLine() as Integer 
                            def b = System.in.newReader().readLine() as Integer 
                            def c = sub(a,b)
                            println "Subtration is : ${c}" 
                    break

                    case 3: println "Enter numbers to Multiple"
                            def a = System.in.newReader().readLine() as Integer 
                            def b = System.in.newReader().readLine() as Integer 
                            def c = mult(a,b)
                            println "Multiplication is : ${c}"            
                    break

                    case 4: println "Enter numbers to Divide"
                            def a = System.in.newReader().readLine() as Integer 
                            def b = System.in.newReader().readLine() as Integer 
                            def c = div(a,b)
                            println "Division is : ${c}"            
                    break

                    case 5: System.exit(0)

                    default: println "Invalid Choice" 
                }

        }        