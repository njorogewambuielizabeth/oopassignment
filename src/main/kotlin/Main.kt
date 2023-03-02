fun main() {
    var person =Human("Sparks",21,65)

   person.eat(5)
    println( person.weight)


    person.speak("Hello there")

    person.birthday()
    println(person.age)

    var myUser = User("Sparks","Njoroge","sparkyfoi43","+254742325744","SparkyFoi43@")
    println(myUser.firstName)
    println(myUser.phoneNumber)







}
class Human(var name:String,var age:Int,var weight:Int) {
    fun eat(foodWeight: Int) {
        weight += foodWeight
        println("I am eating $foodWeight kgs of food")

    }

    fun speak(speech:String){
        println(speech)

    }
    fun birthday(){
        age += 1
    }

}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){

}