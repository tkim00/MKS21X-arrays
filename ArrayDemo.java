public class ArrayDemo{
	public static void printArray(int[]ary){
		System.out.print("{ ");
		for(int i = 0; i < ary.length; i++){
			System.out.print("" + ary[i] + ",");
		}
		System.out.print(" }");
	}
	public static void printArray(int[][]ary){
		System.out.print("{ ");
		for(int x = 0; x < ary.length; x++){
			System.out.println("{ ");
			for(int y = 0; y < ary[x].length; y++){
				System.out.print("" + ary[x][y] + ",");
			}
			System.out.print(" }");
		}
		System.out.print(" }");
	}
	public static int countZeros2D(int[][] nums){
		int c = 0;
                for(int x = 0; x < nums.length; x++){
                        for(int y = 0; y < nums[x].length; y++){
				if(nums[x][y] == 0){
                                c++;
				}
                        }
                }
		return c;
	}
	public static void fill2D(int[][] vals){
		for(int x = 0; x < vals.length; x++){
                        for(int y = 0; y < vals[x].length; y++){
				vals[x][y] = 1;
                                if(x == y){
                                vals[x][y] = 3;
                                }
                        }
                }
	}
	public static int[][] fill2DCopy(int[][] vals){
		int[][] ary = new int[vals.length][vals[].length];
		for(int x = 0; x < vals.length; x++){
                        for(int y = 0; y < vals.length; y++){
                                ary[x][y] = 1;
				if(vals[x][y] < 0){
				ary[x][y] = 3;
                                }
                        }
                }
		return ary;
	}
}

