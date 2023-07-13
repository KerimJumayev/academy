package by.academy.lesson14;

public enum ClothingSize {

	XXS(32) {
		@Override
		public String getDescription() {
			return "big size ";
		}
	},
	XS(34), S(36), M(38), L(40);

	int size;

	ClothingSize(int size) {
		this.size = size;

	}

	public String getDescription() {
		return "big size ";
	}

	public String getDescription1() {
		return "child size ";
	}

}
