package Shape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	private int iDepth;
	

	public int getiDepth() {
		return iDepth;
	}


	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}


	public Cuboid(int width, int length, int dept) {
		super(width, length);
	}
	
	public double volume() {
		return iDepth*getiLength()*getiWidth();
	}

	@Override
	public double area() {
		return 2*(iDepth+getiLength()+getiWidth());
	}


	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	public class SortByArea implements Comparator<Cuboid>{
		public int compare(Cuboid cub1, Cuboid cub2) {
			return (int) (cub1.area()-cub2.area());		
		}
		SortByArea() {
			super();
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid cub1, Cuboid cub2) {
			return (int) (cub1.volume()-cub2.volume());	
			}
		SortByVolume() {
			super();
		}
	}
}
