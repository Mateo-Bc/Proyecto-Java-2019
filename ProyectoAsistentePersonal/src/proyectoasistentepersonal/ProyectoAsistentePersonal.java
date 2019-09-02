package proyectoasistentepersonal;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class ProyectoAsistentePersonal {
    VoiceManager freettsVM;
    Voice freettsVoice;
    
    public ProyectoAsistentePersonal(String words){
        //System.setProperty("mbrola.base", "/usr/share/mbrola/");
        freettsVM = VoiceManager.getInstance();
        
        freettsVoice = freettsVM.getVoice("kevin16");
        freettsVoice.allocate();
        freettsVoice.speak(words);

    }
    
    public static void main(String[] args) {
        
        ProyectoAsistentePersonal pierre = new ProyectoAsistentePersonal("Bienvenido");
        
        Interfaz I = new Interfaz();
        
        //new ProyectoAsistentePersonal("");
        
        
        
    }
    
}
