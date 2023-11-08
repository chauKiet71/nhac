package List;

import javax.swing.ImageIcon;
import model.Model_Chill;

public class PlayList extends javax.swing.JPanel {

    public PlayList() {
        initComponents();
        init();
    }

    public void init() {
        listChill1.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p1.jpg")), "Bầu Trời Âm Nhạc"));
        listChill2.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p2.jpg")), "Đừng Ai Nhắc Về Anh Ấy"));
        listChill3.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p3.jpg")), "Đừng Nhấc Máy"));
        listChill4.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p4.jpg")), "Nhạc Hội Tết Việt"));
        listChill5.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p5.jpg")), "Nhạc Êm Dịu Khi Ngủ"));
        listChill6.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p6.jpg")), "Xin Đừng Nhấc Máy"));
        listChill7.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p7.jpg")), "Nhạc Êm Dịu Cho Giấc Ngủ"));
        listChill8.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p8.jpg")), "Bài Nhạc Đánh Rơi"));
        listChill9.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p9.jpg")), "Nghe Nhạc Anh"));
        listChill10.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p10.jpg")), "Chơi Nhạc"));
        listChill11.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p11.jpg")), "Bậc Nhạc Lên"));
        listChill12.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p12.jpg")), "Đừng Nhắc Chuyện Đau Lòng"));
        listChill13.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p13.jpg")), "Hóa Kiếp Tương Tàn"));
        listChill14.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p14.jpg")), "Hộp Nhạc Đêm"));
        listChill15.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p15.jpg")), "Hội Người Thích Nghe Nhạc"));
        listChill16.addItem(new Model_Chill(new ImageIcon(getClass().getResource("/icon/BaiHat/p16.jpg")), "Sầu Vương Ý Nhạc"));
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
        listChill13 = new component2.ListChill<>();
        listChill14 = new component2.ListChill<>();
        listChill15 = new component2.ListChill<>();
        listChill16 = new component2.ListChill<>();

        setBackground(new java.awt.Color(29, 38, 49));
        setOpaque(false);

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
                        .addComponent(listChill12, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(listChill13, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill14, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill15, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(listChill16, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
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
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listChill16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listChill15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listChill14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listChill13, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component2.ListChill<String> listChill1;
    private component2.ListChill<String> listChill10;
    private component2.ListChill<String> listChill11;
    private component2.ListChill<String> listChill12;
    private component2.ListChill<String> listChill13;
    private component2.ListChill<String> listChill14;
    private component2.ListChill<String> listChill15;
    private component2.ListChill<String> listChill16;
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
