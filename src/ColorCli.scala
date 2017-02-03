object ColorCli {
    val usage = """
Usage: color-cli -f frontcolor -b backcolor str
 
Supported front colors: [black, red, green, yellow, blue, purple, cyan, white]
Supported background colors: [black, red, green, yellow, blue, purple, cyan, white]
"""

    val foreground = Map("black" -> 30,
        "red" -> 31,
        "green" -> 32,
        "yellow" -> 33,
        "blue" -> 34,
        "purple" -> 35,
        "cyan" -> 36,
        "white" -> 37)
      
    val background = Map("black" -> 40,
        "red" -> 41,
        "green" -> 42,
        "yellow" -> 43,
        "blue" -> 44,
        "purple" -> 45,
        "cyan" -> 46,
        "white" -> 47)

    def main(args: Array[String]): Unit = {
        if (args.length != 5) {
            println(usage)
            return
        }
      
        var i = 0
        var fc = ""
        var bc = ""
        var str = ""

        def parse(x: Int) = x + 1
      
        for (i <- 0 until args.length)
            args(i) match {
                case "-f"  => fc = getColor(parseArg(parse(i), args), foreground)
                case "-b" => bc = getColor(parseArg(parse(i), args), background)
                case _ => str = parseArg(i, args)
            }

        if (fc =="" || bc =="" || str =="") {
            println(usage)
            return
        }

        printColorStr(fc, bc, str)
    }

    def parseArg(i:Int, args: Array[String]) : String = {
        return args(i)
    }

    def getColor(color:String, colors: Map[String, Int]): String = {
        if (!colors.contains(color))
            return ""
        else
            return colors(color).toString
    }

    def printColorStr(fc:String, bc:String, s:String): Unit = {
        var output = "\u001b[" + bc + ";" + fc + "m" + s + "\u001b[0m"
        println(output)
    }
}

