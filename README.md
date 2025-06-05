# BrowserHistoryStack

This project demonstrates a simple implementation of browser history management using the Stack data structure in Java. It simulates basic operations such as adding websites to history, viewing the current website, deleting the most recent website, searching for a specific website, printing the entire history, and checking if the history is empty.

## Code Summary

The program uses a Stack<String> to store website names simulating the browser's history stack. It performs the following operations:

i) Add Websites: Pushes a predefined list of websites onto the stack.

ii) View Current Website: Displays the website at the top of the stack.

iii) Delete Top Website: Removes the most recent website visited from the stack.

iv) Search Website: Checks if a particular website (e.g., Facebook) exists in the history.

v) Print All Websites: Prints the current stack content representing the history.

vi) Check if History is Empty: Returns whether the stack is empty.


## Sample Output

```
Current websites in the history: [LinkedIn, GoDaddy, Youtube, Facebook, Instagram]
The current website on the top position is: Instagram
Updated history: [LinkedIn, GoDaddy, Youtube, Facebook]
If the website Facebook exists in the history or not: 4
The latest added websites in the history: [LinkedIn, GoDaddy, Youtube, Facebook]
Is the history empty or not: false
```

## Key Points:
- Uses Java's Stack class to implement browser history.

- Demonstrates basic stack operations: push(), pop(), peek(), search(), and empty().

- The search() method returns the 1-based position from the top of the stack if found; otherwise, it returns -1.
