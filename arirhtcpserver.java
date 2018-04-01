//tcp server

import.java.io.*;
import.java.net.*;

public class arithtcpserver
{
public static void main(string main[]throws Exception
{
System.out.println();
System.out.println("ARITHMETIC SERVER");
Syste,.out.println("******");
System.out.println("Server is ready to accept inputs....");
ServerSocket serversoc=new ServerSocket(9);
Socket clientsoc=serversoc.accept();
PrintWriter out=new PrintWriter(clientsoc.getOutputStream(),true);
BufferedReader.in=new BufferedReader(new InputStreamReader(clientsoc.getInputStream()));
try
{
while(true)
{
String s.op="",st;
int i=0,c=0;
int[]a=new int[2];
while(true)
{
s=in.read.inc();
if(s.equals("+")||s.equals("-")||s.equals("/"))
op=s;
else if(s.equlas("."))
break;
else
{
a[i]=integer.parse
















