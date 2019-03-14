
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class p4tcpsrvr{
    private Socket clntskt=null;
    private BufferedReader  in;private PrintWriter out;
    private DataInputStream din;private BufferedInputStream bin;
    private DataOutputStream dout;
    int clntnumber=0;
    
    public p4tcpsrvr(Socket s){
    
    try {
       clntskt = s;
         bin=new BufferedInputStream(clntskt.getInputStream());
        din =new DataInputStream(bin);
         dout = new DataOutputStream(clntskt.getOutputStream());
        in=new BufferedReader(new InputStreamReader(din));
        out = new PrintWriter(clntskt.getOutputStream(), true);
       
        } 
    catch (IOException ex) 
    {
         //  System.out.println(ex.toString());
        }
        
    }
 /*   
   @Override
   public void run(){  
  while(this.clntskt !=null && this.clntskt.isConnected())
{
    try{
        this.out.print("Hi");
    this.out.flush();
    JOptionPane.showMessageDialog(null, "Hi");
       this.out.print("Hi,");
    this.out.flush();
    JOptionPane.showMessageDialog(null, "Hi,");
     this.out.print("Welcome to Rifan's Shop");
    this.out.flush();
    JOptionPane.showMessageDialog(null, "Welcome to Rifan's Shop");
  }catch(Exception ex){
  JOptionPane.showMessageDialog(null, ex);
  }
  }
    }*/
  void snd2clnt(String d)
  {
      //  if (out != null && !out.checkError()) 
        {
            out.println(d);
            out.flush();
        }  
  }
void snd2clntimgs(byte[] ba) throws IOException
  {
          //  out.println(ba.length);
            dout.writeInt(ba.length);
          //  out.flush();
          // dout.flush();
            dout.write(ba);//, 0, ba.length
           //  out.flush();
             dout.flush();
  }
/*  void recvimgsf(String sarry[]){
     for(String flenm:sarry) {
                try {
                byte [] ba=new byte[Integer.valueOf(in.readLine())];
                din.readFully(ba);
                File file = new File("avnclntfldr/"+flenm);
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(ba);
                fos.flush();
                fos.close();
                    shwmsg(flenm);
            } catch (IOException ex) {}
            }
 }*/
    
   String recvmsgf()throws IOException
  {
  //   try
     {
       //  if(this.in.ready())
         { 
         
         }
        } 
   //  catch (IOException ex)
        {
    //   return "";
        }
      //  return "";
       return this.in.readLine();
  }
  
  void closcnn()
  {
  try {
   this.in.close();
   this.out.close();
   this.clntskt.setKeepAlive(false);
   this.clntskt.close();
   this.clntskt=null;
       } catch (IOException ex) {
          //  System.out.println(ex);
    } 
   }
   
     }

   

