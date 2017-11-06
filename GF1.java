import java.io.*;

class FiniteOps 

{

int p,x,y,sum=0,sub=0,mul=0,div=0;

public void fileRead()
{
try
{

FileReader fr=new FileReader("input.txt");
BufferedReader br=new BufferedReader(fr);

String s1=br.readLine();
p=Integer.valueOf(s1);


String s2=br.readLine();
x=Integer.valueOf(s2);

String s3=br.readLine();
y=Integer.valueOf(s3);

}//try

catch(Exception e)
{

System.out.println(e);

}//catch

}//fileRead method

public void arithematic()
{

try
{

int div=(x*EEA_Div(y,p)[0])%p;

if(x<0)
x=p+x;
if(y<0)
y=p+y;

sum=x+y;
if(x-y>=0)

sub=x-y;
else
sub=p+(x-y);

mul=x*y;

if(sum>=p)
sum=sum%p;

if(sub>=p)
sub=sub%p;

if(mul>=p)
mul=mul%p;


if(div<0)
div=div+p;


File f=new File("output.txt");
f.createNewFile();
FileWriter fw=new FileWriter(f,true);
fw.write(sum+"");
fw.write(System.getProperty("line.separator"));
fw.write(sub+"");
fw.write(System.getProperty("line.separator"));
fw.write(mul+"");
fw.write(System.getProperty("line.separator"));
fw.write(div+"");
fw.write(System.getProperty("line.separator"));
fw.flush();
fw.close();
}
catch(Exception e)
{
System.out.println(e);
}

}

public int[] EEA_Div(int a, int b)
{        

if(b == 0)
{             
return new int[]{1,0};                        
}
else
{
int q = a/b; int r = a%b;
int[] R = EEA_Div(b,r);	    
return new int[]{R[1], R[0]-q*R[1]};
}
}

}//class


class GF1
{

public static void main(String []args)
{

try
{


FiniteOps f1=new FiniteOps();
f1.fileRead();
f1.arithematic();

}//try

catch(Exception e)

{
System.out.println(e);

}//catch
}//main
}//class