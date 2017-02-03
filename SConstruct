PACKAGE_NAME = "color-cli"

env = Environment(JAVAC = "scalac", JAVASUFFIX=".scala")
env.Java('classes', 'src')
env.Jar(PACKAGE_NAME, Glob("classes/*") + ["MANIFEST"])
