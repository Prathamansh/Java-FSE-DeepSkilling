public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier basicNotifier = new EmailNotifier();
        Notifier multiChannelNotifier = new SlackNotifierDecorator(
                                           new SMSNotifierDecorator(
                                               basicNotifier));

        multiChannelNotifier.send("Server down alert!");
    }
}