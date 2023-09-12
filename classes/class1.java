package classes;

public class class1 {
    public static void main(String[] args) {
        student sm = new student("sm","sm@gmail.com" , 78954 , 758001,null,100000,0);
        student sm2 = new student("sm","sm@gmail.com" , 78954 , 75800,null,100000,0);

        System.out.println(sm.calculateFee());
        sm2.printProfile();
    }
}

class Matrix {
    // Define properties here
	int rows;
    int cols;
    int[][] matrix;
		
	// Define constructor here
	public Matrix(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }
	
	void input(Scanner sc){
	     for(int i = 0; i< matrix.length;i++){
            for(int j = 0; j< matrix[i].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
		
	}
	
	Matrix add(Matrix x){
		Matrix sumMat = new Matrix(x.rows, x.cols);
		
        for(int i = 0; i < x.rows;i++){
            for(int j = 0; j< sumMat[i].length;j++){
                sumMat[i][j] = this.matrix[i][j]+ x.matrix[i][j];
            }
        }
        return sumMat;
		
	}
	
	Matrix subtract(Matrix x){
		Matrix diffMat = new Matrix(x.rows, x.cols);
		
        for(int i = 0; i< diffMat.length;i++){
            for(int j = 0; j< diffMat[i].length;j++){
                diffMat[i][j] = this.matrix[i][j] - x.matrix[i][j];
            }
        }
        return diffMat;
		
	}
		
	Matrix transpose(){
		Matrix transposeMat = new Matrix(this.rows, this.cols);
		
        for(int i = 0; i< transposeMat.length;i++){
            for(int j = 0; j< transposeMat[i].length;j++){
                transposeMat[i][j] = this.matrix[j][i];
            }
        }
        return transposeMat;
		
	}
	
	void print(){
		for(int i = 0; i< this.matrix.length;i++){
            for(int j = 0; j< this.matrix[i].length;j++){
                System.out.print(this.matrix[i][j]+" ");
            }
            System.out.println();
        }
		
	}
}

/*
    Matrix a = new Matrix(10, 5)  // 10 rows, 5 columns
	a.input() 
	Matrix b = new Matrix(10, 5)  // 10 rows, 5 columns
	b.input()
    Matrix c1 = a.add(b)
    Matrix c2 = a.subtract(b)
    Matrix c3 = a.transpose()
    a.print()
*/




class student{
    String name;
    String email;
    int phoneNumber;
    int pincode;
    String mentorEmail;
    int scholarship;
    float cgr;

    public student(String name,String email,int phoneNumber,int pincode, String mentorEmail, int scholarship,float cgr){
        this.name = name;
        this.email = email;
        this.pincode = pincode;
        this.phoneNumber = phoneNumber;
        this.mentorEmail = mentorEmail;
        this.scholarship = scholarship;
        this.cgr = cgr;
    }

    void printProfile(){
        System.out.printf("Name: %s, Email: %s, PhoneNumber: %d\n",this.name,this.email,this.phoneNumber);
    }

    boolean belongToSameLocality(student st){
        if (this.pincode == st.pincode){
            return true;
        }
        return false;
    }

    float calculateFee(){
        return ((float)(500000 - this.scholarship));
    }
}