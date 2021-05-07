import java.util.Arrays;

class solve{
    public void solution(int arrone[],int arrtwo[]){
        Arrays.sort(arrone);
        Arrays.sort(arrtwo);

        int indexOne=0;
        int indexTwo=0;
        int answer1 = 0,answer2=0;
        float smallest= Float.POSITIVE_INFINITY;
        float current= Float.POSITIVE_INFINITY;

        while (indexOne<arrone.length && indexTwo<arrtwo.length){

            int firstNumber=arrone[indexOne];
            int secondNumber=arrtwo[indexTwo];


            if (firstNumber<secondNumber){
                current=secondNumber-firstNumber;
                indexOne++;
            }
            else if (secondNumber<firstNumber){
                current=firstNumber-secondNumber;
                indexTwo++;
            }
            else {
                answer1=firstNumber;
                answer2=secondNumber;
                break;
            }
            if (smallest>current){
                smallest=current;
                answer1=firstNumber;
                answer2=secondNumber;
            }
        }
       System.out.println("["+answer1+" "+answer2+"]");
    }
}


public class smallestDifference {
    public static void main(String[] args) {
        int arrOne[]={-1,5,10,28,20,3};
        int arrTwo[]={26,134,135,15,17};
        solve c=new solve();
        c.solution(arrOne,arrTwo);
    }
}
