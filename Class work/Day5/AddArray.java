class AddArray{
public static void main(String[] args){
	int a[][]={{1,2},{2,3},{6,8}};

	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[0].length;j++)
		System.out.print(a[i][j]+" ");
	System.out.println();}
	System.out.println("......");
				
	int b[][]={{1,2},{2,3},{6,8}};

	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[0].length;j++)
		System.out.print(b[i][j]+" ");
	System.out.println();}
					System.out.println();
					
	System.out.println("addition of two matrix");
	int add[][] = new int[a.length][a[0].length];
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[0].length;j++)
	add[i][j]=a[i][j]+b[i][j];}

	for(int i=0;i<add.length;i++){
		for(int j=0;j<a[0].length;j++){
	System.out.print(add[i][j]+" ");}
	System.out.println();}
	}}