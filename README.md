# Groovy ConcurrentModificationException with eachWithIndex
This repository demonstrates a common error in Groovy when modifying a list while iterating using `eachWithIndex`.  The code attempts to remove an element at a specific index during iteration, leading to a `ConcurrentModificationException`.

The solution illustrates safer ways to handle list modification during iteration, avoiding the exception.

## How to Reproduce
1. Clone this repository.
2. Run `bug.groovy`.
3. Observe the `ConcurrentModificationException`.
4. Run `bugSolution.groovy` to see the corrected behavior.