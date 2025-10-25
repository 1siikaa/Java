public class HelloM {
    public static void main(){
        System.out.print("Hello, World!");
    }
}

/*
 * Line-by-Line Explanation

public class HelloWorld {
	•	class: In Java, everything is inside a class. Java is a pure object-oriented language, so even the simplest program needs a class.
	•	HelloWorld: The name of the class. Must match the filename (HelloWorld.java).
	•	public: The access modifier. public means this class is accessible from anywhere.

Importance:
Every Java program starts with a class. This establishes the basic structure of a Java program.

⸻

public static void main(String[] args) {
	•	public: JVM needs to access this method from outside the class to start execution.
	•	static: JVM calls this method without creating an object of the class.
	•	void: This method does not return any value.
	•	main: The entry point of the program — where execution starts.
	•	String[] args: Command-line arguments. An array of strings that allows users to pass input when running the program.

Importance:
main is essential because without it, the JVM doesn’t know where to start executing the program.

⸻

 System.out.println("Hello, World!");
	•	System: A built-in class that provides access to system resources.
	•	out: A static member of System, representing standard output (console).
	•	println: Method to print text followed by a new line.
	•	"Hello, World!": The message to display on the console.

Importance:
This is the first way we learn to produce output, understand method calls, objects, and the syntax of statements in Java.

⸻

 Closing Braces }
	•	These close the main method and the class.
	•	Braces {} define blocks of code, helping the compiler understand scope and structure.

Importance:
Correctly using braces is critical — Java relies on them to group statements.

 */