class Printer {
    synchronized void print(String document) {
        System.out.println(Thread.currentThread().getName() + " is printing: " + document);
        try {
            Thread.sleep(1000); // simulate printing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished printing: " + document);
    }
}

class User extends Thread {
    private Printer printer;
    private String document;

    User(Printer printer, String document, String userName) {
        super(userName); // set thread name
        this.printer = printer;
        this.document = document;
    }

    public void run() {
        printer.print(document);
    }
}
public class PrinterSimulation {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();

        User u1 = new User(sharedPrinter, "Report.pdf", "Alice");
        User u2 = new User(sharedPrinter, "Invoice.docx", "Bob");
        User u3 = new User(sharedPrinter, "Slides.pptx", "Charlie");

        u1.start();
        u2.start();
        u3.start();
    }
}
