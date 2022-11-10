import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args) throws FileNotFoundException {

        RunProgram program = new RunProgram();

        program.setup();
        program.run();

    }
}
