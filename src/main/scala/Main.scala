object Main extends App {
  
  //----------
  // Functions
  //----------

  def returnGivenText(): String = { // Function reads a given string and prints it back
    return ("You've said: " + (scala.io.StdIn.readLine("Say something\n")).toString)
  }

/*   def sumTwoNumbers(num1 : String, num2 : String): String = { // Function reads two given integers, sums them and prints the result
    return (num1 + num2).toString
  } */

  //-----------------------
  // Validators
  //-----------------------

/*   def validateSumTwoNumbers(num1 : String, num2 : String): Int = { // Validates the input from the user regarding the choice in the menu
    try (num1.isDigit && num2.isDigit)
         catch {
          case _: NumberFormatException =>
            println("Not valid numbers, try again")
            validateSumTwoNumbers("1","2")
        }
  } */

  /*def validateMenuInput(input : Any): Int = { // Validates the input from the user regarding the choice in the menu
    try {
          var test = (Map(input -> Int))
          return test
        } catch {
          case _: NumberFormatException =>
            println("That's not a number, try again")
            validateMenuInput()
        }
  }*/

  //-----------------------
  // Menu and Functionality
  //-----------------------

  def getUserMenuInput(): Unit = { // Function reads the given option, validates it and sends it to the tests function
    try {
      var answer = scala.io.StdIn.readInt()
      tests(answer)
    } catch {
      case _: NumberFormatException =>
        println("That's not a number, try again")
        getUserMenuInput()
    }
  }

  def tests(option : Int): Unit = { option match { // Function meant to show the results of the functions
      case 1 => { 
        println(returnGivenText())
        init()
      }
      case 2 => { 
        /* println(sumTwoNumbers("1","2")) */
        init()
      }
      case 10 => { 
        println("Thanks for using the program")
      }
      case _ => { println("Please type a number from 1 to X") }
    }
  }

  def intro() = { // Function meant to show all the introductory text, such as the program name and the menu.
      println("Welcome to my Scala Playground. This is where I've done my first few functions to get started with Scala.\n\n" +
        "1 - Return what you've just typed\n" +
        "2 - Sum two numbers\n" + 
        "10 - Quit")
  }

  def init() = { // Function responsible for initiating the program
    intro()
    getUserMenuInput()
  }

  init()
}