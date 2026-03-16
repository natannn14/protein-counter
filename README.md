# Macro Tracker CLI

Este é um projeto pessoal desenvolvido em **Java** com o objetivo de facilitar o controle diário de ingestão de macronutrientes para entusiastas de musculação e saúde. O projeto faz parte do meu portfólio de estudos como graduando em **Engenharia de Computação** no **IF Goiano - Campus Trindade**.

## 🚀 Funcionalidades Atuais (MVP)

* **Encapsulamento e Segurança de Dados:** Aplicação de modificadores de acesso `private` e validações lógicas (Setters) nos atributos biométricos, garantindo que o sistema não aceite valores impossíveis (ex: pesos negativos ou metas prejudiciais à saúde).
* **Gestão de Macros Completos:** O sistema evoluiu de um simples contador de proteínas para um gestor completo, calculando metas individuais para Proteínas, Carboidratos e Gorduras, além do cálculo dinâmico de Calorias Totais.
* **Definição Automática por Objetivo:** Implementação de uma estrutura de decisão (`switch-case`) que configura automaticamente todas as metas do usuário com base em 7 perfis de treinamento (desde Cut Agressivo até Bulk Agressivo), utilizando métricas reais de nutrição esportiva.
* **Lógica Orientada a Objetos e Associação:** Estrutura focada em Entidades de Domínio (`Usuario` e `Refeicao`). O sistema agora permite que o usuário "consuma" objetos do tipo refeição, delegando a responsabilidade dos cálculos matemáticos para as próprias classes.
* **Painel de Resumo Dinâmico:** Interface gráfica via `JOptionPane` que exibe em tempo real o balanço dos três macronutrientes (Proteína, Carboidrato e Gordura), informando exatamente quanto falta para atingir a meta ou quanto foi superado.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17+).
* **IDE:** IntelliJ IDEA.
* **Versionamento:** Git e GitHub.

## 🎯 Próximos Passos (Roadmap)

Como o projeto está em fase inicial e focado no aprendizado contínuo, as seguintes metas foram estabelecidas:

* [x] **Expansão de Macros:** Inclusão de Carboidratos e Gorduras para um controle de dieta completo.
* [x] **Interface de Interação:** Implementação de métodos Getters e Setters com validação de dados.
* [x] **Interface Gráfica Básica:** Interação inicial implementada utilizando `javax.swing.JOptionPane`.
* [x] **Estruturação da Entidade Refeição:** Finalizar a classe `Refeicao` com seus respectivos construtores e cálculos calóricos individuais.
* [x] **Associação de Objetos:** Criar a interação entre as classes, permitindo que o `Usuario` registre o consumo de uma `Refeicao` e tenha suas metas diárias subtraídas dinamicamente.
* [ ] **Histórico de Refeições:** Implementar o uso de coleções (como `ArrayList`) para guardar o histórico completo das refeições ingeridas no dia.
* [ ] **Persistência de Dados Básica:** Conectar o sistema a um banco de dados relacional (SQL) para manter o histórico de refeições e dados do usuário salvos.

## 📖 Como Executar

1. Certifique-se de ter o JDK instalado.
2. Clone o repositório:
   ```bash
   git clone [https://github.com/natannn14/protein-counter.git](https://github.com/natannn14/protein-counter.git)