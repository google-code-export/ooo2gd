// (c) 2007 by Przemyslaw Rumik
// myBlog: http://przemelek.blogspot.com
// project page: http://ooo2gd.googlecode.com
// contact with me: http://przemelek.googlepages.com/kontakt
package org.openoffice.gdocs.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.openoffice.gdocs.configuration.Configuration;

public class Creditionals {
    
    private static final String CREDITIONALS_FILE = "gdocs.dat";
    private static final String SECRET_PHRASE = "$ogorek#";
    private boolean wasCreditionalsReadedFromDisk = false;
    private String userName;
    private String password;
    private String system;

    public Creditionals(String system) {
        super();
        this.system = system;
        setWasCreditionalReadFromDisk(readCreditionals());
    }    
    
    public Creditionals(String userName, String password, String system) {
        super();
        this.userName = userName;
        this.password = password;
        this.system = system;
    }
    
    public Creditionals(String userName, String password) {
        // by default we use Google Docs
        this(userName,password,"Google Docs");
    }

    public void setSystem(String system) {
        this.system = system;
    }

    private String getCredentionalsfileName() {
        String fileName = CREDITIONALS_FILE;
        if (!("Google Docs".equals(system))) {
            fileName += system.replaceAll(" ", "_");
        }
        String credentionalsFileName = Configuration.getConfigFileName(Configuration.getWorkingPath(),fileName);
        return credentionalsFileName;
    }

    private String xorString(String input,String key) {
      return Util.xorString(input, key);
    }
    
    private boolean readCreditionals() {
        String credentionalsFileName = getCredentionalsfileName();
        boolean result = false;
        try {            
            File file = new File(credentionalsFileName);
            if (file.exists()) {
                FileReader fr = new FileReader(credentionalsFileName);
                BufferedReader br = new BufferedReader(fr);
                char[] buf=new char[1024];
                int length = br.read(buf);
//                buf = Arrays.copyOf(buf,length);                
                br.close();
                String decoded = xorString(new String(buf,0,length),SECRET_PHRASE);
                String[] lines = decoded.split("\n");
                setUserName(lines[0]);
                setPassword(lines[1]);
                result=true;
            }
        } catch (IOException e) { /* intentionaly left empty */}       
        return result;
    }
    
    private void storeCreditionals() {
        String credentionalsFileName = getCredentionalsfileName();
        try {
            FileWriter fw = new FileWriter(credentionalsFileName);
            BufferedWriter bw = new BufferedWriter(fw);
            String password = getPassword();
            String userName = getUserName();
            String str = userName+"\n"+password;
            bw.write(xorString(str,SECRET_PHRASE));
            bw.close();
        } catch (IOException e) {
            // Intentionaly left empty
            // If IOException will be thrown we ignore this
        }
    }    

    public void store() {
        storeCreditionals();
    }
    
    public void remove() {
        String credentionalsFileName = getCredentionalsfileName();
        File credentionalsFile = new File(credentionalsFileName);
        if (credentionalsFile.exists()) {
            credentionalsFile.delete();
        }
    }
    
    public String getUserName() {
        return userName;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }
    
    public void setWasCreditionalReadFromDisk(boolean flag) {
        wasCreditionalsReadedFromDisk = flag;
    }
    
    public boolean getWsCreditionalsReadedFromDisk() {
        return wasCreditionalsReadedFromDisk;
    }

    public String getSystem() {
        return this.system;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Creditionals) {
            Creditionals cr = (Creditionals)obj;
            result=cr.getUserName().equals(this.getUserName()) 
                    && cr.getPassword().equals(this.getPassword()) 
                    && cr.getSystem().equals(this.getSystem());
        } 
        return result;
    }
    
    
    
    public boolean isEmpty() {
        boolean empty = ( (userName==null) || ("".equals(userName)) && (password==null) || ("".equals(password)) );
        return empty;        
    }
}
