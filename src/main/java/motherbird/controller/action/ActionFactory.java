package motherbird.controller.action;

public class ActionFactory {
    private static ActionFactory instance;

    public static ActionFactory getInstance() {
        if (instance == null) {
            instance = new ActionFactory();
        }
        return instance;
    }

    public Action getAction(String command) {
        Action action;
        System.out.println("command :" + command); //DEBUG
        // forwardPageAction
        if (command == null) {
            return null;
        }
        // commandAction
        switch (command) {
            case "/checkLoginStatus.do":
                return new CheckLoginStatusAction();
            case "/allUser.do":
                return new AllUserAction();
            default:
                return null;
        }
    }
}
