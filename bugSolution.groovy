```groovy
def myMethod(List<String> list) {
  //Using iterator to avoid ConcurrentModificationException
  def iterator = list.iterator()
  while (iterator.hasNext()){
    def element = iterator.next()
    println "Element : $element"
    if(element == "c"){
        iterator.remove()
    }
  }
}

List<String> myList = ['a', 'b', 'c', 'd']
myMethod(myList)

//Alternative solution using copy and new list

def myMethod2(List<String> list) {
  def newList = []
  list.each { element ->
    if (element != "c") {
      newList << element
    }
  }
  println newList
}

myList = ['a', 'b', 'c', 'd']
myMethod2(myList)
```