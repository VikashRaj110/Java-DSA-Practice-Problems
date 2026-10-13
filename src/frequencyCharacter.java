import java.util.HashMap;

public class frequencyCharacter {
    static void main(String[] args) {
        String str = "vikash rajput";
        countCharacter(str);
    }
      public static void countCharacter(String str){
//        for(int i=0;i<str.length(); i++) {
//            char ch = str.charAt(i);
//            int count = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(j) == ch) {
//                    count++;
//                }
//            }
//            System.out.println(ch + " :" + count);
//        }
          HashMap<Character,Integer> map = new HashMap<>();
          for (int i = 0; i < str.length(); i++) {
              char ch = str.charAt(i);
              map.put(ch,map.getOrDefault(ch,0)+1);
          }
                 for(char ch: map.keySet()){
                     System.out.println(ch + "->" + map.get(ch));
                 }
          }
}
