package projetos_2d;

import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
    private JButton changeColor;
    private Color color = Color.LIGHT_GRAY;
    private Container container;

    public Main() {
        super("Usando o JColorChooser");

        container = getContentPane();
        container.setLayout(new FlowLayout());

        changeColor = new JButton("Clique em mim para mudar a cor");

        changeColor.addActionListener(e -> {
            color = JColorChooser.showDialog(Main.this, "Escolha uma cor", color);

            if(color == null)
                color = Color.LIGHT_GRAY;

            container.setBackground(color);
        });

        container.add(changeColor);

        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
