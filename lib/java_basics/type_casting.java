package java_basics;

 class typecast {
 public static void main(String[] args) {
     
    int x = 2;
    float y;
   
    x = (int)2.8;
    y = (float) 2;

    String num = "10";
    x = Integer.parseInt(num);
    System.out.println(x + 4);
    System.out.println(y);
 }
}
