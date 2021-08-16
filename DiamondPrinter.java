import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {

        int num = 0;
        String temp = "";
        ArrayList str = new ArrayList();

        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for(char l : letters){
            if(l == a){
                break;
            }
            num += 1;
        }

        for(int i = 0; i < num+1; i++){
            int midNum = 0;
            for(int space = num-i; space > 0; space--){
                temp += " ";
            }
            temp += letters[i];
            if(i == 0){
                for(int end = num -i; end > 0; end--){
                    temp += " ";
                }
            }else {
                for(int mid = i+(i-1); mid > 0; mid--){
                    temp += " ";
                }
                temp += letters[i];  // Second letter
                for(int end = num - i; end > 0; end--){
                    temp += " ";
                }
            }
            str.add(temp);
            temp = "";
        }
        for(int rev = str.size()-2; rev >= 0; rev--){
            String temp2 = "";
            temp2 = str.get(rev).toString();
            str.add(temp2);
        }

        for(int x = 0; x < str.size(); x++){
            System.out.println(str.get(x));
        }
        return str;
    }

}
