import static java.util.Calendar.*    

class collections
{
    static def list()
    {
        def l1 = [1,2,[3,4],5]
        def l2 = l1.clone()
        //l1.clear()
        println l1
        //assert l1==l2 : "Clone Failed"
        l2[2] = 5

        // To print each item of list
        l2.each {println it}

        //assert l2.find{ it > 1 } : "find not true"
        println l2.find{ it > 2}  // returns only first true value in list
        println l2.findAll{ it > 2}  // returns all true value in list
        println l2.every { it < 6}  // returns boolean true/false for every element in list
        println l2.any{ it > 1}     // returns boolean true/false for any element in list
        
        println l2.sum()
        println l2.sum(l1)

        println "Intersection : " + l2.intersect(l1)
        println "Disjoint : " + l2.disjoint(l1)
        println "Sorted List l2 " + l2.sort()
        println "Reverse List l2 " + l2.reverse()

        l2        
    }
    

    static def map()
    {
        def map = [name : 'yuvi', age :24, hobby : 'dancing']
        println "Orignal Map : " + map

        map['hobby'] = 'writing' 
        println "Hobby Changed : " + map

        map.put("gender","male")
        println "Gender Added : " + map

        def map2 = [1,2,3,[name:'yuvi', age:24],5]
        println map2
        println map2.size()
        println map2.get(3).size() // To get size of inner map in list
        
        //map2.eachwithIndex { key, value, i -> println $i $key $value }
        //map2.each { entry -> println "Name $entry.key" }

        map.each { entry -> println "$entry.key $entry.value" }
        //println map.findAll { it.value.name == 'yuvi' }


    }


    static def range()
    {
        def range = 1..4
        
        (range).each{ i -> println "${i}" }

        range = 12..<8

        (range).each { i -> println "${i}" }

        for(i in range)
        {
            println i
        }
    }


    static def cal()
    {
        def cal = Calendar.instance
        println cal[YEAR] + ' '+ cal[MONTH] +' '+ cal[DATE]
    }


    static void main(String []arg)
    {
        def a = list()
        println a 
        println a.size()
        println a.getClass()
        println a.get(0)


        map()

        range()

        cal()
    }
}