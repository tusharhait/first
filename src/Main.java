import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
//        System.out.println(main.intersect(new int[]{1,2,2,1}, new int[]{2,2}));
//        Dog d =  new Dog("black");
//        d.sample();
        // ArrayList with duplicate elements
        ArrayList<Integer> numbersList
                = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        //todo
        Map<Integer, Long> elementCountMap = numbersList.stream()
                .collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));

        //System.out.println(elementCountMap);

        int[] arr = new int[]{4,7,3,4,8,1};
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(main.isValidSudoku(board));
        System.out.println(main.nextGreater(arr));

        List<String> input = new ArrayList<>();

        input.add("apple");
        input.add("orange");
        input.add("mango");
        input.add("grape");

        input.stream().filter(s->s.startsWith("m")).forEach(System.out::println);

        input.add("orange");
        input.add("mango");

        input.stream().collect(Collectors.groupingBy(e->e,Collectors.maxBy(Comparator.comparing(String::toLowerCase)))).get("orange").ifPresent(System.out::print);
    }

    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        int[][] box = new int[9][9];
        for(int i=0; i<9; i++){
            for(int j =0; j<9; j++){
                if(!(board[i][j]=='.')){
                    int val = board[i][j]- '0';
                    int value = val-1;
                    int boxno= 3*(i/3)+(j/3);
                    if(rows[i][value]==1 && columns[j][value]==1 && box[boxno][value]==1){
                        return false;
                    }
                    rows[i][value]=1;
                    columns[j][value]=1;
                    box[boxno][value]=1;
                }
            }
        }
        return true;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        int i =0;
        int r= 0;
        List<Integer> result = new ArrayList<Integer>();
        while(i<nums1.length && r<nums2.length){
            if(nums1[i]==nums2[r]){
                result.add(nums1[i]);
                i++;
                r++;
                if(i==nums1.length || r==nums2.length){
                    return result.stream().mapToInt(Integer::intValue).toArray();
                }
            }else{
                if(result.size()==1){
                    result.remove(0);
                }else if(result.size()>=2){
                    return result.stream().mapToInt(Integer::intValue).toArray();
                }else{
                    r++;
                    if(r==nums2.length){
                        i++;
                        r=0;
                    }
                }

            }
        }
        return new int[1];
    }

    // 4,7,3,4.8.1
    public int[] nextGreater(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> integerStack = new Stack<>();
        for(int i = arr.length-1; i>=0; i--){
            if(!integerStack.isEmpty()){
                while(!integerStack.isEmpty() && integerStack.peek()<=arr[i]){
                    integerStack.pop();
                }
            }
            if(integerStack.isEmpty()){
                result[i]=-1;
            }else{
                result[i] = integerStack.peek();
            }
            integerStack.push(arr[i]);
        }
        return result;
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> counter = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(counter.get(nums[i])!=null){
                counter.put(nums[i],counter.get(nums[i])+1);
            }else{
                counter.put(nums[i],1);
            }
        }
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>(
                (a,b)->a.getValue().equals(b.getValue())?Integer.compare(b.getKey(),
                        a.getKey()):Integer.compare(b.getValue(),a.getValue())
        );
        for(Map.Entry<Integer,Integer> entry: counter.entrySet()){
            queue.offer(entry);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(queue.poll().getKey());
        }
        return result.stream().mapToInt(Integer::intValue).toArray();

    }
}