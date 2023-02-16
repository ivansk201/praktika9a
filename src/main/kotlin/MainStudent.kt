import STUDIK.STUDIK
class MainStudent  constructor(var name:String, var item:String, var date:String, var res:Double, var group1:String, var variant1: Int):STUDIK(group1,variant1) {
    var b: Boolean = true;
    fun Vodim() {
        print("Введите имя студента: ")
        name = readLine()!!.toString()
        print("Введите предмет по которому сдавался экзамен: ")
        item = readLine()!!.toString()
        print("Введите дату экзамена: ")
        date = readLine()!!.toString()
        print("Введите оценку: ");
        res = readLine()!!.toDouble()
    }

    override fun input() {
        super.input()
    }

    fun Info() {
        println("Имя студента: ${name}")
        println("Название предмета: ${item}")
        println("Дата экзамена: ${date}")
        println("Оценка за экзамен: ${res}")
        studentgroup()
        studentvar()
    }


    fun Scan() {
        b=true;
        if (variant>0){
            if (name >= "a" && name <= "z" || name >= "а" && name <= "я" || name >= "A" && name <= "Z" || name >= "А" && name <= "Я") {
                if (item >= "a" && item <= "z" || item >= "а" && item <= "я" || item >= "A" && item <= "Z" || item >= "А" && item <= "Я") {
                    if (res < 0 || res > 5) {println("Некорректный ввод числа"); b=false;}
                }
                else
                {
                    println("Предмет не может включать числа или символы в названии")
                    b = false;
                }
            } else {
                println("Ввод числа и знаков в имени запрещен!")
                b = false;} }
        else
        {
            println("Некорректный ввод варианта")
            b = false;}
    }
}


