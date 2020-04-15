package arrayobjetos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Filmes extends JFrame implements ActionListener{
    int a=0;
   JPanel pa1, pa2, pa3, pa4, pa5, pa6, pa7, pa8, pa9, pa10, pa11;
   JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11;
   JLabel la0, la1, la2, la3, la4, la5, la6, la7, la8, la9, la10, la11;
   JButton bo1, bo2, bo3, bo4, bo5, bo6, bo7, bo8, bo9, bo10, bo11;
    public Filmes(){
        
        Pelicula pelicula1 = new Pelicula("The Texas Chainsaw Masacre","Marcus Nispel ", 2003, " Una historia de cinco veinteañeros cuyo viaje por carretera de espíritu libre se convierte en un aterrador descenso a la locura. Cuando se encuentran aislados en una comunidad rural de Texas, caen en las garras de un monstruoso clan de caníbales de Texas y se ven reducidos por la cara de cuero que empuña una motosierra." );
        Pelicula pelicula2 = new Pelicula("El Perfume: Historia de un asesino", "Tom Tykwer",  2006, "Francia, siglo XVIII. Adaptación del famoso best-seller de Patrick Süskind. Jean Baptiste Grenouille nació en medio del hedor de los restos de pescado de un mercado y fue abandonado por su madre en la basura. Las autoridades se hicieron cargo de él y lo mandaron a un hospicio. Creció en un ambiente hostil; nadie le quería, porque había en él algo excepcional: carecía por completo de olor. Estaba, sin embargo, dotado de un extraordinario sentido del olfato. A los veinte años, después de trabajar en una curtiduría, consiguió trabajo en casa del perfumista Bandini, que le enseñó a destilar esencias. Pero él vivía obsesionado con la idea de atrapar otros olores: el olor del cristal, del cobre, pero, sobre todo, el olor de algunas mujeres." );
        Pelicula pelicula3 = new Pelicula("Toy Story", "Josh Cooley, Lee Unkrich, John Lasseter",  1995,"Los juguetes de Andy, un niño de 6 años, temen que haya llegado su hora y que un uevo regalo de cumpleaños les sustituya en el corazón de su dueño. Woody, un vaquero que ha sido hasta ahora el juguete favorito de Andy, trata de tranquilizarlos hasta que aparece Buzz Lightyear, un héroe espacial dotado de todo tipo de avances tecnológicos. Woody es relegado a un segundo plano. Su constante rivalidad se transformará en una gran amistad cuando ambos se pierden en la ciudad sin saber como volver a casa." );
        Pelicula pelicula4 = new Pelicula("Resident Evil: El huesped maldito", "Paul W. S. Anderson",  2002, "En un centro clandestino de investigación genética -con fines militares- de una poderosa multinacional se produce un brote vírico que contamina todo el edificio. Para contener la fuga el ordenador que controla el centro sella toda la instalación y, en un principio se cree que mueren todos los empleados, pero en realidad se han convertido en feroces zombis..." );
        Pelicula pelicula5 = new Pelicula("Titanic", "James Cameron",  1997, "Jack (DiCaprio), un joven artista, gana en una partida de cartas un pasaje para viajar a América en el Titanic, el transatlántico más grande y seguro jamás construido. A bordo conoce a Rose (Kate Winslet), una joven de una buena familia venida a menos que va a contraer un matrimonio de conveniencia con Cal (Billy Zane), un millonario engreído a quien sólo interesa el prestigioso apellido de su prometida. Jack y Rose se enamoran, pero el prometido y la madre de ella ponen todo tipo de trabas a su relación. Mientras, el gigantesco y lujoso transatlántico se aproxima hacia un inmenso iceberg.");
        Pelicula pelicula6 = new Pelicula("Shreck", "Andrew Adamson, Vicky Jenson",  2001,"Hace mucho tiempo, en una lejanísima ciénaga, vivía un feroz ogro llamado Shrek. De repente, un día, su soledad se ve interrumpida por una invasión de sorprendentes personajes. Hay ratoncitos ciegos en su comida, un enorme y malísimo lobo en su cama, tres cerditos sin hogar y otros seres que han sido deportados de su tierra por el malvado Lord Farquaad. Para salvar su territorio, Shrek hace un pacto con Farquaad y emprende viaje para conseguir que la bella princesa Fiona acceda a ser la novia del Lord. En tan importante misión le acompaña un divertido burro, dispuesto a hacer cualquier cosa por Shrek: todo, menos guardar silencio." );
        Pelicula pelicula7 = new Pelicula("Harry Potter Y la piedra filosofal", "Chris Columbus",  2001,"El día en que cumple once años, Harry Potter se entera de que es hijo de dos destacados hechiceros, de los que ha heredado poderes mágicos. En la escuela Hogwarts de Magia y Hechicería, donde se educa con otros niños que también tienen poderes especiales, aprenderá todo lo necesario para ser mago." );
        Pelicula pelicula8 = new Pelicula("Star Wars: El ascenso de Skywalker", "J.J. Abrams",  2019,"Un año después de los eventos de \"Los últimos Jedi\", los restos de la Resistencia se enfrentarán una vez más a la Primera Orden, involucrando conflictos del pasado y del presente. Mientras tanto, el antiguo conflicto entre los Jedi y los Sith llegará a su clímax, lo que llevará a la saga de los Skywalker a un final definitivo. Final de la trilogía iniciada con \"El despertar de la Fuerza\". " );
        Pelicula pelicula9 = new Pelicula("Coco", "Lee Unkrich, Adrián Molina",  2017, "Miguel es un joven con el sueño de convertirse en leyenda de la música a pesar de la prohibición de su familia. Su pasión le llevará a adentrarse en la \"Tierra de los Muertos\" para conocer su verdadero legado familiar." );
        Pelicula pelicula10 = new Pelicula("Avengers: End Game", "Anthony Russo, Joe Russo",  2019,"Después de los eventos devastadores de 'Avengers: Infinity War', el universo está en ruinas debido a las acciones de Thanos, el Titán Loco. Con la ayuda de los aliados que quedaron, los Vengadores deberán reunirse una vez más para intentar deshacer sus acciones y restaurar el orden en el universo de una vez por todas, sin importar cuáles son las consecuencias... Cuarta y última entrega de la saga \"Vengadores\"." );

        ArrayList lista = new ArrayList();

        lista.add(pelicula1);
        lista.add(pelicula2);
        lista.add(pelicula3);
        lista.add(pelicula4);
        lista.add(pelicula5);
        lista.add(pelicula6);
        lista.add(pelicula7);
        lista.add(pelicula8);
        lista.add(pelicula9);
        lista.add(pelicula10);
        
        setBounds(300, 300, 800, 500);
        setLayout(new FlowLayout());
        
        JLabel la0 = new JLabel("Películas Disponibles: \n\n\n");
        
        pa1=new JPanel(); 
        la1= new JLabel(lista.get(0).toString());
        txt1=new JTextField(5);
        bo1=new JButton("Vender Entradas");
        bo1.addActionListener(this); //agregar acción al botón
        bo1.setActionCommand("1");
        pa1.add(la1, txt1); pa1.add(bo1); 
        add(pa1);
        pa2=new JPanel();
        la2=new JLabel(lista.get(1).toString());
        txt2=new JTextField(5);
        bo2=new JButton("Vender Entradas");
        bo2.addActionListener(this); //agregar acción al botón
        bo2.setActionCommand("2");
        pa2.add(la2, txt2);pa2.add(bo2);
        add(pa2);
        pa3=new JPanel();
        la3=new JLabel(lista.get(2).toString());
        txt3=new JTextField(5);
        bo3=new JButton("Vender Entradas");
        bo3.addActionListener(this); //agregar acción al botón
        bo3.setActionCommand("3");
        pa3.add(la3, txt3); pa3.add(bo3);
        add(pa3);
        pa4=new JPanel();
        la4=new JLabel(lista.get(3).toString());
        txt4=new JTextField(5);
        bo4=new JButton("Vender Entradas");
        bo4.addActionListener(this); //agregar acción al botón
        bo4.setActionCommand("4");
        pa4.add(la4, txt4); pa4.add(bo4);
        add(pa4);
        pa5=new JPanel();
        la5=new JLabel(lista.get(4).toString());
        txt5=new JTextField(5);
        bo5=new JButton("Vender Entradas");
        bo5.addActionListener(this); //agregar acción al botón
        bo5.setActionCommand("5");
        pa5.add(la5, txt5); pa5.add(bo5);
        add(pa5);
        pa6=new JPanel();
        la6=new JLabel(lista.get(5).toString());
        txt6=new JTextField(5);
        bo6=new JButton("Vender Entradas");
        bo6.addActionListener(this); //agregar acción al botón
        bo6.setActionCommand("6");
        pa6.add(la6, txt6); pa6.add(bo6);
        add(pa6);
        pa7=new JPanel();
        la7=new JLabel(lista.get(6).toString());
        txt7=new JTextField(5);
        bo7=new JButton("Vender Entradas");
        bo7.addActionListener(this); //agregar acción al botón
        bo7.setActionCommand("7");
        pa7.add(la7, txt7);pa7.add(bo7);
        add(pa7);
        pa8=new JPanel();
        la8=new JLabel(lista.get(7).toString());
        txt8=new JTextField(5);
        bo8=new JButton("Vender Entradas");
        bo8.addActionListener(this); 
        bo8.setActionCommand("8");
        pa8.add(la8, txt8); pa8.add(bo8);
        add(pa8);
        pa9=new JPanel();
        la9=new JLabel(lista.get(8).toString());
        txt9=new JTextField(5);
        bo9=new JButton("Vender Entradas");
        bo9.addActionListener(this); 
        bo9.setActionCommand("9");
        pa9.add(la9, txt9); pa9.add(bo9);
        add(pa9);
        pa10=new JPanel();
        la10=new JLabel(lista.get(9).toString());
        txt10=new JTextField(5);
        bo10=new JButton("Vender Entradas");
        bo10.addActionListener(this); 
        bo10.setActionCommand("10");
        pa10.add(la10, txt10); pa10.add(bo10);
        pa11=new JPanel();
        la11=new JLabel("Total de entradas vendidas");
        bo11=new JButton("Calcular");
        bo11.addActionListener(this); //agregar acción al botón
        bo11.setActionCommand("11");
        pa11.add(la11);pa11.add(bo11);
        add(pa11);
        
        setVisible(true); 
    }

    @Override
      public void actionPerformed(ActionEvent ae) 
    {
        int val, tl;
     
        if(ae.getActionCommand().equalsIgnoreCase("1")){
           val = Integer.parseInt(txt1.getText());
           a += val;
        }else if(ae.getActionCommand().equalsIgnoreCase("2")){
           val = Integer.parseInt(txt2.getText());
           a += val;
        }else if(ae.getActionCommand().equalsIgnoreCase("3")){
           val = Integer.parseInt(txt3.getText());
           a += val;
        }else if(ae.getActionCommand().equalsIgnoreCase("4")){
           val = Integer.parseInt(txt4.getText());
           a += val;
        }else if(ae.getActionCommand().equalsIgnoreCase("5")){
           val = Integer.parseInt(txt5.getText());
           a += val;
        }else if(ae.getActionCommand().equalsIgnoreCase("6")){
           val = Integer.parseInt(txt6.getText());
           a += val;
        }else if(ae.getActionCommand().equalsIgnoreCase("7")){
           val = Integer.parseInt(txt7.getText());
           a += val;
        }else if(ae.getActionCommand().equalsIgnoreCase("8")){
           val = Integer.parseInt(txt8.getText());
           a += val;
        }else if(ae.getActionCommand().equalsIgnoreCase("9")){
           val = Integer.parseInt(txt9.getText());
           a += val;
        }else if(ae.getActionCommand().equalsIgnoreCase("10")){
           val = Integer.parseInt(txt10.getText());
           a += val;
        } if(ae.getActionCommand().equalsIgnoreCase("11")){
              tl = acu(a);
                JOptionPane.showMessageDialog(null,"Total de entradas vendidas:" + tl );
        }
    }
      public int acu(int acumulador){
          return acumulador;
      }
}
