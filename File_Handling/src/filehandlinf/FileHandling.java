package filehandlinf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
public static void main(String[] args) {
String fileName = "Ashiq.txt";
// Create a file
createFile(fileName);
// Write content to the file
writeFile(fileName, "HI!ITS ME Ashiq!!");
// Read and print the file content
String content = readFile(fileName);
System.out.println("File content: " + content);
// Update the file content
updateFile(fileName, "I BELONG TO KARNATAKA, INDIA!!!");
// Read and print the updated file content
content = readFile(fileName);
System.out.println("Updated file content: " + content);
// Delete the file
deleteFile(fileName);
}
public static void createFile(String fileName) {
File file = new File(fileName);
try {
if (file.createNewFile()) {
System.out.println("File created: " + fileName);
} else {
System.out.println("File already exists: " + fileName);
}
} catch (IOException e) {
System.out.println("An error occurred while creating the file: " + 
e.getMessage());
}
}
public static void writeFile(String fileName, String content) {
try (FileWriter writer = new FileWriter(fileName)) {
writer.write(content);
System.out.println("Content written to the file: " + fileName);
} catch (IOException e) {
System.out.println("An error occurred while writing to the file: " + 
e.getMessage());
}
}
public static String readFile(String fileName) {
StringBuilder content = new StringBuilder();
try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) 
{
String line;
while ((line = reader.readLine()) != null) {
content.append(line);
}
} catch (IOException e) {
System.out.println("An error occurred while reading the file: " + 
e.getMessage());
}
return content.toString();
}
public static void updateFile(String fileName, String newContent) {
try (FileWriter writer = new FileWriter(fileName)) {
writer.write(newContent);
System.out.println("File updated: " + fileName);
} catch (IOException e) {
System.out.println("An error occurred while updating the file: " + 
e.getMessage());
}
}
public static void deleteFile(String fileName) {
File file = new File(fileName);
if (file.delete()) {
System.out.println("File deleted: " + fileName);
} else {
System.out.println("Failed to delete the file: " + fileName);
}
}
}
