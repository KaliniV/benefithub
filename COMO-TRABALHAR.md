# Como o projeto está organizado

São **13 milestones**, do M01 ao M13, em ordem de dependência: cada um assume que o anterior está pronto. Eles vão do básico (montar o ambiente, primeiro endpoint) até o avançado (microsserviços, Kubernetes). Pular pra frente porque parece mais interessante é o jeito mais rápido de travar.

Dentro de cada milestone há de 6 a 8 issues, também em ordem. Elas são pequenas de propósito: cada uma é uma entrega fechada, que cabe em um Pull Request.

Cada issue tem cinco seções:

- **Contexto** — por que essa task existe. É a parte do aprendizado, leia com calma.
- **Objetivo** — uma frase dizendo aonde você precisa chegar.
- **Critérios de aceite** — a definição de "pronto". Nem mais, nem menos.
- **Pistas de estudo** — os termos e as perguntas pra pesquisar. São incompletas de propósito: apontam onde procurar, não dão a resposta.
- **Fora de escopo** — o que **não** fazer agora. Existe pra te impedir de se perder.

As labels ajudam a se situar: o assunto (`backend`, `frontend`, `testes`, `arquitetura`…) e a dificuldade (`nivel: iniciante`, `intermediario`, `avancado`).

---

# Workflow das issues

Repita esse ciclo pra cada issue, na ordem do M01 pro M13.

## Começar

Atualize a main e crie uma branch nova a partir dela. O nome da branch é só pra você se localizar — use o número da issue e duas ou três palavras que digam do que se trata.

## Durante

Vá commitando conforme avança, um commit por pedaço que já funciona. Não deixe pra commitar tudo no fim.

Marque os checkboxes da issue no GitHub à medida que completa cada critério de aceite — assim você enxerga o que ainda falta.

## Fechar

Suba a branch e abra um Pull Request. Escreva **`Closes #N`** na descrição (com o número da issue) — é isso que fecha a issue sozinha quando o PR for mergeado.

Antes de mergear, leia o diff inteiro pelo GitHub. Depois do merge, apague a branch e volte pra main atualizada.

## Regras

- **Uma issue = uma branch = um PR.** Nunca misture duas issues no mesmo PR.
- **Não mergeie com critério de aceite desmarcado.** Se falta algo, a issue não acabou.
- **Nada de commit direto na main.**
- **Nunca commite `.env`, senha ou token.** Uma vez no histórico, é pra sempre.
- **Se quebrou e você não sabe o quê:** olhe o histórico e compare com o commit anterior. É pra isso que os commits são pequenos.

---

Esse arquivo é só um apoio pra não se perder no começo. Quando o fluxo já estiver na mão, pode apagar sem dó — ou mudar o que não fizer sentido pra você.
