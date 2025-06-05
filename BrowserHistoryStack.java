import java.util.Stack;

class Browser {
    Stack<String> stack = new Stack<>();

    void pushToHistory(){
        stack.push("LinkedIn");
        stack.push("GoDaddy");
        stack.push("Youtube");
        stack.push("Facebook");
        stack.push("Instagram");

        System.out.println("Current websites in the history: " + stack);
    }

    void viewPositionOfWebsite(){
        System.out.println("The current website on the top position is: " + stack.peek());
    }

    void deleteTheTopWebsite(){
        stack.pop();
        System.out.println("Updated history: " + stack);
    }

    void checkHistory(){
        System.out.println("If the website Facebook exists in the history or not: " + stack.search("Facebook"));
    }

    void printWebsites(){
        System.out.println("The latest added websites in the history: " + stack);
    }

    void isHistoryEmpty(){
        System.out.println("Is the history empty or not: " + stack.empty());
    }

}

public class BrowserHistoryStack {
    public static void main(String[] args) {
        Browser browser = new Browser();

        browser.pushToHistory();
        browser.viewPositionOfWebsite();
        browser.deleteTheTopWebsite();
        browser.checkHistory();
        browser.printWebsites();
        browser.isHistoryEmpty();
    }
}
