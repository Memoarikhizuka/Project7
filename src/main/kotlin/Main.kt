fun main(args: Array<String>) {

    val list = mutableListOf(
        Student(name = "Ivan", age=19),
        Student(age=20, name="Sergey")
    )

    /*   for(studentInList in list){
           println("Student in list ${studentInList.name}")
       }*/

 /*   list.forEach {student->
        println("Student in list ${student.name}")
    }*/

    val setCollectiom = setOf("123213","sdfgfdg")

    val mapCollection = mapOf("key" to "value", "key2" to "value2")
    println("${mapCollection["key2"]}")

}