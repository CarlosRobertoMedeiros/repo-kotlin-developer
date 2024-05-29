package a1.processandoarquivos

import java.io.File

data class People(val name:String, val sequenceNumber:String)

fun main(){
    val peopleList: MutableList<MutableList<People>> = mutableListOf()

    val file : File = File("src/main/resources/peoplelist.csv")

    file.forEachLine { line ->
        val (name,sequence_number) = line.split(",")
        val sequenceNumber = sequence_number
        val person = People(name,sequenceNumber)

        if (peopleList.isEmpty() || peopleList.last().size ==3){
            peopleList.add(mutableListOf(person))
        }else{
            peopleList.last().add(person)
        }
    }

    //Printing the content
    for ((index, group) in peopleList.withIndex()) {
        println("Group $index:")
        for (person in group) {
            println("${person.name} - ${person.sequenceNumber}")
        }
        println() // Adding an empty line for clarity
    }







}

