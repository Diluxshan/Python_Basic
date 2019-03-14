import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.lang.SecurityException;
import java.lang.NumberFormatException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.ByteArrayBuffer;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.logging.Logger;
import java.util.logging.Level;


public class untitled {
    protected static String bfrdstr="",fldrpth="/home/pi/AvinaFs",
    flepth="/home/pi/AvinaFs/";
    private static Thread srvrthrd=null;
    private static int mdl=3;
   // private static boolean sndd=false;
    private static ServerSocket  mnsrvr=null;
    private static p4tcpsrvr srvr=null;
    protected static int volume=20;
    protected static boolean ply=false;
    private static boolean sndstt=false;
    private static String t3="",l3="",r3="";
   
   private static void plymda3(boolean t,String fnm){
	   String s = null;
	   try{
		   Process pwlcmc=new ProcessBuilder().
          command("killall","omxplayer.bin").start();
           BufferedReader stdInput = new BufferedReader(new 
                 InputStreamReader(pwlcmc.getInputStream()));
            BufferedReader stdError = new BufferedReader(new 
                 InputStreamReader(pwlcmc.getErrorStream()));
            while ((s = stdInput.readLine()) != null);
            while ((s = stdError.readLine()) != null);
            String fstr3 =flepth+fnm;
            if(t){
           Process p3dt=new ProcessBuilder().
          command("sudo","NOREFRESH=1","omxplayer","-r","-b","--fps","30","--no-osd","--loop","--win",t3,"--orientation","180",fstr3+"t.mp4").start();
             Process p3dl=new ProcessBuilder().
          command("sudo","NOREFRESH=1","omxplayer","-r","-b","--fps","30","--no-osd","--loop","--win",l3,"--orientation","90",fstr3+"l.mp4").start();
             Process p3dr=new ProcessBuilder().
          command("sudo","NOREFRESH=1","omxplayer","-r","-b","--fps","30","--no-osd","--loop","--win",r3,"--orientation","270",fstr3+"r.mp4").start();
			}else{
				fstr3 += ".mp4";
          Process pt=new ProcessBuilder().
          command("sudo","NOREFRESH=1","omxplayer","-r","-b","--fps","30","--no-osd","--loop","--win",t3,"--orientation","180",fstr3).start();
             Process pl=new ProcessBuilder().
          command("sudo","NOREFRESH=1","omxplayer","-r","-b","--fps","30","--no-osd","--loop","--win",l3,"--orientation","90",fstr3).start();
             Process pr=new ProcessBuilder().
          command("sudo","NOREFRESH=1","omxplayer","-r","-b","--fps","30","--no-osd","--loop","--win",r3,"--orientation","270",fstr3).start();
          //"-r","--no-ghost-box","--fps","30",
			}
		}catch(IOException e){}
	   }
	   
	   private static boolean dltfle(String fnm){
		   boolean b1=true;String ss=flepth+fnm;
		  try{
			   File df=new File(ss+".png");
		   if(df.exists()){
			   File fa=new File(ss+".mp4");
			if(fnm.endsWith("3d")){
				File fl=new File(ss+"l.mp4");
				File fr=new File(ss+"r.mp4");
				File ft=new File(ss+"t.mp4");
				if(fl.exists()){
				b1 = fl.delete() && b1;
				//Files.delete(fl.toPath());
				}
			if(fr.exists()){
				b1 = fr.delete() && b1;
			//	Files.delete(fr.toPath());
				}
			if(ft.exists()){
			b1 = ft.delete() && b1;
				//Files.delete(ft.toPath());
				}
			 }else if(fa.exists()){
			b1 = fa.delete() && b1;
			 // Files.delete(fa.toPath());
				}
			if(b1){
				b1 = df.delete() && b1;
				}		
		    }}catch(SecurityException e){b1=false;}
			 return b1;
		   }
	   
	private static void plymda4(boolean t,String fnm){
	   String s = null;
	   try{
		   Process pwlcmc=new ProcessBuilder().
          command("killall","omxplayer.bin").start();
           BufferedReader stdInput = new BufferedReader(new 
                 InputStreamReader(pwlcmc.getInputStream()));
            BufferedReader stdError = new BufferedReader(new 
                 InputStreamReader(pwlcmc.getErrorStream()));
            while ((s = stdInput.readLine()) != null);
            while ((s = stdError.readLine()) != null);
            String fstr4 = flepth+fnm;
            if(t){
		/*	  Process p3dt=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","472 40 828 290","--orientation","180",flepth+fnm+"t.mp4").start();
             Process p3dl=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","20 348 365 595","--orientation","90",flepth+fnm+"l.mp4").start();
             Process p3dr=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","935 348 1280 595","--orientation","270",flepth+fnm+"r.mp4").start();	
           Process p3db=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","935 348 1280 595","--orientation","270",flepth+fnm+"b.mp4").start();	*/
            Process p3dt=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","472 0 900 350","--orientation","180",fstr4+"t.mp4").start();
             Process p3dl=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","20 360 430 715","--orientation","90",fstr4+"l.mp4").start();
             Process p3dr=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","900 360 1310 715","--orientation","270",fstr4+"r.mp4").start();	
           Process p3db=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","935 348 1280 595","--orientation","270",fstr4+"b.mp4").start();	
			}else{
			fstr4 += ".mp4";
		/*	Process pt=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","472 40 828 290","--orientation","180",flepth+fnm+".mp4").start();
             Process pl=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","20 348 365 595","--orientation","90",flepth+fnm+".mp4").start();
             Process pr=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","935 348 1280 595","--orientation","270",flepth+fnm+".mp4").start();	
            Process pb=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","935 348 1280 595","--orientation","270",flepth+fnm+".mp4").start();*/
          Process pt=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","472 0 900 350","--orientation","180",fstr4).start();
             Process pl=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","20 360 430 715","--orientation","90",fstr4).start();
             Process pr=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","900 360 1310 715","--orientation","270",fstr4).start();	
            Process pb=new ProcessBuilder().
          command("omxplayer","-r","-b","--loop","--win","935 348 1280 595","--orientation","270",fstr4).start();
			}
		}catch(IOException e){}
	   }
	   
	   private static void updtglry(){
		try {
		Logger.getLogger("org.apache.http.impl.client").setLevel(Level.OFF);
		InetAddress ip = InetAddress.getByName("219.117.236.1");//248.179.235.1,219.117.236.1
		NetworkInterface network = NetworkInterface.getByInetAddress(ip);
		byte[] mac = network.getHardwareAddress();
		StringBuilder sb = new StringBuilder();
		int lnth=mac.length;
		for (int i = 0; i < lnth; i++) {
			sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
		}
		String mymc=sb.toString();
		mymc=mymc.replaceAll("-","");
		HttpClient hc = new DefaultHttpClient();
        HttpPost hp = new HttpPost("http://18.216.66.63/avnasrvr.php");
        hp.addHeader("Cookie", ("PHPSESSID="+mymc));
		try{
            ArrayList<NameValuePair> nvp= new ArrayList<>(1);
            nvp.add(new BasicNameValuePair("avnaid",mymc));
            hp.setEntity(new UrlEncodedFormEntity(nvp, "UTF-8"));
                        HttpResponse rspnc = hc.execute(hp);
                        InputStream is = rspnc.getEntity().getContent();
                        BufferedInputStream bis = new BufferedInputStream(is);
                        ByteArrayBuffer baf = new ByteArrayBuffer(20);
			srvr.snd2clnt("rdngsrvr");
                        int current;
                        while((current = bis.read()) != -1){
                            baf.append((byte)current);}
                        String text = new String(baf.toByteArray());
                        if(text!=null && !text.equals("")){
                            if(text.equals("---")){
								srvr.snd2clnt("rgyrapp");
                                return;
                            }else{
                                String[] bsestr = text.split("-",2);
                                String[] fnms=bsestr[0].split(",");
                                String[] flnks=bsestr[1].split(",");
								int ln=fnms.length;
                                for(int i=0;i<ln;i++){
							File ff=new File("/home/pi/AvinaFs/"+fnms[i]);
								if(!ff.exists()){
								Runtime rt=Runtime.getRuntime();
								String cmnd=String.format("sudo wget -q -T 10 -P /home/pi/AvinaFs %s",flnks[i]);
								Process p=rt.exec(cmnd);
								int rslt=p.waitFor();
								if(rslt!=0){
								srvr.snd2clnt("rdngfld");
								if(ff.exists()){
								ff.delete();}
								return;
								}
								}
								}
								srvr.snd2clnt("rdngsrvrfnsd");
								return;
                               }
                        }
                        is.close(); bis.close(); baf.clear();
                        rspnc.getEntity().consumeContent();
						srvr.snd2clnt("rdngfld");
						   return;
                    }catch (InterruptedException e){
			srvr.snd2clnt("rdngfld");return;
			}
			 catch (IOException e) {
					   srvr.snd2clnt("nosrvr");
                       return;
                    }
	} catch (UnknownHostException | SocketException e) {
		srvr.snd2clnt("rdngfld");return;
	}
	   }
	   
	 private static void plyado(String afnm,boolean l){
	   String s = null;
	   try{
			if(l){
			Process pt=new ProcessBuilder().
          command("omxplayer","--loop","--adev","local",flepth+afnm+".mp3").start();
			}else{
			Process pt=new ProcessBuilder().
          command("omxplayer","--adev","local",flepth+afnm+".mp3").start();
			}
		}catch(IOException e){}
          
	   }
	   
	  private static void rdusb(){
		  String s = null;
	 String usbfldr="/media/NASEER@KATR/AvinaFs";
	   try{
		   Process usbchck=new ProcessBuilder().
          command("sudo","mount","/dev/sda1").start();  
     File folder = new File(usbfldr);
     if(folder.exists() && folder.isDirectory()){
		    File[] flelst = folder.listFiles();
		if(flelst!=null && flelst.length>0 ){
	     srvr.snd2clnt("rdngusb");
	    /*  Process rdu=new ProcessBuilder().
          command("sudo","cp","-fR",usbfldr,"/home/pi").start();   
           BufferedReader stdInput = new BufferedReader(new 
                 InputStreamReader(rdu.getInputStream()));
            BufferedReader stdError = new BufferedReader(new 
                 InputStreamReader(rdu.getErrorStream()));
            while ((s = stdInput.readLine()) != null);
            if ((s = stdError.readLine()) == null) {
			   srvr.snd2clnt("rdngusbfnsd");	
            }*/
				Runtime rt=Runtime.getRuntime();
				String cmnd=String.format("sudo cp -fR %s /home/pi",usbfldr);
				Process p=rt.exec(cmnd);
				int rslt=p.waitFor();
				if(rslt!=0){
				srvr.snd2clnt("rdngfld");
				return;
				}
				srvr.snd2clnt("rdngusbfnsd");
   }else{
	   srvr.snd2clnt("emtyusb");  
	   }}else{
	   srvr.snd2clnt("emtyusb");}
		}catch (InterruptedException e){
			srvr.snd2clnt("rdngfld");return;
		}catch(IOException e){ srvr.snd2clnt("emtyusb");}   
	   }
	
	private static String rdflesfrmdir(){
      String fnms="";
     File folder = new File(fldrpth);
        File[] flelst = folder.listFiles();
   if(flelst!=null && flelst.length>0 ){
       for(File fle:flelst){
       if (fle.isFile() && fle.getName().endsWith(".png")) {
        fnms+=fle.getName()+",";
      }}
       fnms = fnms.replaceAll(",$", "");
   }
   return fnms;
      }
        

/*
  private static byte[] ldfle2(String lfn){
	if(srvr!=null){
	try{
            byte[] fileContent;
            BufferedImage image = ImageIO.read(new File(flepth+lfn));
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      ImageIO.write(image, "png", baos);
     fileContent=baos.toByteArray();
  return fileContent;}catch(IOException e){}
		  }return null;
		  }*/
		  
private static byte[] ldfle(String lfn){
	if(srvr!=null){
	try{
         File file = new File(flepth+lfn);
          FileInputStream fin = new FileInputStream(file);
          byte fileContent[] = new byte[(int)file.length()];
   fin.read(fileContent);
   fin.close();
  return fileContent;
  }catch(IOException e){}
		  }
		  return null;
		  }
	
	public static void main (String args[]) {
		int dw=1920,dh=1080;
		Logger.getGlobal().setLevel(Level.OFF);
  
 /////////////////////////////////////////////////////////////////////////////////////////////////
       //Auto Resolution for video..!         
//	try{
//		String w="",wr="";
//		Process gtw=new ProcessBuilder().
//          command("/bin/sh","-c","fbset | grep  geometry").start();
//           BufferedReader stdInput1 = new BufferedReader(new 
//                 InputStreamReader(gtw.getInputStream()));
//            BufferedReader stdError1 = new BufferedReader(new 
//                 InputStreamReader(gtw.getErrorStream()));
//            while ((wr = stdInput1.readLine()) != null){w+=wr;}
//            while ((wr = stdError1.readLine()) != null);
//            String [] darr=w.split("\\s+");
//		 dw=Integer.parseInt(darr[2]);
//		 dh=Integer.parseInt(darr[3]);
//		 //	System.out.println(dw+"--"+dh);
//	//	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//	//	int dw=(int)screenSize.getWidth(),dh=(int)screenSize.getHeight();
//	}
//	catch(IOException | NumberFormatException e){dw=1920;dh=1080;}
//	if(dw>1920){dw=1920;}if(dh>1080){dh=1080;}
//		int dw3=dw/3,dw2=2*dw3,dh2=dh/2;
//		l3="0 "+dh2+" "+dw3+" "+dh;
//		t3=dw3+" 0 "+dw2+" "+dh2;
//		r3=dw2+" "+dh2+" "+dw+" "+dh;
		
     l3="30 370 360 700";
     t3="473 30 803 360";
     r3="920 370 1250 700";
	
	//l3="0 384 455 768";
	//t3="455 0 910 384";
	//r3="910 384 1366 768";
	
	//l3="0 360 427 720";
	//t3="427 0 854 360";
//	r3="854 360 1280 720";
	
	if(srvrthrd==null || !srvrthrd.isAlive()){
         mnsrvr=null;
         srvrthrd = new Thread(){
          @Override
     public void run(){
        // System.out.println("Avina started");
		 try{
         if(mdl==3){
			 plymda3(false,"welcome");
		 }else
		 {
			 plymda4(false,"welcome");
			 }
          if(sndstt){
		plyado("bckgrnd",true);
		}
		if(mnsrvr==null){
		 InetAddress laddr = InetAddress.getByName("219.117.236.1");//248.179.235.1,219.117.236.1
           mnsrvr = new ServerSocket(11523,1,laddr);	
		}
			//	System.out.println( "server created"); 
			//	System.out.println( "waiting...");
				Socket s=mnsrvr.accept();
				srvr=  new p4tcpsrvr(s);
		//	System.out.println("client connected"); 
			String dd="";
     while(true){
   try{//srvr.snd2clnt("ct");
	 //  System.out.println("started"); 
	dd=srvr.recvmsgf();
	// System.out.println(dd);
	if(dd.equals("auonl")){
		// System.out.println( "received auonl");
		 srvr.snd2clnt("yionl");
		// System.out.println( "sent yionl");
		// dd=srvr.recvmsgf();
		 }
	if(dd.equals("plyme")){
		String fn=srvr.recvmsgf();
         if(fn!=null){
			 	fn=fn.replaceAll(".png","");
              //  System.out.println("plyme-"+fn); 
			  if(fn.endsWith("3d")){
           if(mdl==3){plymda3(true,fn);}else{plymda4(true,fn);}
			}else{
				if(mdl==3){plymda3(false,fn);}else{plymda4(false,fn);}
			}if(sndstt){
		plyado("11",false);
		}
			 }         
		}
		if(dd.equals("tonsnd")){
			sndstt=true;
		}
		if(dd.equals("tofsnd")){
			sndstt=false;
		}
			if(dd.equals("tof")){
				 Process pwroff=new ProcessBuilder().
          command("sudo","poweroff").start();   
			}
			if(dd.equals("tonblb")){
			 Process pldon=new ProcessBuilder().
          command("sudo","python","ldon.py").start();  
			}
			if(dd.equals("tofblb")){
			 Process pldoff=new ProcessBuilder().
          command("sudo","python","ldoff.py").start(); 
			}
	if(dd.equals("cthme")){
		// System.out.println( "received cthme");
		 srvr.snd2clnt("cthdyu");
		// System.out.println( "sent cthdyu");
		 dd=srvr.recvmsgf();}
     if(dd.equals("iamrdynwsndme")){
		// System.out.println( "received iamrdynwsndme");
	    String sd=rdflesfrmdir();
            ///////////////////////////////////////////////
       /*    if(!sd.equals(bfrdstr)){
          sndd=false;
         }else{
		sndd=true; 
		}*/
       //  if(!sndd)
       {
       ////////////////////////////////////////////////////
         srvr.snd2clnt(sd);
			//   System.out.println( "sent -"+sd);
			   dd=srvr.recvmsgf();
        //   System.out.println( "received - "+dd);
         if(dd.equals("osndnwimgs")){
			 String sarry[]=sd.split(",");
			 if(sarry!=null && sarry.length>0){
			for(String fnme:sarry){
				//System.gc();
			//	 System.out.println("waiting for next");
				dd=srvr.recvmsgf();
			//	 System.out.println("got- "+dd);
				while(!dd.equals("nxt")){
					dd=srvr.recvmsgf();}
				//	  System.out.println("sending-"+fnme);
				 srvr.snd2clntimgs(ldfle(fnme));
				//  System.out.println("sent-"+fnme);
				 }	 
			}
          //   bfrdstr=sd;
     //    sndd=true;
         }
         }	 
	}
	if(dd.equals("rdusb")){
		rdusb();	
	}
	if(dd.equals("rdsrvr")){
	 updtglry(); 
	}
	if(dd.equals("dltme")){
		 srvr.snd2clnt("sndmfle");
		 String rmsg=srvr.recvmsgf();
		 if(rmsg!=null){
			 rmsg=rmsg.replaceAll(".png","");
			boolean bb=dltfle(rmsg);
			if(bb){
			srvr.snd2clnt("fledltd");	
			}else{
			srvr.snd2clnt("nfledltd");	
			}}}
   }catch(IOException | NullPointerException e){
	   bfrdstr="";
	 //  System.out.println( "waiting...");
	  //  Process pldoff2=new ProcessBuilder().
      //    command("sudo","python","ldoff.py").start(); 
       if(mdl==3){plymda3(false,"welcome");}else{plymda4(false,"welcome");}
            	   if(sndstt){
		plyado("bckgrnd",true);
		}
	s=mnsrvr.accept();srvr=  new p4tcpsrvr(s);
	   } }}catch(IOException e){}
     }};
	srvrthrd.start();
	}

     }	
	
}

