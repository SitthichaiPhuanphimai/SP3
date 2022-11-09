
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileIO {
    public FileIO() {
    }

    public void createFile() {
        try {
            File usrFile = new File("users.txt");
            if (usrFile.createNewFile()) {
                System.out.println("File created: " + usrFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public static void parseFile(String fileName, String searchStr) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        while (scan.hasNext()) {
            String line = scan.nextLine().toLowerCase().toString();
            if (line.contains(searchStr.toLowerCase())) {
                System.out.println(line);
            }
        }
    }

    public static void writeUser(String userName, String password) {
        try {
            FileWriter writer = new FileWriter("src/Data/test.txt", true);
            writer.write(userName + " " + password + '\n');
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void checkUser(String userName, String password) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/Data/test.txt"));
        Scanner keyboard = new Scanner(System.in);

            String user = scan.next();

            String pass = scan.next();

            String inpUser = userName;
            String inpPass = password; // gets input from user

            if (inpUser.equals(user) && inpPass.equals(pass)) {
                System.out.print("Login successful");
            } else {
                System.out.print("user name & password not found");
            }

    }

        public static ArrayList<String> readData(File file)
        {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                ArrayList<String> data = new ArrayList<>();

                String currentLine = reader.readLine();
                while (currentLine != null) {
                    data.add(currentLine);
                    currentLine =reader.readLine();
                }
                return data;

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        public static ArrayList<User> setupUsers()
        {
          ArrayList<String>userdata = readData(new File("src/Data/test.txt"));
          ArrayList<User>userList = new ArrayList<>();

            for (String s:userdata) {
                String[] userLogin = s.split(" ");

                String userName = userLogin[0];
                String userPassword = userLogin[1];


                userList.add(new User(userName,userPassword, new ArrayList<>(), new ArrayList<>()));
            }

            return userList;
        }





}



