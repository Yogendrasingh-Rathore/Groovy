import groovy.json.JsonSlurper 

class slurper {

   static void main(String[] args) {
      def jsonSlurper = new JsonSlurper()
      def obj = jsonSlurper.parseText ''' {"Integer": 12, "fraction": 12.55, "double": 12e13}'''
		
      def result = jsonSlurper.parseText('{"person":{"name":"Guillaume","age":33,"pets":["dog","cat"]}}')
      println result.person.name

      println(obj.Integer);
      println(obj.fraction);
      println(obj.double); 
   } 
}