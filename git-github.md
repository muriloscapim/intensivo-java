## Git e Github

* Instalando o Git no computador

O git pode ser baixado em: https://git-scm.com/downloads

```
git config --global user.name "Seu nome"
git config --global user.email "seu-email@exemplo.com"

git config --list
```

* Crie um novo repositório na sua conta do Github

* Abra um terminal dentro da pasta do projeto
Git Bash Here

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
> :exclamation: Este comando só é necessário se você criou o ***.gitignore e README.md pelo Github***

Adicionar todos os arquivos ao stage
```
git add .
```

Comitar a versão do projeto
```
git commit -m "First commit"
```

:exclamation: Porém esse commit ainda está na nossa máquina local

Envia o repositório local para o repositório remoto
```
git push -u origin master
```
