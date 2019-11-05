    Random random = new Random()
    def hidden = random.nextInt(20)

    while (true) {
        print "Guess number: "
        def guess = System.in.newReader().readLine() as Integer
        if (guess < hidden) {
            println "Guess was too small"
        } else if (guess > hidden) {
            println "Guess was too hight"
        } else {
            println "Do you want to chance the Guess?"
            def ack = System.in.newReader().readLine()

            if(ack == "yes" || ack == "Yes" || ack == "YES")
            {
                println "Enter New Guess : "
                guess = System.in.newReader().readLine() as Integer
                if (guess < hidden) {
                    println "New Guess was too small"
                } else if (guess > hidden) {
                    println "New Guess was too hight"
                } else {
                    println "And the New Guess is a ...."
                    sleep(5000)
                    println "Match!"
                    break
                }
            }
            else
            {
                println "And Its a ...."
                sleep(5000)
                println "Match!"
                break
            }
        }
    }
     
    println "Bye"