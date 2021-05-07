
    public class stringCheck {
        public static void main(String[] args) {
            String str="Bob hit a ball, the hit BALL flew far after it was hit.";
            String banned=" hit";
            String sen=str.replace(banned,"");
            System.out.println(sen);
        }
    }
    
