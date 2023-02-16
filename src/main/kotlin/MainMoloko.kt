import Moloko.Moloko
class MainMoloko constructor(var name:String,var ves:Double, var jir:Double, var proizvod:String, var chena:Double, var cvet1:String, var vkus1:String):Moloko(cvet1 ,vkus1) {
    var amrt: Boolean = true;
    fun Vvod()
    {
        print("Введите название молочного изделия: ")
        name = readLine()!!.toString()
        print("Введите вес молочного изделия: ")
        ves = readLine()!!.toDouble()
        print("Введите жирность молочного изделия: ")
        jir = readLine()!!.toDouble()
        print("Введите производителя молочного изделия: ")
        proizvod = readLine()!!.toString()
        print("Введите цену молочного изделия (максимально 100.000): ")
        chena = readLine()!!.toDouble()
    }
    override fun inputer() {
        super.inputer()
    }
    fun info1()
    {
        println("Название молочного изделия: ${(name)}")
        println("Вес молочного изделия: ${(ves)}")
        println("Жирность молочного изделия: ${(jir)}")
        println("Производитель молочного изделия: ${(proizvod)}")
        println("Цена молочного изделия: ${(chena)}руб.")
        Molokogroup()
        Molokovar()
    }
    fun Scan1()
    {
        var amrt: Boolean = true;
        if (name>="a" && name <="z" || name>="а" && name<="я"||name>="A" && name <="Z" || name>="А" && name<="Я" )
        {
            if (proizvod >= "a" && proizvod <= "z" || proizvod >= "а" && proizvod <= "я"||proizvod>="A" && proizvod <="Z" || proizvod>="А" && proizvod<="Я" )
            {
                if (chena > 0 && chena <=100000) { }
                else
                {
                    println("Ошибка, цена не может быть меньше 0")
                    amrt = false
                }
            }
            else
            {
                println("Ошибка, в названии производителя не могут быть цифры и знаки")
                amrt = false
            }
        }
        else
        {
            println("Ошибка, в названии молочного продукта не могут быть цифры и знаки")
            amrt = false
        }
    }

}


