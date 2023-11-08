package form;

import SlideShow.Slide1;
import SlideShow.Slide2;
import SlideShow.Slide3;
import SlideShow.Slide4;
import javax.swing.ImageIcon;
import model.Model_ThinhHanh;
import swing.ScrollBarr;

public class Form_ThinhHanh extends javax.swing.JLayeredPane {

    public Form_ThinhHanh() {
        initComponents();
        init();
    }

    public void init() {
        slideShow1.initSlideshow(new Slide1(), new Slide2(), new Slide3(),new Slide4());
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slideShow1 = new SlideShow.SlideShow();
        vuTruNhacViet2 = new List.VuTruNhacViet();
        quocTeNoiBat2 = new List.QuocTeNoiBat();
        tamTrangHomNay1 = new List.TamTrangHomNay();
        chuDeHot2 = new List.ChuDeHot();
        top1001 = new List.Top100();
        videoHot1 = new List.VideoHot();

        setBackground(new java.awt.Color(29, 38, 49));
        setOpaque(true);

        setLayer(slideShow1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(vuTruNhacViet2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(quocTeNoiBat2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(tamTrangHomNay1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(chuDeHot2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(top1001, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(videoHot1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(slideShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(videoHot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(top1001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chuDeHot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamTrangHomNay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quocTeNoiBat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vuTruNhacViet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(slideShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(vuTruNhacViet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(quocTeNoiBat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(tamTrangHomNay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(chuDeHot2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(top1001, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(videoHot1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(442, 442, 442))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private List.ChuDeHot chuDeHot2;
    private List.QuocTeNoiBat quocTeNoiBat2;
    private SlideShow.SlideShow slideShow1;
    private List.TamTrangHomNay tamTrangHomNay1;
    private List.Top100 top1001;
    private List.VideoHot videoHot1;
    private List.VuTruNhacViet vuTruNhacViet2;
    // End of variables declaration//GEN-END:variables
}
