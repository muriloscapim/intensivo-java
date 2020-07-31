## Git e Github

Git é um sistema de controle de versão de arquivos.

GitHub é uma plataforma web de hospedagem de código-fonte com controle de versão que usa o Git.

Assim como o Bitbucket https://bitbucket.org/

### Branch

É uma ramificação no git. São separações de código.

O branch padrão do projeto é o master.

É útil em situações nas quais você deseja adicionar um novo recurso ou corrigir um erro, gerando uma nova ramificação do código.

Depois de concluir a alteração dos códigos da ramificação, você pode unir as branches, por meio do comando **merge**, unindo a ramificação com a principal, que é a **branch master**.

![69payngupg75rqgabwdg](https://user-images.githubusercontent.com/56240254/89055925-997a2a80-d331-11ea-8248-8d613e8a55b1.png)

## Instalando o Git no computador

O git pode ser baixado em: https://git-scm.com/downloads

```
git config --global user.name "Seu nome"
git config --global user.email "seu-email@exemplo.com"

git config --list
```

* Crie um novo repositório na sua conta do Github.

* Abra um terminal dentro da pasta do projeto.
> Para abrir um terminal git no Windows, basta clicar com o botão direito do mouse e escolher **Git Bash Here**.

### Execute os seguintes comandos:

Inicia um novo repositório local na pasta do projeto
```
git init
```
Verificar o status do repositório
```
git status
```

Associa o repositório local ao repositório remoto, chamado de "origin"
```
git remote add origin https://github.com/usuario/meu-projeto.git
```
> Coloque o endereço do seu repositório do Github

Atualiza seu repositório local em relação ao repositório remoto
```
git pull origin master
```
> :exclamation: Este comando só é necessário se você criou o ***.gitignore e README.md pelo Github***.

Adicionar todos os arquivos alterados ao stage.
```
git add .
```

Comitar a versão do projeto, incluirá as modificações que estão no stage.
```
git commit -m "First commit"
```

:exclamation: Porém esse commit ainda está na nossa máquina local

Envia o repositório local para o repositório remoto
```
git push -u origin master
```
:exclamation: Ao executar o comando, você terá que fazer login pelo terminal na sua conta do Github

Para visualizar o histórico de commits
```
git log
```
### Clonar um repositório do Github

Quando começar um novo projeto utilizando git, você cria ele no Github e clona o repositório para sua máquina.
```
git clone https://github.com/usuario/meu-projeto.git
```
