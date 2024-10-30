package grafos;
public class TestaGrafo {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("João");
        grafo.adicionarVertice("Enzo");
        grafo.adicionarVertice("Kaik");
        grafo.adicionarVertice("Guilherme");
        grafo.adicionarVertice("Inacio");
        
        grafo.adicionarAresta(2.0, "João", "Inacio");
        grafo.adicionarAresta(2.0, "Enzo", "Inacio");
        grafo.adicionarAresta(2.0, "Inacio", "Kaik");
        grafo.adicionarAresta(2.0, "Kaik", "Guilherme");
        
        grafo.buscaEmLargura();
    }
}
