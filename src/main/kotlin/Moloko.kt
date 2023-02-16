package Moloko
open class Moloko constructor(var cvet:String, var vkus: String) {
    open fun Molokogroup()
    {
        println("Цвет молочного изделия: $cvet")
    }
    open fun Molokovar()
    {
        println("Вкус молочного изделия: $vkus")
    }
    open fun inputer()
    {
        print("Введите цвет молочного изделия: ")
        cvet=readLine()!!.toString()
        print("Введите вкус молочного изделия: ")
        cvet=readLine()!!.toString()
    }
}