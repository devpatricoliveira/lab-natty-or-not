/**
 * Minha versão - funciona e eu entendo!
 * Baseado naqueles truques que realmente funcionam
 */
public class FakeNattyDetector {
    
    // Checagens rápidas que eu realmente uso
    public boolean seemsSuspicious(BufferedImage img) {
        // 1. Conta os dedos - sério, funciona!
        if (hasWeirdHands(img)) {
            return true;
        }
        
        // 2. Texto parece que foi desenhado por criança?
        if (hasNonsenseText(img)) {
            return true;
        }
        
        // 3. Tudo muito perfeito?
        if (isTooPerfect(img)) {
            return true;
        }
        
        // 4. Fundo faz sentido?
        if (backgroundLooksWeird(img)) {
            return true;
        }
        
        return false; // Provavelmente é real
    }
    
    private boolean hasWeirdHands(BufferedImage img) {
        // Lógica simples: se tem mão visível, verifica se parece normal
        // TODO: Melhorar isso depois, mas por enquanto tá funcionando
        return countFingers(img) != 5; // Spoiler: humanos têm 5 dedos
    }
    
    // ... o resto é tão simples quanto parece ...
}