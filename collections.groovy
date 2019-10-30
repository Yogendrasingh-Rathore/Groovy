class collections
{
    static def list()
    {
        def l1 = [1,'a',3]
        def l2 = l1.clone()
        
        assert l1==l2 : "Clone Failed"
        l2[3] = 5

        // To print each item of list
        l2.each {println it}
        
        l2        
    }
    
    static void main(String []arg)
    {
        def a = list()
        println a 
        println a.size()
        println a.getClass()
        println a.get(0)
    }
}