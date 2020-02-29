import java.util.*;

public class Java_sort {
	static int z = 20;

	public static void main(String[] args) {

		ArrayDeque<Integer> list1 = new ArrayDeque<Integer>();
		for (int j = 0; j < z; j++) {
			int k = (int) (Math.random() * 100) + 1;
			list1.add(k);
		}
		System.out.println("Очередь до сортировки - " + list1.clone());
		sort(list1);
		System.out.println("Очередь после сортировки - " + list1.clone());
	}

	public static int get(int n, ArrayDeque<Integer> list) {
		ArrayDeque<Integer> newlist = new ArrayDeque<Integer>();
		int temp;
		for (int i = 0; i < n; i++) {
			newlist.addLast(list.removeFirst());
		}
		temp = list.removeFirst();
		list.addFirst(temp);
		for (int i = 0; i < n; i++) {
			list.addFirst(newlist.removeLast());
		}
		return (temp);
	}

	public static void set(int n, int num, ArrayDeque<Integer> list) {
		ArrayDeque<Integer> newlist = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			newlist.addFirst(list.remove());
		}
		list.remove();
		list.addFirst(num);
		for (int i = 0; i < n; i++) {
			list.addFirst(newlist.remove());
		}
	}

	public static void sort(ArrayDeque<Integer> list) {
		for (int i = 0; i < z; i++) {
			int min = get(i, list);
			int min_i = i;
			for (int j = i + 1; j < z; j++) {
				if (get(j, list) < min) {
					min = get(j, list);
					min_i = j;
				}
			}
			if (i != min_i) {
				int tmp = get(i, list);
				set(i, get(min_i, list), list);
				set(min_i, tmp, list);
			}
		}
	}
}
