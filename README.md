# Abide Demo

Tiny, naive, [abide](https://github.com/scala/scala-abide) rule,
and even smaller demo.

The rule is in `abide-bay/src/main/scala/UnusedPrivate.scala`,
and is violated by `demo/src/main/scala/demo.scala`.

`sbt demo/abide` should say [*]:
```
> demo/abide
[info] Running abide in demo ...
[info] Checking 1 abide rules
/Users/adriaan/git/abide-demo/demo/src/main/scala/demo.scala:2: warning: Unused member foo
private def foo() = 1
          ^
[success] Total time: 3 s, completed Aug 11, 2015 8:07:31 AM
```

[*] You'll need scala-abide 0.1.0-SNAPSHOT:
```
hub clone scala/scala-abide
cd scala-abide
sbt publish-local
```

Based on https://github.com/dragos/test-abide