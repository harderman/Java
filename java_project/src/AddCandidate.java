package com.bittech.hello;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//interface AddCandiDate {
//    int AddCandidates(char CandidateName);
//    void vote(char CandidateName);
//    int GetVoteResult(char CandidateName);
//    void Clear();
//}
//public class AddCandidate implements AddCandiDate{
//    public static void main(String[] args) {
//        Scanner sca = new Scanner(System.in);
//        String n = sca.next();
//        List<String> list = new ArrayList<>();
//        list.add(n);
//    }
//    @Override
//    public int AddCandidates(char CandidateName) {
//
//
//        return 0;
//    }
//
//    @Override
//    public void vote(char CandidateName) {
//
//    }
//
//    @Override
//    public int GetVoteResult(char CandidateName) {
//        return 0;
//    }
//
//    @Override
//    public void Clear() {
//
//    }
//}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * All Rights Reserved !!!
 */
public class AddCandidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String[] names = new String[n + 1];
            Map<String, Integer> map = new HashMap<>(n);

            for (int i = 0; i < n; i++) {
                names[i] = scanner.next();
                map.put(names[i], 0);
            }
            names[n] = "Invalid";
            map.put(names[n], 0);
            int v = scanner.nextInt();
            while ((--v) >= 0) {
                String s = scanner.next();
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(names[n], map.get(names[n]) + 1);
                }
            }
            StringBuilder builder = new StringBuilder();
            for (String s: names                 ) {
                builder.append(s).append(" : ").append(map.get(s)).append('\n');
            }
            System.out.print(builder.toString());

        }
        scanner.close();
    }
}