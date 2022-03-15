import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();
        Bootcamp bootcamp = new Bootcamp();
        boolean finish = true;
        do {
            String inputValueInitial = JOptionPane.showInputDialog("Este é o painel de controle da DIO.\n" +
                    "\nVocê deve selecionar todas as opções a seguir na sequência para o programa teste funcionar corretamente." +
                    "\n\nDigite: 1- Para adicionar o primeiro curso." +
                    "\nDigite: 2- Para adicionar o segundo curso" +
                    "\nDigite: 3- Para adicionar uma mentoria." +
                    "\nDigite: 4- Para adicionar o bootcamp." +
                    "\nDigite: 5- Para encerrar o programa.\n\n");
            switch (inputValueInitial) {
                case "1":
                    JOptionPane.showMessageDialog(null,"Adicione um curso, caso você adicione um novo curso o registro anterior será apagado.");
                    String inputValue = JOptionPane.showInputDialog("Insira o nome do curso");
                    curso1.setTitulo(inputValue);
                    String inputValue2 = JOptionPane.showInputDialog("Insira uma descrição para o curso");
                    curso1.setDescricao(inputValue2);
                    int inputValue3 = Integer.parseInt(JOptionPane.showInputDialog("Insira uma carga horária para o curso"));
                    curso1.setCargaHoraria(inputValue3);
                    JOptionPane.showMessageDialog(null,"O curso foi adicionado com sucesso.");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null,"Adicione o segundo curso, caso você adicione um novo curso o registro anterior será apagado.");
                    String input2Value = JOptionPane.showInputDialog("Insira o nome do curso");
                    curso2.setTitulo(input2Value);
                    String input2Value2 = JOptionPane.showInputDialog("Insira uma descrição para o curso");
                    curso2.setDescricao(input2Value2);
                    int input2Value3 = Integer.parseInt(JOptionPane.showInputDialog("Insira uma carga horária para o curso"));
                    curso2.setCargaHoraria(input2Value3);
                    JOptionPane.showMessageDialog(null,"O curso foi adicionado com sucesso.");
                case "3":
                    JOptionPane.showMessageDialog(null,"Adicione uma mentoria, caso você adicione um nova mentoria o registro anterior será apagado.");
                    String minputValue = JOptionPane.showInputDialog("Insira o nome da mentoria");
                    mentoria.setTitulo(minputValue);
                    String minputValue2 = JOptionPane.showInputDialog("Insira a descrição da mentoria");
                    mentoria.setDescricao(minputValue2);
                    mentoria.setData(LocalDate.now());
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null,"Adicione o bootcamp, caso você adicione um novo bootcamp o registro anterior será apagado.");
                    String binputValue = JOptionPane.showInputDialog("Insira o nome do bootcamp");
                    bootcamp.setNome(binputValue);
                    String binputValue2 = JOptionPane.showInputDialog("Insira descrição do bootcamp");
                    bootcamp.setDescricao(binputValue2);
                    bootcamp.getConteudos().add(curso1);
                    bootcamp.getConteudos().add(curso2);
                    bootcamp.getConteudos().add(mentoria);
                    break;
                case "5":
                    finish = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Insira um valor correto.");
                    break;
            }
        } while(finish);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
