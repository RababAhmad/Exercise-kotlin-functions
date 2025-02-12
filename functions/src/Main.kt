fun main(){

    greetTraveler() //calling the greetTraveler function
    findOasis(10, 20) // call the findOasis function with values for x and y
    //currentTemperature(25, 40) // called currentTemperature function with temperature values of 25 and 40
    val morningTemperature = 25
    val afternoonTemperature = 40
    val averageTemp = currentTemperature(morningTemperature, afternoonTemperature)
    println("The average temperature for the day is: $averageTemp")
    startCamelRide(10, 5)
    startCamelRide(10)
   // exploreDune(height = 20.0, climRate = 3.0)
    val time = exploreDune(climRate = 3.0, height = 20.0)
    println("The time to climb the dune is: $time")

  //  survivalChance(supplies = 8)
    val supplies = survivalChance(supplies = 8)
    println(" supplies chance: $supplies")

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

fun startCamelRide(time: Int, speed: Int = 5){
    val distance = (speed * time)
    println("camel Ride: Distance = $distance km, speed = $speed km/h, Time = $time hours ")



}

fun exploreDune(height: Double = 20.0, climRate: Double = 3.0) : Double {
    return height/climRate // to calculate the time to climb the dune

}

fun survivalChance(supplies: Int): Int {
    return supplies * 10
}