# Linear Search

## Assignment Instructions
Write a Java program to find a specified element in a given array of elements using Linear Search.

### Requirements
- Create a method called `promptUser()` that:
  - Has no parameters
  - Prompts the user 5 times for an integer
  - Stores those values in an integer array
  - Returns that array to `main`

- Create a method called `linearSearch()` that:
  - Accepts two parameters: an integer array and an integer to find
  - Returns the **index position** of the number if found, or **-1** if not found

- In `main()`:
  - Call `promptUser()` to get the array
  - Ask the user for a number to find
  - Call `linearSearch()` and print either:
    - The index position of the number, or  
    - `"Number not found"` if -1 is returned
