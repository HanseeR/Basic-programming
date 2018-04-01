import.java.io*;
import.java.net*;
public class arthtcpclient
{
	public static void main(String[]args)throws IOException
	{
		System.out.println();
		System.out.println("ARITHMETIC CLIENT");
		System.println("******");
		System.out.println("Enter the host name to connect");
		String str;
		DataInputStream inp=new DataInputStream(System.in);
		str=inp.readLine();
		Socket clientsoc =new Socket(Str,9);
		System.out.println("Enter the inpits");
		PrintWriter out=new PrintWriter(clientsoc.getOutputStream(),true);
		BufferedReader in=new Buffered Reader(new InputStreamReader(Clientsoc.getInputStream()));
		BufferedReader Stdin=new BufferedReader(new InputStreamReader(System.in));
		String userinput;
		
		try
		{
		while(true)
		{
			do
		}
		userinput=stdin.readLine();
		out.println(userinput);
	}
	while(!userinput.equals("."));
	System.out.println("Server Says:"+.read.in());
			
		}
	}
	
	catch(Exception e)
	{
		System.exist(0);
	}
	
}

}
	
	
	