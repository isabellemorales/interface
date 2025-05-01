💻 Interface Gráfica com Java | Introdução ao Swing e JOptionPane

Este projeto reúne meus primeiros exercícios práticos com interfaces gráficas (GUI) em Java, utilizando a 
biblioteca Swing e a classe JOptionPane para entrada e saída de dados de forma interativa e amigável.

Com foco na construção de experiências mais visuais e intuitivas, explorei os principais recursos da 
linguagem para criar janelas de diálogo que substituem a tradicional interação por console.


📌 O que você vai encontrar:
Conceitos fundamentais de GUI – Graphical User Interface

Diferença entre interface gráfica e interface por texto (console)

Uso do JOptionPane para:

Exibir caixas de diálogo com campos de entrada (showInputDialog)

Mostrar mensagens com os dados inseridos (showMessageDialog)

Implementação simples com entrada de dois nomes e exibição dos resultados

Noções básicas sobre componentes da biblioteca javax.swing, como JFrame, JLabel, JTextField, JButton.

📘 Conteúdo aplicado:
String nome = JOptionPane.showInputDialog("Qual seu nome?", "Digite seu nome aqui");
String outronome = JOptionPane.showInputDialog(null, "Qual o outro nome?", "Entrada de dados", JOptionPane.PLAIN_MESSAGE);

JOptionPane.showMessageDialog(null, "Nome é " + nome);
JOptionPane.showMessageDialog(null, "O outro nome é " + outronome);

🛠 Aprendizados
Criação de uma calculadora gráfica com campos de entrada, botões de operação (soma, subtração, multiplicação, divisão, resto) e exibição de resultado

Desenvolvimento de interfaces utilizando o Editor Visual do NetBeans, com arraste de componentes (JFrame, JLabel, JTextField, JButton, etc.)
