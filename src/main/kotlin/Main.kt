fun main() {
    val myShapeFactory: ShapeFactory = ShapeFactoryImpl()
    myShapeFactory.createCircle(10.0).calcArea()
    myShapeFactory.createSquare(10.0).calcArea()
    myShapeFactory.createRectangle(10.0, 20.0).calcPerimeter()
    myShapeFactory.createTriangle(20.0, 30.0, 40.0).calcPerimeter()
    myShapeFactory.createRandomShape().calcArea()
    myShapeFactory.createRandomTriangle().calcPerimeter()
}
