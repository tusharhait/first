public class Package {
    public static long minimalNumberOfPackages(long items, long availableLargePackages, long availableSmallPackages) {
        long largePackageamount= items/5;
        largePackageamount=Math.min(largePackageamount,availableLargePackages);
        long remaining=items-(largePackageamount*5);
        if(remaining<=availableSmallPackages){
            return largePackageamount + (remaining>0?1:0);
        }else if(remaining>availableSmallPackages){
            long add = (long) Math.ceil((double)remaining/5);
            if(largePackageamount+add<=availableLargePackages){
                return largePackageamount+add;
            }else{
                return -1;
            }
        }
        return -1;
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(13, 3, 10));
    }
}
