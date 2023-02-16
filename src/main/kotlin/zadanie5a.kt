fun main()
{
    try {

        var mol:MainMoloko=MainMoloko("Молоко", 50.0, 0.3, "Простоквашино", 169.0 ,"Белый", "Вкусное" )
        mol.Scan1()
        if(mol.amrt ==true)
        {
            mol.info1()

        }
        mol.Vvod()
        mol.inputer()
        mol.Scan1()
        if(mol.amrt==true)
        {
            mol.info1()
        }
    } catch (e:Exception)
    {
        println("Найдена ошибка при вводе данных")
    }
}