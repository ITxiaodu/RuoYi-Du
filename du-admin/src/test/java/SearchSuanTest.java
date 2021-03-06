public class SearchSuanTest {

    public static void main(String[] args) {

        String a = "wqweq";
        if (!(a.length()==0)){
            System.out.println(0);
        }else {
            System.out.println(a.length());
        }


    }

    public static int bsearch(int[] a, int n, int value){
        int low = 0;
        int high = n - 1;
        while (low<high){
            int mid = (low + high) /2;
            if (a[mid] == value){
                return mid;
            } else if (a[mid] < value) {
                low = mid+1;
            }else {
                high = mid -1;
            }
        }
        return  -1;
    }

    private static int Bsearch(int[] a,int n,int value){
        return bsearchInternally(a,0,n-1,value);
    }

    private static int bsearchInternally(int [] a ,int low,
                                         int high,int value){
        int mid = low + ((high-low)>>1);
        if (a[mid] == value){
            return mid;
        }else if (a[mid]<value){
            return bsearchInternally(a,mid+1,high,value);
        }else {
            return bsearchInternally(a,low,mid-1,value);
        }
    }

    public static int searchOne(int[] a,int n,int value){
        int low = 0;
        int high = n - 1;
        while (low<=high){
            int mid = low + ((high-low)>>1);
            if (a[mid] > value){
                high = mid - 1;
            }else if (a[mid] < value){
                low = mid + 1;
            }else {
                if ((mid == 0)||(a[mid-1]!=value)){
                    return mid;
                }else {
                    high = mid - 1;
                }
            }
        }
        return  -1;
    }
}