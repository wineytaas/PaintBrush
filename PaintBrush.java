import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
 
/**
 * @author Ernesto
 * @author Raiana
 * @author Wisney Tadeu
 */
/**
 * codigo menus retirado de : https://desenvolvimentoaberto.org/2014/03/25/visual-jmenubar-jmenu-jseparator-jmenuitem-java/
 */


public class PaintBrush 
{
    // Declara componentes
    JLabel texto;
 
    // Cria o menu completo
    public JMenuBar criaMenu()
    {
        // Declara componentes do menu genericamente
        JMenuBar barraMenu;
        JMenu menu;
        JMenu submenu;
        JMenuItem menuItem;
 
        // Cria barra do Menu
        barraMenu = new JMenuBar();
 
        // Cria menu
        menu = new JMenu("Ações");
        
        // Adiciona menu a barra
        barraMenu.add(menu);
        
        //=======================================================================================
        // Cria item do menu
        // - Rasterização de Pontos.
        menuItem = new JMenuItem("Rasterização de Pontos", KeyEvent.VK_I);
        
        // Cria evento do item
        menuItem.addActionListener(new ActionListener()
        {
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: Ações --> Rasterização de Pontos");
                
            }
        });
        
        // Adiciona item ao Menu
        menu.add(menuItem);
        
        
        //=======================================================================================
        // - Rasterização de Retas: algoritmos DDA e Bresenham.
        // Cria um submenu (novo menu)
        submenu = new JMenu("Rasterização de Retas");
 
        // Cria um item e seu evento
        menuItem = new JMenuItem("Algoritmo DDA", KeyEvent.VK_U);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: Ações -> Rasterização de Retas -> Algoritmo DDA");
 
            }
        });
        //=======================================================================================
        // Adiciona item ao submenu
        submenu.add(menuItem);

        menuItem = new JMenuItem("Algoritmo Bresenham", KeyEvent.VK_U);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: Ações -> Rasterização de Retas -> Algoritmo Bresenham");
 
            }
        });
 
        // Adiciona item ao submenu
        submenu.add(menuItem);
 
        // Adiciona submenu ao menu
        menu.add(submenu);

        //=======================================================================================
        // Cria item do menu
        // - Rasterização de Polígonos: retângulo.
        // Cria um submenu (novo menu)
        submenu = new JMenu("Rasterização de Polígonos");

        menuItem = new JMenuItem("Retângulo", KeyEvent.VK_U);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: Ações -> Rasterização de Polígonos -> Retângulo");
 
            }
        });
 
        // Adiciona item ao submenu
        submenu.add(menuItem);
 
        // Adiciona submenu ao menu
        menu.add(submenu);

        //=======================================================================================
        // Cria item do menu
        // - Rasterização de Circunferência: algoritmo de Bresenham.
        // Cria um submenu (novo menu)
        submenu = new JMenu("Rasterização de Circunferência");

        menuItem = new JMenuItem("Algoritmo de Bresenham", KeyEvent.VK_U);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: Ações -> Rasterização de Circunferência -> Algoritmo de Bresenham");
 
            }
        });
 
        // Adiciona item ao submenu
        submenu.add(menuItem);
 
        // Adiciona submenu ao menu
        menu.add(submenu);

        //=======================================================================================
        // - Transformações Geométricas 2D: translação, rotação, escala e reflexões (X, Y e XY).
        // Cria um submenu (novo menu)
        submenu = new JMenu("Transformações Geométricas 2D");

        menuItem = new JMenuItem("Translação", KeyEvent.VK_U);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: Ações -> Transformações Geométricas 2D -> Translação");
 
            }
        });
 
        // Adiciona item ao submenu
        submenu.add(menuItem);

        //===============================================================================================
        menuItem = new JMenuItem("Rotação", KeyEvent.VK_U);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: Ações -> Transformações Geométricas 2D -> Rotação");
 
            }
        });
 
        // Adiciona item ao submenu
        submenu.add(menuItem);

        //===============================================================================================
        menuItem = new JMenuItem("Escala", KeyEvent.VK_U);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: Ações -> Transformações Geométricas 2D -> Escala");
 
            }
        });
 
        // Adiciona item ao submenu
        submenu.add(menuItem);

        //===============================================================================================
        menuItem = new JMenuItem("Reflexão X", KeyEvent.VK_U);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: Ações -> Transformações Geométricas 2D -> Reflexão X");
 
            }
        });
 
        // Adiciona item ao submenu
        submenu.add(menuItem);

        //===============================================================================================
        menuItem = new JMenuItem("Reflexão Y", KeyEvent.VK_U);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: Ações -> Transformações Geométricas 2D -> Reflexão Y");
 
            }
        });
 
        // Adiciona item ao submenu
        submenu.add(menuItem);

        //===============================================================================================
        menuItem = new JMenuItem("Reflexão XY", KeyEvent.VK_U);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: Ações -> Transformações Geométricas 2D -> Reflexão XY");
 
            }
        });
 
        // Adiciona item ao submenu
        submenu.add(menuItem);
 
        // Adiciona submenu ao menu
        menu.add(submenu);

        //=======================================================================================
        // - Recorte de Regiões: Algoritmos de Cohen-Sutherland e Liang Barsky.
        // Cria um submenu (novo menu)
        submenu = new JMenu("Recorte de Regiões");

        menuItem = new JMenuItem("Algoritmo de Cohen-Sutherland", KeyEvent.VK_U);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: Ações -> Rasterização de Circunferência -> Algoritmo de Cohen-Sutherland");
 
            }
        });
 
        // Adiciona item ao submenu
        submenu.add(menuItem);

        //================================================================================================
        menuItem = new JMenuItem("Algoritmo de Liang Barsky", KeyEvent.VK_U);
        menuItem.addActionListener(new ActionListener()
        {
 
            @Override
            public void actionPerformed(ActionEvent e)
            {
                texto.setText("Você cliquou no item: Ações -> Rasterização de Circunferência -> Algoritmo de Liang Barsky");
 
            }
        });
 
        // Adiciona item ao submenu
        submenu.add(menuItem);
 
        // Adiciona submenu ao menu
        menu.add(submenu);
        
 
        // Adiciona menu a barra de menus
        barraMenu.add(menu);
 
        // retorna menu completo
        return barraMenu;
 
    }
 
    // Cria um painel
    public Container criaPainel()
    {
        // Cria painel e suas propriedades
        JPanel painel = new JPanel(new BorderLayout());
        painel.setOpaque(true);
 
        // Cria um componente de texto
        texto = new JLabel("Você cliquou no item:");
 
        // Adiciona componente ao painel
        painel.add(texto, BorderLayout.PAGE_END);
 
        /// Retorna Painel
        return painel;
    }
 
    // Cria GUI
    public static void criaGUI()
    {
        // Cria formulario e suas propriedades
        JFrame formulario = new JFrame("Paint Brush");
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Cria Menu
        PaintBrush  menu = new PaintBrush();
 
        // Adiciona barra de menus na GUI
        formulario.setJMenuBar(menu.criaMenu());
 
        // Adiciona painel na GUI
        formulario.setContentPane(menu.criaPainel());
 
        // Adiciona propriedades ao formulario
        formulario.setSize(600, 600);
        formulario.setVisible(true);        
 
    }
 
    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run()
            {
 
                // Monta GUI
                criaGUI();
            }
        });
 
    }
 
}