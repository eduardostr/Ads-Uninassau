## Desenvolvimento de um Sistema Modular para Gerenciamento de Frotas: Abordagem Orientada a Objetos e Melhores Práticas de Manutenção

Para desenvolver um sistema de gerenciamento de frota eficiente, é essencial estruturar uma solução que compreenda as particularidades de cada tipo de veículo, a fim de assegurar a precisão no cálculo de seguros e a manutenção regular. Implementar um modelo de classes orientado a objetos permite um gerenciamento mais modular e extensível, além de facilitar futuras expansões.

O design do sistema começa com uma classe abstrata chamada “Veiculo”, que estabelece as propriedades comuns, como placa e ano, e define um método abstrato para o cálculo do seguro. Essa abordagem permite que cada tipo de veículo implemente a lógica de cálculo conforme necessário, garantindo flexibilidade. A interface chamada “Manutencao” adiciona outra camada de abstração, unificando o método de manutenção em diferentes tipos de veículos, mas permitindo que a implementação se ajuste às necessidades específicas de cada subclasse.

Ao dividir os veículos em subclasses como “Carro” e “Moto”, com atributos únicos (como número de portas para carros e cilindrada para motos), o sistema possibilita a criação de funcionalidades específicas para cada tipo de veículo. Isso não apenas torna o código mais organizado, mas também oferece uma interface que permite ao usuário final interagir de forma intuitiva com informações detalhadas de cada veículo, como exibição de detalhes e histórico de manutenção.

Utilizar uma estrutura de dados como “ArrayList” para armazenar a frota facilita o gerenciamento, permitindo acessar e manipular a lista de veículos facilmente. Além disso, o uso de polimorfismo permite que o sistema percorra a lista de veículos, tratando-os de forma genérica, mas aplicando o comportamento específico de cada um.

Em resumo, a organização orientada a objetos aliada a uma estrutura modular e extensível é essencial para criar um sistema robusto e escalável, capaz de atender aos requisitos de uma grande empresa de transporte, proporcionando a eficiência e facilidade de manutenção.

## Explicação de como rodar o código no terminal

1. Abra o terminal do VS Code. Para isso, clique em Terminal > New Terminal ou pressione Ctrl + Shift + (acento grave).
2. No terminal, navegue até a pasta onde estão os arquivos .java. Use o comando:<br/>
   Exemplo = cd caminho/para/sua/pasta
3. Compile todos os arquivos de uma vez usando o comando:<br/>
   Exemplo = javac \*.java<br/>
   **Esse comando compila todos os arquivos .java na pasta.**
4. Após a compilação, você verá os arquivos .class gerados. Agora, execute o programa chamando a classe principal (GerenciadorVeiculos) com o comando:<br/>
   Exemplo = java GerenciadorVeiculos

5. O terminal exibirá a saída do programa, com os detalhes dos veículos, valor do seguro e mensagens de manutenção.
