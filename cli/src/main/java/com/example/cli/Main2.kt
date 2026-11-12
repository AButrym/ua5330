package com.example.cli

fun main1() {
    val b: Byte = 120
    val a: UShort = b.toUShort()
    println("a = $a")
    val i1: Int = 12
    val l1: Long = i1.toLong()

    val pi: Float = 3.1415926513245145F
    println("pi = ${pi}")
    val pi2: Double = 3.141_592_651_324_514_5
    println("pi2 = ${pi2}")
    val pi3: Double = 3.1415926513245145E-2
    println("pi3 = %.3e".format(pi3))

    val ch: Char = '\u0fff'
    val i2: Int = 0x0fff
    val ch2: Char = 0x0fff.toChar()

    val text = """
    >|    dasfgfrsg i2 = $i2\n
    >|  nextLine
    """.trimMargin(marginPrefix = ">")
    println(text)
    val re = """\\.\\\\"""
    println("re = ${re}")
}

fun main2() {
    var anything: Any? = "Hello"
    println("anything = ${anything}")
    anything = 12
    println("anything = ${anything}")
    anything = true
    println("anything = ${anything}")
    anything = null
    println("anything = ${anything}")
}

fun main() {
    val s1 = true
    val s2 = false
    val s3: Boolean = s1 && s2
    val s4: Boolean = s1 and s2
}