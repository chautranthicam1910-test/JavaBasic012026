package SwitchCase;

public class CauLenhSwitchCase {
    public static void main(String[] args) {
        String browser = "Safari";

        switch (browser) {
            case "Chrome":
                System.out.println("Khoi tao trinh duyet Chrome");
                //WebDriver driver = new ChromeDriver();
                break;
            case "Edge":
                System.out.println("Khoi tao trinh duyet Edge");
                //WebDriver driver = new EdgeDriver();
                break;
            case "Firefox":
                System.out.println("Khoi tao trinh duyet Firefox");
                break;
            default:
                System.out.println("Khoi tao trinh duyet Default la Chrome");
        }
    }

}
