object Main extends App {

  // Functions
  def returnGivenText(): String = {
    return ("You've said: " + (scala.io.StdIn.readLine("Say something\n")).toString)
  }

  // Menu and Functionality

  def getUserMenuInput(): Unit = {
    try {
          var answer = scala.io.StdIn.readInt()
          tests(answer)
        } catch {
          case _: NumberFormatException =>
            println("That's not a number, try again")
            getUserMenuInput()
        }
  }

  def intro() = {
    println("Welcome to my Scala Playground. This is where I've done my first few functions to get started with Scala.\nFunctions:\n1 - Return what you've just typed\n")
  }

  def tests(option : Int): Unit = option match {
      case 1 => { 
        println(returnGivenText()) 
        init() 
      }
      case _ => println("Please type a number from 1 to X")
      init()
  }

  def init() = {
    intro()
    getUserMenuInput()
  }

  init()
}