
<h4 align="center">
   👨 Sistema de gerenciamento de pessoas 👨
</h4>

<p align="center">
 <a href="#-sobre-o-projeto">Sobre</a> •
 <a href="#-instruções-de-compilação-e-execução">Instruções de Compilação e Execução</a> •
 <a href="#-exemplo-de-uso">Exemplo de uso</a> •
 <a href="#-explicação-da-lógica-de-encapsulamento">Explicação da lógica de encapsulamento</a>
</p>

## 💻 Sobre o projeto
Sistema de gerenciamento de pessoas 👨 - é um projeto de um sistema de gerenciamento de pessoas desenvolvido para a disciplina de Programação Orientada a Objetos do curso de Análise e Desenvolvimento de Sistemas na UNITINS.
Este projeto implementa um sistema simples de gerenciamento de pessoas, permitindo cadastrar, atualizar e exibir informações de duas pessoas. O sistema foi desenvolvido com foco na aplicação de conceitos de Programação Orientada a Objetos, como encapsulamento, utilizando a linguagem Java.

## 📁 Instruções de Compilação e Execução

```bash

# Clone este repositório
$ git clone https://github.com/marceleeller/sistema-gerenciamento-pessoas.git

# Acesse a pasta do código fonte no terminal/cmd
$ cd src

# Compile o projeto:
$ javac *.java

# Execute com o comando:
$ java Principal

```

## ✅ Exemplo de uso

Ao executar o sistema, você verá a seguinte saída no console:
```bash
Pessoa 1: João, CPF: 123.456.789-00, Idade: 30
Pessoa 2: Maria, CPF: 987.654.321-00, Idade: 25
Pessoa 1: João Silva, CPF: 123.456.789-00, Idade: 31
```

## 💊 Explicação da lógica de encapsulamento

A lógica de encapsulamento foi aplicada no sistema através do uso de modificadores de acesso private nos atributos das classes e métodos public para acessar e modificar esses atributos. Isso garante que os dados das pessoas só possam ser acessados e modificados através dos métodos definidos, proporcionando maior controle e segurança sobre os dados. Os métodos get e set são fornecidos para acessar e modificar esses atributos.
Dessa forma, o sistema garante que os dados das pessoas sejam manipulados de maneira controlada e segura, respeitando os princípios de encapsulamento da Programação Orientada a Objetos.