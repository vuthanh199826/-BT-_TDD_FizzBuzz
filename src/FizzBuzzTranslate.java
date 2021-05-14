public class FizzBuzzTranslate {
    public static String traslate(int number){
        boolean chiaHetCho3 = number%3==0;
        boolean chiaHetCho5 = number%5==0;
        if(chiaHetCho3 && chiaHetCho5){
            return "FizzBuzz";
        }else if(chiaHetCho5){
            return "Buzz";
        }else if(chiaHetCho3){
            return "Fizz";
        }else {
            return ""+number+"";
        }
    }
}
