<div align="center">

<h3 align="center">Object-Oriented Programming Assignments</h3>

  <p align="center">
    A collection of Java programs demonstrating object-oriented programming concepts.
    <br />
     <a href="https://github.com/tridibbanik17/objectorientedprogramming">github.com/tridibbanik17/objectorientedprogramming</a>
  </p>
</div>

## Table of Contents

<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#key-features">Key Features</a></li>
      </ul>
    </li>
    <li><a href="#architecture">Architecture</a></li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>

## About The Project

This repository contains a collection of Java programs created as part of the SFWRENG 2OP3: Object-Oriented Programming course at McMaster University. These programs demonstrate various object-oriented principles and problem-solving techniques using Java. The assignments cover a range of topics, from basic calculations and number conversions to more complex class hierarchies and string manipulation.

### Key Features

- **Basic Calculations:** Programs for calculating the area and perimeter of a circle, solving quadratic equations, and generating right-angle triangles.
- **Number Conversions:** A program to convert decimal integers to octal integers.
- **Game Implementation:** A number guessing game where the user tries to guess a randomly generated number.
- **String Manipulation:** Programs for extracting phone numbers from strings, analyzing text, and cleaning strings by removing punctuation and extra spaces.
- **Object-Oriented Design:** A car fleet management system demonstrating inheritance, polymorphism, and interfaces.
- **Statistical Analysis:** A class for calculating the average and median of an array of integers.

## Architecture

The repository is organized into several directories, each containing related Java programs.

- **Root Directory:** Contains individual programs for basic calculations, number conversions, and game implementation.
- **Car Directory:** Contains a class hierarchy for different types of cars (GasolineCar, ElectricCar, HybridCar, LuxuryCar) and demonstrates inheritance, polymorphism, and interfaces.
- **StatisticsCalculator Directory:** Contains classes for calculating statistical measures (average, median) of an array of integers.
- **StringAnalyzer Directory:** Contains classes for analyzing strings, including calculating word frequencies, finding the longest word, and checking for palindromes.
- **StringCleaner Directory:** Contains classes for cleaning strings by removing punctuation, converting to lowercase, and removing extra spaces.
- **TextAnalyzer Directory:** Contains classes for advanced text analysis, extending the functionality of StringAnalyzer and StringCleaner.

The architecture showcases the application of object-oriented principles in designing and implementing various functionalities.

## Getting Started

To run the Java programs in this repository, you need to have the Java Development Kit (JDK) installed on your system.

### Prerequisites

- **Java Development Kit (JDK):**  Download and install the latest version of the JDK from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) or an open-source distribution like [OpenJDK](https://openjdk.java.net/).

  ```sh
  # Example command to check Java version (after installation)
  java -version
  ```

### Installation

1. **Clone the repository:**
   ```sh
   git clone https://github.com/tridibbanik17/objectorientedprogramming.git
   ```
2. **Navigate to the project directory:**
   ```sh
   cd objectorientedprogramming
   ```
3. **Compile the Java programs:**
   ```sh
   # Example: Compiling Circle.java
   javac Circle.java
   ```
   For the Car project, compile all Java files in the `Car` directory:
   ```sh
   javac Car/*.java
   ```
   Similarly, compile the files in the `StatisticsCalculator`, `StringAnalyzer`, `StringCleaner`, and `TextAnalyzer` directories.
4. **Run the Java programs:**
   ```sh
   # Example: Running Circle.java
   java Circle
   ```
   For the Car project, run the `Main.java` file:
   ```sh
   java Car/Main
   ```
   Similarly, run the `Main.java` file in the `StatisticsCalculator`, `StringAnalyzer`, `StringCleaner`, and `TextAnalyzer` directories.

## Acknowledgments

- This README was created using [gitreadme.dev](https://gitreadme.dev) — an AI tool that looks at your entire codebase to instantly generate high-quality README files.
- Dr. Lingyang Chu for instructing the SFWRENG 2OP3: Object-Oriented Programming course.

