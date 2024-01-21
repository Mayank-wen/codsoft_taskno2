# codsoft_taskno2
# Student Grade Calculator

This is a simple Java console application that calculates the average percentage and assigns a grade based on the entered marks for a given number of subjects.

## How to Use

1. **Compile the Code:**
    - Ensure you have a Java Development Kit (JDK) installed.
    - Open a terminal and navigate to the directory containing the `Studentgradecalculator.java` file.
    - Compile the code using the command: `javac Studentgradecalculator.java`

2. **Run the Program:**
    - Run the compiled program with the command: `java Studentgradecalculator`
    - Follow the on-screen instructions to input the number of subjects and their respective marks.

3. **Grade Calculation:**
    - The program calculates the average percentage based on the entered marks.
    - It then assigns a grade (A, B, C, D, E) based on predefined percentage ranges.

4. **Input Validation:**
    - The program checks for invalid subject marks (greater than 100) and prompts the user to enter the marks again.

## Code Structure

The code is organized into a single Java class (`Studentgradecalculator`). Here's a brief overview:

- `main`: Entry point of the program, where the user inputs the number of subjects and their marks.
- Input validation to handle invalid subject marks.
- Calculation of average percentage and assignment of a grade based on predefined ranges.

## Constants and Variables

- Use of constants for defining grade ranges (`MIN_PERCENTAGE_FOR_A`, `MIN_PERCENTAGE_FOR_B`, ...).
- Variables for subject marks, total marks, and the final grade.

## Improvements and Modifications

Feel free to modify and enhance the code to suit your preferences or add additional features. Consider incorporating user-friendly prompts, handling edge cases, or extending the program for more complex grading criteria.
