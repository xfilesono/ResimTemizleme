import java.io.File;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XFilesOno
 */
public class DosyaSil extends DosyaIslemleri{
    private String klasor;
    public DosyaSil () {
        this.klasor = super.klasor;
    }
    
    public void dosyalariSil(String silinecekDosyaAdi, String tamYolu) {
        // Dosyayı silen bir fonksiyon yazıp ana classtan buraya taşı
        
        File silinecekDosya = new File(tamYolu);
        boolean sonuc = silinecekDosya.delete();
        if(sonuc) {
            JOptionPane.showMessageDialog(null, silinecekDosyaAdi + " isimli Dosya Silindi ...");
        }
        else
            JOptionPane.showMessageDialog(null, silinecekDosyaAdi + " isimli Dosya Silinemedi !!!\n" 
                    + "Klasör Yolu: " + klasor);
        
    }
    
}
