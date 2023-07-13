package by.academy.homework4;

public class Body {

	static int i = 1;

	protected Heart heart;
	protected Lungs lungs;

	public class Heart {

		public void live() {
			while (i <= Integer.MAX_VALUE) {
				if (i % 100 == 0) {
					System.out.println("\"Knock-knock-knockin' on heaven's door\"");
				}
				break;
			}
		}
// public void live		

	}
// class heart

	public class Lungs {

		public void breath() {
			while (i <= Integer.MAX_VALUE) {
				if (i % 50 == 0 && i % 100 != 0) {
					System.out.println("breath in");
				}
				if (i % 100 == 0) {
					System.out.println("breath out");
				}
			}

		}
	}

	public Body() {
		super();
		Body.Heart heart = new Heart();
		this.heart = heart;
		Body.Lungs lungs = new Lungs();
		this.lungs = lungs;

	}

	public void live() {
		while (i < Integer.MAX_VALUE) {
			heart.live();
		}
	}

	public void breath() {
		while (i < Integer.MAX_VALUE) {
			lungs.breath();
		}
	}

}
