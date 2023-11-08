
package component;

import javax.swing.ImageIcon;
import model.Model_Account;


public class Account extends javax.swing.JPanel {

    
    public Account() {
        initComponents();
        init();
    }
    
    public void init(){
        list.addItem(new Model_Account("Anonymus", new ImageIcon(getClass().getResource("/icon/avartar.jpg"))));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list = new component.ListAccount<>();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.ListAccount<String> list;
    // End of variables declaration//GEN-END:variables
}
