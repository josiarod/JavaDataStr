package ds.stack;

public class App {
    public static void main(String[] args) {
        Stack theStack = new Stack(10);
//        theStack.push(20);
//        theStack.push(40);
//        theStack.push(60);
//        theStack.push(80);


        while (!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.println(value);
        }

        App reverse = new App();
        System.out.println(reverse.reverString("Hello"));
    }
    public static String reverString(String str){
        Stack reverseStack = new Stack(str.length());
        for(int i = 0 ; i < str.length(); i++){
            char reverse = str.charAt(i);
            reverseStack.push(reverse);
        }
        String result = "";
        while(!reverseStack.isEmpty()) {
            result += reverseStack.pop();
        }
            return result;

    }


}
