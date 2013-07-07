package pe.calvarado.gestion.util;

import java.util.Objects;

public class JComboBoxModel {
    
    private String value;
    private String label;

    public JComboBoxModel(String value, String label) {
        this.value = value;
        this.label = label;
    }

       
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    @Override
    public String toString(){
        return label;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.value);
        hash = 73 * hash + Objects.hashCode(this.label);
        return hash;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JComboBoxModel other = (JComboBoxModel) obj;
        if (!Objects.equals(this.value, other.value)) {
            return false;
        }
        if (!Objects.equals(this.label, other.label)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
