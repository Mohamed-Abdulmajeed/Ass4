
package ass4_creational_design_patterns;

public class memeberFactory_IS {
    
   private Doctor_IS docIS;
   private TeachingAssistant_IS teachAssistant;

    public Doctor_IS getDocIS() {
        return docIS;
    }

    public void setDocIS(Doctor_IS docIS) {
        this.docIS = docIS;
    }

    public TeachingAssistant_IS getTeachAssistant() {
        return teachAssistant;
    }

    public void setTeachAssistant(TeachingAssistant_IS teachAssistant) {
        this.teachAssistant = teachAssistant;
    }
    
}
