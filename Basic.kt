fun main() {
  val a = 323
     
    var num = a
    var div = 0
    while(num >0)
    {
       val rem = num % 10
        div = div * 10 + rem
        num /= 10
    }
    if (a == div) {
        println(" Number is Palindrome")
    } else {
        println("Number is Not Palindrome")
    }
}

/*fun main() {
  val a = 323
     
    var num = a
    var div = 0
    while(num >0)
    {
       val rem = num % 10
        div = div * 10 + rem
        num /= 10
    }
    if (a == div) {
        println(" Number is Palindrome")
    } else {
        println("Number is Not Palindrome")
    }
}

fun main() {
    for (i in 5 downTo 1) {
        for (j in 1..i) {
            print(" ")
        }
        for (k in 1..(5 - i) * 2 + 1) {
            print("*")
        }
        println()
    }
    for (i in 1..4) 
    {
        for (j in 1..i) 
        {
            print(" ")
        }
        for (k in 1..(i * 2 - 1)) 
        {
            print("*")
        }
        println(" ")
    }
}
//DUCK NUMMBER
fun isDuckNumber(number: Int): Boolean {
  if (number <= 0) {
    return false
  }  
  var hasZero = false
  var currentDigit: Int
     var temp = number

  currentDigit = number / 10
  if (currentDigit == 0) {
    return false
  }
  while (currentDigit > 0) {
    currentDigit = number % 10
    if (currentDigit == 0) {
      hasZero = true
    }
    temp /= 10
  }
  
  return hasZero
}

fun main() {
  val number = 709
  val isDuck = isDuckNumber(number)
  if (isDuck) {
    println("$number is a duck number.")
  } else {
    println("$number is not a duck number.")
  }
}

fun main()
{
    var a= 153566
    var ac= a.toString();
    for(i in 1 until ac.length+1)
    {
        println("$i")
    }
}




for (i in 1..4 step 2) {
print(i)
}


PRINTING PATTERN
fun main() 
{
    val rows = 5
    
    for (r in 1..rows) 
    {
        
        for (i in 1..(rows - r)) 
        {
            print(" ")
        }
       
        for (j in 1..(2 * r - 1)) 
        {
            print("*")
        }
        println()
    }
    
    for (r in rows downTo 1) 
    {
        for (i in 1 until rows - r + 1) 
        {
            print(" ")
        }
        for (j in 1 until 2 * r) 
        {
            print("*")
        }
        println()
    }
}*/

fun main() 
{
    val num = 1010
    val str = num.toString()
    for (char in str)
    {
         println(char)
    }
    
}





/*fun main() 
{
    largestofTwo(12,3)
}
fun largestofTwo(a: Int, b: Int)
{
  if(a>b)
    {
        println("a:${a} is the Largest nuber")
    }
    else
    {
        println("b:${b} is the Largest nuber")
    }
} 


fun main()
{
    var number = listOf(1,3,4,5,6,7,8)
    var total = sumOfList(number)
    println("The Sum of Elements= $total")
    
}
fun sumOfList(number : List<Int>) : Int
{
    var sum =0
    for(num in number)
    {
        sum = sum + num
    }
     return sum
}

fun main()
{
    var str = POP
    var check= isPalindrome(str)
    println("The String is $chek Palindrom")
}
fun isPalindrom(str : String) : String
{
    for(char in str)
    {
        
    }
}*/

fun main() 
{
    var c=" "
    val num = 3678
    val str = num.toString()
    for (char in str downTo str.length)
    {
         c= c+char
    }
    println("str is $c")
}






















