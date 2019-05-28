
package Quest3;

public class GadEPos {
    
    private String DisciplinaG;
    private String DisciplinaPG;
    
    public String getNDisciplinaPG(){
    
        return this.DisciplinaPG;
    }
    public void setDisciplinaPG(String dpg){
    
        this.DisciplinaPG = dpg;
    }
   
    public String getNDisciplinaG(){
    
        return this.DisciplinaG;
    }
    public void setDisciplinaG(String dg){
    
        this.DisciplinaG = dg;
    }
    public GadEPos(String dg, String dpg){
    
        this.setDisciplinaG(dg);
        this.setDisciplinaPG(dpg);
    }
}
