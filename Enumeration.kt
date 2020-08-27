fun main() {
    val color: Color = Color.WHITE

    when(color){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.WHITE -> print("Color is White")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    BLUE(0x0000FF),
    WHITE(0xFFFFFF)
}
