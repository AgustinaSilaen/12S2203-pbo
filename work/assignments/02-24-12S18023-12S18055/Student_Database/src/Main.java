import java.util.ArrayList;
import java.util.List;
import java.util.scanner;

/**
 *
 * @author 24-12S18023 Agustina Silaen
 * @author 24-12S18055 Raja Muda Gading Tulen Sihite
 */
public class Main {
    
    private static List<String> nims = new ArrayList<>();
    private static List<String> names = new ArrayList<>();

public static void main(string[] _args) {
Scanner in = new Scanner(System.in);
String s;
boolean quit = false;

do{
s = in.nextLine();
String[] tokens = s.split(" ");
String output = "";

Switch (tokens[0]) {
    case "add":
        add(tokens[1], tokens[2]);
        break;
    case "find":
        output = find(tokens[1]);
        break;
    case "count":
        output = "" + count();
        break;
    case "reset":
        reset();
        break;
    case "exit":
        quit = true;
}
    if (output.length() > 0) {
        System.out.println(output);

        }
    }   while (!quit);
}
    
    public static void add(String _nim, String _name) {
    int scan = 0;
    for(int i = 0; i<nims.size; i++){
           if(_nim.equals(nims.get(i))){
               scan++;
            }
        }
        
     if (scan = 0){
    nims.add(_nim);
    names.add(_name);

            }
        }
    
    

    public static int count() {
    return nims.size();
   }

    public static void reset(){
    nims.clear();
    nims.clear();
    }
   


public static String find(String _nim) {
    int index = nims.indexOf(_nim);
   
    if (index >= 0) {
    return nims.get(index) + " " + names.get(index);
}
    return"";
        }
    }

