# 🚀 Macro Tracker CLI

Sistema em **Java** para controle de ingestão de macronutrientes (Proteína, Carboidrato e Gordura), desenvolvido com foco em **aprendizado de Programação Orientada a Objetos** e boas práticas de desenvolvimento.

> Projeto desenvolvido como parte da minha formação em **Engenharia de Computação (IF Goiano - Campus Trindade)**.

---

## 🧠 Sobre o Projeto

O **Macro Tracker CLI** permite que o usuário:

- Defina seu objetivo (cutting, bulking, manutenção)
- Tenha metas automáticas de macros baseadas no peso
- Registre refeições ao longo do dia
- Acompanhe em tempo real o progresso das metas

---

## ⚙️ Funcionalidades

- ✅ Cálculo automático de macros e calorias
- ✅ Registro de refeições com múltiplos macronutrientes
- ✅ Resumo dinâmico do consumo diário
- ✅ Validação de dados de entrada
- ✅ Estrutura orientada a objetos (`Usuario` e `Refeicao`)
- ✅ Refatoração com reutilização de lógica (`MacroService`)

---

## 🛠️ Tecnologias

- Java (JDK 17+)
- IntelliJ IDEA
- Git + GitHub

---

## ▶️ Como executar

```bash
git clone https://github.com/natannn14/protein-counter.git
```

1. Abra o projeto na sua IDE
2. Execute a classe `ContadorProteina`
3. Interaja com o sistema via interface gráfica (JOptionPane)

---

## 💡 Exemplo de uso

```text
RESUMO DOS MACROS

Proteína: Faltam 20.00g para atingir a meta
Carboidrato: Meta atingida!
Gordura: Meta superada em 10.00g
```

---

## 📈 Evolução do Projeto

Este projeto evoluiu de um simples contador de proteína para um sistema completo de gerenciamento de macronutrientes.

Principais melhorias:
- Refatoração para eliminar código repetido
- Criação de serviços reutilizáveis (`MacroService`)
- Melhor organização e separação de responsabilidades

---

## 🎯 Roadmap

- [ ] Histórico de refeições (`ArrayList`)
- [ ] Persistência com banco de dados (SQL)
- [ ] Interface gráfica mais avançada
- [ ] Transformar em API (Spring Boot)

---

## 📚 Aprendizados

Durante o desenvolvimento deste projeto, pratiquei:

- Programação Orientada a Objetos (POO)
- Encapsulamento e validação de dados
- Refatoração de código
- Separação de responsabilidades
- Boas práticas de organização

---