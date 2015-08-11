lazy val abideBay = project in file("abide-bay/")
lazy val demo     = project in file("demo/") //dependsOn abideBay -- https://github.com/scala/scala-abide/issues/62
