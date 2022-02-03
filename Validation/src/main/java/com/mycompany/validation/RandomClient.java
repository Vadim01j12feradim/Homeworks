/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author found404
 */
public class RandomClient {
    RandomAccessFile raf = null;
File file;
int Max = 1;
public RandomClient(){
file = new File("archivo.obj");
raf=null;
}
public int MaxID() throws FileNotFoundException{
       String UserName = "";
       String TipeUser = "";
       String Status="";
       String name="";
       String OneAPe="";
       String TwoApe="";
       int id=0;
       String Password="";
       String Address="";
       String Email="";
       long Phone=0;
    
    int lol=1;
    this.Max++;
    int[] arr=new int[9999];
    int i=0;
    
    try{
        raf = new RandomAccessFile(file, "rw");
    raf.seek(0);
    
    while(true){
            UserName = raf.readUTF();
            TipeUser = raf.readUTF();
            Status=raf.readUTF();
            name=raf.readUTF();
            OneAPe=raf.readUTF();
            TwoApe=raf.readUTF();
            id=raf.readInt();
            Password=raf.readUTF();
            Address=raf.readUTF();
            Email=raf.readUTF();
            Phone = raf.readLong();
            arr[i] = id;
            i++;    
    }
    }catch(IOException ex){
        //ocurre un error
    }
    int x=1;
    while(x<=i+1){
        int y=0;
        int enc=0;
        while(y<i){
            if(x==arr[y]){
                enc=1;
            }
            y++;
        }
        if(enc==0){
            lol=x;
            break;
        }
        
        x++;
    }
    return lol;
}

public void Format(){
    file.delete();
    file = null;
    file = new File("archivo.obj");
}



public ClassClient ExecuteLogin(ClassClient User,int MaxValue) throws IOException{ 
try {
    
    raf = new RandomAccessFile(file, "rw");   
    raf.seek(0);
       String UserName = "";
       String TipeUser = "";
       String Status="";
       String name="";
       String OneAPe="";
       String TwoApe="";
       int id=0;
       String Password="";
       String Address="";
       String Email="";
       long Phone=0;
       int i=1;
while (i<MaxValue){
            i++;
            UserName = raf.readUTF();
            TipeUser = raf.readUTF();
            Status=raf.readUTF();
            name=raf.readUTF();
            OneAPe=raf.readUTF();
            TwoApe=raf.readUTF();
            id=raf.readInt();
            Password=raf.readUTF();
            Address=raf.readUTF();
            Email=raf.readUTF();
            Phone = raf.readLong();
            //JOptionPane.showMessageDialog(null,UserName+"-"+User.getUserName()+" "+Password+"-"+User.getPassword()+Status);
    if (UserName.equals(User.getUserName()) && Password.equals(User.getPassword())){
     //   JOptionPane.showMessageDialog(null,name);

        User.setName(name);
        User.setTipeUser(TipeUser);
        User.setOneAPe(OneAPe);
        User.setTwoApe(TwoApe);
        User.setPassword(Password);
        if(Status.equals("Activo"))
        return User;
        User.setName("");
        }
}

} catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null,"Error en el metodo ExecuteLogin");

}
return User;
}        
public ClassClient Search(ClassClient Us) throws IOException{ 
        raf = new RandomAccessFile(file, "rw");
            ClassClient User1 = new ClassClient();
            User1.setUserName("");
            User1.setTipeUser("");
            User1.setStatus("");
            User1.setName("");
            User1.setOneAPe("");
            User1.setTwoApe("");
            User1.setId(0);
            User1.setPassword("");
            User1.setAddress("");
            User1.setEmail("");
            User1.setPhone(0);
           if(MaxID()<=Us.getId())
               return User1;
           raf = new RandomAccessFile(file, "rw");
           raf.seek(0);
           String UserName;
           String TipeUser;
           String Status;
           String name;
           String OneAPe;
           String TwoApe;
           int id;
           String Password;
           String Address;
           String Email;
           long Phone;   
try {

while (true){ 
               UserName = raf.readUTF();
               TipeUser = raf.readUTF();
               Status=raf.readUTF();
               name=raf.readUTF();
               OneAPe=raf.readUTF();
               TwoApe=raf.readUTF();
               id=raf.readInt();
               Password=raf.readUTF();
               Address=raf.readUTF();
               Email=raf.readUTF();
               Phone = raf.readLong();
    if (id==Us.getId()){
            User1.setUserName(UserName);
            User1.setTipeUser(TipeUser);
            User1.setStatus(Status);
            User1.setName(name);
            User1.setOneAPe(OneAPe);
            User1.setTwoApe(TwoApe);
            User1.setId(id);
            User1.setPassword(Password);
            User1.setAddress(Address);
            User1.setEmail(Email);
            User1.setPhone(Phone);
            return User1;
        }
    
     //JOptionPane.showMessageDialog(null, "not end", "Error!", JOptionPane.ERROR_MESSAGE);
}
//JOptionPane.showMessageDialog(null, "not end", "Error!", JOptionPane.ERROR_MESSAGE);
} catch (FileNotFoundException ex) {
}
return User1;
}

public void AddEnd(ClassClient UserI) throws Exception {//Esta funcion
    //agrega un nuevo ogjeto al final pero ademas incorpora una posible 
    //esepcion con throws Exception
        raf = new RandomAccessFile(file, "rw");//Creacion de objeto
                                                //para leer
    raf.seek(raf.length());//Se posiciona al final
    raf.writeUTF(UserI.getUserName());//Escribe un string nombre de usuario
    raf.writeUTF(UserI.getTipeUser());//Escribe un string tipo de usuario
    raf.writeUTF(UserI.getStatus());//Escribe un string estatus de usuario
    raf.writeUTF(UserI.getName());//Escribe un string nombre de usuario
    raf.writeUTF(UserI.getOneAPe());//Escribe un string primer apellido
    raf.writeUTF(UserI.getTwoApe());//Escribe un string segundo apellido
    raf.writeInt(UserI.getId());//Escribe un entero id de usuario
    raf.writeUTF(UserI.getPassword());//Escribe un string contrasena
    raf.writeUTF(UserI.getAddress());//Escribe un string direccion
    raf.writeUTF(UserI.getEmail());//Escribe un string email
    raf.writeLong(UserI.getPhone());//Escribe un long numero de telefono
  raf.close();//Cierre del archivo de lectura
}//Fin de la funcion 
}
