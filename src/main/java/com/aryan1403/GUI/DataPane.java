package com.aryan1403.GUI;

import java.awt.Font;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.aryan1403.Manage.Student;
import com.aryan1403.Manage.studentDAO;

public class DataPane extends JPanel {
    public final int x = 20;
    public int y = 20;
    public final int width = 500;
    public final int height = 50;
    public DataPane() {
        this.setBounds(0, 0, 790, 690);
        List<Student> list = studentDAO.getAllData(); // Get Data
        for (Student s : list) {
            this.add(data(s)); // Add Data to the panel
        }
        this.setLayout(null);
    }

    public JLabel data(Student s) {
        JLabel label = new JLabel();
        label.setBounds(x, y, width, height);
        label.setText(s.getStudentId() + ". " + s.getStudentName());
        label.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        label.setLayout(null);

        y += 100;
        return label;
    }
}
