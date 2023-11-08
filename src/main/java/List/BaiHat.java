package List;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import model.Model_Chill;

public class BaiHat extends javax.swing.JPanel {

    public BaiHat() {
        initComponents();
        init();
    }
    Clip clip;
    public void init() {
        listChill1.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/b1.jpg")), "Bleed"));
        listChill2.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/b2.jpg")), "Sanding Next to You"));
        listChill3.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/b3.jpg")), "Buồn một lần nữa thôi"));
        listChill4.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/b4.jpg")), "Can't Believe"));
        listChill5.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/b5.jpg")), "Đâu còn quan trọng"));
        listChill6.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/b6.jpg")), "Đừng khóc"));
        listChill7.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/b7.jpg")), "Mời buồn sang chơi"));
        listChill8.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/b8.jpg")), "Panic Attack"));
        listChill9.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/b9.jpg")), "Sweet Sounds Of Heaven"));
        listChill10.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/b10.jpg")), "Từng quen"));
        listChill11.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/b11.jpg")), "Cục vợ ơi, lấy anh nha"));
        listChill12.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/b12.jpg")), "Vào đời"));
//        listChill5.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/Chill/6.png")), "Nhạc Việt 'lâu phai' và gây nghiện"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listChill1 = new component2.ListChill<>();
        listChill2 = new component2.ListChill<>();
        listChill3 = new component2.ListChill<>();
        listChill4 = new component2.ListChill<>();
        listChill5 = new component2.ListChill<>();
        listChill6 = new component2.ListChill<>();
        listChill7 = new component2.ListChill<>();
        listChill8 = new component2.ListChill<>();
        listChill9 = new component2.ListChill<>();
        listChill10 = new component2.ListChill<>();
        listChill11 = new component2.ListChill<>();
        listChill12 = new component2.ListChill<>();

        setBackground(new java.awt.Color(29, 38, 49));
        setForeground(new java.awt.Color(29, 38, 49));
        setOpaque(false);

        listChill1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listChill1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(listChill1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(listChill2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(listChill3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(listChill4, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(listChill5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill8, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listChill9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill12, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listChill4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(listChill3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listChill2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listChill1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listChill8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listChill7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listChill6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listChill5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listChill12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listChill11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listChill10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listChill9, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listChill1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listChill1MouseClicked
        String path = "D://loinho.wav";
        try {
            // Mở và phát file âm thanh (ở đây tôi sử dụng một file test.wav)
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(path).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_listChill1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component2.ListChill<String> listChill1;
    private component2.ListChill<String> listChill10;
    private component2.ListChill<String> listChill11;
    private component2.ListChill<String> listChill12;
    private component2.ListChill<String> listChill2;
    private component2.ListChill<String> listChill3;
    private component2.ListChill<String> listChill4;
    private component2.ListChill<String> listChill5;
    private component2.ListChill<String> listChill6;
    private component2.ListChill<String> listChill7;
    private component2.ListChill<String> listChill8;
    private component2.ListChill<String> listChill9;
    // End of variables declaration//GEN-END:variables
}
