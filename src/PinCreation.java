public class PinCreation {
    static String[] set = {"1","2","3","4","6","7","8","9","0"};
    public static String createPin(){
       String i = set[(int) (Math.floor(Math.random() * 10))];
       String j = set[(int) (Math.floor(Math.random() * 10))];
       String k = set[(int) (Math.floor(Math.random() * 10))];
       String l = set[(int) (Math.floor(Math.random() * 10))];
       return (i+j+k+l);
    }
    public static void main(String[] args)
    {
         String me = createPin();
         System.out.print(me);
    }
}
