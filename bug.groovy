```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { element, index ->
    println "Element at index $index: $element"
    if (index == 2) {
      list.remove(element) // This line causes ConcurrentModificationException
    }
  }
}

List<String> myList = ['a', 'b', 'c', 'd']
myMethod(myList) 
```