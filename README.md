# Examsoft Assessment: James Campbell
Thank you for your consideration, in this repository is my assessment file which will take in some text, count word occurrences, and display counts grouped by the words.

### A few user details about the application:
 
* The application is ran via command line
* The application distinguishes a "word" as having letters (no numbers or character-only words).
* The application currently only works with english
* Currently the application only whitelists apostrophe and hyphen characters in the words themselves
* Java 8 is a requirement for this application, see how to install it here: https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html

### A few technical details about the application:

* Almost the entire application is one big Java 8 stream, which does all the transformations, grouping, and displaying of the information without uneccesary variables.
* Some assumptions were made about what the input and output formats were, so the application is started up with the text as a command line argument.

### How to run

After Java has been installed, simply compile the .java class by navigating to the root of the project folder and running (via command line):

``javac -d ./ *.java``

Build the .jar file:

``jar cfe examsoft-assessment.jar WordFrequencyCalculator WordFrequencyCalculator.class``

And then run the program:

``JAVA -jar .\examsoft-assessment.jar``

Given the sample text in the assignment, you should now see:


INPUT: the cat is in the bag ->

>2 the\
>1 bag\
>1 cat\
>1 in\
>1 is

Thank you for your consideration!




