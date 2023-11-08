
package List;

import javax.swing.ImageIcon;
import model.Model_Chill;
import model.Model_Profile;

public class VideoHot extends javax.swing.JPanel {


    public VideoHot() {
        initComponents();
         init();
    }

    public void init() {
        listVideoHot1.addItem(new Model_Profile("Anh Là Ngoại Lệ Của Em","Phương Ly",new ImageIcon(getClass().getResource("/icon/Chill/videohot1.jpg"))));
        listVideoHot2.addItem(new Model_Profile("Martini (Lyric)","Văn Mai Hương, Hứa Kim Tuyền",new ImageIcon(getClass().getResource("/icon/Chill/videohot2.jpg"))));
        listVideoHot21.addItem(new Model_Profile("Anh Sai Rồi","Tăng Phúc, Nguyễn Hồng Thuận",new ImageIcon(getClass().getResource("/icon/Chill/videohot3.jpg"))));
        listVideoHot22.addItem(new Model_Profile("Either Way","IVE",new ImageIcon(getClass().getResource("/icon/Chill/videohot4.jpg"))));

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        listVideoHot1 = new List.ListVideoHot<>();
        listVideoHot2 = new List.ListVideoHot<>();
        listVideoHot21 = new List.ListVideoHot2<>();
        listVideoHot22 = new List.ListVideoHot2<>();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(885, 1201));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chủ Đề Hot");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(listVideoHot21, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listVideoHot2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listVideoHot1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listVideoHot22, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listVideoHot1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listVideoHot22, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listVideoHot2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listVideoHot21, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private List.ListVideoHot<String> listVideoHot1;
    private List.ListVideoHot<String> listVideoHot2;
    private List.ListVideoHot2<String> listVideoHot21;
    private List.ListVideoHot2<String> listVideoHot22;
    // End of variables declaration//GEN-END:variables
}
