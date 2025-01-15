```groovy
def myMethod(a, b) {
  return a >? b ? a : b ?: a ?: b
}

println myMethod(5, 2) //5
println myMethod(2, 5) //5
println myMethod(null, 5) //5
println myMethod(5, null) //5
println myMethod(null, null) //null
```