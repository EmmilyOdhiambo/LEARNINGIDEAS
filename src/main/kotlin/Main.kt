fun main(args: Array<String>) {
    var nameOfPeople = arrayOf("Uhuru","Amani")
    var ageOfPeople = arrayOf("60","50")
    var weightOfPeople = arrayOf("58","68")
    var phoneNumbers = arrayOf("78906544","71234566")
    val countryCode254=true

var people0 = arrayOf("peoplesDetails",nameOfPeople[0],ageOfPeople[0],weightOfPeople[0],phoneNumbers[0],countryCode254)
println(people0.contentToString())
var people1 = arrayOf("peoplesDetails",nameOfPeople[1],ageOfPeople[1],weightOfPeople[1],phoneNumbers[1],countryCode254)
println(people1.contentToString())
}