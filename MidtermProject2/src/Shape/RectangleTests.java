package Shape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Shape.Cuboid.SortByArea;

class ShapeTests {
	
	
	@Test
	public void testLength() {
		int length =1; 
		Rectangle rect = new Rectangle(0, 0);
		rect.setiLength(length);
		assertEquals(length,rect.getiLength());
	}
	
	@Test
	public void testWidth() {
		int width =1; 
		Rectangle rect = new Rectangle(0, 0);
		rect.setiWidth(width);
		assertEquals(width,rect.getiWidth());
	}
	
	}
	@Test
	public void areaTest() {
		Rectangle rect = new Rectangle(2,3);
		double expectedArea = 6;
		assertEquals(expectedArea, rect.area());
	}
	
	@Test
	public void perimeterTest() {
		Rectangle rect = new Rectangle(2,3);
		double expectedPerimeter = 10;
		assertEquals(expectedPerimeter, rect.perimeter());
	}
	
	@Test
	public void testDepth() {
		int depth = 1;
		Cuboid cub = new Cuboid (0, 0, 0);
		cub.setiDepth(depth);
		assertEquals(depth,cub.getiDepth());
	}
	
	@Test
	public void testSortByArea() {
		Cuboid cub1 = new Cuboid (2,2,2);
		Cuboid cub2 = new Cuboid (3,3,3);
		  int result = SortByArea.compare(cub1, cub2);
		  assertTrue("expected to be less than", result <= -1);
	}
	
	@Test
	public void restSortByVolume() {
		Cuboid cub1 = new Cuboid (2,2,2);
		Cuboid cub2 = new Cuboid (1,1,1);
		 int result = SortByVolume.compare(cub1, cub2);
	        assertTrue("expected to be greater than", result >= 1);
	}
}
