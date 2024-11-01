public class Insertion {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        int[] s = new int[]{4,5,3,7,2,1};
        for(int i =1;i<s.length;i++){
            int j =i-1;
            int x = s[i];
            while(j!=-1 && s[j]>x){
                s[j+1]=s[j];
                j--;
            }
            s[j+1]=x;
        }

        for(int i: s){
            System.out.print(i+" ");
        }

    }

}
