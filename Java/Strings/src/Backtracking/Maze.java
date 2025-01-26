package Backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(mazeCount(3,3));
//        System.out.println(mazeCountDiagonal(3,3));
//      mazePath("",3,3);
//      System.out.println(mazePathRet("",3,3));
//      System.out.println(mazePathDiagonal("",3,3));

        // false --> obstacles
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        mazePathRestrictions("",board,0,0);

    }

    // Counting how many ways we can go from A to B.
    static int mazeCount(int r, int c){
        //If anyone == 1 --> return 1
        if(r == 1 || c == 1){
            return 1;
        }
        int left = mazeCount(r-1,c);
        int right = mazeCount(r,c-1);

        return left+right;
    }
    // Here we're printing the ways from where we can go from A to B.
    static void mazePath(String p,int r, int c){
        //If both == 1 --> return ans
        if(r == 1 && c == 1){
            System.out.println(p);
            return ;
        }
        // If r == 1, you can't go to Down
        if (r > 1){
            mazePath(p+'D',r-1,c);
        }
        // If c == 1, you can't go to Right
        if(c > 1){
            mazePath(p + 'R',r,c-1);
        }
    }
    // Here we're returning the ArrayList.
    static ArrayList<String> mazePathRet(String p, int r, int c){
        //If both == 1 --> return ans
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        // If r == 1, you can't go to Down
        if (r > 1){
            ans.addAll(mazePathRet(p+'D',r-1,c));
        }
        // If c == 1, you can't go to Right
        if(c > 1){
            ans.addAll(mazePathRet(p+'R',r,c-1));
        }
        return ans;
    }
    // You can go RIGHT, DOWN && DIAGONAL
    static int mazeCountDiagonal(int r, int c){
        //If anyone == 1 --> return 1
        if(r == 1 || c == 1){
            return 1;
        }
        int left = mazeCountDiagonal(r-1,c);
        int diagonal = mazeCountDiagonal(r-1,c-1);
        int right = mazeCountDiagonal(r,c-1);

        return left+diagonal+right;
    }
    // Here we're returning the ArrayList if we go Diagonally.
    static ArrayList<String> mazePathDiagonal(String p, int r, int c){
        //If both == 1 --> return ans
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        // If r == 1, you can't go to Down
        if (r > 1){
            ans.addAll(mazePathDiagonal(p+'D',r-1,c));
        }
        // If r == 1 && c == 1, you can't go to Diagonally anymore.
        if (r > 1 && c > 1){
            ans.addAll(mazePathDiagonal(p+'d',r-1,c-1));
        }
        // If c == 1, you can't go to Right
        if(c > 1){
            ans.addAll(mazePathDiagonal(p+'R',r,c-1));
        }
        return ans;
    }
    // Path with the restrictions
    static void mazePathRestrictions(String p,boolean[][] maze,int r, int c){
        //If both == 2 --> return ans
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return ;
        }
        // This is stop the recursion, if you find obstacles/restrictions
        if (!maze[r][c]){ // !(maze[r][c] == false) --> give us true.
            return;
        }
        // If r == 2, you can't go to Down
        if (r < maze.length-1){
            mazePathRestrictions(p+'D',maze,r+1,c);
        }
        // If c == 2, you can't go to Right
        if(c < maze[0].length-1){
            mazePathRestrictions(p + 'R',maze, r,c+1);
        }
    }
}
