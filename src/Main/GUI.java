package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUI extends JFrame {
    
    private Container cp;
        JLabel LbLanchesNerdSA = new JLabel("Lanches Nerd S.A.");
        JLabel LbQuant = new JLabel("Quantidade");
        JLabel LbLanche = new JLabel("Lanche");
        JLabel LbPreco = new JLabel("Preço Unitário");
        JLabel LbSubtotal = new JLabel("Subtotal");
        TextField TfLanche1 = new TextField("");
        JLabel LbSalada = new JLabel("X-Salada");
        JLabel LbPrecoSalada = new JLabel("12,00");
        TextField TfSubtotalSalada = new TextField("");
        TextField TfLanche2 = new TextField("");
        JLabel LbEgg = new JLabel("X-Egg");
        JLabel LbPrecoEgg = new JLabel("9,00");
        TextField TfSubtotalEgg = new TextField("");
        TextField TfLanche3 = new TextField("");
        JLabel LbFrango = new JLabel("X-Frango");
        JLabel LbPrecoFrango = new JLabel("11,00");
        TextField TfSubtotalFrango = new TextField("");
        TextField TfLanche4 = new TextField("");
        JLabel LbTudo = new JLabel("X-Tudo");
        JLabel LbPrecoTudo = new JLabel("17,00");
        TextField TfSubtotalTudo = new TextField("");
        TextField TfLanche5 = new TextField("");
        JLabel LbNerd = new JLabel("X-Nerd");
        JLabel LbPrecoNerd = new JLabel("15,22");
        TextField TfSubtotalNerd = new TextField("");
        JButton BtCalc = new JButton("Calcular");
        JLabel LbTotal = new JLabel("Total");
        TextField TfResTotal = new TextField();
        JLabel LbNada = new JLabel();
    
    public GUI() {
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        JPanel PainelCentro = new JPanel();
        PainelCentro.setLayout(new GridLayout(8,4));
        setTitle("Lanches Nerd S.A.");
        JPanel PainelNorte = new JPanel(new FlowLayout(FlowLayout.CENTER));
        PainelNorte.add(LbLanchesNerdSA);
        TfSubtotalSalada.setEditable(false);
        TfSubtotalEgg.setEditable(false);
        TfSubtotalFrango.setEditable(false);
        TfSubtotalTudo.setEditable(false);
        TfSubtotalNerd.setEditable(false);
        TfResTotal.setEditable(false);
        TfSubtotalSalada.setFocusable(false);
        TfSubtotalEgg.setFocusable(false);
        TfSubtotalFrango.setFocusable(false);
        TfSubtotalTudo.setFocusable(false);
        TfSubtotalNerd.setFocusable(false);
        TfResTotal.setFocusable(false);
        
        cp.add(PainelNorte, BorderLayout.NORTH);
        PainelCentro.add(LbQuant);
        PainelCentro.add(LbLanche);
        PainelCentro.add(LbPreco);
        PainelCentro.add(LbSubtotal);
        PainelCentro.add(TfLanche1);
        PainelCentro.add(LbSalada);
        PainelCentro.add(LbPrecoSalada);
        PainelCentro.add(TfSubtotalSalada);
        PainelCentro.add(TfLanche2);
        PainelCentro.add(LbEgg);
        PainelCentro.add(LbPrecoEgg);
        PainelCentro.add(TfSubtotalEgg);
        PainelCentro.add(TfLanche3);
        PainelCentro.add(LbFrango);
        PainelCentro.add(LbPrecoFrango);
        PainelCentro.add(TfSubtotalFrango);
        PainelCentro.add(TfLanche4);
        PainelCentro.add(LbTudo);
        PainelCentro.add(LbPrecoTudo);
        PainelCentro.add(TfSubtotalTudo);
        PainelCentro.add(TfLanche5);
        PainelCentro.add(LbNerd);
        PainelCentro.add(LbPrecoNerd);
        PainelCentro.add(TfSubtotalNerd);
        PainelCentro.add(LbNada);
        PainelCentro.add(LbNada);
        PainelCentro.add(LbNada);
        PainelCentro.add(LbNada);
        PainelCentro.add(BtCalc);
        PainelCentro.add(LbNada);
        PainelCentro.add(LbTotal);
        PainelCentro.add(TfResTotal);
        cp.add(PainelCentro, BorderLayout.CENTER);
        
        BtCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Total total = new Total();
                if("".equals(TfLanche1.getText())){
                    total.setQuantSalada(0);
                }if(!"".equals(TfLanche1.getText())){
                    total.setQuantSalada(Integer.valueOf(TfLanche1.getText()));
                }
                if("".equals(TfLanche2.getText())){
                    total.setQuantEgg(0);
                }if(!"".equals(TfLanche2.getText())){
                    total.setQuantEgg(Integer.valueOf(TfLanche2.getText()));
                }
                if("".equals(TfLanche3.getText())){
                    total.setQuantFrango(0);
                }if(!"".equals(TfLanche3.getText())){
                    total.setQuantFrango(Integer.valueOf(TfLanche3.getText()));
                }
                if("".equals(TfLanche4.getText())){
                    total.setQuantTudo(0);
                }if(!"".equals(TfLanche4.getText())){
                    total.setQuantTudo(Integer.valueOf(TfLanche4.getText()));
                }
                if("".equals(TfLanche5.getText())){
                    total.setQuantNerd(0);
                }if(!"".equals(TfLanche5.getText())){
                    total.setQuantNerd(Integer.valueOf(TfLanche5.getText()));
                }
                
                TfSubtotalSalada.setText(String.valueOf(total.getSubtotalSalada()));
                TfSubtotalEgg.setText(total.getSubtotalEgg());
                TfSubtotalFrango.setText(total.getSubtotalFrango());
                TfSubtotalTudo.setText(total.getSubtotalTudo());
                TfSubtotalNerd.setText(total.getSubtotalNerd());
                TfResTotal.setText(total.getResultado());
            }
        });
        
        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
    }
}
