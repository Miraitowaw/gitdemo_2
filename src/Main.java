import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        //write your code here......
        line = line.replaceAll("[^a-zA-Z]", "");
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }

        }

        Set<Map.Entry<Character, Integer>> entrys = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrys) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("修改---------");
        //第二次修改，提交并推送到远程GitHub仓库上
    }
}