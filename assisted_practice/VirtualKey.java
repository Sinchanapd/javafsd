package assisted_practice;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualKey {
	static String DIRECTORY;
    File folder_name;

    public VirtualKey()
    {
        DIRECTORY = System.getProperty("user.dir");
        folder_name = new File(DIRECTORY+"/files");
        if (!folder_name.exists())
            folder_name.mkdirs();
        System.out.println("DIRECTORY : "+ folder_name.getAbsolutePath());
    }
    private static final String WELCOME =
            "\n------------------Welcome to Virtual Key-------------------------"+ "\n"+
                    "\n\t\t Developer name: Sinchana P D \n"  +
              "-----------------------------------------------------------------\n";

    private static final String MAIN_MENU =
            "\nMAIN MENU - Select any of the following: \n"+
                    "1 -> List files in directory\n"+
                    "2 -> Perform file operations\n"+
                    "3 -> Exit";

    private static final String SECONDARY_MENU =
            "   \nSelect any of the following: \n"+
                    "   a -> Add a file\n"+
                    "   b -> Delete a file\n"+
                    "   c -> Search a file\n"+
                    "   d -> Go back to main menu";

    void showPrimaryMenu()
    {
        System.out.println(MAIN_MENU);
        try
        {
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice)
            {
                case 1 : 
                {
                    showFiles();
                    showPrimaryMenu();
                }
                case 2 : 
                {
                    showSecondaryMenu();
                }
                case 3 : 
                {
                    System.out.println("Thank You");
                    System.exit(0);
                }
                default: showPrimaryMenu();
            }
        }
        catch (Exception e){
            System.out.println("Please enter 1, 2 or 3");
            showPrimaryMenu();
        }
    }

    void showSecondaryMenu()
    {
        System.out.println(SECONDARY_MENU);
        try
        {
            Scanner scanner = new Scanner(System.in);
            char[] input = scanner.nextLine().toLowerCase().trim().toCharArray();
            char option = input[0];

            switch (option)
            {
                case 'a' : {
                    System.out.println("Adding a file");
                    System.out.println("Please Enter a File Name : ");
                    String filename = scanner.next().trim().toLowerCase();
                    addFile(filename);
                    break;
                }
                case 'b' : {
                    System.out.println("Deleting a file ");
                    System.out.println("Please Enter a File Name : ");
                    String filename = scanner.next().trim();
                    deleteFile(filename);
                    break;
                }
                case 'c' : {
                    System.out.print("Searching a file ");
                    System.out.println("Please Enter a File Name : ");
                    String filename = scanner.next().trim();
                    searchingFile(filename);
                    break;
                }
                case 'd' : {
                    System.out.println("Going Back to main menu");
                    showPrimaryMenu();
                    break;
                }
                default : System.out.println("Please enter a, b, c or d");
            }
            showSecondaryMenu();
        }
        catch (Exception e){
            System.out.println("Please enter a, b, c or d");
            showSecondaryMenu();
        }
    }

    void showFiles() 
    {
        if (folder_name.list().length==0)
            System.out.println("The folder is empty");
        else 
        {
            String[] list = folder_name.list();
            System.out.println("The files in "+ folder_name +" are :");
            Arrays.sort(list);
            for (String str:list)
            {
                System.out.println(str);
            }
        }
    }

    void addFile(String filename) throws IOException
    {
        File filepath = new File(folder_name +"/"+filename);
        String[] list = folder_name.list();
        for (String file: list) 
        {
            if (filename.equalsIgnoreCase(file))
            {
                System.out.println("File " + filename + " already exists at " + folder_name);
                return;
            }
        }
        filepath.createNewFile();
        System.out.println("File "+filename+" added to "+ folder_name);
    }

    void deleteFile(String filename) 
    {
        File filepath = new File(folder_name +"/"+filename);
        String[] list = folder_name.list();
        for (String file: list)
        {
            if (filename.equals(file) && filepath.delete())
            {
                System.out.println("File " + filename + " deleted from " + folder_name);
                return;
            }
        }
        System.out.println("Delete Operation failed. FILE NOT FOUND");
    }

    void searchingFile(String filename)
    {
        String[] list = folder_name.list();
        for (String file: list) 
        {
            if (filename.equals(file))
            {
                System.out.println("FOUND : File " + filename + " exists at " + folder_name);
                return;
            }
        }
        System.out.println("File NOT found ");
    }
	public static void main(String[] args) {
		System.out.println(WELCOME);
        VirtualKey key = new VirtualKey();
        key.showPrimaryMenu();
	}

}
