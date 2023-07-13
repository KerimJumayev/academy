package by.academy.lesson16;
//1.

//а) Создать динамический массив(ArrayList), содержащий объекты класса HeavyBox. (добавим 2-3 коробки)
//б) Раcпечатать его содержимое используя for each. 
//в) Изменить вес первого ящика на 1. 
//г) Удалить последний ящик. 
//д) Получить массив содержащий ящики из коллекции двумя способами и вывести на консоль. 
//е) Удалить все ящики.

class HeavyBox {

	int weight;
	int width;
	int height;
	int depth;

	HeavyBox(int w, int h, int d, int m) {
		width = w;
		height = h;
		depth = d;
		weight = m;

	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * @param depth the depth to set
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "HeavyBox [weight=" + weight + ", width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}

}
