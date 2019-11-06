def mno()
{
    println "Enter Mobile No. : "
    def mno = System.in.newReader().readLine() 
    def no = /[6-9][0-9]{9}/

    println mno ==~ no
}

def email()
{
    println "Enter Email Id : " 
    def email = System.in.newReader().readLine()
    def regex_email = /\w+@\w+\.\w{2,3}/

    println email ==~regex_email
}

def citylist()
{
    def city = ["Pune","Mumbai","Delhi"]
    def regex_city = /Delhi/


    for (i in 0..2)
    {
        print "${city[i]} : " 
        print city[i] ==~ regex_city
        println ""
    }
}



def lt = [2,3,4]
def lt2 = [20,30,40]

def num = 2
lt.each { i -> println i * num}
lt2.each { i -> println i * num}


citylist()
mno()
email()

 /*
 if(no)
 {
     println "Valid Number"
 }
 else
 {
     println "Enter a Valid Mobile Number"
 }

*/