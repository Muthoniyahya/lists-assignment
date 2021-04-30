
fun main() {
    println(evenString(listOf("Iman","Bilal","Zeddy","Njamba","Aimal","Kauthar","Abubakar","Harun","Zahra","Rahma")))
    var personHeights=peopleHeight(listOf(30.2,60.4,100.2))
    println(personHeights.average)
    println(personHeights.total)
    human()
    people()
    var mile= listOf(
        Car("45gud",600),
        Car("KBC656",450),
        Car("KCA734",700)
    )
    println(car(listOf(600,450,700)))

}


fun evenString(names:List<String>):List<String>{
    var y= mutableListOf<String>()
    for (name in names){
        if( names.indexOf(name)%2==0){
            y.add(name)

        }


    }
    return y
}
data class AverageTotal(var average:Double, var total:Double)
fun peopleHeight(heights:List<Double>):AverageTotal{
    var sum=heights.sum()
    var avr=heights.average()
    var avrgsum=AverageTotal(avr,sum)
    return avrgsum

    
}
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)
fun human(){
    var humans= listOf(
        Person("Sharon",24,1.68,60.0),
        Person("Audrey",20,1.80,54.0),
        Person("Imali",23,1.54,58.0)


    )
    var sortedPerson=humans.sortedByDescending { person -> person.age  }
    println(sortedPerson)
}
data class Humans(var name:String,var age:Int,var height: Double,var weight:Double)
fun people(){
    var names= mutableListOf(
        Humans("Bilal",22,1.98,56.0),
        Humans("Zeddy",25,1.68,68.0),
        Humans("Troy",21,2.15,54.0)



        )
    names.addAll(listOf(
        Humans("Olga",20,1.8,68.0),
        Humans("Njamba",3,1.0,24.0)

    ))
    println(names)
}

data class Car(var registration:String,var mileage:Int)
    fun car(mileage:List<Int>):Int{
        var mile=mileage.average().toInt()
        return mile


}
