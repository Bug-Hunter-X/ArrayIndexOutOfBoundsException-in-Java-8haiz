public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        System.out.println(arr[0]); // Accessing valid index
        //for demonstration purposes only
        //handling potential exception
        try{
          System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Exception caught: "+e.getMessage());
        }
    }
}