import java.net.*;
import java.io.*;
class DatagramClient
{
public static void main(String args[])throws Exception
{
byte buffer[]=new byte[1024];
DatagramSocket  ds=new DatagramSocket(789);
System.out.println(" Client: waiting for server data");
while(true)
{
DatagramPacket p=new DatagramPacket(buffer,buffer.length);
ds.receive(p);
String psx=new String(p.getData(),0,p.getLength());
System.out.println(psx);
}}}