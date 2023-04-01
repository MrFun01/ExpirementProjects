import java.util.Scanner;

class BitWisePatch{
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	boolean start=true;
	
	while(start){
	System.out.println("Write number to cnvert to byte code");
	if(sc.hasNextInt()){
	int res=sc.nextInt();
	//int res=47;
	System.out.println("Byte code presentation: "+(((res&128)>0)?"1":"0")+(((res&64)>0)?"1":"0")+
	(((res&32)>0)?"1":"0")+(((res&16)>0)?"1":"0")+(((res&8)>0)?"1":"0")+
	(((res&4)>0)?"1":"0")+(((res&2)>0)?"1":"0")+(((res&1)>0)?"1":"0")
	);
}else{
	start=false;	
}
}
	
	
		


}
}