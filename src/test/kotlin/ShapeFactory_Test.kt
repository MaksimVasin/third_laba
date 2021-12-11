import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

internal class ShapeFactory_Test {
    ///////////////// Circle ////////////////////////////////////////////////////////////
    @Test
    fun createCircleTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertEquals(myShapeFactory.createCircle(10.0).radius, 10.0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun createCircleErrorTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        myShapeFactory.createCircle(-10.0)
    }

    @Test
    fun createRandomCircleTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertNotEquals(myShapeFactory.createRandomCircle().radius, 0.0)
    }

    @Test
    fun areaCircleTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertEquals(Math.PI * 10.0 * 10.0, myShapeFactory.createCircle(10.0).calcArea())
    }

    @Test
    fun perimeterCircleTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertEquals(2 * Math.PI * 10.0, myShapeFactory.createCircle(10.0).calcPerimeter())
    }

    ///////////////// Square ////////////////////////////////////////////////////////////
    @Test
    fun createSquareTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertEquals(myShapeFactory.createSquare(10.0).side, 10.0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun createSquareErrorTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        myShapeFactory.createSquare(-10.0)
    }

    @Test
    fun createRandomSquareTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertNotEquals(myShapeFactory.createRandomSquare().side, 0.0)
    }

    @Test
    fun areaSquareTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertEquals(10.0 * 10.0, myShapeFactory.createSquare(10.0).calcArea())
    }

    @Test
    fun perimeterSquareTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertEquals(10.0 + 10.0 + 10.0 + 10.0, myShapeFactory.createSquare(10.0).calcPerimeter())
    }

    ///////////////// Rectangle //////////////////
    @Test
    fun createRectangleTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertEquals(myShapeFactory.createRectangle(10.0, 10.0).width, 10.0)
        assertEquals(myShapeFactory.createRectangle(10.0, 10.0).height, 10.0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun createRectangleWidthErrorTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        myShapeFactory.createRectangle(-10.0, 10.0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun createRectangleHeightErrorTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        myShapeFactory.createRectangle(10.0, -10.0)
    }

    @Test
    fun createRandomRectangleTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertNotEquals(myShapeFactory.createRandomRectangle().width, 0.0)
        assertNotEquals(myShapeFactory.createRandomRectangle().height, 0.0)
    }

    @Test
    fun areaRectangleTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertEquals(10.0 * 20.0, myShapeFactory.createRectangle(10.0, 20.0).calcArea())
    }

    @Test
    fun perimeterRectangleTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertEquals(10.0 + 10.0 + 20.0 + 20.0, myShapeFactory.createRectangle(10.0, 20.0).calcPerimeter())
    }

    ///////////////// Triangle ///////////////////
    @Test
    fun createTriangleTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertEquals(myShapeFactory.createTriangle(15.0, 10.0, 20.0).sideA, 15.0)
        assertEquals(myShapeFactory.createTriangle(15.0, 10.0, 20.0).sideB, 10.0)
        assertEquals(myShapeFactory.createTriangle(15.0, 10.0, 20.0).sideC, 20.0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun createTriangleSideAErrorTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        myShapeFactory.createTriangle(-10.0, 10.0, 10.0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun createTriangleSideBErrorTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        myShapeFactory.createTriangle(10.0, -10.0, 10.0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun createTriangleSideCErrorTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        myShapeFactory.createTriangle(10.0, 10.0, -10.0)
    }

    @Test
    fun createRandomTriangleTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertNotEquals(myShapeFactory.createRandomTriangle().sideA, 0.0)
        assertNotEquals(myShapeFactory.createRandomTriangle().sideB, 0.0)
        assertNotEquals(myShapeFactory.createRandomTriangle().sideC, 0.0)
    }

    @Test
    fun areaTriangleTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertEquals(30.0 * 40.0 / 2, myShapeFactory.createTriangle(30.0, 40.0, 50.0).calcArea())
    }

    @Test
    fun perimeterTriangleTest() {
        val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
        assertEquals(30.0 + 40.0 + 50.0, myShapeFactory.createTriangle(30.0, 40.0, 50.0).calcPerimeter())
    }
}
