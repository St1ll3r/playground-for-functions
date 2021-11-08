object Main extends App {

  // Functions
  def returnGivenText(): String = {
    return ("You've said: " + (scala.io.StdIn.readLine("Say something\n")).toString)
  }

  // Menu and Functionality

  def getUserMenuInput(): Int = {
    scala.io.StdIn.readLine("Welcome to my Scala Playground. This is where I've done my first few functions to get started with Scala.\nFunctions:\n1 - Return what you've just typed\n").toInt
  }

  def tests(option : Int): Unit = option match {
      case 1 => println(returnGivenText())
      case _ => ("Please type a number from 1 to X")
      tests(getUserMenuInput())
  }
  
  tests(getUserMenuInput())
}