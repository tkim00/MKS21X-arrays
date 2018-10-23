public class ArrayDemo{
	public static void main(String[] args){
    int[] ary1 = new int[10];
    for(int i = 0; i < ary1.length; i++){
      ary1[i] = i;
    }
    int[][] ary2 = new int[10][10];
    for(int x = 0; x < ary2.length; x++){
      for(int y = 0; y < ary2.length; y++){
        ary2[x][y] = x * y;
      }
    }

    printArray(ary1);
    printArray(ary2);
    int x = countZeros2D(ary2);
		System.out.println(x);
    fill2D(ary2);
    printArray(ary2);
    fill2DCopy(ary2);
    printArray(ary2);
  }
	public static void printArray(int[]ary){
		System.out.print("{ ");
		for(int i = 0; i < ary.length; i++){
			System.out.print("" + ary[i] + ",");
		}
		System.out.print(" }\n");
	}
	public static void printArray(int[][]ary){
		System.out.print("{ ");
		for(int x = 0; x < ary.length; x++){
			System.out.print("{ ");
			for(int y = 0; y < ary[x].length; y++){
				System.out.print("" + ary[x][y] + ",");
			}
			System.out.print(" }\n");
		}
		System.out.print(" }\n");
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
		int[][] ary = new int[vals.length][vals[0].length];
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
