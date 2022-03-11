

package arrays_and_function;
class StringMethods {
   public static void main(String[] args) {
       String name = "Hossam Ramadan Elkasas";
       System.out.println(name.length());
       System.out.println(name.contains("H"));
       System.err.println(name.isEmpty());
       System.out.println(name.indexOf("E"));
       System.out.println(name.lastIndexOf("a"));
       System.out.println(name.charAt(2));
       System.out.println(name.equals("Hossam"));
       System.out.println(name.compareTo("Hossam Ramadan Elkasas"));
       System.out.println(name.endsWith("s"));
       System.out.println(name.toUpperCase());
       System.out.println(name.toLowerCase());
       //substract from text
       System.out.println(name.substring(10));
       // add to text
       System.out.println(name.concat("/Eng"));
       System.out.println(name.replace(
           "Elkasas", "replacement"));
           System.out.println(name.replaceFirst("R", "r"));
           System.out.println(name.replaceAll("Hoss", "Hossam"));
        char[] arr = name.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i == arr.length - 1){
                System.out.println("\n");
            }
        } 
        
       // String Buffer
       System.out.println("-----------------StringBuffer---------------");
       StringBuffer a = new  StringBuffer("abcd");
       System.out.println(a.append('e'));
       System.out.println(a.delete(0, 2));
       System.out.println(a.deleteCharAt(0));
       System.out.println(a.length());
       System.out.println(a.capacity());
       System.out.println(a.insert(0, "heallo"));

   }
}