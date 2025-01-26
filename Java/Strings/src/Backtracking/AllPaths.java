package Backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        // false --> obstacles
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        allPath("",board,0,0);

        int[][] path = new int[board.length][board[0].length];
        allPathPrint("",board,0,0, path,1);
    }
    static void allPath(String p,boolean[][] maze,int r, int c){
        //If both == 2 --> return ans
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return ;
        }
        // This is stop the recursion, if you find obstacles/restrictions
        if (!maze[r][c]){ // !(maze[r][c] == false) --> give us true.
            return;
        }
        maze[r][c] = false; // Marking as false so same cell can't visit again.
        // If r == 2, you can't go to Down
        if (r < maze.length-1){
            allPath(p+'D',maze,r+1,c);
        }
        // If c == 2, you can't go to Right
        if(c < maze[0].length-1){
            allPath(p + 'R',maze, r,c+1);
        }
        if(r > 0){
            allPath(p + 'U',maze, r-1,c);
        }
        if(c > 0){
            allPath(p + 'L',maze, r,c-1);
        }
        // Making as true, so its don't create any problem for the another calls.
        // This is backtracking.
        // When the function is over it will make the cells as True.
        maze[r][c] = true;
    }
    static void allPathPrint(String p,boolean[][] maze,int r, int c, int[][] path,int step){
        //If both == 2 --> return ans
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step; //This is also a step, So we have to add one more step.
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return ;
        }
        // This is stop the recursion, if you find obstacles/restrictions
        if (!maze[r][c]){ // !(maze[r][c] == false) --> give us true.
            return;
        }
        maze[r][c] = false; // Marking as false so same cell can't visit again.
        path[r][c] = step;
        // If r == 2, you can't go to Down
        if (r < maze.length-1){
            allPathPrint(p+'D',maze,r+1,c, path, step+1);
        }
        // If c == 2, you can't go to Right
        if(c < maze[0].length-1){
            allPathPrint(p + 'R',maze, r,c+1, path, step+1);
        }
        if(r > 0){
            allPathPrint(p + 'U',maze, r-1,c, path, step+1);
        }
        if(c > 0){
            allPathPrint(p + 'L',maze, r,c-1, path, step+1);
        }
        // Making as true, so its don't create any problem for the another calls.
        // This is backtracking.
        // When the function is over it will make the cells as True.
        maze[r][c] = true;

        // At every new path we have to start from starting.
        path[r][c] = 0;
    }
}
