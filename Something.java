public class Something {
	int x;
	int y;

	public Something(int num) {
		x += num;
		y += num;
	}

	public class Nothing {
		int x;

		public Nothing() {
			this.x += x;
		}
	}

	public static void main(String[] args) {
			Something s = new Something(5);
			Something.Nothing n = s.new Nothing();
			System.out.println(s.x + " " + n.x);
	}

}
