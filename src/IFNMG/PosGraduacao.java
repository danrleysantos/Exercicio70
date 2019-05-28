
package IFNMG;

public class PosGraduacao {
    
    private String DisciplinaPG;
    
    public String getNDisciplinaPG(){
    
        return this.DisciplinaPG;
    }
    public void setDisciplinaPG(String dpg){
    
        this.DisciplinaPG = dpg;
    }
    public PosGraduacao(String dpg){
    
        this.setDisciplinaPG(dpg);
    }
}
