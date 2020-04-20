# PaintBrush
## Trabalho Prático I: Implementação De Um Paint Brush
Prof. Pedro Henrique PennaValor: 15 Pontos
Graduação em Ciência da Computação – 6ºPeríodo
Pontifícia Universidade Católica de Minas Gerais (PUC Minas)
### Resumo
Este  trabalho  tem  como  objetivo  complementar  os  conhecimentos  teóricos  na  disciplina  de Computação Gráfica com o desenvolvimento de uma aplicação de desenho gráfico assistido,como o Paint Brush.
### 1.  Descrição
Você deverá implementar uma aplicação de desenho gráfico assistido que permita um usuário interagir com uma matriz de Pixels (Canvas) utilizando o mouse. Essa aplicação deve contem-plar as seguintes funcionalidades:
- Rasterização de Pontos.
- Rasterização de Retas: algoritmos DDA e Bresenham.
- Rasterização de Polígonos: retângulo.
- Rasterização de Circunferência: algoritmo de Bresenham.
- Transformações Geométricas 2D: translação, rotação, escala e reflexões (X, Y e XY).
- Recorte de Regiões: Algoritmos de Cohen-Sutherland e Liang Barsky.
### 2. Especificações Técnicas
A aplicação pode ser implementada em qualquer uma das seguintes linguagens: C,C++,Java ou Go Lang.
O projeto deverá ser necessariamente desenvolvido usando o sistema de versionamento Git.Para hospedar a árvore de fontes, qualquer plataforma de hospedagem de projetos,  como o GitHub, BitBucket ou então GitLab, pode ser usada.
Na árvore de fontes do projeto, informações suficientes para a compilação do programa devemser fornecidas. Obrigatoriamente, a compilação deve suportar o ambiente Linux Ubuntu 18.04e não deve exigir a instalação de pacotes e/ou programas de terceiros (ie.IDEs).∗O presente enunciado está sujeito a correções nesse sentido e, caso ocorram, serão divulgadas no SGA e em sala.

### 3. Distribuição de Pontos

Este trabalho tem o valor de 15 pontos e deve ser desenvolvido em grupo de três a quatro in-tegrantes. O link do repositório Git contendo a árvore de fontes do projeto deverá ser entregueem um arquivo texto no SGA, antes do prazo para entrega estipulado.Commitsrealizados norepositório após o prazo de entregue estabelecido serão desconsiderados.  Este trabalho seráavaliado da seguinte forma:

* Corretude da Solução (9 pontos)
* Participação de Todos os Integrantes do Grupo (3 pontos)
* Qualidade de Código (2 pontos)
* Documentação de Código (1 ponto)

A  participação  de  todos  dos  integrantes  do  grupo  no  trabalho  será  validada  caso  todos  osmembros tenham realizado ao menos umcommitrelevante na árvore de fontes e/ou atuadona gestão do projeto, de forma importante (ie.criação decards, bugs,pull requests,merges).Discussões entre diferentes grupos da turma são encorajadas.  No entanto, qualquer identifi-cação de cópia do trabalho,  total ou parcial,  implicará na avaliação em zero,  para ambas aspartes.

### 4. Distribuição de Pontos ExtrasOs grupos que desejarem podem realizar uma ou mais das atividades seguintes para obtençãode pontos extras nesse trabalho:
* Preenchimento de áreas delimitadas por polígonos usando um dos algoritmos estudadosem sala, comoBoundary Fille/ouFlood Fill(1 ponto).
* Salvar/Restaurar estruturas de dados internas doCanvasem/de um arquivo (2 pontos).
### 5 Como dar build
1. cd src/paintbrush
2. javac Point.java
3. javac Reta.java
4. javac Retangulo.java
5. javac Circunferencia.java
6. javac PaintBrushFrame.java
7. java PaintBrushFrame
