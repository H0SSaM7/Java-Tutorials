package arrays_and_function;

public class arrays {
    // there is two main ways to declair an array;
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 22;
        a[1] = 33;
        a[2] = 44;

        int[] b = {22,33,44};
        for(int i = 0; i< b.length; i++){
            System.out.println(b[i]);
        }
        for(var element : b){
            System.out.println(element);
        }
    }
    
}
