fun main(){

    greetTraveler() //calling the greetTraveler function
    findOasis(10, 20) // call the findOasis function with values for x and y
    //currentTemperature(25, 40) // called currentTemperature function with temperature values of 25 and 40
    val morningTemperature = 25
    val afternoonTemperature = 40
    val averageTemp = currentTemperature(morningTemperature, afternoonTemperature)
    println("The average temperature for the day is: $averageTemp")
}

fun greetTraveler(){

    println("Welcome to the Desert, Traveler! ")

}

fun findOasis(x: Int, y: Int) {
    println("Oasis found at coordinates ($x , $y) ")

}

fun currentTemperature(morningTemperature: Int, afternoonTemperature: Int): Int {

    return (morningTemperature + afternoonTemperature) / 2

}