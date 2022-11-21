package myFileManager;

import java.util.Scanner;

public class PersonalFileManager {
	static Scanner s = new Scanner(System.in);
	static String rootPath = "D:\\MyData";

	// functions start
	public static void createDirectory() {

	}

	public static void renameDirectory() {

	}

	public static void deleteDirectory() {

	}

	public static void copyDirectory() {

	}

	public static void moveDirectory() {

	}

	public static void createFile() {

	}

	public static void renameFile() {

	}

	public static void deleteFile() {

	}

	public static void copyFile() {

	}

	public static void moveFile() {

	}
	// functions end

	public static void main(String[] args) {
		int choice = 0;
		System.out.println("\n\t Welcome to File Manager!");

		// start of do while
		do {
			System.out.println("\n\t Please select an option from below!");
			System.out.println("\n\t 1 create directory");
			System.out.println("\n\t 2 rename directory!");
			System.out.println("\n\t 3 delete directory!");
			System.out.println("\n\t 4 copy directory!");
			System.out.println("\n\t 5 move directory!");

			System.out.println("\n\t 6 create file");
			System.out.println("\n\t 7 rename file!");
			System.out.println("\n\t 8 delete file!");
			System.out.println("\n\t 9 copy file!");
			System.out.println("\n\t 10 move file!");

			System.out.println("\n\t 0 Exit!");
			System.out.print("\n\n\t Your choice : ");
			choice = s.nextInt();

			switch (choice) {
			case 1:
				createDirectory();
				break;
			case 2:
				renameDirectory();
				break;
			case 3:
				deleteDirectory();
				break;
			case 4:
				copyDirectory();
				break;
			case 5:
				moveDirectory();
				break;

			case 6:
				createFile();
				break;
			case 7:
				renameFile();
				break;
			case 8:
				deleteFile();
				break;
			case 9:
				copyFile();
				break;
			case 10:
				moveFile();
				break;
			}
		} while (choice != 0);

		System.out.println("\n\t Thank you for using our File Manager!");
	}
}