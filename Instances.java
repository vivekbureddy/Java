public class Instances{
byte b;
public byte getBytevalue(){
return 24;
}
public short getShortvalue(){
return 240;
}
public int getIntvalue(){
return 2400;
}
public long getLongvalue(){
return 24000;
}
public float getFloatvalue(){
return 2.4f;
}
public double getDoublevalue(){
return 24000;
}
public char getCharvalue(){
return 'a';
}public boolean getBooleanvalue(){
return true;
}
public String getStringvalue(){
return "abc";
}

public static void main(String[] args){
Instances obj1=new Instances();
byte res=obj1.getBytevalue();
System.out.println(res);
short res1=obj1.getShortvalue();
System.out.println(res1);
int res2=obj1.getIntvalue();
System.out.println(res2);
long res3=obj1.getLongvalue();
System.out.println(res3);
float res4=obj1.getFloatvalue();
System.out.println(res4);
double res5=obj1.getDoublevalue();
System.out.println(res5);
char res6=obj1.getCharvalue();
System.out.println(res6);
boolean res7=obj1.getBooleanvalue();
System.out.println(res7);
String res8=obj1.getStringvalue();
System.out.println(res8);
}
}

