# Projeto de Gestão de Funcionários

## Visão Geral

Este projeto é uma aplicação simples para a **gestão de funcionários** utilizando **Java**. O objetivo é permitir o cadastro, atualização, listagem, e exclusão de funcionários, além de persistir os dados em um arquivo. A aplicação segue uma estrutura orientada a objetos com uso de **interfaces** e **herança**, proporcionando uma prática de conceitos importantes na programação em Java.

O sistema é capaz de manipular diferentes tipos de funcionários, incluindo:
- **Desenvolvedores**
- **Gerentes**
- **Treinadores**
- **Gerentes Desenvolvedores** (uma combinação de Gerente e Desenvolvedor)

## Funcionalidades

- **Cadastro de Funcionários**: Inclui nome e salário, permitindo a escolha do tipo de funcionário.
- **Listagem de Funcionários**: Exibe todos os funcionários cadastrados no sistema.
- **Atualização de Salário**: Permite atualizar o salário de um funcionário específico.
- **Exclusão de Funcionário**: Remove um funcionário do sistema.
- **Persistência de Dados**: Salva e carrega os dados de funcionários utilizando a serialização em um arquivo `.dat`.

## Estrutura do Projeto

A estrutura do projeto está organizada em pacotes para facilitar a manutenção e compreensão do código:


## Como Executar o Projeto

### Pré-requisitos

- **Java SE Development Kit** (JDK 11 ou superior)
- Um editor de código como **Eclipse**, **IntelliJ**, ou **Visual Studio Code** com suporte a Java.

### Passos para Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git


Importe o projeto no seu editor de código.

Compile e execute a classe Main.java que se encontra no pacote main.

Utilização
Após iniciar o programa, você verá um menu com as opções disponíveis:

Cadastrar Funcionário: Escolha o tipo de funcionário e forneça os dados.
Listar Funcionários: Exibe todos os funcionários cadastrados.
Atualizar Funcionário: Permite atualizar o salário de um funcionário existente.
Excluir Funcionário: Remove um funcionário da lista.
Sair: Encerra o programa.
Persistência de Dados
Os dados dos funcionários são armazenados no arquivo funcionarios.dat localizado na pasta resources. O arquivo é carregado automaticamente ao iniciar o programa e atualizado ao adicionar, remover ou editar um funcionário.

Tecnologias Utilizadas
Java
Serialização para persistência de dados
Collections (ArrayList) para armazenar os funcionários temporariamente
Estrutura MVC (Model-View-Controller)
Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar um pull request com melhorias, correções de bugs ou novas funcionalidades.

Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

Autor
Desenvolvido por [Ruan Correia](https://github.com/ruancorreia).

![Diagrama de Classes](https://github.com/user-attachments/assets/569cb0b4-c263-4402-ac34-7e5bb6332a39)

## PRINTS DA APLICAÇÂO 

**Menu Inicial**  
![Menu inicial](https://github.com/user-attachments/assets/a0ec3865-8643-423f-b6a9-daef504fd9a8)

**Seleção de tipo de funcionario**  
![Seleção de Tipo de funcionario](https://github.com/user-attachments/assets/1d9e3a73-7c25-4d46-8bb8-1fe837bb4d7e)

**Dados Preenchidos**  
![image](https://github.com/user-attachments/assets/ed1b98a4-15b8-424c-9d4d-1b4283e8151d)

**Persistencia dos dados**  
![image](https://github.com/user-attachments/assets/0588d31e-0f88-4845-85bf-ce6cbbee9142)

**Exclusao de dados**  
![image](https://github.com/user-attachments/assets/c6be5ad3-14ab-4b5f-bdab-51dcc764892a)




