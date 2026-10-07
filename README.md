### relembrar o javinha é sempre bom, fiquei foi hypado para mudar a estrutura do assina para spring...
Seria o Java o proximo pagador de contas e não o C? vamos ver nas cenas do proximo capitulo; enquanto isso estou muito interessado em relembrar conceitos importantes da linguagem mais usada para sistemas realmente seguros, porem não a mais mais C me entende né?

### Deixar aqui alguns comandos uteis
> ./mvnw spring-boot:run

Caraca o Vim vai me desculpar, mas não tem como usar Java no Vim o IntelliJ é muito sofisticado e assim, não é vscode né, acho que da pra aceitar, não to me sentindo um estudante da rocketseat to me sentindo numa IDE meio low code, parece que se apreta tab tab tab ela tem um intelisense muito, interessante... caraca pessoal do typescript o sonho de vcs era fazer um spring boot com outro nome né? kkkk aqui tudo é tipado e muito mais elegante do que, oque vocês, tentaram fazer com o javascript kkk pqp!

### Explicações inesperadas de um spring selvagem
Por baixo dos panoes o Spring tem um recurso que se chama DispatcherServlet e sempre que a gente envia requisições pro server, esse cara que recebe e ele faz ali uma especie de roteamento para qual Controller que vai receber e responder a solicitação... (posso ta pensando merda mas me parece muito com o express do node, porém javascript para backend é aquilo né, pior que isso só vibecodando mesmo kkk)

### Testar a API

```bash
curl --request POST \
  --url http://localhost:8080/parking-spot \
  --header 'Content-Type: application/json' \
  --data '{
	"parkingSpotNumber": "2058",
	"licensePlateCar": "RRS8562",
	"brandCar": "Audi",
	"modelCar": "q5",
	"colorCar": "black",
	"responsibleName": "Matheus Braga",
	"apartment": "205",
	"block": "0"
}'
```