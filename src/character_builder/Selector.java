/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package character_builder;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.util.Iterator;

/**
 *
 * @author Rizkhard
 */
public class Selector extends JFrame {

    protected int str = 10;
    protected int dex = 10;
    protected int con = 10;
    protected int wis = 10;
    protected int intel = 10;
    protected int cha = 10;
    protected JPanel panel;
    protected JLabel Strength_Label, Dexterity_Label, Constitution_Label, Wisdom_Label, Intelligence_Label, Charisma_Label;
    protected JTextField Character_Name;
    protected String background_selected, alignment_selected, class_selected;
    protected String race_selected = "";

    public Selector() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Termina la ejecución al cerrar el JFrame
        setMinimumSize(new Dimension(700, 700)); // Dimension mínima
        pack();
        setVisible(true); // Se hace visible
        setResizable(false); // Impide redimensionar la ventana
        setLocationRelativeTo(null); // Aparece en el centro de la pantalla

        initComp();
    }

    private void initComp() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);

        name();
        classes();
        races();
        background();
        alignment();
        stats();
        panel.repaint();
    }

    private void name() {
        JLabel Character_Name_Label = new JLabel("Character name:");
        Character_Name_Label.setBounds(70, 5, 100, 30);
        Character_Name = new JTextField();
        Character_Name.setBounds(180, 10, 200, 22);

        panel.add(Character_Name_Label);
        panel.add(Character_Name);
    }

    private void classes() {
        JLabel Class_Label = new JLabel("Class:");
        Class_Label.setBounds(420, 5, 100, 30);

        JButton Class_Button = new JButton("Select class");
        Class_Button.setBounds(460, 7, 110, 30);

        Class_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog Class_Dialog = new JDialog();
                Class_Dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
                Class_Dialog.setLayout(null);
                Class_Dialog.setResizable(false);

                ButtonGroup buttonGroup = new ButtonGroup();

                JRadioButton barbarian = new JRadioButton("Barbarian");
                barbarian.setBounds(10, 0, 100, 50);
                JRadioButton bard = new JRadioButton("Bard");
                bard.setBounds(10, 35, 100, 50);
                JRadioButton cleric = new JRadioButton("Cleric");
                cleric.setBounds(10, 70, 100, 50);
                JRadioButton druid = new JRadioButton("Druid");
                druid.setBounds(10, 105, 100, 50);
                JRadioButton fighter = new JRadioButton("Fighter");
                fighter.setBounds(120, 0, 100, 50);
                JRadioButton monk = new JRadioButton("Monk");
                monk.setBounds(120, 35, 100, 50);
                JRadioButton paladin = new JRadioButton("Paladin");
                paladin.setBounds(120, 70, 100, 50);
                JRadioButton ranger = new JRadioButton("Ranger");
                ranger.setBounds(120, 105, 100, 50);
                JRadioButton rogue = new JRadioButton("Rogue");
                rogue.setBounds(230, 0, 100, 50);
                JRadioButton sorcerer = new JRadioButton("Sorcerer");
                sorcerer.setBounds(230, 35, 100, 50);
                JRadioButton warlock = new JRadioButton("Warlock");
                warlock.setBounds(230, 70, 100, 50);
                JRadioButton wizard = new JRadioButton("Wizard");
                wizard.setBounds(230, 105, 100, 50);

                buttonGroup.add(barbarian);
                buttonGroup.add(bard);
                buttonGroup.add(cleric);
                buttonGroup.add(druid);
                buttonGroup.add(fighter);
                buttonGroup.add(monk);
                buttonGroup.add(paladin);
                buttonGroup.add(ranger);
                buttonGroup.add(rogue);
                buttonGroup.add(sorcerer);
                buttonGroup.add(warlock);
                buttonGroup.add(wizard);

                JButton save = new JButton("Save");
                save.setBounds(120, 160, 80, 20);
                save.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (barbarian.isSelected()) {
                            class_selected = barbarian.getText();
                        } else if (bard.isSelected()) {
                            class_selected = bard.getText();
                        } else if (cleric.isSelected()) {
                            class_selected = cleric.getText();
                        } else if (druid.isSelected()) {
                            class_selected = druid.getText();
                        } else if (fighter.isSelected()) {
                            class_selected = fighter.getText();
                        } else if (monk.isSelected()) {
                            class_selected = monk.getText();
                        } else if (paladin.isSelected()) {
                            class_selected = paladin.getText();
                        } else if (ranger.isSelected()) {
                            class_selected = ranger.getText();
                        } else if (rogue.isSelected()) {
                            class_selected = rogue.getText();
                        } else if (sorcerer.isSelected()) {
                            class_selected = sorcerer.getText();
                        } else if (warlock.isSelected()) {
                            class_selected = warlock.getText();
                        } else if (wizard.isSelected()) {
                            class_selected = wizard.getText();
                        } else {
                            class_selected = "Select class";
                        }
                        Class_Button.setText(class_selected);
                        Class_Dialog.dispose();
                    }
                }
                );
                Class_Dialog.add(barbarian);
                Class_Dialog.add(bard);
                Class_Dialog.add(cleric);
                Class_Dialog.add(druid);
                Class_Dialog.add(fighter);
                Class_Dialog.add(monk);
                Class_Dialog.add(paladin);
                Class_Dialog.add(ranger);
                Class_Dialog.add(rogue);
                Class_Dialog.add(sorcerer);
                Class_Dialog.add(warlock);
                Class_Dialog.add(wizard);

                Class_Dialog.add(save);

                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Termina la ejecución al cerrar el JFrame
                Class_Dialog.setBounds(30, 10, 340, 250);
                Class_Dialog.setResizable(false);
                Class_Dialog.setLocationRelativeTo(null); // Aparece en el centro de la pantalla
                Class_Dialog.setVisible(true);
            }
        }
        );
        panel.add(Class_Label);
        panel.add(Class_Button);
    }

    private void races() {
        JLabel Race_Label = new JLabel("Race:");
        Race_Label.setBounds(30, 60, 200, 30);

        JButton Race_Button = new JButton("Select race");
        Race_Button.setBounds(70, 60, 101, 30);

        Race_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog Races_Dialog = new JDialog();
                Races_Dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
                Races_Dialog.setLayout(null);
                Races_Dialog.setResizable(false);

                // RACES TO SELECT
                ButtonGroup buttonGroup = new ButtonGroup();

                JRadioButton dragonborn = new JRadioButton("Dragonborn");
                dragonborn.setBounds(10, 0, 100, 50);
                JRadioButton dwarf = new JRadioButton("Dwarf");
                dwarf.setBounds(10, 35, 100, 50);
                JRadioButton elf = new JRadioButton("Elf");
                elf.setBounds(10, 70, 100, 50);
                JRadioButton gnome = new JRadioButton("Gnome");
                gnome.setBounds(120, 0, 100, 50);
                JRadioButton half_elf = new JRadioButton("Half-Elf");
                half_elf.setBounds(120, 35, 100, 50);
                JRadioButton halfling = new JRadioButton("Halfling");
                halfling.setBounds(120, 70, 100, 50);
                JRadioButton half_orc = new JRadioButton("Half-Orc");
                half_orc.setBounds(230, 0, 100, 50);
                JRadioButton human = new JRadioButton("Human");
                human.setBounds(230, 35, 100, 50);
                JRadioButton tiefling = new JRadioButton("Tiefling");
                tiefling.setBounds(230, 70, 100, 50);

                buttonGroup.add(dragonborn);
                buttonGroup.add(dwarf);
                buttonGroup.add(elf);
                buttonGroup.add(gnome);
                buttonGroup.add(half_elf);
                buttonGroup.add(halfling);
                buttonGroup.add(half_orc);
                buttonGroup.add(human);
                buttonGroup.add(tiefling);

                // SAVE BUTTON
                JButton save = new JButton("Save");
                save.setBounds(120, 125, 80, 20);
                save.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int temp_str = 10;
                        int temp_dex = 10;
                        int temp_con = 10;
                        int temp_wis = 10;
                        int temp_intel = 10;
                        int temp_cha = 10;
                        if (dragonborn.isSelected()) {
                            temp_str += 2;
                            temp_cha += 1;
                            race_selected = dragonborn.getText();
                        } else if (dwarf.isSelected()) {
                            temp_con += 2;
                            race_selected = dwarf.getText();
                        } else if (elf.isSelected()) {
                            temp_dex += 2;
                            race_selected = elf.getText();
                        } else if (gnome.isSelected()) {
                            temp_intel += 2;
                            race_selected = gnome.getText();
                        } else if (half_elf.isSelected()) {
                            temp_cha += 2;
                            race_selected = half_elf.getText();
                        } else if (halfling.isSelected()) {
                            temp_dex += 2;
                            race_selected = halfling.getText();
                        } else if (half_orc.isSelected()) {
                            temp_str += 2;
                            temp_con += 1;
                            race_selected = half_orc.getText();
                        } else if (human.isSelected()) {
                            temp_str += 1;
                            temp_dex += 1;
                            temp_con += 1;
                            temp_wis += 1;
                            temp_intel += 1;
                            temp_cha += 1;
                            race_selected = human.getText();
                        } else if (tiefling.isSelected()) {
                            temp_cha += 2;
                            temp_intel += 1;
                            race_selected = tiefling.getText();
                        } else {
                            race_selected = "Select race";
                        }
                        
                        str = temp_str;
                        dex = temp_dex;
                        con = temp_con;
                        wis = temp_wis;
                        intel = temp_intel;
                        cha = temp_cha;

                        Strength_Label.setText(String.valueOf(str));
                        Dexterity_Label.setText(String.valueOf(dex));
                        Constitution_Label.setText(String.valueOf(con));
                        Wisdom_Label.setText(String.valueOf(wis));
                        Intelligence_Label.setText(String.valueOf(intel));
                        Charisma_Label.setText(String.valueOf(cha));

                        Race_Button.setText(race_selected);

                        Races_Dialog.dispose();

                        panel.repaint();
                    }
                }
                );

                // ADD RACES TO JDIALOG
                Races_Dialog.add(dragonborn);
                Races_Dialog.add(dwarf);
                Races_Dialog.add(elf);
                Races_Dialog.add(gnome);
                Races_Dialog.add(half_elf);
                Races_Dialog.add(halfling);
                Races_Dialog.add(half_orc);
                Races_Dialog.add(human);
                Races_Dialog.add(tiefling);
                Races_Dialog.add(save);

                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Termina la ejecución al cerrar el JFrame
                Races_Dialog.setBounds(30, 10, 340, 200);
                Races_Dialog.setResizable(false);
                Races_Dialog.setLocationRelativeTo(null); // Aparece en el centro de la pantalla
                Races_Dialog.setVisible(true);

            }
        }
        );

        panel.add(Race_Label);

        panel.add(Race_Button);
    }

    private void background() {
        JLabel Background_Label = new JLabel("Background:");
        Background_Label.setBounds(190, 60, 200, 30);

        JButton Background_Button = new JButton("Select background");
        Background_Button.setBounds(270, 60, 150, 30);

        Background_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog Background_Dialog = new JDialog();
                Background_Dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
                Background_Dialog.setLayout(null);
                Background_Dialog.setResizable(false);

                ButtonGroup buttonGroup = new ButtonGroup();

                JRadioButton acolyte = new JRadioButton("Acolyte");
                acolyte.setBounds(10, 0, 100, 50);
                JRadioButton charlatan = new JRadioButton("Charlatan");
                charlatan.setBounds(10, 35, 100, 50);
                JRadioButton criminal = new JRadioButton("Criminal");
                criminal.setBounds(10, 70, 100, 50);
                JRadioButton entertainer = new JRadioButton("Entertainer");
                entertainer.setBounds(10, 105, 100, 50);
                JRadioButton folk_hero = new JRadioButton("Folk Hero");
                folk_hero.setBounds(120, 0, 100, 50);
                JRadioButton gladiator = new JRadioButton("Gladiator");
                gladiator.setBounds(120, 35, 100, 50);
                JRadioButton guild_artisan = new JRadioButton("Guild Artisan");
                guild_artisan.setBounds(120, 70, 100, 50);
                JRadioButton hermit = new JRadioButton("Hermit");
                hermit.setBounds(120, 105, 100, 50);
                JRadioButton knight = new JRadioButton("Knight");
                knight.setBounds(230, 0, 100, 50);
                JRadioButton noble = new JRadioButton("Knight");
                noble.setBounds(230, 35, 100, 50);
                JRadioButton outlander = new JRadioButton("Outlander");
                outlander.setBounds(230, 70, 100, 50);
                JRadioButton pirate = new JRadioButton("Pirate");
                pirate.setBounds(230, 105, 100, 50);
                JRadioButton sage = new JRadioButton("Sage");
                sage.setBounds(340, 0, 100, 50);
                JRadioButton sailor = new JRadioButton("Sailor");
                sailor.setBounds(340, 35, 100, 50);
                JRadioButton soldier = new JRadioButton("Soldier");
                soldier.setBounds(340, 70, 100, 50);
                JRadioButton urchin = new JRadioButton("Urchin");
                urchin.setBounds(340, 105, 100, 50);

                buttonGroup.add(acolyte);
                buttonGroup.add(charlatan);
                buttonGroup.add(criminal);
                buttonGroup.add(entertainer);
                buttonGroup.add(folk_hero);
                buttonGroup.add(gladiator);
                buttonGroup.add(guild_artisan);
                buttonGroup.add(hermit);
                buttonGroup.add(knight);
                buttonGroup.add(noble);
                buttonGroup.add(outlander);
                buttonGroup.add(pirate);
                buttonGroup.add(sage);
                buttonGroup.add(sailor);
                buttonGroup.add(soldier);
                buttonGroup.add(urchin);

                JButton save = new JButton("Save");
                save.setBounds(175, 160, 80, 20);
                save.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (acolyte.isSelected()) {
                            background_selected = acolyte.getText();
                        } else if (charlatan.isSelected()) {
                            background_selected = charlatan.getText();
                        } else if (criminal.isSelected()) {
                            background_selected = criminal.getText();
                        } else if (entertainer.isSelected()) {
                            background_selected = entertainer.getText();
                        } else if (folk_hero.isSelected()) {
                            background_selected = folk_hero.getText();
                        } else if (gladiator.isSelected()) {
                            background_selected = gladiator.getText();
                        } else if (guild_artisan.isSelected()) {
                            background_selected = guild_artisan.getText();
                        } else if (hermit.isSelected()) {
                            background_selected = hermit.getText();
                        } else if (knight.isSelected()) {
                            background_selected = knight.getText();
                        } else if (noble.isSelected()) {
                            background_selected = noble.getText();
                        } else if (outlander.isSelected()) {
                            background_selected = outlander.getText();
                        } else if (pirate.isSelected()) {
                            background_selected = pirate.getText();
                        } else if (sage.isSelected()) {
                            background_selected = sage.getText();
                        } else if (sailor.isSelected()) {
                            background_selected = sailor.getText();
                        } else if (soldier.isSelected()) {
                            background_selected = soldier.getText();
                        } else if (urchin.isSelected()) {
                            background_selected = urchin.getText();
                        } else {
                            background_selected = "Select background";
                        }

                        Background_Button.setText(background_selected);
                        Background_Dialog.dispose();
                    }
                }
                );
                Background_Dialog.add(acolyte);
                Background_Dialog.add(charlatan);
                Background_Dialog.add(criminal);
                Background_Dialog.add(entertainer);
                Background_Dialog.add(folk_hero);
                Background_Dialog.add(gladiator);
                Background_Dialog.add(guild_artisan);
                Background_Dialog.add(hermit);
                Background_Dialog.add(knight);
                Background_Dialog.add(noble);
                Background_Dialog.add(outlander);
                Background_Dialog.add(pirate);
                Background_Dialog.add(sage);
                Background_Dialog.add(sailor);
                Background_Dialog.add(soldier);
                Background_Dialog.add(urchin);
                Background_Dialog.add(save);

                Background_Dialog.setBounds(30, 10, 440, 250);
                Background_Dialog.setResizable(false);
                Background_Dialog.setLocationRelativeTo(null); // Aparece en el centro de la pantalla
                Background_Dialog.setVisible(true);
            }
        }
        );
        panel.add(Background_Label);
        panel.add(Background_Button);
        panel.repaint();
    }

    private void alignment() {
        JLabel Alignment_Label = new JLabel("Alignment:");
        Alignment_Label.setBounds(440, 60, 200, 30);

        JButton Alignment_Button = new JButton("Select alignment");
        Alignment_Button.setBounds(510, 60, 139, 30);

        Alignment_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog Alignment_Dialog = new JDialog();
                Alignment_Dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
                Alignment_Dialog.setLayout(null);
                Alignment_Dialog.setResizable(false);

                ButtonGroup buttonGroup = new ButtonGroup();

                JRadioButton lawful_good = new JRadioButton("Lawful good");
                lawful_good.setBounds(10, 0, 100, 50);
                JRadioButton neutral_good = new JRadioButton("Neutral good");
                neutral_good.setBounds(10, 35, 100, 50);
                JRadioButton chaotic_good = new JRadioButton("Chaotic good");
                chaotic_good.setBounds(10, 70, 100, 50);
                JRadioButton lawful_neutral = new JRadioButton("Lawful neutral");
                lawful_neutral.setBounds(120, 0, 110, 50);
                JRadioButton neutral = new JRadioButton("Neutral");
                neutral.setBounds(120, 35, 100, 50);
                JRadioButton chaotic_neutral = new JRadioButton("Chaotic neutral");
                chaotic_neutral.setBounds(120, 70, 112, 50);
                JRadioButton lawful_evil = new JRadioButton("Lawful evil");
                lawful_evil.setBounds(240, 0, 100, 50);
                JRadioButton neutral_evil = new JRadioButton("Neutral evil");
                neutral_evil.setBounds(240, 35, 100, 50);
                JRadioButton chaotic_evil = new JRadioButton("Chaotic evil");
                chaotic_evil.setBounds(240, 70, 100, 50);

                buttonGroup.add(lawful_good);
                buttonGroup.add(neutral_good);
                buttonGroup.add(chaotic_good);
                buttonGroup.add(lawful_neutral);
                buttonGroup.add(neutral);
                buttonGroup.add(chaotic_neutral);
                buttonGroup.add(lawful_evil);
                buttonGroup.add(neutral_evil);
                buttonGroup.add(chaotic_evil);

                JButton save = new JButton("Save");
                save.setBounds(130, 125, 80, 20);
                save.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (lawful_good.isSelected()) {
                            alignment_selected = lawful_good.getText();
                        } else if (neutral_good.isSelected()) {
                            alignment_selected = neutral_good.getText();
                        } else if (chaotic_good.isSelected()) {
                            alignment_selected = chaotic_good.getText();
                        } else if (lawful_neutral.isSelected()) {
                            alignment_selected = lawful_neutral.getText();
                        } else if (neutral.isSelected()) {
                            alignment_selected = neutral.getText();
                        } else if (chaotic_neutral.isSelected()) {
                            alignment_selected = chaotic_neutral.getText();
                        } else if (lawful_evil.isSelected()) {
                            alignment_selected = lawful_evil.getText();
                        } else if (neutral_evil.isSelected()) {
                            alignment_selected = neutral_evil.getText();
                        } else if (chaotic_evil.isSelected()) {
                            alignment_selected = chaotic_evil.getText();
                        } else {
                            alignment_selected = "Select alignment";
                        }

                        Alignment_Button.setText(alignment_selected);

                        Alignment_Dialog.dispose();
                    }
                }
                );
                Alignment_Dialog.add(lawful_good);
                Alignment_Dialog.add(neutral_good);
                Alignment_Dialog.add(chaotic_good);
                Alignment_Dialog.add(lawful_neutral);
                Alignment_Dialog.add(neutral);
                Alignment_Dialog.add(chaotic_neutral);
                Alignment_Dialog.add(lawful_evil);
                Alignment_Dialog.add(neutral_evil);
                Alignment_Dialog.add(chaotic_evil);
                Alignment_Dialog.add(save);

                Alignment_Dialog.setBounds(30, 10, 360, 200);
                Alignment_Dialog.setResizable(false);
                Alignment_Dialog.setLocationRelativeTo(null); // Aparece en el centro de la pantalla
                Alignment_Dialog.setVisible(true);
            }
        }
        );
        panel.add(Alignment_Label);
        panel.add(Alignment_Button);

    }

    private void stats() {
        JLabel Stats_Label = new JLabel("Stats:");
        Stats_Label.setBounds(30, 130, 200, 30);

        JLabel strength = new JLabel("STR");
        strength.setBounds(110, 100, 200, 30);
        JLabel dexterity = new JLabel("DEX");
        dexterity.setBounds(210, 100, 200, 30);
        JLabel constitution = new JLabel("CON");
        constitution.setBounds(300, 100, 200, 30);
        JLabel wisdom = new JLabel("WIS");
        wisdom.setBounds(390, 100, 200, 30);
        JLabel intelligence = new JLabel("INT");
        intelligence.setBounds(480, 100, 200, 30);
        JLabel charisma = new JLabel("CHA");
        charisma.setBounds(570, 100, 200, 30);

        Strength_Label = new JLabel(String.valueOf(str));
        Dexterity_Label = new JLabel(String.valueOf(dex));
        Constitution_Label = new JLabel(String.valueOf(con));
        Wisdom_Label = new JLabel(String.valueOf(wis));
        Intelligence_Label = new JLabel(String.valueOf(intel));
        Charisma_Label = new JLabel(String.valueOf(cha));

        Strength_Label.setBounds(115, 130, 200, 30);
        Dexterity_Label.setBounds(215, 130, 200, 30);
        Constitution_Label.setBounds(305, 130, 200, 30);
        Wisdom_Label.setBounds(395, 130, 200, 30);
        Intelligence_Label.setBounds(481, 130, 200, 30);
        Charisma_Label.setBounds(575, 130, 200, 30);

        panel.add(strength);
        panel.add(dexterity);
        panel.add(constitution);
        panel.add(wisdom);
        panel.add(intelligence);
        panel.add(charisma);

        panel.add(Strength_Label);
        panel.add(Dexterity_Label);
        panel.add(Constitution_Label);
        panel.add(Wisdom_Label);
        panel.add(Intelligence_Label);
        panel.add(Charisma_Label);

        panel.add(Stats_Label);
    }

}
