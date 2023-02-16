fun main()
{
    try {

        var stud:MainStudent=MainStudent("Иван", "Русский", "23/03/2018", 3.0, "ПР-22",15)
        stud.Scan()
        if(stud.b==true)
        {
            stud.Info()

        }
        stud.Vodim()
        stud.input()
        stud.Scan()
        if(stud.b==true)
        {
            stud.Info()
        }
    } catch (e:Exception)
    {
        println("Найдена ошибка при вводе данных")
    }
}
