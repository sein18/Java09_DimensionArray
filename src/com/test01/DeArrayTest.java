package com.test01;

public class DeArrayTest {
	public void testInit() {
		// 2���� �迭
		int iarr1[][];
		int iarr2[][];

		// �Ҵ�
		iarr1 = new int[3][5];

		iarr2 = new int[3][];
		iarr2[0] = new int[5];
		iarr2[1] = new int[5];
		iarr2[2] = new int[5];

		// 2�� for���� �׿��Ͽ� �迭�� �� ���
		for (int i = 0; i < iarr2.length; i++) {
			for (int j = 0; j < iarr2[i].length; j++) {
				System.out.print(iarr2[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void testInit2() {
		int iarr[][] = new int[3][5];

		iarr[0][0] = 1;
		iarr[0][1] = 2;
		iarr[0][2] = 3;
		iarr[0][3] = 4;
		iarr[0][4] = 15;

		iarr[1][0] = 5;
		iarr[1][1] = 6;
		iarr[1][2] = 7;
		iarr[1][3] = 8;
		iarr[1][4] = 14;

		iarr[2][0] = 9;
		iarr[2][1] = 10;
		iarr[2][2] = 11;
		iarr[2][3] = 12;
		iarr[2][4] = 13;

		// ����for���� �̿��� �� ���
		int val = 100;
		for (int i = 0; i < iarr.length; i++) {
			for (int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = val++;
			}
		}

		printArr(iarr);

	}

	public void testInit3() {
		// �����迭
		int iarr[][] = new int[3][];

		iarr[0] = new int[5];
		iarr[1] = new int[3];
		iarr[2] = new int[10];

		//printArr(iarr);

		int val = 100;
		for (int i = 0; i < iarr.length; i++) {
			for (int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = ++val;
			}
		}

		printArr(iarr);

		//
		int iarr2[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		int iarr3[][] = { { 1 }, { 3, 5, 6 }, { 6, 7, 8, 9, 10 }, { 11, 12 } };

		printArr(iarr2);
		printArr(iarr3);

	}

	public void test01() {
		// �������� 2���� �迭�� �־��
		int arr[][] = new int[8][9];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 2) * (j + 1);
				System.out.println((i + 2) + " * " + (j + 1) + " = " + arr[i][j]);
			}
			System.out.println();
		}	
	}
	
	public void test2() {
		int arr[][] = new int[5][5];
		int a = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					arr[i][j] = ++a;
				} else {
					arr[i][4 - j] = ++a;
				}
			}
		}
		printArr(arr);
	}
	
	public void printArr(int iarr[][]) {
		for (int i = 0; i < iarr.length; i++) {
			for (int j = 0; j < iarr[i].length; j++) {
				System.out.print(iarr[i][j] + " ");
			}
			System.out.println();
		}
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
