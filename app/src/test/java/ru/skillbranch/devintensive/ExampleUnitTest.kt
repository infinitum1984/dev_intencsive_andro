package ru.skillbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.extentsions.TimeUnits
import ru.skillbranch.devintensive.extentsions.add
import ru.skillbranch.devintensive.extentsions.dformat
import ru.skillbranch.devintensive.models.*
import ru.skillbranch.devintensive.utils.Utils
import java.util.*
import java.util.concurrent.TimeUnit

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun test_this_shit() {
        val user = User("1")
        val user2 = User("2","I fuck","Dou")
        user.printThisDud()
        user2.printThisDud()
    }
    @Test
    fun test_factory(){
        val user =User.Factory.makeUser("Danya Nosyk")
        val user1 =User.Factory.makeUser("Danya")
        val user2 =User.Factory.makeUser("Danya Nosyk3")
        val user3=user.copy(lastVisit = Date())//not
        println(user3.lastVisit?.dformat())
        print(user)

        user.printThisDud()
        user1.printThisDud()

        val date = Date()
        println(date.dformat("HH:mm"))
    }
    @Test
    fun test_abstract_factory(){
        val user = User.makeUser("Danya Nosyk")
        val textMsg= BaseMessage.makeMessgae(user,chat = Chat("0"),date = Date(),payload = "my text")
        val imageMsg= BaseMessage.makeMessgae(user,chat = Chat("0"),date = Date(),type = "image",payload = "my text")
        when(textMsg){
            is ImageMessage -> println("its image")
            is TextMessage -> println("its text")
        }

    }
    @Test
    fun date_test(){
        val date = Date()
        println(date.hours)
        val date2 = date.add(-2, TimeUnits.HOUR)
        println(date.hours)
        println(date2.hours)

    }
    @Test
    fun parsename_test(){
        val n1=Utils.parsFullName(null)
        val n2=Utils.parsFullName("")
        val n3=Utils.parsFullName(" ")
        val n4 = Utils.parsFullName("John")
        println(n1.first+" "+n1.second)
        println(n2.first+" "+n2.second)
        println(n3.first+" "+n3.second)
        println(n4.first+" "+n4.second)

    }
}
