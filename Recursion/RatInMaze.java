package Recursion;

import java.util.*;

public class RatInMaze
{   
    // solve() --> isSafe()
    private static boolean isSafe(int x, int y, int n, ArrayList<ArrayList<Integer>> visited, int[][] ar)
    {
        if( (x>=0 && x<n) && (y>=0 && y<n) && ar[x][y]==1 && visited.get(x).get(y).equals(0) )
        {
            return true;
        }
     
        return false;
    }

    // findPath() --> solve()
    private static void solve(int[][] ar, int n, ArrayList<String> ans, int x, int y,ArrayList<ArrayList<Integer>> visited, StringBuilder path)
    {
        //base case
        if(x==n-1&& y==n-1)
        {
            ans.add(path.toString());
            return;
        }

        //we are at x,y

        //mat.get(row).set(col,value);
        visited.get(x).set(y,1);

        //4 choicse - D L R U

        //Go Down
        int newx = x+1;
        int newy= y;

        if(isSafe(newx,newy,n,visited,ar)) //check the following condition for movement
        {
            path.append('D');

            solve(ar, n, ans, newx, newy, visited, path);
            //backtrack
            path.deleteCharAt(path.length()-1); //delete last char
        }

        //Go left
        newx=x;
        newy=y-1;

        if(isSafe(newx, newy, n, visited, ar))
        {
            path.append('L');
            solve(ar, n, ans, newx, newy, visited, path);
            //backtrack
            path.deleteCharAt(path.length()-1);
        }

        //Go Right
        newx=x;
        newy=y+1;

        if(isSafe(newx, newy, n, visited, ar))
        {
            path.append('R');
            solve(ar, n, ans, newx, newy, visited, path);
            //backtrack
            path.deleteCharAt(path.length()-1);
        }
        
        //Go UP
        newx=x-1;
        newy=y;

        if(isSafe(newx, newy, n, visited, ar))
        {
            path.append('U');
            solve(ar, n, ans, newx, newy, visited, path);
            //backtrack
            path.deleteCharAt(path.length()-1);
        }

        //backtrack mark visited 0 when entire fun call ends
        visited.get(x).set(y, 0);

    }

    // main() --> findPath()
    private static ArrayList<String> findPath(int[][] ar, int n)
    {
        ArrayList<String> ans=new ArrayList<>();
        
        if(ar[0][0]==0)
        {
            return ans;
        }

        int srcx=0;
        int srcy=0;

        ArrayList<ArrayList<Integer>> visited=new ArrayList<ArrayList<Integer>>();
        
        //init. with 0
        for (int i = 0; i < n; i++)
        {
            ArrayList<Integer> row=new ArrayList<Integer>();

            for (int j = 0; j < n; j++)
            {
                row.add(0);
            }   

            visited.add(row);
        }

        StringBuilder path=new StringBuilder("");

        solve(ar,n,ans,srcx,srcy,visited,path);

        Collections.sort(ans);

        return ans;
    }    


    public static void main(String[] args)
    {
        int ar[][]={{1,0,0,0},
                    {1,1,0,1},
                    {1,1,0,0},
                    {0,1,1,1}
                };

        ArrayList<String> res = new ArrayList<>();

        res=findPath(ar,ar.length);

        System.out.println(res);
    }

   
}
