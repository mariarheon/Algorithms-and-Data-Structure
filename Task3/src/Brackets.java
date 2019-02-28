
public class Brackets {
    private String input;

    public Brackets(String input) {
        this.input = input;
    }
    
    public void check(){
        int size = input.length();
        Stack st = new Stack(size);
        
        for (int i = 0 ; i < size; i++){
            char ch = input.charAt(i);
            switch(ch){
                case '{':
                case '[':
                case '(':
                    st.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!st.isEmpty()){ //перенести в отдельный метод
                        char chr = st.pop();
                        if (ch == ')' && chr != '(' ||
                                ch == '}' && chr != '{' ||
                                ch == ']' && chr != '['){
                            
                            System.out.println("Ошибка " + ch + " в " + (i+1) + " скобке");
                        } 
                        break;
                    }
                    else{
                        System.out.println("Нет левого разделителя");
                        break;
                    }
                default:
                    break;
            }
        }
        
        if(!st.isEmpty()){
            System.out.println("Нет правого разделителя");
        }
    }
}
