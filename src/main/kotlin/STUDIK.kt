package STUDIK
open class STUDIK constructor(var group:String, var variant: Int) {
    open fun studentgroup()
    {
        println("Группа в которой обучается студент: $group")
    }
    open fun studentvar()
    {
        println("Вариант: $variant")
    }
    open fun input()
    {
        print("Введите группу: ")
        group= readLine()!!.toString()
        print("Введите вариант: ")
        variant= readLine()!!.toInt()
    }
}