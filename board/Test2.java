package board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Num> nums2 = new ArrayList<Num>();
		

		nums2.add(new Num(4,9));
		nums2.add(new Num(3,4));
		nums2.add(new Num(7,1));
		nums2.add(new Num(1,8));
		nums2.add(new Num(5,10));
		
		for (Num n : nums2) {
			System.out.println(n.getNum1());
		}
		
		MyComparator com = new MyComparator();
		Collections.sort(nums2, com); // 오름차순
		
		for (Num n : nums2) {
			System.out.println(n.getNum2());
		}
	}
}
class Num {
	int num1;
	int num2;
	
	Num(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	int getNum1() {
		return num1;
	}
	
	int getNum2() {
		return num2;
	}
}
// 정렬 대상과 기준 정하기
class MyComparator implements Comparator<Num> {
	  @Override
	  public int compare(Num n1, Num n2) {
		  if (n1.num1 > n2.num2) {
		      return 1; // x에 대해서는 오름차순 (왼쪽꺼가 더 크면 오름차순 반대면 내림차순
		    }
		       return -1;
		 }
	}

