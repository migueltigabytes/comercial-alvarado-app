package pe.calvarado.gestion.util;
public class UserSession {
    
    private String  user_name;
    private int     perfil_id;
    private int     user_id;
    private String  look_and_feel;
    private static UserSession instance;
    
    private UserSession(){
       
    }
    
    public static UserSession getInstance(){
         if(instance == null){
            instance = new UserSession();
            }
         return instance;
         
    }
    
    
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getPerfil_id() {
        return perfil_id;
    }

    public void setPerfil_id(int perfil_id) {
        this.perfil_id = perfil_id;
    }

    
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getLook_and_feel() {
        return look_and_feel;
    }

    public void setLook_and_feel(String look_and_feel) {
        this.look_and_feel = look_and_feel;
    }
    
    
    
    
    
}
