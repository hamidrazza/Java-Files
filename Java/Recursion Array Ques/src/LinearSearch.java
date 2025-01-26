import java.util.ArrayList;

// Linear Search using Recursion
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,5,11,11,4,18,9};
//        System.out.println(find(arr,11,0));
//        System.out.println(findIndex(arr,11,0));
//        System.out.println(findFromLast(arr,11,arr.length-1));
//        findAllIndex(arr,11,0);
//        System.out.println(list);
//        ArrayList<Integer> ans = findAllIndexWithArrayList(arr,11, 0, new ArrayList<>());
//        System.out.println(ans);
        System.out.println(findAllIndex3(arr, 11, 0));
    }
    static boolean find(int[] arr, int target, int index){
        // Base Condition
        if(index == arr.length){
            return false;
        }
        return (arr[index]==target) || find(arr, target, index+1);
    }

    static int findIndex(int[] arr, int target, int index){
        // Base condition
        if(index == arr.length){
            return -1; // means element not found
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr,target,index+1);
    }
    static int findFromLast(int[] arr, int target, int index){
        // Base condition
        if(index == -1){
            return -1; // means element not found
        }
        if(arr[index] == target){
            return index;
        }
        return findFromLast(arr,target,index-1);
    }

    static void findAllIndex(int[] arr, int target, int index){
        // Base condition
        if(index == arr.length){
            return ; // means element not found
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> findAllIndexWithArrayList(int[] arr, int target, int index, ArrayList<Integer> list2){
        // Base condition
        if(index == arr.length){
            return list2; // means element not found
        }
        if(arr[index] == target){
            list2 .add(index);
        }
        return findAllIndexWithArrayList(arr,target,index+1,list2);
    }
    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index){
        ArrayList<Integer> list3 = new ArrayList<>();
        // Base condition
        if(index == arr.length){
            return list3; // means element not found
        }
        if(arr[index] == target){
            list3.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr,target,index+1);
        list3.addAll(ansFromBelowCalls);
        return list3;
    }
}
