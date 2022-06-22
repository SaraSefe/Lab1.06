import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        generateEmployees();

    }

    private static void generateEmployees() throws IOException {
        Employee employees[] = {
                new Intern("Sara", "Segura", 67231231, 123123),
                new Intern("Eli", "Fernandez", 93723423, 231231),
                new Intern("Sergi", "Ruiz", 937234443, 1312311),
                new Intern("Salvatore", "Ramirez", 97233444, 19000),
                new Intern("Antonio", "Gonzalez",98233444, 20000),
                new Intern("Raquel", "Robles", 99233444, 23134),
                new Intern("Lucía", "Chica", 542334445, 12500),
                new Intern("Laia", "Tienda", 722334443, 25000),
                new Intern("Helena", "Pintor", 652334443, 23500),
                new Intern("Eric", "Mas", 726233444, 28000),
        };
         for (Employee employee: employees){
                  write(employee.toString());

    }

    }
    private static void write(String text) throws IOException {
        FileWriter writer = new FileWriter("employees.txt",true);
        writer.write(text);
        writer.close();

    }
}
