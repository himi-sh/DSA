import java.util.*; // contains Collections framework

class KillMonster {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int H = sc.nextInt();
		int p[] = new int[N];
		int w[] = new int[N];
		

		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
		}
		sc.close();
		int sum = 0;
		int count = 0;

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0 ; i < N; i++) {
			// w[i] = sc.nextInt();
			if (w[i] <= D) {
				// System.out.println(p[i]);
				list.add(p[i]);
				System.out.println(list);
			}
		}
		Collections.sort(list);
		
		for (int i =  0; i < list.size(); i++) {
			// if (w[i] <= D) {
				sum = sum + list.get(i);
				count++;
			// }
			// System.out.println(list.get(i));
		}

		if (sum >= H) {
			System.out.println(count);
		} else {
			System.out.println(-1);
		}

		/**
			6 8 20 
			1 2 3 4 5 6 
			2 2 2 2 2 2
		*/

	}
}
