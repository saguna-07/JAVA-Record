EXP NO:12(b)
DATE:13-10-26
                                       CARD LAYOUT
Aim:
To write and execute a Java Applet program to demonstrate the use of `CardLayout` in AWT.

Algorithm:
1. Start the program.
2. Import the required `java.io`, `java.awt`, `java.applet`, and `java.awt.event` packages.
3. Create an applet class named `carddemo` that extends `Applet` and implements `ActionListener`.
4. Declare Button, Panel, and CardLayout objects.
5. In the `init()` method:
   - Create a panel.
   - Create a CardLayout object.
   - Set the CardLayout to the panel.
   - Create three buttons and add action listeners.
   - Add the buttons to the panel with different names.
6. In the `actionPerformed()` method, use `buttonCardLayout.next(buttonPanel)` to display the next card.
7. Run the applet.
8. Stop the program.

Code:
import java.io.*; import
java.awt.*; import
java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class carddemo extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout;
public void init()
{
buttonPanel=new Panel();
add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout);
b1=new Button("first Button");
b1.addActionListener(this);
buttonPanel.add(b1,"first Button");
b2=new Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button");
b3=new Button("third button");
b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}

Result:
Thus, the Java Applet program was executed successfully to demonstrate the `CardLayout` in AWT, which displays one component at a time and switches to the next component when an action event occurs.
