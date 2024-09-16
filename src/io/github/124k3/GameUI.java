import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * GameUI hadles the creation of all the UI componets in the game
 *
 * The class makes extensive use of Java Swing Gui library.
 * @version 1.1
 * @author 124k3
 *
 */
public class GameUI 
{

    // --------------------------constructor(s)

    public GameUI() 
    {
        createWindow();
    }

    // --------------------------method(s)

    /**
     * create(s) the parent window using the JFrame.
     *
     * The main windown on which other gui can be rendered.
     */
    public void createWindow() 
    {
        // main parent window
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 480);
        centerWindow(frame);
        frame.setVisible(true);
    }

    /**
     * Ceteres the frame i.e the Window.
     * @param frame JFrame object
     *
     **/
    private static void centerWindow(JFrame frame) 
    {
        // get screen size
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenDimension = toolkit.getScreenSize();

        // get size of frame
        Dimension frameDimension = frame.getSize();

        // getting the x, y cord to center the window
        int xCord = (screenDimension.width - frameDimension.width) / 2;
        int yCord = (screenDimension.height - frameDimension.height) / 2;

        frame.setLocation(xCord, yCord);
    }

    /**
     * The reply(s) / messages given to the user on each successfull
     * interaction (user Input).
     *
     * @param reply the reply user would see/get.
     * @param frame the parent window on which to render the frame.
     *
     **/
    public void setGameReply(String reply, JFrame frame) 
    {
        // parentComp, object, title, optionType
        JOptionPane.showConfirmDialog(frame, reply, "Gay Tester!", 2);
    }

    /**
     * The question(s) to ask user.
     * @param question the question to be asked.
     * @param frame the parent window on to which the game renders.
     * @param optionType {@code 1} - yes,no option buttons, 
     * {@code 2} - yes, no, cancel option buttons avalable.
     * 
     *
     **/
    public int askQuestion(String question, JFrame frame, int optionType)
    {
        return (JOptionPane.showInternalConfirmDialog(
                    frame, question, "Gay Tester!", optionType));

    }

}
