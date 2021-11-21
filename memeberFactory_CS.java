
package ass4_creational_design_patterns;

public class memeberFactory_CS {
    
   private Doctor_CS docCS;
   private TeachingAssistant teachAssistant;

    public Doctor_CS getDocCS() {
        return docCS;
    }

    public void setDocCS(Doctor_CS docCS) {
        this.docCS = docCS;
    }

    public TeachingAssistant getTeachAssistant() {
        return teachAssistant;
    }

    public void setTeachAssistant(TeachingAssistant teachAssistant) {
        this.teachAssistant = teachAssistant;
    }

    void setTeachAssistant(TeachingAssistant_CS teachCS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

