
package component2;

import javax.swing.ImageIcon;
import model.Model_GoiY;


public class GoiY extends javax.swing.JPanel {

 
    public GoiY() {
        initComponents();
        init();
    }
    
    public void init(){
        list.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/thuyChi.jpg"))));
        list.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/sonTung.jpg"))));
        list.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/hoaMinzy.jpg"))));
        
        list1.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/thuyChi.jpg"))));
        list1.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/sonTung.jpg"))));
        list1.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/hoaMinzy.jpg"))));
        
        list2.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/thuyChi.jpg"))));
        list2.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/sonTung.jpg"))));
        list2.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/hoaMinzy.jpg"))));
        
        list3.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/thuyChi.jpg"))));
        list3.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/sonTung.jpg"))));
        list3.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/hoaMinzy.jpg"))));
        
        list4.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/thuyChi.jpg"))));
        list4.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/sonTung.jpg"))));
        list4.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/hoaMinzy.jpg"))));
        
        list5.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/thuyChi.jpg"))));
        list5.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/sonTung.jpg"))));
        list5.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/hoaMinzy.jpg"))));
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list = new component2.ListGoiY<>();
        list1 = new component2.ListGoiY<>();
        list2 = new component2.ListGoiY<>();
        list3 = new component2.ListGoiY<>();
        list4 = new component2.ListGoiY<>();
        list5 = new component2.ListGoiY<>();

        setBackground(new java.awt.Color(0, 0, 0));

        list.setBorder(null);

        list1.setBorder(null);

        list2.setBorder(null);

        list3.setBorder(null);

        list4.setBorder(null);

        list5.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(list2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(list3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(list4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(list5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component2.ListGoiY<String> list;
    private component2.ListGoiY<String> list1;
    private component2.ListGoiY<String> list2;
    private component2.ListGoiY<String> list3;
    private component2.ListGoiY<String> list4;
    private component2.ListGoiY<String> list5;
    // End of variables declaration//GEN-END:variables
}
