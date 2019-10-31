import groovy.json.JsonSlurper 

class slurper {

   static void main(String[] args) {
      def jsonSlurper = new JsonSlurper()
      def obj = jsonSlurper.parseText ''' {"Integer": 12, "fraction": 12.55, "double": 12e13}'''
		
      println(obj.Integer);
      println(obj.fraction);
      println(obj.double); 
   } 
}