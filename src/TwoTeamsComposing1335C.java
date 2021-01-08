import java.util.*;
public class TwoTeamsComposing1335C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int ans[]=new int[t];
        for (int i = 0; i < t ; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            HashSet<Integer> hs = new HashSet<Integer>();
            for(int k = 0; k < n; k++)
            {
                hs.add(arr[k]);
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int k = 0; k < arr.length; k++) {
                if (map.containsKey(arr[k])) {
                    map.put(arr[k], map.get(arr[k]) + 1);
                } else {
                    map.put(arr[k], 1);
                }
            }
            Iterator entries = map.entrySet().iterator();
            int maxCount = 0;
            while (entries.hasNext()) {
                Map.Entry entry = (Map.Entry) entries.next();
                int count = (Integer) entry.getValue();
                if (maxCount < count) {
                    maxCount = count;
                }
            }

            if (maxCount == 1 && hs.size() == 1) {
                ans[i] = 0;
            } else if (maxCount == hs.size()) {
                ans[i] = Math.min(maxCount, hs.size()) - 1;
            } else {
                ans[i] = Math.min(maxCount, hs.size());
            }
        }
        for (int i = 0; i <t ; i++) {
            System.out.println(ans[i]);
        }
    }
}

