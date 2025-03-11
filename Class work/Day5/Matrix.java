class Matrix{
public static void main(String[] args){
	int a[]={2,45,7};
	int b[]={12,4,9};
	int c[]={21,5,17};
	int arr1[][]=new int[3][];
	arr1[0]=a;  
	arr1[1]=b;
	arr1[2]=c;
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++)
			System.out.print(arr1[i][j]+" ");
				System.out.println();
			}
}}
