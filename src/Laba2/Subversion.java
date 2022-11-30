package Laba2; //пакет Java классов

import java.awt.event.ActionListener; //библиотека для события слушателя
import javax.swing.*; // Библиотека для GUI (построена на основе awt)
public class Subversion {

    protected JFrame mainGUI;
    protected JPanel mainPanel;
    public static Object imagePanel;
    public static Object logoImage;

    public Subversion() {
        mainGUI = new JFrame("subversion");	// создание графического окна
        mainGUI.setTitle ("Using subversion for developers");
        mainGUI.setBounds(500,400,400,300);
        mainGUI.setResizable(false); // фиксированный размер окна


        mainPanel = new JPanel(); // Панель - используется для организации компонентов в окне
        mainPanel.setLayout(null);
        mainGUI.add(mainPanel);


        JLabel labaInfo = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
        labaInfo.setBounds(120,0,150,30);
        mainPanel.add(labaInfo);


        JButton buttonExit = new JButton("Выход"); // добавляем кнопку
        buttonExit.setBounds(270,200,100,40);
        ActionListener actionListener = new ListenerButton(); //создаем слушатель
        buttonExit.addActionListener(actionListener); // добавляем слушатель к кнопке
        mainPanel.add(buttonExit);

        JButton buttonInfo = new JButton("Информация");
        buttonInfo.setBounds(30,200,150,40);
        ActionListener info_listener = new InfoButton();
        buttonInfo.addActionListener(info_listener);
        mainPanel.add(buttonInfo);

        JLabel image = new JLabel(new ImageIcon(new ImageIcon(getClass().getResource("./icon.jpg"))
                .getImage().getScaledInstance(100,49, java.awt.Image.SCALE_SMOOTH)));
        image.setBounds(30,30, 100,49);
        mainPanel.add(image);

        JComboBox<String> selectLogo = new JComboBox<>(new String[] {"Слева", "По центру", "Справа"});

        selectLogo.setBounds(150, 150, 100, 30);
        selectLogo.addItemListener(new ListenerComboBox(image));

        mainPanel.add(selectLogo);

        mainGUI.setVisible(true);


        mainGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
    }




    public static void main(String[] args) {
        Subversion student = new Subversion();
    }

}

