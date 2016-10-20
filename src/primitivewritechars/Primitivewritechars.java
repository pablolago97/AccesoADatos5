
package primitivewritechars;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;

/**
 *
 * @author plago-bergonpazos
 */
public class Primitivewritechars {
    
 public static char  bucleLer(DataInputStream x) throws IOException{
            char y = 0;
            for(int i = 0;i<18;i++){
                 y = x.readChar();
            }
            return y;
        }
    
    public static void main(String[] args) throws IOException {
        
        //Variable del String
        String a = "Esta e unha cadea\n";
        
        //Creamos nuevo archivo
        File texto4 = new File("/home/local/DANIELCASTELAO/plago-bergonpazos/NetBeansProjects/primitivewritechars/src/texto4.txt");
        texto4.createNewFile();
        DataInputStream read = new DataInputStream(new FileInputStream(texto4));
        DataOutputStream write = new DataOutputStream(new FileOutputStream(texto4));
        
        //Método bucle
        String s="";
        
        //Se escirbe 1 linea
        write.writeChars(a);
        System.out.println("writeChars escribiu: "+a+
        "writeChars escribiu: "+write.size()+" bytes\n");
        
        //Se escribe segunda linea
        write.writeChars(a);
        System.out.println("writeChars escribiu: "+a+
        "writeChars escribiu: "+(write.size()-36)+" bytes\n\n"+
        "bytes escritos en total: "+write.size()+" bytes\n");
        for(int i = 0;i<18;i++){
         char c = read.readChar();
         s+=c;
        }
        System.out.println("lemos a primeira cadea: "+s+
                "numero de bytes lidos: "+(write.size()-read.available())+"\n"+
                "numero de bytes por ler: "+(write.size()-read.available())+"\n");
        System.out.println("lemos a primeira cadea: "+s+
                "numero de bytes lidos: "+(write.size()-read.available())+"\n"+
                "numero de bytes por ler: "+(read.available()-36));
        
        
    }
    
}
