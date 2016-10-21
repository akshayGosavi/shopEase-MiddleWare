package com.aspire.shopEase.dao;

public class EntryExitDao {

	private static int[] arr;
	
	static {
		arr = generateEntryExitArray();
	}
	
	private static int[] generateEntryExitArray(){
		int[] result = new int[10];
		
		return result;
		
	}

	public static int[] getArr() {
		return arr;
	}

	public static void setArr(int[] arr) {
		EntryExitDao.arr = arr;
	}
	
}
