enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun nextColor(color: Color) = when(color) {
    Color.RED -> Color.GREEN
    Color.GREEN -> Color.BLUE
    Color.BLUE -> Color.RED
}

fun foo(c1: Color, c2: Color) = when(setOf(c1, c2)) {
    setOf(Color.RED, Color.GREEN) -> Color.BLUE
    setOf(Color.RED, Color.BLUE) -> Color.GREEN
    setOf(Color.GREEN, Color.BLUE) -> Color.RED
    else -> TODO()
}

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr): Expr

fun eval(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.left) + eval(e.right)
    else -> TODO()
}
