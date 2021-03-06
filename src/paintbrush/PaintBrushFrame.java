package paintbrush;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.*;


/**
 * @author Ernesto
 * @author Wisney
 */
public class PaintBrushFrame extends javax.swing.JFrame{

    /**
     * Declare variables
     */
    private static final long serialVersionUID = 1L;
    public static int opcaoAlgoritmo = 1;
    public List<Reta> retaList = new ArrayList<Reta>();
    public Reta reta;
    public List<Retangulo> retanguloList = new ArrayList<Retangulo>();
    public Retangulo retangulo;
    public List<Circunferencia> circunferenciaList = new ArrayList<Circunferencia>();
    public Circunferencia circunferencia;


    public PaintBrushFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        retangulo = new Retangulo();
        reta = new Reta(null, null);
        circunferencia = new Circunferencia();

        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAcoes = new javax.swing.JMenu();
        jMenuItemPontos = new javax.swing.JMenuItem();
        jMenuRetas = new javax.swing.JMenu();
        jMenuItemRetaDDA = new javax.swing.JMenuItem();
        jMenuItemRetaBresenham = new javax.swing.JMenuItem();
        jMenuPoligonos = new javax.swing.JMenu();
        jMenuItemPoligonosRetangulo = new javax.swing.JMenuItem();
        jMenuCircunferencia = new javax.swing.JMenu();
        jMenuItemCircunferenciaBresenham = new javax.swing.JMenuItem();
        jMenuTransformacoes = new javax.swing.JMenu();
        jMenuItemTransformacoesTraslacao = new javax.swing.JMenuItem();
        jMenuItemTransformacoesRotacao = new javax.swing.JMenuItem();
        jMenuItemTransformacoesEscala = new javax.swing.JMenuItem();
        jMenuItemTransformacoesReflexaoX = new javax.swing.JMenuItem();
        jMenuItemTransformacoesReflexaoY = new javax.swing.JMenuItem();
        jMenuItemTransformacoesReflexaoXY = new javax.swing.JMenuItem();
        jMenuJanela = new javax.swing.JMenu();
        jMenuItemJanelaCohenSutherland = new javax.swing.JMenuItem();
        jMenuItemJanelaLiangBarsky = new javax.swing.JMenuItem();

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        final javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1.setBackground(Color.WHITE);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 400, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 268, Short.MAX_VALUE));

        jMenuAcoes.setText("Ações");

        jMenuItemPontos.setText("Rasterização de Pontos");
        jMenuItemPontos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(final java.awt.event.MouseEvent evt) {
                jMenuItemPontosMousePressed(evt);
            }
        });
        jMenuAcoes.add(jMenuItemPontos);

        jMenuBar1.add(jMenuAcoes);

        jMenuRetas.setText("Retas");

        jMenuItemRetaDDA.setText("Algoritmo DDA");
        jMenuItemRetaDDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(final java.awt.event.MouseEvent evt) {
                jMenuItemRetaDDAMousePressed(evt);
            }
        });
        jMenuRetas.add(jMenuItemRetaDDA);

        jMenuItemRetaBresenham.setText("Algoritmo Bresenham");
        jMenuItemRetaBresenham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(final java.awt.event.MouseEvent evt) {
                retaBresenhamMenuItemMousePressed(evt);
            }
        });
        jMenuRetas.add(jMenuItemRetaBresenham);

        jMenuBar1.add(jMenuRetas);

        jMenuPoligonos.setText("Polígonos");
        jMenuPoligonos.setToolTipText("");

        jMenuItemPoligonosRetangulo.setText("Retângulo");
        jMenuItemPoligonosRetangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(final java.awt.event.MouseEvent evt) {
                retanguloMenuItemMousePressed(evt);
            }
        });

        jMenuPoligonos.add(jMenuItemPoligonosRetangulo);

        jMenuBar1.add(jMenuPoligonos);

        jMenuCircunferencia.setText("Circunferência");

        jMenuItemCircunferenciaBresenham.setText("Algoritmo de Bresenham");
        jMenuItemCircunferenciaBresenham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(final java.awt.event.MouseEvent evt) {
                jMenuItemCircunferenciaBresenhamMousePressed(evt);
            }
        });
        jMenuCircunferencia.add(jMenuItemCircunferenciaBresenham);

        jMenuBar1.add(jMenuCircunferencia);

        jMenuTransformacoes.setText("Transformações");

        jMenuItemTransformacoesTraslacao.setText("Translação");
        jMenuItemTransformacoesTraslacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(final java.awt.event.MouseEvent evt) {
                jMenuItemTransformacoesTraslacaoMousePressed(evt);
            }
        });
        jMenuTransformacoes.add(jMenuItemTransformacoesTraslacao);

        jMenuItemTransformacoesRotacao.setText("Rotação");
        jMenuItemTransformacoesRotacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(final java.awt.event.MouseEvent evt) {
                jMenuItemTransformacoesRotacaoMousePressed(evt);
            }
        });
        jMenuTransformacoes.add(jMenuItemTransformacoesRotacao);

        jMenuItemTransformacoesEscala.setText("Escala");
        jMenuItemTransformacoesEscala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(final java.awt.event.MouseEvent evt) {
                jMenuItemTransformacoesEscalaMousePressed(evt);
            }
        });
        jMenuTransformacoes.add(jMenuItemTransformacoesEscala);

        jMenuItemTransformacoesReflexaoX.setText("Reflexão X");
        jMenuItemTransformacoesReflexaoX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(final java.awt.event.MouseEvent evt) {
                jMenuItemTransformacoesReflexaoXMousePressed(evt);
            }
        });
        jMenuTransformacoes.add(jMenuItemTransformacoesReflexaoX);

        jMenuItemTransformacoesReflexaoY.setText("Reflexão Y");
        jMenuItemTransformacoesReflexaoY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(final java.awt.event.MouseEvent evt) {
                jMenuItemTransformacoesReflexaoYMousePressed(evt);
            }
        });
        jMenuTransformacoes.add(jMenuItemTransformacoesReflexaoY);

        jMenuItemTransformacoesReflexaoXY.setText("Reflexão XY");
        jMenuItemTransformacoesReflexaoXY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(final java.awt.event.MouseEvent evt) {
                jMenuItemTransformacoesReflexaoXYMousePressed(evt);
            }
        });
        jMenuTransformacoes.add(jMenuItemTransformacoesReflexaoXY);

        jMenuBar1.add(jMenuTransformacoes);

        jMenuJanela.setText("Janela");

        jMenuItemJanelaCohenSutherland.setText("Cohen-Sutherland");
        jMenuItemJanelaCohenSutherland.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(final java.awt.event.MouseEvent evt) {
                jMenuItemJanelaCohenSutherlandMousePressed(evt);
            }
        });
        jMenuJanela.add(jMenuItemJanelaCohenSutherland);

        
        jMenuItemJanelaLiangBarsky.setText("Liang-Barsky");
        jMenuItemJanelaLiangBarsky.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(final java.awt.event.MouseEvent evt) {
                jMenuItemJanelaLiangBarskyMousePressed(evt);
            }
        });
        jMenuJanela.add(jMenuItemJanelaLiangBarsky);

        jMenuBar1.add(jMenuJanela);

        setJMenuBar(jMenuBar1);

        final javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)));

        pack();
    }

    private void jMenuItemPontosMousePressed(final java.awt.event.MouseEvent evt) {
        opcaoAlgoritmo = 1;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
    }

    private void jMenuItemRetaDDAMousePressed(final java.awt.event.MouseEvent evt) {
        opcaoAlgoritmo = 2;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
    }

    private void retaBresenhamMenuItemMousePressed(final java.awt.event.MouseEvent evt) {
        opcaoAlgoritmo = 3;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
    }

    private void retanguloMenuItemMousePressed(final java.awt.event.MouseEvent evt) {
        opcaoAlgoritmo = 4;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
    }

    private void jMenuItemCircunferenciaBresenhamMousePressed(final java.awt.event.MouseEvent evt) {
        opcaoAlgoritmo = 5;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
    }

    private void jMenuItemTransformacoesTraslacaoMousePressed(final java.awt.event.MouseEvent evt) {
        opcaoAlgoritmo = 6;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
        try{
            JPanel p = new JPanel(new BorderLayout(5, 5));
            JPanel labels = new JPanel(new GridLayout(0, 1, 2, 2));
            labels.add(new JLabel("Fator a:", SwingConstants.RIGHT));
            labels.add(new JLabel("Fator b:", SwingConstants.RIGHT));
            p.add(labels, BorderLayout.WEST);
            

            JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
            JTextField a = new JTextField();
            JTextField b = new JTextField();
            controls.add(a);
            controls.add(b);
            p.add(controls, BorderLayout.CENTER);

            JOptionPane.showMessageDialog(jPanel1, p, "Translação", JOptionPane.QUESTION_MESSAGE);
            int valorA = Integer.parseInt(a.getText());
            int valorB = Integer.parseInt(b.getText());

            for (Reta r : retaList) {
                r.transladar(valorA,valorB);
            }
            
            for (Retangulo r : retanguloList) {
                r.transladar(valorA,valorB);
            }
            
            for (Circunferencia c : circunferenciaList) {
                c.transladar(valorA,valorB);
            }
        }
        catch(Exception e)
        {

        }
    }

    private void jMenuItemTransformacoesRotacaoMousePressed(final java.awt.event.MouseEvent evt) {
        opcaoAlgoritmo = 7;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
        try{
            int grau = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o grau: "));
            
            for (Reta r : retaList) {
                r.rotacionar(grau);
            }

            // for (Retangulo ret : retanguloList) {
            //     ret.rotacionar(grau);
            // }
        }
        catch(Exception e)
        {
            
        }
    }

    private void jMenuItemTransformacoesEscalaMousePressed(final java.awt.event.MouseEvent evt) {
        opcaoAlgoritmo = 8;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
        try{
            JPanel p = new JPanel(new BorderLayout(5, 5));
            JPanel labels = new JPanel(new GridLayout(0, 1, 2, 2));
            labels.add(new JLabel("Fator a:", SwingConstants.RIGHT));
            labels.add(new JLabel("Fator b:", SwingConstants.RIGHT));
            p.add(labels, BorderLayout.WEST);
            

            JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
            JTextField a = new JTextField();
            JTextField b = new JTextField();
            controls.add(a);
            controls.add(b);
            p.add(controls, BorderLayout.CENTER);

            JOptionPane.showMessageDialog(jPanel1, p, "Escala", JOptionPane.QUESTION_MESSAGE);
            double valorA = Double.parseDouble(a.getText());
            double valorB = Double.parseDouble(b.getText());
            
            for (Reta r : retaList) {
                r.escalar(valorA, valorB);
            }
            
            for (Retangulo r : retanguloList) {
                r.escalar(valorA, valorB);
            }
            
            for (Circunferencia c : circunferenciaList) {
                c.escalar(valorA, valorB);
            }
        }
        catch(Exception e)
        {
            
        }
    }

    private void jMenuItemTransformacoesReflexaoXMousePressed(final java.awt.event.MouseEvent evt) {
        opcaoAlgoritmo = 9;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
        
        for (Reta r : retaList) {
            r.reflexaoX();
        }

    }

    private void jMenuItemTransformacoesReflexaoYMousePressed(final java.awt.event.MouseEvent evt) {
        opcaoAlgoritmo = 9;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
        
        for (Reta r : retaList) {
            r.reflexaoY();
        }

    }

    private void jMenuItemTransformacoesReflexaoXYMousePressed(final java.awt.event.MouseEvent evt) {
        opcaoAlgoritmo = 9;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
        
        for (Reta r : retaList) {
            r.reflexaoXY();
        }

    }

    private void jMenuItemJanelaCohenSutherlandMousePressed(final java.awt.event.MouseEvent evt) {
        opcaoAlgoritmo = 12;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
    }

    private void jMenuItemJanelaLiangBarskyMousePressed(final java.awt.event.MouseEvent evt) {
        opcaoAlgoritmo = 12;
        System.out.println("Opção MousePressed: " + opcaoAlgoritmo);
    }

    

    
    

    public static void main(final String args[]) {
        try {
            for (final javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (final ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaintBrushFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (final InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaintBrushFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (final IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaintBrushFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (final javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaintBrushFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                final PaintBrushFrame paintBrushFrame = new PaintBrushFrame();
                paintBrushFrame.setVisible(true);
                paintBrushFrame.jPanel1.addMouseListener(new MouseAdapter() {

                    @Override
                    public void mousePressed(final MouseEvent e) {
                        paintBrushFrame.opcoes(new Point(e.getX(), e.getY(), e.getComponent().getGraphics(), e.getComponent().getHeight(), e.getComponent().getWidth()));
                    }
                });
            }
        });
    }

    private javax.swing.JMenuItem jMenuItemPontos;
    private javax.swing.JMenu jMenuAcoes;
    private javax.swing.JMenu jMenuRetas;
    private javax.swing.JMenu jMenuPoligonos;
    private javax.swing.JMenu jMenuCircunferencia;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenuTransformacoes;
    private javax.swing.JMenu jMenuJanela;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemTransformacoesReflexaoY;
    private javax.swing.JMenuItem jMenuItemTransformacoesReflexaoXY;
    private javax.swing.JMenuItem jMenuItemRetaBresenham;
    private javax.swing.JMenuItem jMenuItemPoligonosRetangulo;
    private javax.swing.JMenuItem jMenuItemCircunferenciaBresenham;
    private javax.swing.JMenuItem jMenuItemTransformacoesTraslacao;
    private javax.swing.JMenuItem jMenuItemTransformacoesRotacao;
    private javax.swing.JMenuItem jMenuItemTransformacoesEscala;
    private javax.swing.JMenuItem jMenuItemTransformacoesReflexaoX;
    private javax.swing.JMenuItem jMenuItemJanelaCohenSutherland;
    private javax.swing.JMenuItem jMenuItemJanelaLiangBarsky;
    
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jMenuItemRetaDDA;

    public static void drawPoint(final Graphics2D g2d, final int x, final int y, Color c) {
        g2d.setStroke(new BasicStroke(0.1f));
        g2d.setColor(c);

        g2d.draw(new Line2D.Double(x, y, x, y));
    }

    public void opcoes(final Point p) {
        System.out.println("Opção de desenho: " + opcaoAlgoritmo);
        if (opcaoAlgoritmo == 0) {
            System.out.println(" NADA ");
        } else if (opcaoAlgoritmo == 1) {
            System.out.println(" Pontos ");
            p.draw(10);
        } else if (opcaoAlgoritmo == 2) {
            System.out.println(" Reta DDA ");
            if (reta.dda(p)) {
                retaList.add(reta);
                reta = new Reta();
                System.out.println(" Reta count: " + retaList.size());
            }
        } else if (opcaoAlgoritmo == 3) {
            System.out.println(" Reta Bresenham ");

            if (reta.bresenham(p)) {
                retaList.add(reta);
                reta = new Reta();
                System.out.println(" Reta count: " + retaList.size());
            }
        } else if (opcaoAlgoritmo == 4) {
            System.out.println(" Poligonos - retângulo ");
            if (retangulo.inserir(p)) {
                retanguloList.add(retangulo);
                System.out.println(" Retangulos count: " + retanguloList.size());
                retangulo = new Retangulo();
            }
        } else if (opcaoAlgoritmo == 5) {
            System.out.println(" Circunferencia - Bresenham ");
            if (circunferencia.bresenhams(p)) {
                circunferenciaList.add(circunferencia);
                System.out.println(" Circunferencias count: " + circunferenciaList.size());
                circunferencia = new Circunferencia();
            }
        } else if (opcaoAlgoritmo == 6) {
            System.out.println(" - Transformações Geométricas 2D: translação");
        } else if (opcaoAlgoritmo == 7) {
            System.out.println(" - Transformações Geométricas 2D: rotação");
        } else if (opcaoAlgoritmo == 8) {
            System.out.println(" - Transformações Geométricas 2D: escala");
        } else if (opcaoAlgoritmo == 9) {
            System.out.println(" - Transformações Geométricas 2D: reflexões X");
        } else if (opcaoAlgoritmo == 10) {
            System.out.println(" - Transformações Geométricas 2D: reflexões Y");
        } else if (opcaoAlgoritmo == 11) {
            System.out.println(" - Transformações Geométricas 2D: reflexões XY");
        } else if (opcaoAlgoritmo == 12) {
            if (reta.inserirPonto(p)) {
                Point p1 = reta.getP1().clone();
                Point p2 = reta.getP1().clone();
                p2.y = reta.getP2().y;
                Point p3 = reta.getP2().clone();
                Point p4 = reta.getP2().clone();
                p4.y = reta.getP1().y;

                Reta r1 = new Reta(p1, p2);
                Reta r2 = new Reta(p2, p3);
                Reta r3 = new Reta(p3, p4);
                Reta r4 = new Reta(p4, p1);

                r1.bresenham();
                r2.bresenham();
                r3.bresenham();
                r4.bresenham();

                retaList.add(r1);
                retaList.add(r2);
                retaList.add(r3);
                retaList.add(r4);

                for(int i = 0; i < retaList.size(); i ++){
                    Reta r = retaList.get(i);

                    r.cohenSutherland(r.getP1(),r.getP2(), reta.getP1(), reta.getP2());
                }

                reta = new Reta();
            }
            System.out.println("Recorte de Regiões: Algoritmo de Cohen-Sutherland");
        } else if (opcaoAlgoritmo == 13) {
            System.out.println("Recorte de Regiões: Algoritmo de Liang Barsky");
            if (reta.inserirPonto(p)) {
                Point p1 = reta.getP1().clone();
                Point p2 = reta.getP1().clone();
                p2.y = reta.getP2().y;
                Point p3 = reta.getP2().clone();
                Point p4 = reta.getP2().clone();
                p4.y = reta.getP1().y;

                Reta r1 = new Reta(p1, p2);
                Reta r2 = new Reta(p2, p3);
                Reta r3 = new Reta(p3, p4);
                Reta r4 = new Reta(p4, p1);

                r1.bresenham();
                r2.bresenham();
                r3.bresenham();
                r4.bresenham();

                retaList.add(r1);
                retaList.add(r2);
                retaList.add(r3);
                retaList.add(r4);

                for(int i = 0; i < retaList.size(); i ++){
                    Reta r = retaList.get(i);

                    r.liang(r.getP1(),r.getP2(), reta.getP1(), reta.getP2());
                }

                reta = new Reta();
            }
        }
    }

    public void clear(Graphics2D g2d, Color c) {
        
        for(int x = 0; x < jPanel1.getWidth(); x++)
        {
            for(int y = 0; y < jPanel1.getHeight(); y++)
            {
                drawPoint(g2d, x, y, c);
            }   
        }
    }
}