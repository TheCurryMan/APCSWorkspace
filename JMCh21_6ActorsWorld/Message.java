public class Message
{
    private Actor sender;
    private Actor recipient;
    private String text;

    /**Constructor of the Message class
     * @param a1 the sender of the message
     * @param a2 the recipient of the message
     * @param str the contents of the message
     */
    public Message(Actor a1, Actor a2, String str)
    {
        sender = a1;
        recipient = a2;
        text = str;
    }

    public Actor getSender() { return sender; }
    public Actor getRecipient() { return recipient; }
    public String getText() { return text; }

    public String toString()
    {
        String toName;

        if (recipient != null)
            toName = recipient.getName();
        else
            toName = "all";

        return "From: " + sender.getName() + "\n"
        + "To: " + toName + "\n"
        + text + "\n";
    }
}
