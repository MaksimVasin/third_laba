fun main() {
    val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
    val listShapes: List<Shape> = listOf(
        myShapeFactory.createCircle(10.0),
        myShapeFactory.createSquare(10.0),
        myShapeFactory.createRectangle(10.0, 20.0),
        myShapeFactory.createTriangle(20.0, 30.0, 40.0)
    )
    println("User-defined shapes")
    println("Sum area: ${listShapes.sumOf { it.calcArea() }}")
    println("Sum perimeter: ${listShapes.sumOf { it.calcPerimeter() }}")
    println("Shape with max area: ${listShapes.maxByOrNull { it.calcArea() }} / min area: ${listShapes.minByOrNull { it.calcArea() }}")
    println("Shape with max perimeter: ${listShapes.maxByOrNull { it.calcArea() }} / min perimeter: ${listShapes.minByOrNull { it.calcArea() }}")
    println()

    val listShapesRandomParameters: List<Shape> = listOf(
        myShapeFactory.createRandomCircle(),
        myShapeFactory.createRandomSquare(),
        myShapeFactory.createRandomRectangle(),
        myShapeFactory.createRandomTriangle(),
    )
    println("Random parameters shapes")
    println("Sum area: ${listShapesRandomParameters.sumOf { it.calcArea() }}")
    println("Sum perimeter: ${listShapesRandomParameters.sumOf { it.calcPerimeter() }}")
    println("Shape with max area: ${listShapesRandomParameters.maxByOrNull { it.calcArea() }} / min area: ${listShapesRandomParameters.minByOrNull { it.calcArea() }}")
    println("Shape with max perimeter: ${listShapesRandomParameters.maxByOrNull { it.calcArea() }} / min perimeter: ${listShapesRandomParameters.minByOrNull { it.calcArea() }}")
    println()

    val listRandomShapes: List<Shape> = listOf(
        myShapeFactory.createRandomShape(),
        myShapeFactory.createRandomShape(),
        myShapeFactory.createRandomShape(),
    )
    println("Random shapes")
    println("Sum area: ${listRandomShapes.sumOf { it.calcArea() }}")
    println("Sum perimeter: ${listRandomShapes.sumOf { it.calcPerimeter() }}")
    println("Shape with max area: ${listRandomShapes.maxByOrNull { it.calcArea() }} / min area: ${listRandomShapes.minByOrNull { it.calcArea() }}")
    println("Shape with max perimeter: ${listRandomShapes.maxByOrNull { it.calcArea() }} / min perimeter: ${listRandomShapes.minByOrNull { it.calcArea() }}")
}
