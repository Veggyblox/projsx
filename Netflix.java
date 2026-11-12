class Netflix {
    private String accountEmail = "user@gmail.com";

    protected String platform = "Netflix";

    public void showAccount() {
        System.out.println("Welcome to Netflix!");
    }

    public void subscribe() {
        System.out.println("basic subscription selected");
    }

    public void subscribe(String plan) {
        System.out.println("Selected Plan: " + plan);
    }

    public void subscribe(String plan, int months) {
        System.out.println("Plan: " + plan);
        System.out.println("Duration: " + months + " months");
    }
}

class MobilePlan extends Netflix {

    public void welcome() {
        System.out.println("Welcome to Netflix Mobile!");
    }

    public void showFeatures() {
        System.out.println("Device:  1 Mobile");
        System.out.println("Quality: SD");
        System.out.println("Price: 199 NPR");
        System.out.println("Platform: " + platform);
    }
}

class StandardPlan extends Netflix {

    public void welcome() {
        System.out.println("Welcome to Netflix Standard!");
    }

    public void showFeatures() {
        System.out.println("Device: 2");
        System.out.println("Quality: Full HD");
        System.out.println("Price: 399 NPR");
    } 
}

class PremiumPlan extends Netflix {
    
    public void welcome() {
        System.out.println("Welcome to Netflix Premium!");
    }

    public void showFeatures() {
        System.out.println("Device: 4");
        System.out.println("Quality: 4k");
        System.out.println("Price: 599 NPR");
    } 
}
public class Netflix {
    public static void main(String[] args) {

        MobilePlan mobile = new MobilePlan();
        StandardPlan standard = new StandardPlan();
        PremiumPlan premium = new PremiumPlan();

        System.out.println("=== ACCOUNT DETAILS ===");
        mobile.showAccount();

        System.out.println("\n=== SUBSCRIPTION ===");

        mobile.subscribe();
        mobile.subscribe("Mobile");
        mobile.subscribe("Mobile", 3);

        System.out.println("\n=== PLAN DETAILS ===");

        mobile.welcome();
        mobile.showFeatures();

        standard.welcome();
        standard.showFeatures();

        premium.welcome();
        premium.showFeatures();
    }
}

// Works but not in VS
