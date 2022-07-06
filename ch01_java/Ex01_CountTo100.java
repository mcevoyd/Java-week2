public class Ex01_CountTo100 {
    public static void main(String[] args) {       

        for (int x=1; x<=100; x ++){
            if (x%9 == 0){
                System.out.println("Cats have 9 lives!");
            } else {
                System.out.println(x);
            }
            
        }
    }
    
}
