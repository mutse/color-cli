Color Cli with Scala
=========

How to print a colorful string with Scala.

# Dependencies

In ubuntu, please use the below command to install compile dependencies:

    $ sudo apt install scala scons openjdk-8-jdk-headless openjdk-8-jdk

# How to compile

Generate the jar package with the command:

    $ scons

and run it with

    $ scala -cp classes ColorCli -f red -b blue "I like Scala"

or

    $ scala color-cli.jar ColorCli -f red -b blue "I like Scala"

