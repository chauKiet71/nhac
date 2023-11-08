package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class RoundedImage extends JComponent {

    private Icon image;

    public RoundedImage() {
    }

    public RoundedImage(Icon image) {
        this.image = image;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    @Override
    public void paint(Graphics g) {
        if (image != null) {
            int width = image.getIconWidth();
            int height = image.getIconHeight();
            int cornerRadius = 20;
            BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Rectangle size = getAutoSize(image);
            Graphics2D g2d = outputImage.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);   
            g2d.setClip(new RoundRectangle2D.Float(0, 0, width, height, cornerRadius, cornerRadius));
            g2d.drawImage(toImage(image), 0, 0, width, height, null); // Vẽ ảnh lên outputImage
            g2d.dispose();
            
            // Thêm border màu xám
            int borderSize = 2; // Kích thước của border
            BufferedImage imageWithBorder = new BufferedImage(width + 2 * borderSize, height + 2 * borderSize, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2dWithBorder = imageWithBorder.createGraphics();
            g2dWithBorder.setColor(Color.GRAY); // Màu xám
            g2dWithBorder.fillRect(0, 0, width + 2 * borderSize, height + 2 * borderSize);
            g2dWithBorder.drawImage(outputImage, borderSize, borderSize, width, height, null);
            g2dWithBorder.dispose();

//            g.drawImage(imageWithBorder, 0, 0, null);



            g.drawImage(outputImage, size.getLocation().x, size.getLocation().y, size.getSize().width, size.getSize().height, null);
//            super.paint(g);
        }
    }

    private Rectangle getAutoSize(Icon image) {
        int w = getWidth();
        int h = getHeight();
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale); // Sử dụng min để đảm bảo ảnh không bị cắt xén
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        int x = (w - width) / 2;
        int y = (h - height) / 2;
        return new Rectangle(x, y, width, height);
    }

    private Image toImage(Icon icon) {
        return ((ImageIcon) icon).getImage();
    }
}



