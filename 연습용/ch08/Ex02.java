package 연습용.ch08;

public class Ex02 {
	public static void main(String[] args) {
		// 이중 배열
		boolean[][] dblBoolAry = new boolean[3][3];
		
		int [][] dblIntAry = new int[][] {
			{1,2,3},
			{4,5},
			{6,7,8,9}
		};
		int int1= dblIntAry[0][1];
		int int2 = dblIntAry[2][3];
		int[] intAry = dblIntAry[1];
		
		// 삼중 배열
		char[][][] trpCharAry = {
				{{'자','축'}, {'인','묘'}},
				{{'진','사'}, {'오','미'}},
				{{'신','유'}, {'술','해'}}
		};
		char [][] dblChrAry = trpCharAry[0];
		char [] chrAry = dblChrAry[0];
		char chr1 = chrAry[1];
		char chr2 = trpCharAry[2][0][1];
	}

}
