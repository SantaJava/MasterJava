public class Singleton {
//Singleton pattern practice
    private static Singleton one;
   private Singleton(){

   }

   public static Singleton getInstance(){
        if(one == null){
            one = new Singleton();
        }
        return one;
   }
}
