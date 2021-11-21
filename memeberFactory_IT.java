
package ass4_creational_design_patterns;

public class memeberFactory_IT {
    
    private Doctor_IT docIT;
    private TeachingAssistant_IT teachAssistant;

    public TeachingAssistant_IT getTeachingAssistant_IT() {
        return teachAssistant;
    }
    public void setTeachingAssistant_IT(TeachingAssistant_IT teachAssistant) {
        this.teachAssistant = teachAssistant;
    }

    public Doctor_IT getDocIT() {
        return docIT;
    }
    public void setDocIT(Doctor_IT docIT) {
        this.docIT = docIT;
    }

    
}
