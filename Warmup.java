public class Warmup {
	//This function is searching a key in a given unsorted array by moving 'bk' steps back every 'fd' steps.
	public static void main(String[] args) {
		System.out.println("hello");
	}
	public static int backtrackingSearch(int[] arr, int x, int fd, int bk, Stack myStack) {
    	int i=0;
    	int fdCounter=0;
        while(i<arr.length)
        {
        	if(arr[i]==x)
        	return i;
        	else if(fdCounter==fd)
       		{
        		for(int j=0; j<bk; j++)
        		i=(int) myStack.pop();     		
        		fdCounter=0;
        	}
        	else
        	{
        		myStack.push(i);
        		fdCounter++;
        		i++;
        	}
        }
    	return -1;
    }

 //   public static int consistentBinSearch(int[] arr, int x, Stack myStack) {
        // TODO: implement your code here
 //   }

    private static int isConsistent(int[] arr) {
        double res = Math.random() * 100 - 75;

        if (res > 0) {
            return (int)Math.round(res / 10);
        } else {
            return 0;
        }
    }
}
